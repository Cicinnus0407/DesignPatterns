package creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 戴尔电脑builder
 */
public class DellBuilder extends LaptopBuilder {
    @Override
    public void buildScreen() {
        laptop.setScreen("戴尔屏幕");
    }

    @Override
    public void buildWifi() {
        laptop.setWifi("戴尔wifi");
    }

    @Override
    public void buildKeyboard() {
        laptop.setKeyboard("戴尔键盘");
    }

    @Override
    public void buildBlueTooth() {
        laptop.setBluetooth("戴尔蓝牙");
    }
}
