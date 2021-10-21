# Author: your.email@your.domain.com
Feature: AddTariff plan flow validation

  Background: 
    Given user launche demo telecom application
    And user click add tariff plan button

  @reg
  Scenario: Add Tariff plan details with 1 dimensional list
    When user fill all the fields by one dimensional list concept
      | 500 | 1200 | 200 | 50 | 1 | 2 | 1 |
    And user click  the submit button
    Then user confirms the add plan
    And user verify the text is equals

  Scenario: Add Tariff plan details by using 1 dimensional map
    When user fill all the fields by one dimensional map concept
      | rental1         |  5000 |
      | local_minutes   | 12012 |
      | inter_minutes   |  1236 |
      | sms_pack        |    60 |
      | minutes_charges |     1 |
      | inter_charges   |     4 |
      | sms_charges     |    11 |
    And user click  the submit button
    Then user confirms the add plan
    And user verify the text is equals

  Scenario Outline: 
    When user fill all the fields "<rental1>","<local_minutes>","<inter_minutes>","<sms_pack>","<minutes_charges>","<inter_charges>","<sms_charges>"
    And user click  the submit button
    Then user confirms the add plan
    And user verify the text is equals

    Examples: 
      | rental1 | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |     500 |          1200 |           200 |       50 |               1 |             2 |           1 |
      |     900 |         14500 |           500 |       90 |               2 |             3 |           5 |
      |     700 |          5000 |            62 |       80 |               4 |             5 |           6 |
