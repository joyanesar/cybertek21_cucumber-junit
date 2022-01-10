
@librarian
Feature: As a user login  to librarian page

  Scenario: login
    Given User is on the librarian  home page
    When  User should enter email address
    And   User should enter password
    Then  User click on login button
    Then  login page should be displayed