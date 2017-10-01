package design_pattern.structural.composite;

/**
 * Created by Cicinnus on 2017/10/1.
 * 抽象组件,包涵容器型和控件型
 */
public abstract class Component {
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
    //共有的操作方法
    public abstract void operation();
}
