Feature: Parallel functionality
  I as end user should be able to run the test cases parallely

  Scenario: I as an user should be run the test cases parallely
    Given The user in eclipse
    Then runs the tc
    And try again
    Then run should be successful
