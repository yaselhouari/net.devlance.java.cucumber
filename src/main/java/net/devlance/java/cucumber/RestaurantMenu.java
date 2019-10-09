package net.devlance.java.cucumber;

import java.util.ArrayList;

public class RestaurantMenu {
    ArrayList<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new  ArrayList<MenuItem>();
    }

    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public boolean findItem(String string) {
        for (MenuItem menuItem:menuItems) {
            if(menuItem.name.equals(string)) {
                return true;
            }
        }
        return false;
    }
}
