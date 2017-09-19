package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 惠普电脑builder
 */
public class HPBuilder extends LaptopBuilder {
    @Override
    public void buildScreen() {
        laptop.setScreen("惠普屏幕");
    }

    @Override
    public void buildWifi() {
        laptop.setWifi("惠普wifi");
    }

    @Override
    public void buildKeyboard() {
        laptop.setKeyboard("惠普键盘");
    }

    @Override
    public void buildBlueTooth() {
        laptop.setBluetooth("惠普蓝牙");
    }
}
