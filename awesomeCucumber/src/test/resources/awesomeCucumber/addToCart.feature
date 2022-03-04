Feature: Add to cart
  Rule: Add from store
    Scenario: Add one quantity to the cart
      Given I'm on the store page
      When I add a "Blue Shoes" to the cart
      Then I see 1 "Blue Shoes" in the cart