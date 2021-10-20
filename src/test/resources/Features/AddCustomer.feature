 #Author: your.email@your.domain.com


Feature: AddCustomer flow validation
Background:
    Given user launches demo telecom application
    And user click on add customer button 

  

  Scenario: Add Customer valiidation by using 1 dimensional list
     
     When user fill all the fields by one dimensional list method
     |Thiru|maran|maran@gmail.com|chennai|9874563210|
     And user click on the submit button
     Then user verify customer id is generated 
     And user verify please note down text is visible
    
    Scenario: Add Customer valiidation by using  dimensional map
      
     When user fill all the fields by one dimensional map method
     |fname|Thiru|
     |lname|s|
     |mail|maran@gmail.com|
     |adress|chennai|
     |phone|9874563210|
     And user click on the submit button
     Then user verify customer id is generated 
     And user verify please note down text is visible
    
     Scenario Outline:
    
    When user fill all the fields "<fname>","<lname>","<mail>","<adress>","<phone>"
    And user click on the submit button
    Then user verify customer id is generated 
    And user verify please note down text is visible
    
    Examples:
    |fname |lname|mail           |adress   |phone     |
    |Thiru |maran|maran@gmail.com|tambaram |6545321032|
    |maran |thiru|asdf@gmail.com |tamilnadu|963852    |
    |guru  |s    |ghj@gmail.com  |old      |774125    |
    |karnan|T    |zxc@gmail.com  |new      |45612302  |