package design_pattern.creational.prototype;

/**
 * Created by Cicinnus on 2017/10/4.
 */
public interface AbstractCustomer extends Cloneable{
    AbstractCustomer clone();
    void display();
}
