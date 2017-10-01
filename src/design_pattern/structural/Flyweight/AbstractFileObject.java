package design_pattern.structural.Flyweight;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public abstract class AbstractFileObject {

    public abstract String getType();


    public void display(Coordinate coordinate,long fileSize) {
        System.out.println("文件类型为:" + getType()
                + " ,文件大小为:" + fileSize
                + " ,文件位置" + coordinate.getX() + ", " + coordinate.getY());
    }

}
