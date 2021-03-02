package wisoft.io.designPattern.vedingMachine.state;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;
import wisoft.io.designPattern.vedingMachine.strategy.NoIce;

public class Hot implements State {

    private static Hot hot = new Hot();
    public Hot() {}

    public String getState() {
        return "따뜻한 ";
    }

    public static Hot getInstance() {
        return hot;
    }

    @Override
    public Beverage setIce(Beverage beverage) {
        beverage.setIceAmount(new NoIce());
        return beverage;
    }

}
