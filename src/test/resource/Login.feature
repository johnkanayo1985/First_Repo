Feature: As a user I want to be able to login


Scenario:Login
Given am on the landing page
And  I enter my username and password
And  I click the login button
When I should see the Home page
And  I click logout
Then I should be on the landing page