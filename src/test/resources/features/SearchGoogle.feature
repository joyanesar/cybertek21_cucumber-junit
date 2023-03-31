Feature: As a user want to look item

  Scenario: user looking for an item
    Given  user is on the google home page
    When  user search for apple product
    Then  user should be able see apple displayed