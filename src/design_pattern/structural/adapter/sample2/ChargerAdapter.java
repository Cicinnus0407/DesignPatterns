package design_pattern.structural.adapter.sample2;

/**
 * Created by Cicinnus on 2017/10/6.
 * 类适配器
 */
public class ChargerAdapter  extends Computer implements Socket {

    @Override
    public void supplyWith220V() {
        System.out.println("连接220V插座");
        super.connectWith20V();
    }
}
