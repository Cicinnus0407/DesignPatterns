package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class TXTFile extends AbstractFile {
    @Override
    public void convertTo() {
        ExactData exactData =   exactDataImpl.readFromDB();

        System.out.println("转为TXT文件");
    }
}
