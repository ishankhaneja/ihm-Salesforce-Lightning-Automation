
@smokeTest
Feature: Verify that there should not be any JavaScript error when clicks on any related lists

Background: User navigates to Company home page
Given the user opens the chrome page

Scenario: Verify that there should not be any JavaScript error when clicks on any related lists
Then the user navigate to the salesforce page
Given the user login in as 'Smoke test ae smoke'
And the user views the page 
And the user clicks the account tab
Then the user create a new advertiser account
And the user views the page
And the user views the page
And the user views the page
And the user views the page
And the user views the page
And the user delete the records
And the user views the page

 
