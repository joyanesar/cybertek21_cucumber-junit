@cloudtables
Feature: DDT example with Cloud tables

  Scenario Outline: Adding multiple users to the table
    Given User is on cloudTables homepage
    When User clicks on New button
    When User enters "<firstname>" to firstname field
    And User enters "<lastname>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    Then User clicks on create button

    Examples:
      |firstname|lastname|position|salary|
      |Janina   |R       |SDET    |115000|
      |Nisso    |U       |Automation Engineer|150000|
      |Kamila   |S       |Developer|130000|
      |Fahima   |E       |UI Developer|180000|
      |NesarAhmad|J      |PO          |110000|
      |Adalat    | p     |SC          |200000|
