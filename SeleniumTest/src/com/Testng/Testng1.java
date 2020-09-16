package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	
	
	// in testng we have different annotations to define the test cases
	
	// for every Annotation it should have a separate method
	
	//All @Before annotations are prerequisite of the test cases
	
	// All @After annotations are post requisites after the test cases execution.
	
	@BeforeSuite //first preference
	
	public void setUP() {
		
		System.out.println("setup system property for the browser");
	}
	
   @BeforeTest //second preference
	
	public void login() {
		
		System.out.println("login to the app");}
	
	@BeforeClass //3rd preference
	
	public void launchBrowser () {
		
		System.out.println("launched the browser");
	}
	
	
	// *@BeforeMethod
	//@Test
	//@AfterMethod
	
	
	@BeforeMethod //4th preference
	
	public void enterURL() {
		
		System.out.println("Enter the URL of the browser");
	}
		
		@Test // 5th test cases execution, if we have  5 testcases then those will be executed as per *
		
		public void googletitletest () {
			
			System.out.println("GoogleTitleTest");}
			
			@Test
			
			public void searchtest() {
				
				System.out.println ("search the test");
			}
			
			@Test
			
			public void google12() {
				
				System.out.println("google is opened");
			}
		
		
		@AfterMethod
		
		public void closeURL() {
			
			System.out.println ("delete all the cookies");
			
		
		}
		
		@AfterClass
		
		public void closeBrowser() {
			
			System.out.println("closing the browser");
			
	}

	@AfterTest
	
	public void logout() {
		
		System.out.println("logout of the app");
		
		
	}
	

}
