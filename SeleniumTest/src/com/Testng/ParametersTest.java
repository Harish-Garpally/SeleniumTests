package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	WebDriver driver;

	@Test
	@Parameters({"Browser","url","EmailID"})

	public void Yahoologintest(String Browser,String url, String EmailID ) {

		if (Browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get(url);}

		else if(Browser.equals("Firefox")){

			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.get(url);}


		driver.get(url);

		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(EmailID);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();


	}

}
