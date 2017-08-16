package com.web.SlnmRltd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseOvrActions {

	@Test()
	public void mouseAct() throws AWTException{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot rbt=new Robot();
		
		// right click
		
		rbt.mousePress(InputEvent.BUTTON3_MASK);
		rbt.mouseRelease(InputEvent.BUTTON3_MASK);
		
	}
}
