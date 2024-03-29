package Steps;

import org.openqa.selenium.WebDriver;

import Java.Method.HandleAlerts;
import Java.Method.StudentRegistrationMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;




public class AlertsSteps {
	
	private WebDriver driver;

	public AlertsSteps() {
		driver = Hooks.driver ;
	}
	
	@Given("User is on Alert page {string}")
	public void user_is_on_alert_page(String str) throws InterruptedException {
	   StudentRegistrationMethod.launchBrowser(driver, str);
	    
	}

	@When("User clicks on the Simple Alert")
	public void user_clicks_on_the_simple_alert() {
		HandleAlerts.simpleAlert(driver);
	    
	}

	@And("User clicks on the time based alert")
	public void user_clicks_on_the_time_based_alert() throws InterruptedException {
		HandleAlerts.timerAlertButton(driver);
	    
	}

	@And("User clicks on the confirmation alert")
	public void user_clicks_on_the_confirmation_alert() throws InterruptedException {
		HandleAlerts.confirmAlertButton(driver);
	    
	}

	@And("User clicks on the prompt alert and enter text as {string}")
	public void user_clicks_on_the_prompt_alert_and_enter_text_as(String string) throws InterruptedException {
		HandleAlerts.promptAlertButton(driver , string);
	    
	}




}
