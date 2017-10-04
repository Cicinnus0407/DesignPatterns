package design_pattern.structural.proxy;

/**
 * Created by Cicinnus on 2017/10/2.
 */
public class RealPermission implements AbstractPermisson {
    @Override
    public void modifyUserInfo(String userId) {
        System.out.println("修改用户信息");
    }

    @Override
    public void viewNote() {
        System.out.println("查看文档");
    }

    @Override
    public void publishNote() {
        System.out.println("发布文档");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改文档");
    }

    @Override
    public void setLevel(int level) {

    }
}
