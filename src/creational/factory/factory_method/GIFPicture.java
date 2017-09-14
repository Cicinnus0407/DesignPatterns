package creational.factory.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * gif图片实现picture解析方法
 */
public class GIFPicture implements Picture {
    @Override
    public void analysis() {
        System.out.println("解析GIF图片");
    }
}
