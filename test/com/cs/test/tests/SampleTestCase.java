package com.cs.test.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cs.automationframework.pageobjects.SamplePageObject;
import com.cs.test.utilities.Utilities;

public class SampleTestCase extends BaseTestClass{
	Utilities util = new Utilities(getDriver());
	SamplePageObject spo = new SamplePageObject(getDriver());
	
	@BeforeMethod
	public void setup() {
		util.driver.get("https://www.google.com");
	}
	
	@Test
	public void testOne() {
		spo.enterSearch("Chicken Nuggets");
		Assert.assertEquals(util.findElement(SamplePageObject.SEARCH_BUTTON).isEnabled(), true);
	}
}