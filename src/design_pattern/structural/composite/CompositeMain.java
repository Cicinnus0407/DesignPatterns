package design_pattern.structural.composite;

/**
 * Created by Cicinnus on 2017/10/1.
 */
public class CompositeMain {
    public static void main(String[] args) {
        Component buttonComponent = new ButtonComponent();
        Component textAreaComponent = new TextAreaComponent();
        Component windowComponent = new WindowComponent();
        windowComponent.add(buttonComponent);
        windowComponent.add(textAreaComponent);
        windowComponent.operation();
    }
}
