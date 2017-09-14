package creational.factory.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 圆形
 */
public class Round implements Shape {
    public Round() {
        System.out.println("创建绘制圆形工具");
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
