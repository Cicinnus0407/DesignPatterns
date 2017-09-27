package design_pattern.creational.factory_method;

/**
 * Created by Cicinnus on 2017/9/14.
 * 图片工厂接口
 */
public abstract class PictureFactory {
    //读取图片方法
    public abstract Picture readPicture();

    public void analysisPicture(){
        Picture picture = this.readPicture();
        picture.analysis();
    }
}
