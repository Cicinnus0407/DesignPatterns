package design_pattern.behavior.mediator;

/**
 * Created by Cicinnus on 2017/10/10.
 */
public class ListPane extends Pane {
    @Override
    public void update() {
        System.out.println("列表刷新");
    }
    public void selected(){
        System.out.println("列表选中");
    }
}
