package wisoft.io.designPattern.vedingMachine.beverage;

import wisoft.io.designPattern.vedingMachine.state.Hot;
import wisoft.io.designPattern.vedingMachine.state.State;
import wisoft.io.designPattern.vedingMachine.strategy.*;

public abstract class Beverage {

    private String name;
    private IceAmount iceAmount;
    private SugarAmount sugarAmount;
    private State state;

    public Beverage (String name) {
        this.name = name;
        state = new Hot();
    }

    protected Beverage() {}

    public String getName() {
        return this.name;
    }

    public String selectedIceAmount() { return iceAmount.iceAmount(); }
    public String selectedSugarAmount() { return sugarAmount.sugarAmount(); }

    public void setIceAmount(IceAmount ice_a) { this.iceAmount = ice_a; }
    public void setSugarAmount(SugarAmount sugar_a) {
        this.sugarAmount = sugar_a;
    }

    public abstract String addOption();

    public void setState(State state) {
        this.state = state;
    }

    public String getState() {
        return state.getState();
    }

    public Beverage setIce() {
        return state.setIce(this);
    }

}