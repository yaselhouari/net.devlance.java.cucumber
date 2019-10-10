package net.devlance.java.cucumber;

import java.util.ArrayList;

public class RestaurantMenu {
    ArrayList<MenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new  ArrayList<MenuItem>();
    }

    public boolean add(MenuItem menuItem) {
        if(! findItem(menuItem.name)) {
            menuItems.add ( menuItem );
            return true;
        }
        return false;
    }

    public boolean findItem(String string) {
        for (MenuItem menuItem:menuItems) {
            if(menuItem.name.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public void delete(MenuItem cucumberSandwitch) {
        int index = 0;
        for (MenuItem menuItem:menuItems) {
            if(menuItem.name.equals(cucumberSandwitch.name)) {
                menuItems.remove(index);
            }
            index++;
        }
    }

    public void modify(String thename, MenuItem menuItem) {
        int index = 0;
        for (MenuItem aMenuItem:menuItems) {
            if(aMenuItem.getName().equals(thename)) {
                menuItems.set(index, menuItem);
            }
            index++;
        }
    }

    public ArrayList<MenuItem> getAllItems() {
        return this.menuItems;
    }
}
