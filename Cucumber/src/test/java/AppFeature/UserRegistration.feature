Feature: User Registration
  
Scenario: User registration with different data
Given User is on registration page
When User enters following user details
      |Thams|Selva|sel@gmail.com|99999|Chennai|
      |Subha|Thamu|sub@gmail.com|98339|Chennai|
      |Sathish|Kumar|sat@gmail.com|94883|Chennai|
Then User registration should be sucessful