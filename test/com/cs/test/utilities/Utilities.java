package com.cs.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public Utilities(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 90);
	}
	
	public WebDriver driver;
	
	public static WebDriverWait wait;
	
	public void sendKeys(By by, String input){
		WebElement element = findElement(by);
		element.sendKeys(input);
	}
	
	public WebElement findElement(By by){
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
}
