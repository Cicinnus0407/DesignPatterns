package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 编辑系统公告类:具体类
 */
public class EditCommand extends AbstractCommand {

    @Override
    public void execute() {
        System.out.println("编辑公告板");
    }

}
