@addToCart
Feature: Add item to the cart

  Scenario:user add item to cart and checkout
    Given user open Ikea Portal
    When user add product to bag
    And user go to the bag
    And user click on continue to checkout
    And User fill his personal data for delivery
    And user click next button for delivery
    And user click next button to go checkout
    And user choose pay by credit debit card
    And user fills his card
    And user click pay now
    Then user should see a success Icon
    And user should see a confirmation Number


  Scenario:user add item to cart and checkout
    Given user open Ikea Portal
    When user add product to bag
    And user go to the bag
    And user click on continue to checkout
    And user choose Click & Collect
    And  User fill his personal data for click and collect
    And user click next button for click and collect
    And user click next button to go checkout
    And user choose pay by credit debit card
    And user fills his card
    And user click pay now
    Then user should see a success Icon
    And user should see a confirmation Number
