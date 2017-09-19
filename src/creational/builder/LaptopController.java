package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 建造者控制器
 */
public class LaptopController {
    public Laptop construct(LaptopBuilder builder){
        Laptop laptop;
        builder.buildScreen();
        builder.buildWifi();
        builder.buildBlueTooth();
        builder.buildKeyboard();
        laptop = builder.build();
        return laptop;
    }
}
