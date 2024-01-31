package Java.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;


public class TabmilesLoginMethod {
	
	final static Logger logger = LogManager.getLogger(TabmilesLoginMethod.class);
	
	
	public static void enterEmailid(WebDriver driver, String url) {
		try {
			driver.get(url);
			} catch (TimeoutException e){
				logger.info("URL is taking time to load", e);				
			}
	        logger.info("Browser is launched successfully");
	}
	
	
}