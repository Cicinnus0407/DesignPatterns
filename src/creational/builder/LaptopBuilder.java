package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 笔记本建造者
 */
public abstract class LaptopBuilder {
    //protected修饰可以被子类对象访问
    protected Laptop laptop = new Laptop();

    public abstract void buildScreen();
    public abstract void buildWifi();
    public abstract void buildKeyboard();
    public abstract void buildBlueTooth();

    public Laptop build(){
       this.buildScreen();
       this.buildWifi();
       this.buildKeyboard();
       this.buildBlueTooth();
        return laptop;
    }


}
