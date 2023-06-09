@RunSmoke
Feature: user able to Validate the Subscription Packages For Ksa
  #Scenario1:
  Scenario: Validate the Subscription Packages For Ksa Country
    Given user open page and click on select country Ksa
    Then Package Type and Price should be displayed for Ksa