package wisoft.io.designPattern.vedingMachine.decorator;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public class AddBubble extends AddDecorator {

    public AddBubble(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String addOption() {
        return super.addOption() + "펄 추가 ";
    }

}
