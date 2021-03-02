package wisoft.io.designPattern.vedingMachine.decorator;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public abstract class AddDecorator extends Beverage {

    private Beverage decoratedBeverage;

    public AddDecorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public String addOption() {
        return decoratedBeverage.addOption();
    }

    public String getName() {return decoratedBeverage.getName();}

}