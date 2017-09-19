package creational.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 正方形
 */
public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("创建绘制正方形工具");
    }

    @Override
    public void draw() {
        System.out.println("绘制正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除正方形");
    }
}
