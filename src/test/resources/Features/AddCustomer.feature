
Feature: Multiple customer addition
Background:
    Given user launch chrome browser
    When user opens the url "https://admin-demo.nopcommerce.com/login"

  @1stcustomeradd
  Scenario: user is able to add new customer
    When user enter the admin@yourstore.com and admin
    And click on login button
    Then user should be able to "Start accepting orders" title on Dashboard
    And user clicks on Customers Menu
    And user clicks on Customers Item
    And user clicks on Add new
    Then user can view add new customer page
    And user enters all the customer details
    And user clicks on Save
    Then user can see the confirmation page "the customer has been added successfully"
 
    
    

