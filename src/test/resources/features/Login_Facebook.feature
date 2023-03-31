@fc
Feature: As a user login  to facebook page

  Scenario: login
    Given User is on the facebook  home page
    When  User should enter email "joyanisar@gmail.com" and password "afghan30"
    And   User should click on login button
    Then  User should see login page  displayed