package com.Testng;

import org.testng.annotations.Test;

public class Testngfeatures {

	@Test
	
	public void logintest() {
		
		System.out.println("login succed");
		
	//int i=9/0;
	}
	//dependesonMethod is used when test cases are dependent on each other, ex if login test failed then there is no need to execute other test case
	// we can use this keyword to ignore/skip this test cases.
	
	@Test(dependsOnMethods="logintest")
	
public void logofftest() {
		
		System.out.println("logout succed");
}
	@Test(dependsOnMethods="logintest")
public void manage() {
		
		System.out.println("logout succed");
}
	@Test(dependsOnMethods="logintest")
public void zoom() {
	
	System.out.println("logout succed");
}
	@Test(dependsOnMethods="logintest")
public void logouttest() {
	
	System.out.println("logout succed");
}
}