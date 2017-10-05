package design_pattern.creational.single_instance;

/**
 * Created by Cicinnus on 2017/9/18.
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public LazySingleton   getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class){
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
