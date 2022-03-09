Feature: Add to cart
  Rule: Add from store
    Scenario: Add one quantity to the cart
      Given I'm on the store page
      When I add a "Blue Shoes" to the cart
      Then I see 1 "Blue Shoes" in the cart

    Scenario Outline: Add one quantity to the cart
      Given I'm on the store page
      When I add a "<product_name>" to the cart
      Then I see 1 "<product_name>" in the cart

      Examples:
        | product_name                    |
        | Anchor Bracelet                 |
        | Black Over-the-shoulder Handbag |