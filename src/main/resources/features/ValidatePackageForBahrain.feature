@RunSmoke
Feature: user able to Validate the Subscription Packages For Bahrain
  #Scenario1:
  Scenario: Validate the Subscription Packages For Bahrain Country
    Given user open page and click on select country Bahrain
    Then Package Type and Price should be displayed for Bahrain