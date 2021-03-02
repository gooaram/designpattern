package wisoft.io.designPattern.vedingMachine.decorator;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public class AddCream extends AddDecorator {

    public AddCream(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String addOption() {
        return super.addOption() + "휘핑 추가 ";
    }

}
