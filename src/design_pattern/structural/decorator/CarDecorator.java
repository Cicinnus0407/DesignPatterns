package design_pattern.structural.decorator;

/**
 * Created by Cicinnus on 2017/10/1.
 * 对车的装饰类
 */
public class CarDecorator extends Car {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void speedup() {
        System.out.println("加速前强化");
        car.speedup();
    }

    @Override
    public void stop() {
        car.stop();
    }


}
