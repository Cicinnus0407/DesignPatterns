package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class TXTFile extends AbstractFile {
    @Override
    public void convert() {
        ExactData exactData = new ExactData();
        exactDataImpl.readFrom(exactData);
        System.out.println("转为TXT文件");
    }
}
