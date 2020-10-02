




Feature: User Login
  User should be able to log in using valid credentials


  Scenario: Testing login with valid credentials
    Given I am on login page
    When I enter username as "TestGilligan" and password as "Test123"
    And I submit login button
    Then I am logged in 
    And I am redirected to user home page
    
    
    Scenario: Testing login correctly fails with invalid credentials
    Given I am on login page
    When I enter username as "TestGilligan" and password as "invalid"
    And I submit login button
    Then I am correctly not logged in 
    And I am correctly not redirected to user home page


