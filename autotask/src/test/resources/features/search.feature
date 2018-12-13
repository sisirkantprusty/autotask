Feature: Search functionality
  I as end user should be able to search for article successfully

  Scenario: I as an user should be able search the product by keyword
    Given The user in portal
    Then Clicks on search field
    And Searches for a key word
    Then Search result is displayed

  Scenario: No results found message should be displayed if keyword does not fetch any result
    Given The user in portal
    Then Clicks on search field
    And Searches for a keyword such as "QWQQWQWRETUEQWQE"
    Then No Search result found page is displayed
