Feature: Login Feature

Scenario: Login with valid credentials

Given user is on login page
When user login with valid credentials
Then user lands on homepage and verify the titile of the home page

