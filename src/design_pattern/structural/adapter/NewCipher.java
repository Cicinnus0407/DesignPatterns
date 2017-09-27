package design_pattern.structural.adapter;

/**
 * Created by Cicinnus on 2017/9/27.
 * 新的加密算法类
 */
public class NewCipher {

    public String encrypt(int key, String pwd) {
        String encryptedPwd = "";
        for (int i = 0; i < pwd.length(); i++) {
            //将密码的每一位整除key
            String c = String.valueOf(pwd.charAt(i) % key);
            encryptedPwd += c;
        }
        return encryptedPwd;
    }
}
