Feature: Make sure the registration of the user is successful
  I as an end user should be able to register in Flight booking site

  @Smoketest
  Scenario: I as an user should be able to register for Flight booking site
    Given The user navigates to newtours site
    Then Clicks on Register
    And Enters the necessary user details
    When Clicks on Submit button
    Then Registration should be successful

  Scenario: I as an user should not be able to register without providing the password
    Given The user navigates to newtours site
    Then Clicks on Register
    And Enters the necessary user name
    When Clicks on Submit button
    Then Registation should not be successful