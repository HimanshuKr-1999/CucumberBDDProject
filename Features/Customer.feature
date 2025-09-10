Feature: Customer
Scenario:
Add new Customer

Given User launches chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Valid Email as "admin@yourstore.com" and Valid Password as "admin"
And User clicks on Login
Then User can view Dashboard
When User click on customers Menu 
And click on customers Menu Item 
And click on Add new button 
Then User can view Add new customer page 
When User enter customer info 
And click on Save button 
Then User can view confirmation message "The new customer has been added successfully." 
And close browser