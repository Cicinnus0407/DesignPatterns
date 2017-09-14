package creational.factory.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 */
public class ReadException extends Exception {
    @Override
    public String getMessage() {
        return "读取图片出错";
    }
}
