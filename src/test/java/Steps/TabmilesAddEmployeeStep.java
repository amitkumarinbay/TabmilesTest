package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TabmilesAddEmployeeStep {
	
	private WebDriver driver ;
	
	
	public TabmilesAddEmployeeStep() { 
		driver = Hooks.driver;
	}
	
	@Given("the user navigate to {string}")
	public void the_user_navigate_to(String url) {
	    
	   
	}

	@When("the user enter the Employee Code as {string}, Employee Code SAP as {string}, Date Of Joining as {string}")
	public void the_user_enter_the_employee_code_as_employee_code_sap_as_date_of_joining_as(String ecode, String escode, String doj) {
	    
	   
	}

	@And("the user enter the First Name as {string},Last Name as {string}")
	public void the_user_enter_the_first_name_as_last_name_as(String fname, String lname) {
	    
	   
	}

	@And("the user enter the Email as {string},Email ID Personal as {string},Password as {string}")
	public void the_user_enter_the_email_as_email_id_personal_as_password_as(String email, String pemail, String pwd) {
	    
	   
	}

	@And("the user enter the Mobile No as {string},Personal Mobile No as {string},Address as {string},City as {string},Country as {string},Pincode as {string},Permanent Address With pincode as {string}")
	public void the_user_enter_the_mobile_no_as_personal_mobile_no_as_address_as_city_as_country_as_pincode_as_permanent_address_with_pincode_as(String mob, String pmob, String add, String city, String country, String pin, String peradd) {
	    
	   
	}

	@And("the user enter the Designation as {string},Department as {string},H.Q as {string},Salary as {string}")
	public void the_user_enter_the_designation_as_department_as_h_q_as_salary_as(String deg, String dept, String hq, String sal) {
	    
	   
	}

	@And("the user click the Submit button")
	public void the_user_click_the_submit_button() {
	    
	   
	}

	@And("the user click on Ok button and verify the Message")
	public void the_user_click_on_ok_button_and_verify_the_message() {
	    
	   
	}

	@Then("the new user added successfully in to Tabmiles CRM application.")
	public void the_new_user_added_successfully_in_to_tabmiles_crm_application() {
	    
	   
	}


}
