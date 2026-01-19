Feature: Add to cart

  As a customer of AskOmDch website
  I want to add products to the cart
  So that I can purchase the products

  Rule: Add from Store page

    Background:
      Given I am on the Store page of AskOmDch website

    Scenario: Successfully add single product to cart
      When I click Add to Cart button for "Blue Shoes"
      Then I should see the View Cart button
      And the cart count should show "1"

#    Scenario: Add multiple different products to cart
#      When I add "Blue Shoes" to cart
#      And I add "Denim Jacket" to cart
#      Then the cart count should show "2 items"
#      And both products should be visible in the cart
#
#  Rule: Add from Product page
#
#    Background: Common Given steps
#      Given I am on the Product details page for "Blue Shoes"
#
#    Scenario: Add product with default options
#      When I click the Add to Cart button
#      Then I should see a success message
#      And the product should appear in my cart
#
#    Scenario: Add product with quantity selection
#      When I select quantity "3"
#      And I click the Add to Cart button
#      Then "3" units of the product should be in my cart
#      And the cart total should be updated correctly