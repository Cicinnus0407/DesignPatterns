package design_pattern.structural.Flyweight;

import java.util.HashMap;

/**
 * Created by Cicinnus on 2017/10/1.
 * 单例工厂
 */
public class FileObjectFactory {
    private static FileObjectFactory factory = new FileObjectFactory();
    private HashMap<String, Object> fileObjMap;

    private FileObjectFactory() {
        fileObjMap = new HashMap<>();
        AbstractFileObject picObj = new PicFile();
        AbstractFileObject gifObj = new GifFile();
        AbstractFileObject videoObj = new VideoFile();
        fileObjMap.put("pic", picObj);
        fileObjMap.put("gif", gifObj);
        fileObjMap.put("video", videoObj);
    }

    public static FileObjectFactory getFactory() {
        return factory;
    }

    public AbstractFileObject getFileObj(String type) {

        return (AbstractFileObject) fileObjMap.get(type);
    }

}
