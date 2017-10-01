package design_pattern.structural.decorator;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class Audi extends Car{
    @Override
    public void speedup() {
        System.out.println("奥迪加速");
    }

    @Override
    public void stop() {
        System.out.println("奥迪停车");
    }
}
