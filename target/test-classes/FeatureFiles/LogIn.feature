@login
Feature: To validate Login Functionality of facbook Application

  Background: 
    Given user have to enter faceook login through chrome browser

 @sanity
  Scenario: 
    
    To validate login by using vald email and invalid password

    When user have to enter valid email and invalid password
    And click login button
    Then user have to reach invalid credentials page
    
@smoke
  Scenario: 
    
    To validate login by using vald invalid email and invalid password

    When user have to enter valid invalid email and invalid password
    And click login buttons
    Then user have to reach invalid paswword credentials page
    
