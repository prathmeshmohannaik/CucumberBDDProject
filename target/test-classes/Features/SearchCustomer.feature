Feature: Search Customer record

  Background: 
    Given user launch chrome browser
    When user opens the url "https://admin-demo.nopcommerce.com/login"

  @searchcustomernew
  Scenario: search exisiting customer record
    When user enter the admin@yourstore.com and admin
    And click on login button
    Then user should be able to "Start accepting orders" title on Dashboard
		When user clicks on Customers Menu
    And user clicks on Customers Item
    And user enter email address
    And user click on search box
    Then user data displayed in search table
    Then close the browser
