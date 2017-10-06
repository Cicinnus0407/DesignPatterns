package design_pattern.structural.adapter.sample2;

/**
 * Created by Cicinnus on 2017/10/6.
 */
public abstract class ComputerAdapter  implements Socket {
    @Override
    public void supplyWith220V() {
        System.out.println("连接220V插座");
    }
}
