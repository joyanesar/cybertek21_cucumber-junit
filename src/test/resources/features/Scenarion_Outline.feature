Feature: Data Driven test table on Editor

  Scenario Outline: Adding multiple users to the table
    Given  User is on cloudTables home page
    When   User should click on New button
    Then   User should add firstName "<firstname>"
    And    user should add lastName "<lastname>"
    And    user should add position "<position>"
    And    user should add start date"<startDate>"
    And    user should add salary "<salary>"
    And User clicks on create button
    Examples:
    |firstname|lastname|position|startDate|salary|
    |NesarAhmad    |Joya    |QATester|July     |110000$|
    |Sam           |Quen    |Audet   |June     | 12000$|
    |Ahmad         |Joya    |SDET     |May     |1510000$|
    |Mike          |Math    |Audet   |April     | 12000$|
    |Ali           |MA    |QATester  | SEP     |110000$|
    |Sam           |Quen    |Audet   |June     | 12000$|
    |Yalda         |haider  |QATester|Dec     |110000$|
    |Negina        |Joya    |Eng     |March    | 12000$|