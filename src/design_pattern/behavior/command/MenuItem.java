package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 菜单项
 */
public class MenuItem {


    private String name;//按钮名称
    private AbstractCommand abstractCommand;//抽象命令

    public MenuItem(String name) {
        this.name = name;
    }

    public void setCommand(AbstractCommand command) {
        this.abstractCommand = command;
    }

    public void click() {
        abstractCommand.execute();
    }
}
