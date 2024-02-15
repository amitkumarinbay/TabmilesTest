package Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import Java.Method.StudentRegistrationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentRegistrationSteps {
	
	private WebDriver driver;

	public StudentRegistrationSteps() {
		driver = Hooks.driver;

	}
	
	@Given("User is on registration page {string}")
	public void user_is_on_registration_page(String str) throws InterruptedException {
	    StudentRegistrationMethod.launchBrowser(driver, str);
	}

	@When("User enter First Name as {string}, Last Name as {string} and Email id as {string}")
	public void user_enter_first_name_as_last_name_as_and_email_id_as(String fname, String lname, String email) throws Throwable {
		StudentRegistrationMethod.enterFnameLnameEmail(driver, fname, lname, email); 
	    
	}

	@And("User click on Gender as {string}")
	public void user_click_on_gender_as(String string) throws AWTException {
		StudentRegistrationMethod.selectGender(driver);
	    
	}

	@And("User enter mobile number as {string}")
	public void user_enter_mobile_number_as(String mobile) throws InterruptedException {
	   StudentRegistrationMethod.enterPhone(driver, mobile);
		
	    
	}

	@And("User Enters Subject as {string}, Hobbies as {string}, Select Date and address as {string}")
	public void user_enters_subject_as_hobbies_as_select_date_and_address_as(String sub, String hob, String add) throws InterruptedException, AWTException {
	    StudentRegistrationMethod.enterSubject(driver, sub);
	    StudentRegistrationMethod.selectHobbies(driver, hob);
	    StudentRegistrationMethod.selectDate(driver);
	    StudentRegistrationMethod.enterAddress(driver, add); 
	    
	}

	@And("User upload the picture")
	public void user_upload_the_picture() throws InterruptedException {
		StudentRegistrationMethod.uploadImage(driver);
		
	    
	}

	@And("User select State as {string} and City as {string}")
	public void user_select_state_as_and_city_as(String state, String city) {
		StudentRegistrationMethod.selectState(driver, state) ;
		StudentRegistrationMethod.selectCity(driver, city);
	    
	}

	@And("User Click on the submit button")
	public void user_click_on_the_submit_button() throws InterruptedException {
		StudentRegistrationMethod.submit(driver);
	    
	}

	@Then("User should register successfully into the portal")
	public void user_should_register_successfully_into_the_portal() throws InterruptedException {
		StudentRegistrationMethod.confirmRegister(driver);
	    
	}


}
