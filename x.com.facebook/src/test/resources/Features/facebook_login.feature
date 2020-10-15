Feature: facebook_login feature

Scenario Outline: User should be able to login with valid credentials
Given User on home page
And Wait for "3" seconds
When User enters email_id in  email_id filed"<email>"
And Wait for "2" seconds
When User enters password in password filed"<password>"
And Wait for "5" seconds
When User clicks on login button
Then User should successfully login and Abdul should displayed
And Wait for "10" seconds

Examples:
|email|password|
|keya192001@yahoo.com|amayra03|
