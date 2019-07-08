Feature: User Login

Scenario Outline: Tseting login with valid credentials
   Given I open login page
   When I enter username as "<name>" and password as "<pass>"
    And I submit login page
   Then I redirect to user home page
   Examples:
   |name|pass|
   |jsmith|demo123|
   |admin|admin|
   
   
Scenario: Tseting login with invalid credentials
   Given I am on login page
   When I enter username as "invalid" and password as "demo123"
   And I submit login page
   Then I am login page