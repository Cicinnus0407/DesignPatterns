package design_pattern.structural.adapter.sample2;

/**
 * Created by Cicinnus on 2017/10/6.
 * 对象适配器
 */
public class Charger2Adapter implements Socket{
    private Computer computer;
    public Charger2Adapter(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void supplyWith220V() {
        System.out.println("连接220V插座");
        computer.connectWith20V();
    }
}
