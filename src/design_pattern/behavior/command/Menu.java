package design_pattern.behavior.command;

import java.util.ArrayList;

/**
 * Created by Cicinnus on 2017/10/9.
 */
public class Menu {

    private ArrayList<MenuItem> menuItems ;

    public Menu() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public void removeMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
    }

}
