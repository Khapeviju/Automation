Feature: Login of Flipkart application

  Scenario: User should be logged on with valid credentilas
    Given User is on login page
    When User enter valid credentials
    Then Home page should be displayed
