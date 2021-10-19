#Author: your.email@your.domain.com


Feature: AddCustomer flow validation
  
 
  Scenario: AddCustomer
    Given user launches demo telecom application
    And user click on add customer button 
    When user fill all the fields
    And user click on the submit button
    Then user verify customer id is generated 
    And user verify please note down text is visible
    

 