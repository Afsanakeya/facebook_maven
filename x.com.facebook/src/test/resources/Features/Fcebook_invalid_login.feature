Feature: Fcebook_invalid_login.feature

Scenario Outline: User shouldnot  able to login with invalid credentials
Given User on home page
And Wait for "3" seconds
When User enters email_id in  email_id filed"<email>"
And Wait for "2" seconds
When User enters password in password filed"<password>"
And Wait for "5" seconds
When User clicks on login button
Then User can faild to login and The email you’ve entered doesn’t match any account. Sign up for an account. should displayed
And Wait for "10" seconds

Examples:
|email|password|
|keya196@yahoo.com|amayra03|
