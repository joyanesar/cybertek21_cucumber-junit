Feature: Amazon Order test
  Agile story, Searching an item on the amazon webpage
 Background:  user is on login page
 #    Given    I navigate to login page
    Given     I go to amazon shopping website
#    When      I submit username  and password
#    Then      I should be able logged in

  Scenario: Search product and add the first product to the user basket
      Given  User search for hp Laptop
      When   Add the first laptop that appears in the search result to the basket
#      Then   User basket should be displayed with added item

#      Scenario: Search for monitor 32 inch and print the result
#        Given user search for  lenovo monitor
#        When  add the first result to the shopping cart
#        Then  User should be able see displayed with added item