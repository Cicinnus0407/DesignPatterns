package design_pattern.structural.adapter;

import design_pattern.ObjectXMLUtil;

/**
 * Created by Cicinnus on 2017/9/27.
 * 适配器模式入口
 */
public class AdapterMain {
    public static void main(String[] args) {
        DataOperation dataOperation = (DataOperation) ObjectXMLUtil.getBean("src/design_pattern/structural/adapter/config.xml");
        if (dataOperation != null) {
            dataOperation.setPassword("cicinnus");
            String pwd = dataOperation.getPassword();
            String encryptedPwd = dataOperation.encrypt(5,pwd);
            System.out.println(pwd);
            System.out.println(encryptedPwd);
        }
    }
}
