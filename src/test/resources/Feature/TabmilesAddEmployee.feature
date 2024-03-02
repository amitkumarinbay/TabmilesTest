Feature: Employee Management feature in Tabmiles CRM applications.
  
  As a User,
  I want to add new employee in Tabmiles CRM application,
  So that new employee can use the Tabmiles CRM application and perfoem his working.

  @Smoke @Tabmiles
  Scenario Outline: Verify the new employee addition functionally in employee management feature at Tabmiles CRM application.
    Given the user navigate to "http://www.tabmiles.com/app/dashboard/employees/add_employee.php"
    When the user enter the Employee Code as "<Employee Code>", Employee Code SAP as "<Employee Code SAP>", Date Of Joining as "<Date Of Joining>"
    And the user enter the First Name as "<First Name>",Last Name as "<Last Name>"
    And the user enter the Email as "<Email>",Email ID Personal as "<Email ID Personal>",Password as "<Password>"
    And the user enter the Mobile No as "<Mobile No>",Personal Mobile No as "<Personal Mobile No>",Address as "<Address>",City as "<City>",Country as "<Country>",Pincode as "<Pincode>",Permanent Address With pincode as "<Permanent Address With pincode>"
    And the user enter the Designation as "<Designation>",Department as "<Department>",H.Q as "<H.Q>",Salary as "<Salary>"
    And the user click the Submit button
    And the user click on Ok button and verify the Message
    Then the new user added successfully in to Tabmiles CRM application.

    Examples: 
      | Employee Code |  | Employee Code SAP   |  | Date Of Joining |  | First Name |  | Last Name |  | Email             |    | Email ID Personal      |  | Password |  | Mobile No |  | Personal Mobile No |  | Address |  | City |  | Country |  | Pincode |  | Permanent Address With pincode |  | Designation |  | Department |  | H.Q |  | Salary |
      |0              |  |0                    |  |0                |  |Indusind    |  |Bank       |  |indusind@in-bay.com|    |mail.indusind@in-bay.com|  |1234      |  |82383283288|  |338832832883        |  |NA       |  |NA    |  |India    |  |1234     |  |Na                              |  |NA           |  | NA         |  |NA   |  |0       |     