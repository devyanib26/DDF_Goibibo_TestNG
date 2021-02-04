package com.goibibo.testScripts;

import org.testng.annotations.Test;

import com.goibibo.objectRepository.ObjectRepository;
import com.goibibo.utilities.BrowserObjects;
import com.goibibo.utilities.Excel;

import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TC0001 {
	WebDriver browser;
	ArrayList<String> data;
	
	@BeforeMethod	
	 public void setup() throws Exception {
		 browser = BrowserObjects.get(ObjectRepository.browserName);
		 browser.get(ObjectRepository.url);
		 data = Excel.getRowData("TC001", 1);
	 }
	
	
	  @Test
	  public void defaultPageIsFlightSearch() {
		 // assertEquals(LandingPage.getHeaderText(browser), data.get(0));
	  }

  @AfterMethod
  public void teatDown(ITestResult testResult ) {
	  if(testResult.getStatus()==ITestResult.FAILURE) {
		//  CaptureScreenShot.asFile(browser, testResult.getName());
	  }
	  browser.close();
  }

}
