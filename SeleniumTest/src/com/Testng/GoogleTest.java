package com.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	// priority will define the priority of the test case and we can use groups keyword to define groups of test cases
	
	@Test(priority=1, groups="title") 
	
	public void GoogleTitleTest() {
		
		String Title=driver.getTitle();
		System.out.println(Title);}
		
	@Test(priority=3,groups="logo")
	
	public void Googlelogotest() {
		
		Boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	@Test(priority=2, groups="links")
	public void MailTest() {
		Boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	
	@Test(priority=4,groups="general")
	public void test() {
		System.out.println("test");
		
	}
	
	@Test(priority=5,groups="general")
	public void test1() {
		System.out.println("test1");
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
