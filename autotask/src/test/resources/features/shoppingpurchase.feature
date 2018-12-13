Feature: Order completion using various payment method
   I as an user should be able to place order using Payment Methods

  Scenario: I as an user should be able to place order using Payment Method1
    Given The user logs in with valid userId and Password
    Then Adds products to shopping bag
    When The user is in Checkout
    And Selects Payment1 as Payment method
    And Enters the details of Payment method
    And Submits the order
    Then Purchase should be successful