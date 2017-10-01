package design_pattern.creational.abstract_factory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by Cicinnus on 2017/9/14.
 * 从xml读取配置
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src/design_pattern/creational/abstract_factory/config.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String name = node.getNodeValue();
            //反射获取Java类
            Class clzz = Class.forName(name);
            //创建对象
            return clzz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
