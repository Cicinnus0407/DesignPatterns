package creational.factory.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * 调用方法
 */
public class Main {
    public static void main(String[] args) {
        PictureFactory pictureFactory = (GIFFactory) XMLUtil.getBean();
        Picture picture;
        if (pictureFactory != null) {
            picture = pictureFactory.readPicture();
            picture.analysis();
        }
    }
}
