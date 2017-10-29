package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 创建系统公告板类:具体命令类
 */
public class CreateCommand extends AbstractCommand {
    private BoardScreen boardScreen;

    public CreateCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.create();
    }

}
