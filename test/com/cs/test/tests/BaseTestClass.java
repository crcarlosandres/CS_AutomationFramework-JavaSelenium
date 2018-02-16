package com.cs.test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class BaseTestClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resource/chromedriver");
		if(this.driver == null) {
			this.driver = new ChromeDriver();
		}
		return driver;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
