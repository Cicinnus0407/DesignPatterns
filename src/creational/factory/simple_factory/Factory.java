package creational.factory.simple_factory;

/**
 * Created by Cicinnus on 2017/9/14.
 * 工厂类,用于创建各种图表
 */
public class Factory {

    public static Shape getChart(String type){
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
