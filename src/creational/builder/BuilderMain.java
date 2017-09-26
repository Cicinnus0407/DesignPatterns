package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 建造者模式入口
 */
public class BuilderMain {
    public static void main(String[] args) {
        LaptopBuilder laptopBuilder = (LaptopBuilder) BuilderXMLUtil.getBean();

        Laptop laptop = laptopBuilder.construct();
        System.out.println(laptop.toString());


    }
}
