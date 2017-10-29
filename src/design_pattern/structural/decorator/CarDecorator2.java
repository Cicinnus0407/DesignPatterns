package design_pattern.structural.decorator;

/**
 * Created by Cicinnus on 2017/10/14.
 */
public class CarDecorator2 extends Car {
    private Car car;

    @Override
    public void speedup() {
        System.out.println("使用No2");
        car.speedup();

    }

    @Override
    public void stop() {
        car.stop();
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
