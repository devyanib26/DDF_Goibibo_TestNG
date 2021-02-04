package com.goibibo.testScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.goibibo.utilities.BrowserObjects;

public class ScrollExample {
	
  @Test
  public void f() throws Exception {
	  
	  WebDriver browser = BrowserObjects.get("chrome");
	  
	  browser.get("http://www.amazon.in");
	  
	  JavascriptExecutor js = (JavascriptExecutor) browser;
	  
//	  js.executeScript("window.scrollBy(0,500)");
//	  
//	  Thread.sleep(2000);
//	  
//	  js.executeScript("window.scrollBy(0,500)");
//	  
//	  Thread.sleep(2000);
//	  
//	  js.executeScript("window.scrollBy(0,500)");
//	  
//	  Thread.sleep(2000);
//	  
//	  js.executeScript("window.scrollBy(0,-1000)");
	  Thread.sleep(2000);
	  
	  //WebElement instaLink = browser.findElement(By.xpath("//*[contains(text(), 'Safety & security')]"));
	  
	  //js.executeScript("arguments[0].scrollIntoView();", instaLink);
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }
}
