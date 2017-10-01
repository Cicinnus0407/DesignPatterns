package design_pattern.structural.composite;

/**
 * Created by Cicinnus on 2017/10/1.
 * 按钮组件
 */
public class ButtonComponent extends Component{
    @Override
    public void add(Component component) {
        System.out.println("不支持该方法");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不支持该方法");
    }

    @Override
    public Component getChild(int index) {
        System.out.println("不支持该方法");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("按钮点击");
    }
}
