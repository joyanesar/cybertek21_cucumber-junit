Feature: User test  login  functionality

  Scenario Outline:  login with different credential
    Given User is on the facebook page
    When  User should enter email "<email>" password "<password>"
    And  User click login button
    Then  Facebook login page should be displayed
    Examples:
      | email| password|
      |joyanisar@gmail.com|afghan30|