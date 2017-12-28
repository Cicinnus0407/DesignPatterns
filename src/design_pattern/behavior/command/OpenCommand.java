package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 打开系统公告类:具体命令类
 */
public class OpenCommand extends AbstractCommand {


    @Override
    public void execute() {
        System.out.println("打开公告板");
    }
}
