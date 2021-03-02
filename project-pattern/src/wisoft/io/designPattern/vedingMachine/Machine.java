package wisoft.io.designPattern.vedingMachine;

import wisoft.io.designPattern.vedingMachine.beverage.Americano;
import wisoft.io.designPattern.vedingMachine.beverage.Beverage;
import wisoft.io.designPattern.vedingMachine.beverage.CafeLatte;
import wisoft.io.designPattern.vedingMachine.beverage.ChocoLatte;
import wisoft.io.designPattern.vedingMachine.decorator.AddBubble;
import wisoft.io.designPattern.vedingMachine.decorator.AddCream;
import wisoft.io.designPattern.vedingMachine.decorator.AddShot;
import wisoft.io.designPattern.vedingMachine.state.Hot;
import wisoft.io.designPattern.vedingMachine.state.Ice;
import wisoft.io.designPattern.vedingMachine.strategy.*;

import java.util.Scanner;

public class Machine {

    Beverage beverage1;

    private Scanner scanner = new Scanner(System.in);
    private static Machine machine = new Machine();

    private Machine() { }

    public static Machine getMachine() {
        return machine;
    }

    public int choiceNumber() {
        int menuNumber = scanner.nextInt();
        while (menuNumber > 3 || menuNumber == 0) {
            System.out.print("잘못 선택하셨습니다. 다시 선택해 주세요 >>");
            menuNumber = scanner.nextInt();
        }
        return menuNumber;
    }

    public void printMenu() {
        System.out.println("==========================================");
        System.out.println("1.아메리카노    2.카페라떼      3.초코라떼");
        System.out.println("==========================================");
    }

    public void returnBeverage(Beverage beverage) {
        System.out.println();
        String menu = beverage.selectedIceAmount() + beverage.selectedSugarAmount()
                + beverage1.addOption() + beverage.getState() + beverage.getName();
        System.out.println(">>>>>>> " + menu + " 나왔습니다.");
    }

    public Beverage makeBeverage() {
        printMenu();
        System.out.print("음료를 선택해주세요 >> ");
        switch (choiceNumber()) {
            case 1:
                beverage1 = new Americano("아메리카노");
                break;
            case 2:
                beverage1 = new CafeLatte("카페라떼");
                break;
            case 3:
                beverage1 = new ChocoLatte("초코라떼");
                break;
        }

        return beverage1;
    }


    public Beverage customize(Beverage beverage) {
        System.out.print("◎ 1.ice 2.hot >> ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                beverage.setState(Ice.getInstance());
                break;
            case 2:
                beverage.setState(Hot.getInstance());
                break;
        }

        beverage = setSugar(beverage);
        beverage.setIce();

        selectedAddOption(beverage);

        return beverage;
    }

    public Beverage selectedAddOption(Beverage beverage) {
        while (true) {
            System.out.print("◎ 추가 (1.샷 2.휘핑 3.펄) >> ");
            switch (choiceNumber()) {
                case 1:
                    beverage = addShot(beverage);
                    break;
                case 2:
                    beverage = addCream(beverage);
                    break;
                case 3:
                    beverage = addBubble(beverage);
                    break;
            }

            System.out.print("=> 계속 추가 (1번) / 추가 종료 (그 외) >> ");
            int input = scanner.nextInt();
            if (input == 1) continue;
            else break;
        }

        return beverage;
    }

    public Beverage addShot(Beverage beverage) {
        beverage1 = new AddShot(beverage);
        return beverage1;
    }

    public Beverage addCream(Beverage beverage) {
        beverage1 = new AddCream(beverage);
        return beverage1;
    }

    public Beverage addBubble(Beverage beverage) {
        beverage1 = new AddBubble(beverage);
        return beverage1;
    }

    public Beverage setSugar(Beverage beverage) {
        System.out.print("◎ 당도 (1.덜달게 2.보통 3.달게) >> ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                beverage.setSugarAmount(new SugarLess());
                break;
            case 2:
                beverage.setSugarAmount(new SugarMiddle());
                break;
            case 3:
                beverage.setSugarAmount(new SugarMuch());
                break;
        }

        return beverage;
    }

}
