package com.DataDrivenTesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class ebaytesting {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2Fsearch%3Fp%3Damazon%26type%3DE211IN826G0%26fr%3Dmcafee&src=noSrc&specId=yidReg");
	
	}
	
	@DataProvider
	public Iterator<Object[]> gettestData() {
		ArrayList<Object[]> testData=TestUtil.GetDatafromexcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="gettestData")
	public void ebayregtest(String Firstname,String Surname,String Emailaddress,String Mobilenumber,String BirthMonth,String Day,String year,
			String Gender) {
		driver.findElement(By.className("ureg-fname")).clear();
        driver.findElement(By.className("ureg-fname")).sendKeys(Firstname);
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys(Surname);
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(Emailaddress);
        driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys(Mobilenumber);
        
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
        select1.selectByVisibleText(BirthMonth);
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys(Day);
        
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys(year);
        driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).clear();
        driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys(Gender);
	}
	
	
  @AfterMethod

public void tearDown() {
	
	driver.quit();
}

}
