package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 */
public class CommandMain {

    public static void main(String[] args) {
        MenuItem menuItem1  = new MenuItem("打开");
        MenuItem menuItem2  = new MenuItem("新建");
        MenuItem menuItem3  = new MenuItem("编辑");

        Menu menu = new Menu();
        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);

        BoardScreen boardScreen = new BoardScreen();

        AbstractCommand open,create,edit;
        open = new OpenCommand(boardScreen);
        create = new CreateCommand(boardScreen);
        edit = new EditCommand(boardScreen);


        menuItem1.setCommand(create);
        menuItem2.setCommand(open);
        menuItem3.setCommand(edit);

        menuItem1.click();
        menuItem2.click();
        menuItem3.click();
    }


}
