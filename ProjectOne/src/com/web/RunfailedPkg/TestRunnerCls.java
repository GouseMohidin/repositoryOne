package com.web.RunfailedPkg;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRunnerCls {

	@Test
	public void runningFailedTstCases() {

		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
        list.add("C:/Users/Admin/git/repositoryOne/ProjectOne/test-output/Suite/testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
