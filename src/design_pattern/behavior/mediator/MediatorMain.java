package design_pattern.behavior.mediator;

/**
 * Created by Cicinnus on 2017/10/10.
 */
public class MediatorMain {
    public static void main(String[] args) {
        ConcreteWindow concreteWindow = new ConcreteWindow();

        ButtonPane buttonPane = new ButtonPane();
        TextPane textPane = new TextPane();
        ListPane listPane = new ListPane();
        GridPane gridPane = new GridPane();

        concreteWindow.buttonPane = buttonPane;
        concreteWindow.textPane = textPane;
        concreteWindow.listPane = listPane;
        concreteWindow.gridPane = gridPane;

        buttonPane.setAbstractWindow(concreteWindow);
        textPane.setAbstractWindow(concreteWindow);
        listPane.setAbstractWindow(concreteWindow);
        gridPane.setAbstractWindow(concreteWindow);

//        textPane.update();

        buttonPane.changed();

    }
}
