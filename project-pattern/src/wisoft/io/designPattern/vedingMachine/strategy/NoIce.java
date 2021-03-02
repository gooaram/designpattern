package wisoft.io.designPattern.vedingMachine.strategy;

public class NoIce implements IceAmount {
    @Override
    public String iceAmount() {
        return "";
    }
}
