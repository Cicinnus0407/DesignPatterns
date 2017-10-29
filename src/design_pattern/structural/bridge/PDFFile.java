package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class PDFFile extends AbstractFile {
    @Override
    public void convertTo() {
        ExactData exactData =  exactDataImpl.readFromDB();

        System.out.println("转换为PDF文件");
    }
}
