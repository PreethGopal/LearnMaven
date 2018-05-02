Feature: Create a Lead

Scenario Outline: Login to leaftaps and create a lead Postive, Chrome, Preethi

#Given Open the browser
#And Use TimeOuts
#And Maximize the browser
#And Load the URL
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click on login 
And Click on CRMSFA link
And Click on Leads
And Click on Create Lead
And Enter the company name as <cName>
And Enter the first name as <fName>
And Enter the last name as <lName>
When Click the Create Lead button
Then New lead is created
Examples:
|cName|fName|lName|
|TestLeaf|Preeth|Gopal|
|TestLeaf123|Ravi|Kanth|
|TestLeafabc|Prasanth|Gopi|
