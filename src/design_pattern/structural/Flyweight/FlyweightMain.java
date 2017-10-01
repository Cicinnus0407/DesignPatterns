package design_pattern.structural.Flyweight;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class FlyweightMain {
    public static void main(String[] args) {
        FileObjectFactory factory = FileObjectFactory.getFactory();
        AbstractFileObject picFile1 = factory.getFileObj("pic");
        AbstractFileObject picFile2 = factory.getFileObj("pic");
        AbstractFileObject gifFile1 = factory.getFileObj("gif");
        picFile1.display(new Coordinate(50, 60), 200);
        picFile2.display(new Coordinate(60, 70), 300);
        gifFile1.display(new Coordinate(70, 80), 400);

    }
}
