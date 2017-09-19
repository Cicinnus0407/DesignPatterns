package creational.abstract_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 * Windows的按钮
 */
public class WindowsButton implements Button {


    @Override
    public void display() {
        System.out.println("显示Windows按钮");
    }
}
