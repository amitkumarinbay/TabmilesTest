package Steps;

import org.openqa.selenium.WebDriver;

import Java.Method.BrowserWindowMethod;
import Java.Method.StudentRegistrationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserWindowSteps {
	
	private WebDriver driver;

	public BrowserWindowSteps() {
		driver = Hooks.driver ;
	}
	
	
	@Given("the User navigates to the Browser Window Page at {string}")
	public void the_user_navigates_to_the_browser_window_page_at(String string) throws InterruptedException {
	   StudentRegistrationMethod.launchBrowser(driver, string);
	    
	}

	@When("the User clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) throws InterruptedException {
	    BrowserWindowMethod.Click_New_Tab(driver);
	    
	}

	@And("a new tab is opened within the same window")
	public void a_new_tab_is_opened_within_the_same_window() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@And("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) throws InterruptedException {
		BrowserWindowMethod.Click_New_Window(driver);
	    
	}
	
	

	@And("a new window is opened")
	public void a_new_window_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("the User interacts with the {string} functionality")
	public void the_user_interacts_with_the_functionality(String string) throws InterruptedException {
		BrowserWindowMethod.Click_New_Window_Message(driver);
	    
	}

	@Then("a new window with the specified message is displayed")
	public void a_new_window_with_the_specified_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	

}
