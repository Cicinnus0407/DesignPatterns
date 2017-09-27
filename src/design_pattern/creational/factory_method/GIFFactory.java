package design_pattern.creational.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * git工厂类
 */
public class GIFFactory extends PictureFactory {
    @Override
    public Picture readPicture() {
        System.out.println("读取gif图片");
        return new GIFPicture();
    }
}
