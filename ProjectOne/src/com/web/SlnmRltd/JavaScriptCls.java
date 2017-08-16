package com.web.SlnmRltd;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.testng.annotations.Test;

public class JavaScriptCls {
	String st;
	@Test()
	public void mouseAct() throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//generate Alert Pop window
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello World');");
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		// refresh browser window 
		js.executeScript("history.go(0)");
		
		// get innertext of the entire webpage
		 st=js.executeScript("return document.documentElement.innerText;").toString();
	     System.out.println(st);
	     
	    //get the Title of our webpage
	     st=js.executeScript("return document.title;").toString();
	     System.out.println("Title :"+st);
	     
	    // Scroll on application
	     js.executeScript("window.scrollBy(0,100)");
	     
	   // scrolling till the bottom of the page
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	   //Navigate to new Page
	     js.executeScript("window.location = 'https://www.facebook.com/uftHelp'");   
	     
	     
	}

}
