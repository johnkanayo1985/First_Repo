Feature: As a user
I want to be able to click 
on all Navigation Pane


Scenario: Login
Given am on the landing page
And I enter my username and password
And I click the login button

Scenario: Click trade your Jet tab 
When I click the trade your Jet tab
Then I should be on trade your Jet page

Scenario: Click book your jet 
When I click on book your jet tab
Then I should be on book your jet page 

Scenario: Click just trade
When I click on just trade tab 
Then I should be on just trade page

Scenario: Click about us
When I click on about us tab 
Then I should be on about us page 

Scenario: Click contact us 
When I click on contact us tab 
Then I should be on contact us page  