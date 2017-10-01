package design_pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cicinnus on 2017/10/1.
 * 窗体组件
 */
public class WindowComponent extends Component{

    private List<Component> componentList = new ArrayList<>();


    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return componentList.get(index);
    }

    @Override
    public void operation() {
        for (Component component : componentList) {
            component.operation();
        }
    }
}
