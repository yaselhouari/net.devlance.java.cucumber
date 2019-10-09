Feature: Delete a menu item
  Scenario: Delete a menu item
    Given Menu item with name "Cucumber Sandwitch" exists
    When I delete that Item
    Then That item should be deleted