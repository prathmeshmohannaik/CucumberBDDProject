@LoginSuite
Feature: Login to nopcommerce application
Background:
    Given user launch chrome browser

    
#background scope is withing the same feature file 
#Before->background->scenario->after


  @logindemoL1
  Scenario: User logged in with valid credentials

    When user enter the admin@yourstore.com and admin
    And click on login button
    Then user should be able to "Start accepting orders" title on Dashboard
    Then close the browser

  @logindemoL2
  Scenario: admin logged in with invalid credentials
    When user enter the "admin@yourstore.com" and ad1min
    And click on login button
    Then user should not be able to login
     Then close the browser

  @logindemoL3
  Scenario Outline: admin logged in with invalid credentials
    When user enter the <username> and <password>
    And click on login button
    Then user should not be able to login
    Then close the browser

    Examples: 
      | username | password |
      | admin2   |    12345 |
      | admin1   |    42345 |
      
      
      
      
      
  #@DatadrivenTestDemo
  #Scenario: user signup to the application
  # Given user launch chrome browser
  #  When user opens the url "https://www.jotform.com/build/232541437605453"
   # When user enter the details
    #|Prathmesh Naik|
    #|+910000000000|
    #|abc@yahoo.com|
    #|08/08/2000|
    #And click on submit button
    #Then user should be successfully signed up
