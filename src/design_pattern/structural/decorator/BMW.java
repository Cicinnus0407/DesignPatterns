package design_pattern.structural.decorator;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class BMW extends Car {
    @Override
    public void speedup() {
        System.out.println("宝马加速");
    }

    @Override
    public void stop() {
        System.out.println("宝马停车");
    }
}
