Feature: Browser Window Functionality
  
  As a user,
  I want to seamlessly interact with new browser tabs and windows,
  So that I can verify and validate their functionality.

  @Smoke
  Scenario: Verify the functionality of New Tab, New Window, and New Window Message
    Given the User navigates to the Browser Window Page at "https://demoqa.com/browser-windows"
    When the User clicks on the 'New Tab' button
    And a new tab is opened within the same window
    And User clicks on the 'New Window' button
    And a new window is opened
    And the User interacts with the 'New Window Message' functionality
    Then a new window with the specified message is displayed