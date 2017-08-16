package com.web.TestNgRltd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParamtrCls {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void selectBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Ie")){
			System.setProperty("webdriver.ie.driver", "D:\\BrowserDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("fireFox")){
			driver=new FirefoxDriver();
		}
		else{
			driver=null;
		}
		
		
	}
	
	@Parameters("BrVal")
	@Test()
	public void opnBrowser(String brval){
		driver.manage().window().maximize();
		driver.get("http://www.chaichai.in/");
		System.out.println(brval);
		
	}

}
