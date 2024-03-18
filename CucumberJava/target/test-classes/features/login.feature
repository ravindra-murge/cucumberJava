@smoketest
Feature: feature to test login functionality

  Background: 
    Given user is on login page
    

  Scenario: check login is successful
    When user eneter username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario Outline: check login is successful functionality
    When user eneters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | ravindra |    12345 |
      | Admin    | admin123 |
