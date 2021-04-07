Feature: Compose Function of Gmail

  Scenario: To Verify the compose function of Gmail
    Given I launched the chrome browser and navigated to Gmail URL
    When I enter Username
    And I enter Password
    And click on Login button
    Then I verify if i navigated to Inbox Emails screen
    When I Click on Compose button
    Then I should be displayed with Compose pop-up
    When I enter To Email Address
    And I enter Subject as "Incubyte"
    And I enter Body as "Hello World"
    And I click on Send button
    Then I verify if mail is sent
