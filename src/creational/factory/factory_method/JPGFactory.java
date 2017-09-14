package creational.factory.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * 解析JPG图片的工厂类
 */
public class JPGFactory implements PictureFactory{

    @Override
    public Picture readPicture() {
        System.out.println("读取jpg图片");
        return new JPGPicture();
    }
}
