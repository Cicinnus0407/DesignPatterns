package design_pattern.creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 联想电脑builder
 */
public class LenovoBuilder extends LaptopBuilder {
    @Override
    public void buildScreen() {
        laptop.setScreen("联想屏幕");
    }

    @Override
    public void buildWifi() {
        laptop.setWifi("联想wifi");
    }

    @Override
    public void buildKeyboard() {
        laptop.setKeyboard("联想键盘");
    }

    @Override
    public void buildBlueTooth() {
        laptop.setBluetooth("联想蓝牙");
    }
}
