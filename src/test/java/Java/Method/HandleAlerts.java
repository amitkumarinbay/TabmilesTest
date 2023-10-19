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
			// TODO: handle exception
		}
		

	}

	
	public static void timerAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.TIMER_ALERT).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		
	}

	
	public static void confirmAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(Alerts.CONFIRM_ALERT).click();
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		

	}

	
	public static void promptAlertButton(WebDriver driver,String str) throws InterruptedException {
		try {
			driver.findElement(Alerts.PROMPT_ALERT).click();
			driver.switchTo().alert().sendKeys(str);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		
		
		
		driver.quit();
	}

}



