package creational.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * 调用方法
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        PictureFactory pictureFactory = (PictureFactory) XMLUtil.getBean();
        pictureFactory.analysisPicture();
    }
}
