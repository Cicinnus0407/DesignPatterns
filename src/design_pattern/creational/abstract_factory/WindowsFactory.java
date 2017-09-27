package design_pattern.creational.abstract_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 * Windows工厂
 */
public class WindowsFactory implements Factory{


    @Override
    public Button createButton() {
        System.out.println("生产Windows按钮");
        return new WindowsButton();
    }

    @Override
    public Font createFont() {
        System.out.println("生产Windows字体");
        return new WindowsFont();
    }
}
