package com.web.TestNgRltd;

import org.testng.annotations.Test;

public class ExceptionTst {

	@Test(expectedExceptions=Exception.class)
	public void arthExceptionMth(){
		System.out.println(1/0);
	}
	
}
