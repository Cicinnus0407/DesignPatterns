package design_pattern.behavior.command;

/**
 * Created by Cicinnus on 2017/10/9.
 * 打开系统公告类:具体命令类
 */
public class OpenCommand extends AbstractCommand {
    private BoardScreen boardScreen;

    public OpenCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.open();
    }
}
