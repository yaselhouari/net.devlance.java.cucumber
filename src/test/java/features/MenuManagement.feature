Feature: Menu Management
  Scenario: Add a menu item
    Given I have a menu item "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name"Cucumber Sandwich" will be added