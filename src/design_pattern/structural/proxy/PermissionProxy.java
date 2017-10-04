package design_pattern.structural.proxy;

/**
 * Created by Cicinnus on 2017/10/2.
 */
public class PermissionProxy implements AbstractPermisson {
    private RealPermission realPermission;
    private int level = 0;

    public PermissionProxy() {
        realPermission = new RealPermission();
    }

    @Override
    public void modifyUserInfo(String userId) {
        if (level == 0) {
            System.out.println("权限不足");
        } else if (level > 0) {
            realPermission.modifyUserInfo(userId);
        }
    }

    @Override
    public void viewNote() {
        if (level == 0) {
            System.out.println("权限不足");
        } else if (level > 0) {
            realPermission.viewNote();
        }
    }

    @Override
    public void publishNote() {
        if (level == 0) {
            System.out.println("权限不足");
        } else if (level > 0) {
            realPermission.publishNote();
        }
    }

    @Override
    public void modifyNote() {
        if (level == 0) {
            System.out.println("权限不足");
        } else if (level > 0) {
            realPermission.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
