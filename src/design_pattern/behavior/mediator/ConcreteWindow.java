package design_pattern.behavior.mediator;

/**
 * Created by Cicinnus on 2017/10/10.
 */
public class ConcreteWindow extends AbstractWindow {
    public TextPane textPane;
    public GridPane gridPane;
    public ListPane listPane;
    public ButtonPane buttonPane;

    @Override
    public void componentChanged(Pane pane) {
        if (pane == textPane) {
            //文本框改变,按钮变色,列表选中
            buttonPane.update();
            listPane.selected();
        } else if (pane == gridPane) {
            //网格改变,列表刷新
            listPane.update();

        } else if (pane == listPane) {
            //列表改变,文本刷新
            textPane.update();
        } else if (pane == buttonPane) {
            //按钮点击更新三个控件的状态
            textPane.update();
            gridPane.update();
            listPane.update();
        }
    }
}
