Feature: Login Feature

    Scenario Outline: Login to the application
    Given user is on Application landing page
    When user click on sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in UserName field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets "InCorrect Password"

    Examples: 
      | UserName  | Password |
      | incorrectusername | 12345 |
      | correctusername |incorrectpassword| 
			| incorrectusername | incorrectpassword|
			