@RunSmoke
Feature: user able to Validate the Subscription Packages For Kuwait
  #Scenario1:
  Scenario: Validate the Subscription Packages For Kuwait Country
    Given user open page and click on select country Kuwait
    Then Package Type and Price should be displayed for Kuwait