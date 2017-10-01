package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class BridgeMain {
    public static void main(String[] args) {
        try {
            AbstractFile abstractFile = (AbstractFile) BridgeXMLUtil.getObject("file");
            ExactDataImpl exactDataImpl = (ExactDataImpl) BridgeXMLUtil.getObject("db");
            abstractFile.setExactDataImpl(exactDataImpl);
            abstractFile.convert();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
