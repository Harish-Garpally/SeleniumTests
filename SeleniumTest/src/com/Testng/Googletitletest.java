package com.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletitletest {
	
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
	
	
	@Test
	
	public void GoogleTitleTest() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google420");// we need to use assertions to validate the test case expected vs actual
	}  
	
   @Test
	
	public void Googlelogotest() {
		
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		
   }
         
        
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}


}
