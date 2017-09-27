package design_pattern.creational.abstract_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 * Mac工厂
 */
public class MacFactory implements Factory{

    @Override
    public Button createButton() {
        System.out.println("生产Mac按钮");
        return new MacButton();
    }

    @Override
    public Font createFont() {
        System.out.println("生产Mac字体");
        return new MacFont();
    }
}
