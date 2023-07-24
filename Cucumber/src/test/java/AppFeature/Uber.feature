Feature: Uber Booking Feature

@all @smoke
Scenario: Booking Cab Honda
Given User wants to select a cab type "Honda" from uber app
When User selects car "HondaCity" and pick up point "Bangalore" and drop location "Chennai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab KIA
Given User wants to select a cab type "KIA" from uber app
When User selects car "Karens" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod @smoke
Scenario: Booking Cab Toyoto
Given User wants to select a cab type "Toyoto" from uber app
When User selects car "Fortuner" and pick up point "Bangalore" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD