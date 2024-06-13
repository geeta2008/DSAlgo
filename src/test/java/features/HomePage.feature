@homePage
Feature: Home Page Verification


 Background: User is on the homepage
Given User opens DS Algo portal link
When User clicks the Get Started button

Scenario: Verify admin able to see all the Seven modules in Data Structures dropdown

And User clicks the Data Structures dropdown 
Then User should able to see all the seven options in dropdown menu 

