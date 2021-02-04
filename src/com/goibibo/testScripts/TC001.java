package com.goibibo.testScripts;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.objectRepository.ObjectRepository;
import com.goibibo.pageObjects.LandingPage;
import com.goibibo.utilities.BrowserObjects;
import com.goibibo.utilities.Excel;

public class TC001 {
	
	WebDriver browser;
	ArrayList<String> data;
	
	@BeforeMethod	
	 public void setup() throws Exception {
		 browser = BrowserObjects.get(ObjectRepository.browserName);
		 browser.get(ObjectRepository.url);
		 data = Excel.getRowData("TC001", 1);
	 }
	
	@AfterMethod
	public void tearDown() {
		browser.close();
	}
	
	  @Test
	  public void defaultPageIsFlightSearch() {
		  assertEquals(LandingPage.getHeaderText(browser), data.get(0));
	  }
}
