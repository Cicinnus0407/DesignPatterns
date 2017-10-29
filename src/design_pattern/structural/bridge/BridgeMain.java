package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class BridgeMain {
    public static void main(String[] args) {
        try {
            AbstractFile abstractFile = new TXTFile();
            ExactDataImpl exactDataImpl = new MySQLImpl();
            abstractFile.setExactDataImpl(exactDataImpl);
            abstractFile.convertTo();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
