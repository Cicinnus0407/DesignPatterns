package creational.factory.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * git工厂类
 */
public class GIFFactory implements PictureFactory{
    @Override
    public Picture readPicture() {
        System.out.println("读取gif图片");
        return new GIFPicture();
    }
}