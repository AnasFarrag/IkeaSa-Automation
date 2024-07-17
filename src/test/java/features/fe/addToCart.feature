@addToCart
Feature: Add item to the cart

  Scenario:user add item to cart and checkout
    Given user open Ikea Portal
    When user add product to bag
    And user go to the bag
#    Then user should find the selected product in the bag
    And user click on continue to checkout
#    And user choose Delivery option
    And User fill his personal data for delivery
    And user click next button for delivery
#    Then user should see the products total amount of money
#    And user should see the Parcel delivery fees



  Scenario:user add item to cart and checkout
    Given user open Ikea Portal
    When user add product to bag
    And user go to the bag
#    Then user should find the selected product in the bag
    And user click on continue to checkout
    And user choose Click & Collect
    And  User fill his personal data for click and collect
    And user click next button for click and collect
#    Then user should see the products total amount of money
#    And user should see the Click & collect fees are Free
