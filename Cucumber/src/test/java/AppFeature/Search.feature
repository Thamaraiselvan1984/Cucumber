Feature: Amazon Search

Scenario: Search a Product
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed
Then order id is 12345 and username is "ThamaraiSelvan"