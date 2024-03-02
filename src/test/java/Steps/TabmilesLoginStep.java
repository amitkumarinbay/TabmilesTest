package Steps;


import org.openqa.selenium.WebDriver;

import Java.Method.TabmilesLoginMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TabmilesLoginStep {
	
private WebDriver driver;

public TabmilesLoginStep () {
	driver = Hooks.driver;
}

	
	
	@Given("the user navigates to the Browser Window Page at {string}")
	public void the_user_navigates_to_the_browser_window_page_at(String string) {
	   TabmilesLoginMethod.launchBrowser(driver, string);
	    
	}

	@When("the user enters the email ID as {string}")
	public void the_user_enters_the_email_id_as(String string) {
		TabmilesLoginMethod.enterEmailid(driver, string);
	    
	}

	@And("the user enters the password as {string}")
	public void the_user_enters_the_password_as(String string) {
	   TabmilesLoginMethod.enterPassword(driver, string);
	    
	}

	@And("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
	   TabmilesLoginMethod.clickLogin(driver);
	    
	}

	@Then("the user should log in successfully into the portal")
	public void the_user_should_log_in_successfully_into_the_portal() {
	  TabmilesLoginMethod.verifyUrl(driver); 
	    
	}


}
