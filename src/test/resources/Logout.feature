Feature: Automation Exercise with logout testing
Description:#write some important requirement
Background:#common steps
Scenario: As a logged-in user, I want to logout from Automation Exercise successfully,
so thatmy information  is saved
Given open the browser
And pass the URL 
|https://automationexercise.com/|
When Click on sign in button in homepage 
And enter the email in the email field
|tasmimrah47@gmail.com  |
And enter the password in the password field
|NweYork2024|
And click on the login button
And click on log out button
Then validate log out is successful
