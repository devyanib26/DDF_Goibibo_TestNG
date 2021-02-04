package com.goibibo.testScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goibibo.utilities.BrowserObjects;

public class ScreenShot {
	
  @Test
  public void f() throws Exception {
	  
	  WebDriver browser = BrowserObjects.get("chrome");
	  
	  browser.get("http://www.amazon.in");
	  
	  JavascriptExecutor js = (JavascriptExecutor) browser;
	  
	  WebElement signIn = browser.findElement(By.linkText("Sign in"));
	  
	  js.executeScript("arguments[0].scrollIntoView();", signIn);
	  
	  signIn.click();
	  
	  browser.findElement(By.name("email")).sendKeys("mhdaimi@himail.coom");
	  
	  browser.findElement(By.id("continue")).click();
	  
	  TakesScreenshot ss = (TakesScreenshot) browser;
	  File screenGrab = ss.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenGrab, new File("E:\\Workspaces\\Batch-8\\DataDrivenFramework\\src\\com\\goibibo\\screenShots\\amazon.jpg"));
	  
  }
}
