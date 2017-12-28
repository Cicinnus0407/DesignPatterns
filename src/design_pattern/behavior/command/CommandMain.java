package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 */
public class CommandMain {

    public static void main(String[] args) {
        MenuItem menuItem1  = new MenuItem("创建");
        MenuItem menuItem2  = new MenuItem("打开");
        MenuItem menuItem3  = new MenuItem("编辑");

        Menu menu = new Menu();
        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);


        AbstractCommand open,create,edit;
        open = new OpenCommand();
        create = new CreateCommand();
        edit = new EditCommand();


        menuItem1.setCommand(create);
        menuItem2.setCommand(open);
        menuItem3.setCommand(edit);

        //单个按钮操作
        menuItem1.click();
        menuItem2.click();
        menuItem3.click();

        //执行所有按钮操作
//        menu.executeAll();
    }


}
