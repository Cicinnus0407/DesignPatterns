package creational.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * jpg类实现picture的解析方法
 */
public class JPGPicture implements Picture {
    @Override
    public void analysis() {
        System.out.println("解析JPG图片");
    }
}
