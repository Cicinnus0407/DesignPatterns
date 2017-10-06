package design_pattern.creational.builder.builder2;

/**
 * Created by Cicinnus on 2017/10/6.
 */
public class Builder2Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.Builder()
                .setBluetooth("蓝牙模块")
                .setKeyboard("键盘模块")
                .setScreen("屏幕")
                .setWifi("Wifi")
                .build();
        laptop.dispaly();
    }
}
