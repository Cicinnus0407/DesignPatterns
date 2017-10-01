package design_pattern.structural.bridge;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public class BridgeXMLUtil {

    public static Object getObject(String args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/design_pattern/structural/bridge/config.xml"));
        NodeList nodeList = document.getElementsByTagName("className");
        String className = null;
        if (args.equals("file")) {
            className = nodeList.item(0).getFirstChild().getNodeValue();
        }else if(args.equals("db")){
            className = nodeList.item(1).getFirstChild().getNodeValue();
        }
        Class cls = Class.forName(className);
        return cls.newInstance();
    }
}
