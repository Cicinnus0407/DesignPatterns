package design_pattern.creational.simple_factory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by Cicinnus on 2017/9/16.
 * 读取xml中的图形
 */
public class SimpleFactoryXmlUtil {
    public static String getShapeType() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/design_pattern/creational/simple_factory/config.xml"));
            NodeList nodeList = document.getElementsByTagName("shapeType");
            Node node = nodeList.item(0).getFirstChild();
            return node.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
