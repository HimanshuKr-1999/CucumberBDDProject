Feature: Customer



Background:
Steps common for all Scenarios
Given User launches chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Valid Email as "admin@yourstore.com" and Valid Password as "admin"
And User clicks on Login
Then User can view Dashboard

@Sanity @Regression
Scenario:
Add new Customer


When User click on customers Menu 
And click on customers Menu Item 
And click on Add new button 
Then User can view Add new customer page 
When User enter customer info 
And click on Save button 
Then User can view confirmation message "The new customer has been added successfully." 
And close browser

@Regression
Scenario:
Search Customer By email


When User click on customers Menu 
And click on customers Menu Item 
And Enter customer EMail
And click on search button
Then User should get the Email in search result table

And close browser



akweycgbwakiencrjmdXK'[
"
Z;S