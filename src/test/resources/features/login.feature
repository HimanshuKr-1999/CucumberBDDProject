Feature: Login page automatio
@regression @smoke
Scenario Outline:
Check login is successfull

Given User is on login page
When User enters Valid "<Username>" and "<Password>"
And Clicks on submit button
Then user is navigated to Home page
And Close the browser

Examples:
|Username|Password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|