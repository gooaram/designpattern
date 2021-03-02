package wisoft.io.designPattern.vedingMachine.state;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;
import wisoft.io.designPattern.vedingMachine.strategy.IceLess;
import wisoft.io.designPattern.vedingMachine.strategy.IceMiddle;
import wisoft.io.designPattern.vedingMachine.strategy.IceMuch;

import java.util.Scanner;

public class Ice implements State {

    private static Ice ice = new Ice();
    private Ice() {}

    public String getState() {
        return "아이스 ";
    }

    public static Ice getInstance() {
        return ice;
    }

    @Override
    public Beverage setIce(Beverage beverage) {
        System.out.print("◎ 얼음양 (1.얼음 적게 2.얼음 보통 3.얼음 많이) >> ");
        Scanner scanner = new Scanner(System.in);
        int number = choiceNumber(scanner.nextInt());

        switch (number) {
            case 1:
                beverage.setIceAmount(new IceLess());
                break;
            case 2:
                beverage.setIceAmount(new IceMiddle());
                break;
            case 3:
                beverage.setIceAmount(new IceMuch());
                break;
        }

        return beverage;
    }

    private int choiceNumber(int number) {
        Scanner scanner = new Scanner(System.in);

        while (number > 3 || number == 0) {
            System.out.print("잘못 선택하셨습니다. 다시 선택해 주세요 >> ");
            number = scanner.nextInt();
        }
        return number;
    }

}