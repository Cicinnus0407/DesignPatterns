package design_pattern.structural.adapter;

/**
 * Created by Cicinnus on 2017/9/27.
 * 数据操作抽象类
 */
public abstract class DataOperation {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String encrypt(int key, String pwd);
}
