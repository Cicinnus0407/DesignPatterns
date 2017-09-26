package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 笔记本建造者
 */
public abstract class LaptopBuilder {
    //protected修饰可以被子类对象访问
    Laptop laptop = new Laptop();

    public abstract void buildScreen();
    public abstract void buildWifi();
    public abstract void buildKeyboard();
    public abstract void buildBlueTooth();

    public Laptop construct( ){
        this.buildScreen();
        this.buildWifi();
        this.buildBlueTooth();
        this.buildKeyboard();

        return laptop;
    }


}
