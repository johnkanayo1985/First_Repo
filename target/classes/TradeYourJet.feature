Feature: I want to be able to filling 
the Trade your Jet form and submit

Scenario:Login
Given am on the landing page
And I enter my username and password
And I click the login button

Scenario: Trade Your Jet
When I click the trade your jet tab 
And I enter current jet price
And I enter purchase price
And I enter flight time
And I select the relevant radio button
And click submit
Then I should see a successful message