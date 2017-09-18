package creational.factory.simple_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 * 创建了未知图形的异常类
 */

public class UnSupportShapeException extends Exception {
    @Override
    public String getMessage() {
        return "创建了一个未知图形";
    }
}
