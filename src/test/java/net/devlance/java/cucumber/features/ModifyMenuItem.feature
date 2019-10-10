Feature: Modify a menu item
  Scenario: Modify a menu item
    Given Menu item with name "Cucumber Sandwitch" and price 20 exists
    When I modify that Item to "Cucumber Salad" and price 30
    Then That item should be modifed