package com.web.SlnmRltd;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class keywrdActions {

	@Test()
	public void keyWrdMth() throws Exception {
		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(ffprofile);
		driver.navigate().to("https://chaipoint.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement srchBox = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("google_location2"))));
		srchBox.sendKeys("c");
		Thread.sleep(1000);
		srchBox.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		String vl = srchBox.getAttribute("value");
		System.out.println(vl);

	}   

}
