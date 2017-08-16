package com.web.TestNgRltd;

import org.testng.annotations.Test;

public class GroupExmple {
	
	@Test(groups="one")
	public void tstMthOne(){
		System.out.println("Group one tstMthone");
	}
	@Test(groups="Two")
	public void tstMthTwo(){
		System.out.println("Group Two tstMthone");
	}
	
	@Test(groups={"one","Two"})
	public void combTstMth(){
		System.out.println("Group one and Group two related Test Mth");
	}
}
