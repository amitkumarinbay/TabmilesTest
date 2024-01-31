Feature: Login to Tabmiles Application

  As a user,
  I want to log in to the Tabmiles application,
  So that I can verify and validate its functionality.
  
  @Smoke

  Scenario: Verify the login functionality of Tabmiles application
    Given the user navigates to the Browser Window Page at "http://www.tabmiles.com/app/dashboard/index.php"
    When the user enters the email ID as "monita@in-bay.com"
    And the user enters the password as "1234"
    And the user clicks on the login button
    Then the user should log in successfully into the portal