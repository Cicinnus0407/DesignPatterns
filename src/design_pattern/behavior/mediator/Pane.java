package design_pattern.behavior.mediator;

/**
 * Created by Cicinnus on 2017/10/10.
 * 抽象窗格对象
 */
public abstract class Pane {
    protected AbstractWindow abstractWindow;

    public void setAbstractWindow(AbstractWindow abstractWindow) {
        this.abstractWindow = abstractWindow;
    }

    public void changed(){
        abstractWindow.componentChanged(this);
    }

    public abstract void update();
}
