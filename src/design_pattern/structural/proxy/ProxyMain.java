package design_pattern.structural.proxy;

import design_pattern.ObjectXMLUtil;

/**
 * Created by Cicinnus on 2017/10/2.
 */
public class ProxyMain {
    public static void main(String[] args) {
        AbstractPermisson permisson = (AbstractPermisson) ObjectXMLUtil.getBean("src/design_pattern/structural/proxy/config.xml");
        if (permisson != null) {

            System.out.println("配置权限前---------------------");
            permisson.modifyUserInfo("123");
            permisson.viewNote();
            permisson.modifyNote();
            permisson.publishNote();
            System.out.println("配置权限后--------------------");
            permisson.setLevel(1);
            permisson.modifyUserInfo("123");
            permisson.viewNote();
            permisson.modifyNote();
            permisson.publishNote();
        }
    }
}
