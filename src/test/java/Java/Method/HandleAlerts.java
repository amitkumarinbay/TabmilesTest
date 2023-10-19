package Java.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import Page.Object.Alerts;




public class HandleAlerts {
	
	final static Logger logger = LogManager.getLogger(HandleAlerts.class);
	
	public static void simpleAlert(WebDriver driver) {
		try {
			driver.findElement(Alerts.SIMPLE_ALERT).click();
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("Unable to find Alert Window on SIMPLE_ALERT click", e);
		}
		
		logger.info("Simple_Alert is working successfully ");
	}

	
	public static void timerAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.TIMER_ALERT).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("Unable to find Alert Window on TIMER_ALERT click", e);
		}
		logger.info("TIMER_ALERT is working successfully");
	}

	
	public static void confirmAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.CONFIRM_ALERT).click();
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			logger.info("Unable to find Alert Window on CONFIRM_ALERT click", e);
		}
		logger.info("CONFIRM_ALERT is working successfully");	

	}

	
	public static void promptAlertButton(WebDriver driver,String str) throws InterruptedException {
		try {
			driver.findElement(Alerts.PROMPT_ALERT).click();
			driver.switchTo().alert().sendKeys(str);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("Unable to find Alert Window on PROMPT_ALERT click", e);
		}
		catch (NoSuchElementException e) {
			logger.info("Unable to locate ALERT on PROMPT_ALERT click", e);
		}
		
		logger.info("PROMPT_ALERT is working successfully");	
		
		driver.quit();
	}

}



