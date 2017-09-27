package design_pattern.creational.builder;

/**
 * Created by Cicinnus on 2017/9/19.
 * 笔记本电脑对象
 */
public class Laptop {
    //蓝牙模块
    private String bluetooth;
    //wifi模块
    private String wifi;
    //屏幕
    private String screen;
    //键盘
    private String keyboard;
    //...


    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "bluetooth='" + bluetooth + '\'' +
                ", wifi='" + wifi + '\'' +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
