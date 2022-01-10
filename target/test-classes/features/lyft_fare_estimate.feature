@regression
@lyft
Feature: Searching Lyft fare details
  As a rider, I should be able to enter pickup and drop off
  locations so that, I see the estimate fare

  Scenario: Fare estimate using City
    Given User is on lyft fare estimate page
    When User enters "Mclean, VA, USA" to pickup address
    And User enters "Woodbridge, VA, USA" to drop-off address
    And User clicks on get estimate button
    Then User should see estimated prices

  Scenario: Fare estimate using Full address
    Given User is on lyft fare estimate page
    When User enters "Albany Airport,NY,USA" to pickup address
    And User enters "Lake George, NY, USA" to drop-off address
    And User clicks on get estimate button
    Then User should see estimated prices


  Scenario: Fare estimate using empty should show error
    Given User is on lyft fare estimate page
    When  User enters "" to pickup address
    And  User enters "" to drop-off address
    And  User clicks on get estimate button
    Then User should see error message