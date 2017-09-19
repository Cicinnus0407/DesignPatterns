package creational.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 需要创建的图形接口
 * 无论什么图型都有绘制和擦除方法
 */
public interface Shape {
    void draw();
    void erase();
}
