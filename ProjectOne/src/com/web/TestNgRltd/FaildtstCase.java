package com.web.TestNgRltd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaildtstCase extends FailedScreenShot {
	
	@Test
	public void excone(){
		System.out.println("test Case One");
	}
	@Test
	public void exctwo(){
		System.out.println("test Case two");
	}
	@Test
	public void excthree(){
		Assert.assertTrue(false);
		System.out.println("Test Case Three");
	}

}
