package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 创建系统公告板类:具体命令类
 */
public class CreateCommand extends AbstractCommand {


    @Override
    public void execute() {
        System.out.println("创建公告板");
    }

}
