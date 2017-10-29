package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 公告板系统界面
 */
public class BoardScreen {

    public void open(){
        System.out.println("打开公告板");
    }
    public void create(){
        System.out.println("创建公告板");
    }
    public void edit(){
        System.out.println("编辑公告板");
    }
}
