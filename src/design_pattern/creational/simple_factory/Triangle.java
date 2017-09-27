package design_pattern.creational.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 三角形
 */
public class Triangle implements Shape {

    public Triangle() {
        System.out.println("创建绘制三角形工具");
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
