package net.devlance.java.cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.devlance.java.cucumber.MenuItem;
import net.devlance.java.cucumber.RestaurantMenu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DeleteMenuItem {

    RestaurantMenu restaurantMenu;
    MenuItem cucumberSandwitch;

    @Given("Menu item with name {string} exists")
    public void menu_item_with_name_exists(String string) {
        restaurantMenu = new RestaurantMenu ();
        cucumberSandwitch = new MenuItem("string", 20);
        restaurantMenu.add(new MenuItem(string, 20));
        assertTrue(restaurantMenu.findItem(string));
    }

    @When("I delete that Item")
    public void i_delete_that_Item() {
        restaurantMenu.delete(cucumberSandwitch);
    }

    @Then("That item should be deleted")
    public void that_item_should_be_deleted() {
        assertFalse(restaurantMenu.findItem(cucumberSandwitch.getName()));
    }
}
