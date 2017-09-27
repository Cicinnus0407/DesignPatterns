package design_pattern.creational.single_instance;

/**
 * Created by Cicinnus on 2017/9/18.
 */
public class IoDHSingleton {
    private IoDHSingleton (){}

    private IoDHSingleton getInstance(){
        return Holder.ioDHSingleton;
    }

    private static class Holder{
        private static IoDHSingleton ioDHSingleton = new IoDHSingleton();

    }
}
