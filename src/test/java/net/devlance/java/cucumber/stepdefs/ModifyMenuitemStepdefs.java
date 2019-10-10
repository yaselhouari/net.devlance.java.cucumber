package net.devlance.java.cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.devlance.java.cucumber.MenuItem;
import net.devlance.java.cucumber.RestaurantMenu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ModifyMenuitemStepdefs {

    RestaurantMenu restaurantMenu;
    MenuItem cucumberSandwitch, cucumberSalad;

    @Given("Menu item with name {string} and price {int} exists")
    public void menu_item_with_name_and_price_exists(String string, Integer int1) {
        restaurantMenu = new RestaurantMenu ();
        cucumberSandwitch = new MenuItem (string, 20);
        restaurantMenu.add(new MenuItem(string, 20));
        assertTrue(restaurantMenu.findItem(string));
    }

    @When("I modify that Item to {string} and price {int}")
    public void i_modify_that_Item_to_and_price(String string, Integer int1) {
        cucumberSalad = new MenuItem(string, int1);
        restaurantMenu.modify(cucumberSandwitch.getName (), cucumberSalad);
        System.out.println ("Cucumber Sandwitc.getName() :" + cucumberSandwitch.getName ());
    }

    @Then("That item should be modifed")
    public void that_item_should_be_modifed() {
       assertFalse(restaurantMenu.findItem(cucumberSandwitch.getName()));
       assertTrue(restaurantMenu.findItem(cucumberSalad.getName()));
    }
}
