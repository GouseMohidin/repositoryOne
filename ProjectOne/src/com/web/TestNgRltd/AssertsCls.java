package com.web.TestNgRltd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertsCls {
	WebDriver driver;
	@Test
	public void verifyMth(){
		System.setProperty("webdriver.ie.driver", "D:\\BrowserDrivers\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	 driver.navigate().to("https://chaipoint.com/");
	 driver.manage().window().maximize();
	 Assert.assertEquals("https://chaipoint.com/", driver.getCurrentUrl(),"Not Matched");
	}

}
