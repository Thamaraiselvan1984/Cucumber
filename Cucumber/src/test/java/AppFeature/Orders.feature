Feature: Amazon Order Page

In order to check my order detail as a Registered user 
I want to specify the feature of order details page

Background:
	Given a registered user exists
	Given user is on Amazon login page
	When user enters UserName
	And user enters Password
	And user clicks on login button
	Then user navigate to order page

Scenario: Check previous order details
	When user click to order link
	Then user checks the previous order details

Scenario: Check open order details
	When user click to Open orders link
	Then user checks the open order details

Scenario: Check Cancelled order details
	When user click to cancelled orders link
	Then user checks the cancelled order details





