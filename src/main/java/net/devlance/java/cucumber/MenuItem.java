package net.devlance.java.cucumber;

public class MenuItem {
    String name;
    int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
}
