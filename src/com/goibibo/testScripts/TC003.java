package com.goibibo.testScripts;

import org.testng.annotations.Test;

import com.goibibo.objectRepository.ObjectRepository;
import com.goibibo.pageObjects.LandingPage;
import com.goibibo.pageObjects.SearchResults;
import com.goibibo.utilities.BrowserObjects;
import com.goibibo.utilities.Excel;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TC003 {
	WebDriver browser;
	ArrayList<String> data;
	
  @Test
  public void searchReturnsNoResults() {
	  LandingPage.enterSourceCity(browser, data.get(0));
	  LandingPage.enterDestinationCity(browser, data.get(1));
	  LandingPage.selectDate(browser, data.get(2));
	  LandingPage.clickSearch(browser);
	  assertFalse(SearchResults.checkResultsAreShown(browser));
  }
  
	@BeforeMethod	
	public void setup() throws Exception {
		browser = BrowserObjects.get(ObjectRepository.browserName);
		browser.get(ObjectRepository.url);
		data = Excel.getRowData("TC003", 1);
	}
		
	@AfterMethod
	public void tearDown() {
		browser.close();
	}

}
