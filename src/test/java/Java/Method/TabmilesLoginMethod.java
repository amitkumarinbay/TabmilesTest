package Java.Method;

import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Page.Object.TabmilesLoginOR;

public class TabmilesLoginMethod {

	final static Logger logger = LogManager.getLogger(TabmilesLoginMethod.class);

	public static void launchBrowser(WebDriver driver, String url) {
		try {
			driver.get(url);
			logger.info("Browser is launched successfully");
		} catch (TimeoutException e) {
			logger.error("Timeout occurred while loading the URL", e);
		}
	}

	public static void enterEmailid(WebDriver driver, String emailid) {
		try {
			driver.findElement(TabmilesLoginOR.EMAIL_ID).sendKeys(emailid);
			logger.info("Value is entered into Email_ID Text box");
		} catch (NoSuchElementException e) {
			logger.error("Email_ID Text box not found", e);
		}
	}

	public static void enterPassword(WebDriver driver, String password) {
		try {
			driver.findElement(TabmilesLoginOR.PASSWORD).sendKeys(password);
			logger.info("Value is entered into Password Text box");
		} catch (NoSuchElementException e) {
			logger.error("Password Text box not found", e);
		}
	}

	public static void clickLogin(WebDriver driver) {
		try {
			driver.findElement(TabmilesLoginOR.LOGIN).click();
			logger.info("Login Button is successfully clicked");
		} catch (NoSuchElementException e) {
			logger.error("Login Button not found", e);
		}
	}

	public static void verifyUrl(WebDriver driver) {
		try {
			String expectedUrl = "http://www.tabmiles.com/app/dashboard/dashboard.php";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			logger.info("User successfully log in  into the portal");
		} catch (NoSuchElementException e) {
			logger.error("actualUrl not matched with exceptedUrl ", e);
		}

	}
}
