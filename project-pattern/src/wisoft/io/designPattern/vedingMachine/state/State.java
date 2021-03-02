package wisoft.io.designPattern.vedingMachine.state;

import wisoft.io.designPattern.vedingMachine.beverage.Beverage;

public interface State {

    Beverage setIce(Beverage beverage);
    String getState();

}
