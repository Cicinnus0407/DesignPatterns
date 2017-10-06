package design_pattern.structural.adapter.sample2;

/**
 * Created by Cicinnus on 2017/10/6.
 * 接口适配器
 */
public class Charger3Adapter extends ComputerAdapter {

    private Computer computer;

    @Override
    public void supplyWith220V() {
        super.supplyWith220V();
    }

    public void connectWith20V() {
        this.supplyWith220V();
        computer.connectWith20V();
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
