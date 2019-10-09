package net.devlance.java.cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.devlance.java.cucumber.MenuItem;
import net.devlance.java.cucumber.RestaurantMenu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MenuManagementStepDefs {

    MenuItem cucumberSandwich;
    RestaurantMenu restaurantMenu;

    @Given("I have a menu item {string} and price {int}")
    public void i_have_a_menu_item_and_price(String string, Integer int1) {
        cucumberSandwich = new MenuItem(string, int1);
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        restaurantMenu = new RestaurantMenu();
        restaurantMenu.add(cucumberSandwich);
    }

    @Then("Menu item with name {string} will be added")
    public void menu_item_with_name_will_be_added(String string) {
        assertTrue (restaurantMenu.findItem(string));
    }
}
