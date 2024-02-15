package Java.Method;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.Object.StudentRegistrationOR;

public class StudentRegistrationMethod {

    public static String filePath = "TestData/userimage.jpg";

    final static Logger logger = LogManager.getLogger(StudentRegistrationMethod.class);

    public static void launchBrowser(WebDriver driver, String url) {
        try {
            driver.get(url);
            logger.info("Browser is launched successfully");
        } catch (TimeoutException e) {
            logger.error("URL is taking time to load", e);
        }
    }

    public static void enterFnameLnameEmail(WebDriver driver, String fname, String lname, String email) {
        try {
            driver.findElement(StudentRegistrationOR.FIRSTNAME).sendKeys(fname);
            driver.findElement(StudentRegistrationOR.LASTTNAME).sendKeys(lname);
            driver.findElement(StudentRegistrationOR.EMAIL).sendKeys(email);
            logger.info("Values are entered into first name, last name, and email Text box");
        } catch (NoSuchElementException e) {
            logger.error("Not able to locate first name, last name, and email Text box", e);
        }
    }

    public static void enterAddress(WebDriver driver, String address) {
        try {
            driver.findElement(StudentRegistrationOR.CURRENTADDRESS).sendKeys(address);
            logger.info("Address is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate CURRENTADDRESS on registration form", e);
        }
    }

    public static void enterPhone(WebDriver driver, String phoneNumber) {
        try {
            driver.findElement(StudentRegistrationOR.PHONE).sendKeys(phoneNumber);
            logger.info("Phone number is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate PHONE on registration form", e);
        }
    }

    public static void selectGender(WebDriver driver) {
        try {
            WebElement gender = driver.findElement(StudentRegistrationOR.GENDER_MALE);
            Actions actions = new Actions(driver);
            actions.moveToElement(gender).click().build().perform();
            logger.info("Gender is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate GENDER on registration form", e);
        }
    }

    public static void confirmRegister(WebDriver driver) {
        try {
            WebElement element = driver.findElement(StudentRegistrationOR.CONFIRMATION_POPUP);
            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            actions.moveToElement(element).click().build().perform();
            logger.info("ConfirmRegister is executed successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate CONFIRMATION_POPUP on registration form", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Interrupted while sleeping", e);
        }
    }

    public static void enterSubject(WebDriver driver, String sub) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(StudentRegistrationOR.AUTOSUGGESTION));
            ele.sendKeys(sub);
            Thread.sleep(1000);
            driver.findElement(StudentRegistrationOR.AUTOSUGGESTION_OPTIONS).click();
            logger.info("Subject is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate AUTOSUGGESTION_OPTIONS on registration form", e);
        } catch (TimeoutException | InterruptedException e) {
            logger.error("TimeoutException in AUTOSUGGESTION_OPTIONS on registration form", e);
        }
    }

    public static void selectHobbies(WebDriver driver, String hob) {
        try {
            WebElement element = driver.findElement(StudentRegistrationOR.HOBBIES);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            logger.info("Hobbies is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate HOBBIES on registration form", e);
        }
    }

    public static void selectDate(WebDriver driver) {
        try {
            WebElement element = driver.findElement(StudentRegistrationOR.DATEPICKER);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();

            Select month = new Select(driver.findElement(StudentRegistrationOR.DATE_MONTH));
            month.selectByIndex(0);

            Select year = new Select(driver.findElement(StudentRegistrationOR.DATE_YEAR));
            year.selectByValue("2023");

            List<WebElement> day = driver.findElements(StudentRegistrationOR.DATE);
            day.get(0).click();

            logger.info("Date is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate DATE_MONTH, DATE_YEAR, or DATE on registration form", e);
        }
    }

    public static void uploadImage(WebDriver driver) {
        try {
            WebElement uploadImg = driver.findElement(StudentRegistrationOR.UPLOAD_IMAGE);
            Thread.sleep(3000);
            uploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());
            Thread.sleep(3000);
            logger.info("Image is uploaded successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate UPLOAD_IMAGE on registration form", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Interrupted while sleeping", e);
        }
    }

    public static void selectState(WebDriver driver, String state) {
        try {
        	 driver.findElement(StudentRegistrationOR.STATE).click();
             WebElement se = driver.findElement(StudentRegistrationOR.STATE_VALUE);
            se.click();
            logger.info("State is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate STATE and STATE_VALUE on registration form", e);
        }
        catch (TimeoutException e) {
            logger.error("Timeout occurred while locate STATE and STATE_VALUE on registration form", e);
        }
    }

    public static void selectCity(WebDriver driver, String city) {
        try {
            driver.findElement(StudentRegistrationOR.CITY).click();
            WebElement se = driver.findElement(StudentRegistrationOR.CITY_VALUE);
            se.click();
            logger.info("City is entered successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate CITY and CITY_VALUES on registration form", e);
        }
    }

    public static void submit(WebDriver driver) {
        try {
            WebElement element = driver.findElement(StudentRegistrationOR.SUBMIT);
            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            actions.moveToElement(element).click().build().perform();
            logger.info("Submit button is clicked successfully on Student form");
        } catch (NoSuchElementException e) {
            logger.error("Unable to locate Submit button on the Practice form", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Interrupted while sleeping", e);
        }
    }
}
