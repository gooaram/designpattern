package wisoft.io.designPattern.vedingMachine;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public class Client {

    private Machine machine = Machine.getMachine();

    public void start() {
        Beverage beverage = machine.customize(machine.makeBeverage());
        machine.returnBeverage(beverage);
    }

}
