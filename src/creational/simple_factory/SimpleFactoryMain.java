package creational.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 客户端调用工厂方法获取图形,并调用方法
 */
public class SimpleFactoryMain {
    public static void main(String[] args){
        Shape shape ;
        shape = ShapeFactory.getShape(SimpleFactoryXmlUtil.getShapeType());
        shape.draw();
        shape.erase();

    }
}
