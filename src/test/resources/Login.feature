Feature: Automation Exercise with login testing
Description:#write some important requirement
Background:#common steps
Scenario: As a user, I want to login in to Automation Exercise with valid credential,
so that I can use this website
Given open the browser
And pass the URL 
|https://automationexercise.com/|
When Click on sign in button in homepage 
And enter the email in the email field
|tasmimrah47@gmail.com  |
And enter the password in the password field
|NweYork2024|
And click on the login button
Then validate that login is successful
@regression
Scenario Outline: As a user, I want to login to Automation Exercise with multiple valid credential, 
so that I can use the website
Given open the browser
And pass the URL "<URL>"
When click on sign in button in home page
And pass the email on email field "<email>"
And pass the password in the password field "<password>"
And click on login button
Then validate that login is successful
Examples:
|URL                            | email                     |password   |
|https://automationexercise.com/|tasmimrah47@gmail.com      |NweYork2024|
|https://automationexercise.com/|ahnaf.x.tahmid@gmail.com   |passWord1! |


