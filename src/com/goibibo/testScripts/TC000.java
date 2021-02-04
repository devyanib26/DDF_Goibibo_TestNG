package com.goibibo.testScripts;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.goibibo.objectRepository.ObjectRepository;
import com.goibibo.pageObjects.LandingPage;
import com.goibibo.pageObjects.SearchResults;
import com.goibibo.utilities.BrowserObjects;
import com.goibibo.utilities.Excel;

public class TC000 {
	WebDriver browser;
	
	
  @Test
  public void f() throws Exception {
	  browser = BrowserObjects.get(ObjectRepository.browserName);
	  browser.get(ObjectRepository.url);
	  ArrayList<String> values = Excel.getRowData(ObjectRepository.flightSearchSheet, ObjectRepository.firstRow);
	  //LandingPage.selectTripType(browser, values.get(0));
	  LandingPage.enterSourceCity(browser, values.get(1));
	  LandingPage.enterDestinationCity(browser, values.get(2));
	  LandingPage.selectDate(browser, values.get(3));
	  //LandingPage.selectDate(browser, values.get(4));
	  LandingPage.clickSearch(browser);
	  assertEquals(SearchResults.getValue(browser), "Filters");
	  SearchResults.selectFlightByNameTime(browser, "Air India", "17:00");
	  
  }
  
  
}
