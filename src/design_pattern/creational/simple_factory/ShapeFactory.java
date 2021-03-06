package design_pattern.creational.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 工厂类,用于创建各种图表
 */
public class ShapeFactory {
    public static Shape getShape(String type)  {
        Shape shape =null;
        if(type.equalsIgnoreCase("round")){
            shape = new Round();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else if(type.equalsIgnoreCase("triangle")){
            shape = new Triangle();
        }
        return shape;
    }
}
