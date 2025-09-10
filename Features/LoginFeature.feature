Feature: Login

Scenario:
Successfull Login with valid credentials
Given User launches chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Valid Email as "admin@yourstore.com" and Valid Password as "admin"
And User clicks on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Log out link
Then Page Title should be "nopCommerce demo store. Login"
Then close browser

Scenario Outline:
Successfull Login with valid credentials DDT
Given User launches chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Valid Email as "<Email>" and Valid Password as "<Password>"
And User clicks on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Log out link
Then Page Title should be "nopCommerce demo store. Login"
Then close browser

Examples:
|Email|Password|
|admin@yourstore.com|admin|
|TestEmail.com|Worngpasword|
