package creational.factory.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 需要创建的图行接口
 */
public interface Shape {
    //无论什么图型都有绘制和擦除方法
    void draw();
    void erase();
}
