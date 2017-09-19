package creational.single_instance;

/**
 * Created by Cicinnus on 2017/9/18.
 * 饿汉式单例
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
