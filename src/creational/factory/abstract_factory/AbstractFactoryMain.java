package creational.factory.abstract_factory;

/**
 * Created by Cicinnus on 2017/9/16.
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        Button button;
        Font font;
        Factory factory = ((Factory) XMLUtil.getBean());
        if (factory != null) {
            button = factory.createButton();
            font = factory.createFont();
            button.display();
            font.display();
        }
    }
}
