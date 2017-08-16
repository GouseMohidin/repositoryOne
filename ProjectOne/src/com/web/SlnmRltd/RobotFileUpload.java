package com.web.SlnmRltd;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotFileUpload {
	@Test()
	
	public void testUpload() throws AWTException{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///D:/wrkPrgms/uploadingFl.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("fl")).click();
		
		fileUpload("E:\\Althaf Zakir\\qs\\IntLife.docx");
		
	}
	
	
	public void setClipBoarddata(String clipBrd){
		
		StringSelection str=new StringSelection(clipBrd);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
	}
	public void fileUpload(String filepath) throws AWTException{
		setClipBoarddata(filepath);
		
		Robot rbt=new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		/*rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);*/
		rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}
	
}
