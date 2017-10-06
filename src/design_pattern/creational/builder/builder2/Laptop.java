package design_pattern.creational.builder.builder2;

/**
 * Created by Cicinnus on 2017/10/6.
 * Builder的另一种形式
 */
public class Laptop {

    private Builder builder;

    private Laptop(Builder builder) {
        this.builder = builder;
    }

    public void dispaly() {
        System.out.println("笔记本使用---\n");
        System.out.println(builder.toString());
    }

    public static class Builder {

        //蓝牙模块
        private String bluetooth;
        //wifi模块
        private String wifi;
        //屏幕
        private String screen;
        //键盘
        private String keyboard;

        public Builder setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder setWifi(String wifi) {
            this.wifi = wifi;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "bluetooth='" + bluetooth + '\'' +
                    ", wifi='" + wifi + '\'' +
                    ", screen='" + screen + '\'' +
                    ", keyboard='" + keyboard + '\'' +
                    '}';
        }
    }
}
