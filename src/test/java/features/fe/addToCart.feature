Feature: Add item to the cart
  Scenario:
    Given user open Ikea Portal
    When user add product to bag ////button[contains(@aria-label, 'Add to bag, NEIDEN, Bed frame')]
    And user go to the bag   /// //span[text()='Shopping bag']
    Then user should find the selected product in the bag
    And user click on continue to checkout
    And user redirect to the other checkout link
    And user choose Delivery option
    And User fill his personal data for delivery
    And user click next button
    Then user should see the products total amount of money
    And user should see the Parcel delivery fees



  Scenario:
    Given user open Ikea Portal
    When user add product to bag ////button[contains(@aria-label, 'Add to bag, NEIDEN, Bed frame')]
    And user go to the bag   /// //span[text()='Shopping bag']
    Then user should find the selected product in the bag
    And user click on continue to checkout
    And user redirect to the other checkout link
    And user choose Click & Collect
    And  User fill his personal data for click and collect
    And user click next button
    Then user should see the products total amount of money
    And user should see the Click & collect fees are Free
