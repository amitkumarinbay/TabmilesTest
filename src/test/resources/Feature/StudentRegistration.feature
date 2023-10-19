Feature: Student Registration Form

   As a Student
   I want to register into portal
   So that I can register myself


@"Smoke"

Scenario Outline: Verify the Student register form
Given User is on registration page "https://demoqa.com/automation-practice-form"
When User enter First Name as "Amit", Last Name as "Kumar" and Email id as "amitkumar.inbay@gmail.com"
And User click on Gender as "<Gender>"
And User enter mobile number as "8284898563"
And User Enters Subject as "<Subject>", Hobbies as "<Hobbies>", Select Date and address as "<Address>"
And User upload the picture
And User select State as "Rajasthan" and City as "Jaipur"
And User Click on the submit button
Then User should register successfully into the portal

Examples: 
      | Subject           |  | Hobbies |  | Address    | | Gender |
      | Computer Science  |  | Music   |  | Kharar     | | Male   |



