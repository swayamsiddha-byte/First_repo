Feature: Validate the Login Feature

  Scenario: Successful login with valid credentials
    Given : user launch chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com"
    And user enters password as "admin"
    And click on Login 
    Then page title should be "Dashboard / nopCommerce administration
    When user click on Logout link 
    Then page title should be "Your Store.Login"
    And close browser
    