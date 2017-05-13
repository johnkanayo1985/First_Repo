Feature: AS a user,
I want to be able to book my 
jet and see confirmation.

Background:Login
Given am on the landing page
And  I enter my username and password
And  I click the login button
Then I click on book your jet tab

Scenario:Book your jet journey
And I enter my Start destination
And I enter my end destination
And I select a zone
When I click on the relevant check box
And I select the no radio button
And I click on submit button
Then a successfull confirmation message is displayed