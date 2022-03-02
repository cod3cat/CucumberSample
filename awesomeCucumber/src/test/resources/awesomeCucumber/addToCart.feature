Feature: Add to cart
  Rule: Add from store

    @scenario2
    Scenario Outline: Add one quantity to the cart
      Given I'm on the store page
      When I add a "<product name>" to the cart
      Then I see <quantity> "<product name>" in the cart

      Examples:
        | product name | quantity |
        | Blue shoes   | 1        |
