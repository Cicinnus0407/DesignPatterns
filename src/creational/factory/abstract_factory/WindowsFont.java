package creational.factory.abstract_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 * Windows字体
 */
public class WindowsFont implements Font{
    @Override
    public void display() {
        System.out.println("显示Windows字体");
    }
}
