Feature: to test dropdown on the zoo site
Scenario: To test that we are able to select value from dropdown
Given I am on the zoo site
When i click on "Adoption"
Then I set the dropdown to "First day of the next week"
Then I close browser

Scenario: To test that we are able to clcik on a radio button on contact page
Given I am on the zoo site
When i click on "Contact"
Then I set the radio to "cadop"
Then I close browser