Feature: Add a menu item
  Background: Initial haves
    Given I have a menu item "Cucumber Sandwich" and price 20
    When I add that menu item
  Scenario: Add a menu item
    Then Menu item with name "Cucumber Sandwich" will be added

  Scenario: Add a menu item that already exists
    And "Cucumber Sandwich" menu item already exists
    Then Menu item with name "Cucumber Sandwich" will not be added
