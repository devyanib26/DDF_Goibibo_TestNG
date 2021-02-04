package com.goibibo.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.goibibo.objectRepository.ObjectRepository;
import com.goibibo.pageObjects.LandingPage;
import com.goibibo.pageObjects.SearchResults;
import com.goibibo.utilities.BrowserObjects;
import com.goibibo.utilities.ScrollPage;

public class TC0000 {
  @Test
  public void f() throws Exception {
	  WebDriver browser = BrowserObjects.get(ObjectRepository.browserName);
	  browser.get(ObjectRepository.url);
	  LandingPage.selectTripType(browser, "round");
	  LandingPage.enterSourceCity(browser, "Delhi");
	  LandingPage.enterDestinationCity(browser, "Mumbai");
	  LandingPage.selectDate(browser, "20200915");
	  LandingPage.selectDate(browser, "20201011");
	  LandingPage.clickSearch(browser);
	  
	  SearchResults.selectRoundTripDepartureFlightByName(browser, "Spicejet");
	  ScrollPage.verticalByPixels(browser, "-1000");
	  SearchResults.selectRTReturnFlightByNameTime(browser, "GoAir", "06:00");
	  
	  
	  
  }
}
