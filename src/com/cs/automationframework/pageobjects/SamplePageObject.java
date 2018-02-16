package com.cs.automationframework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cs.test.utilities.Utilities;

public class SamplePageObject {
	
	Utilities util;
	public SamplePageObject(WebDriver driver){
		util = new Utilities(driver);
	}
	
	public static By GOOGLE_INPUT = By.xpath("//*[@id=\'lst-ib\']");
	public static By SEARCH_BUTTON = By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]");
	
	public void enterSearch(String input){
		util.sendKeys(GOOGLE_INPUT, input);
	}
}
