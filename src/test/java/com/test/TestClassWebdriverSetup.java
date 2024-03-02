package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassWebdriverSetup {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void Launchbrowser() {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--force-device-scale-fector=0.5");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
	}
	
	
	@Test
	public static void openTabmiles() {
		driver.get("http://www.tabmiles.com/");
		
	}
	
	
	
	

}
