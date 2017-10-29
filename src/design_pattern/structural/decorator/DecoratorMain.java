package design_pattern.structural.decorator;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Car car = new WuLingHongGuang();
        CarDecorator carDecorator = new CarDecorator();
        carDecorator.setCar(car);
        carDecorator.speedup();
        carDecorator.stop();
    }
}
