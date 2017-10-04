package design_pattern.structural.proxy;

/**
 * Created by Cicinnus on 2017/10/2.
 * 抽象权限接口
 */
public interface AbstractPermisson {
    void modifyUserInfo(String userId);

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);

}
