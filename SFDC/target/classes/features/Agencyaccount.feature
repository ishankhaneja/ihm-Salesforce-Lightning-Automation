
@smokeTest
Feature: To test my cucumber test is running


Background: User navigates to Company home page
Given the user opens the chrome page

Scenario: cucumber setup
Then the user navigate to the salesforce page
Given the user login in as 'Smoke Test Ae Smoke'
Given the user views the page 
Given the user clicks the account tab
Then the user create a new agency account

