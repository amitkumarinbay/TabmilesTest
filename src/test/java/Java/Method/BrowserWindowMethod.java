package Java.Method;

import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Page.Object.BrowserWindowOR;


public class BrowserWindowMethod {
	
	final static Logger logger = LogManager.getLogger(BrowserWindowMethod.class);
	
	public static void Click_New_Tab(WebDriver driver) throws InterruptedException {
		try {
			WebElement element = driver.findElement(BrowserWindowOR.NEW_TAB);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate NEW_TAB button on the Browser Window" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
			logger.info("TimeoutException in NEW_TAB on Browser Window", e);
		}
		logger.info("NEW_TAB is clicked successfully on Browser Window");
	}
	
	
	
	public static void Click_New_Window(WebDriver driver) throws InterruptedException {
		try {
			WebElement element = driver.findElement(BrowserWindowOR.NEW_WINDOW);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();
		

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate NEW_WINDOW button on the Browser Window" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
			logger.info("TimeoutException in NEW_WINDOW on Browser Window", e);
		}
		logger.info("NEW_WINDOW is clicked successfully on Browser Window");
	}
	
	
	
	
	public static void Click_New_Window_Message(WebDriver driver) throws InterruptedException {
		try {
			WebElement element = driver.findElement(BrowserWindowOR.NEW_WINDOW_MESSAGE);
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate NEW_WINDOW_MESSAGE button on the Browser Window" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
			logger.info("TimeoutException in NEW_WINDOW_MESSAGE on Browser Window", e);
		}
		logger.info("NEW_WINDOW_MESSAGE is clicked successfully on Browser Window");
	}
	
	
	
	
	
		
	}
	

