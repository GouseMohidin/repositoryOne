package com.web.TestNgRltd;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class ParallelExc {
	WebDriver	 driver;
	
	 
	@Test
	public void chrmBrw(){
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		 driver.navigate().to("https://chaipoint.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		 Assert.assertTrue(false);
	}
	@Test
	public void fireFoxBrowser(){
	 	 driver=new FirefoxDriver();
		 driver.navigate().to("https://www.wikipedia.org/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("input[@type='checkbox']")).click(); 
		
	}
	
	@AfterMethod()
	public void tearDown(ITestResult result) throws IOException{
		
		
		if(ITestResult.FAILURE==result.getStatus()){
			FailedScreenShot.captureScreenShots(driver, result.getName());
		}
	
		driver.quit();
	}
	/*@AfterClass()
	public void closeBrwser(){
		driver.quit();
	}*/
	
}
