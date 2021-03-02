package wisoft.io.designPattern.vedingMachine.decorator;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public class AddShot extends AddDecorator {

    public AddShot(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String addOption() {
        return super.addOption() + "샷 추가 ";
    }

}
