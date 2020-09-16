package com.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
       Xls_Reader reader = new Xls_Reader("D:\\workspace\\SeleniumTest\\src\\com\\testData\\YahooTestData.xlsx");
		
		String firstname =reader.getCellData("RegData", "Firstname", 2);
		System.out.println(firstname);
		String Surname =reader.getCellData("RegData", "Surname", 2);
		System.out.println(Surname);
		String Emailaddress =reader.getCellData("RegData", "Emailaddress", 2);
		System.out.println(Emailaddress);
		String CountryCode =reader.getCellData("RegData", "CountryCode", 2);
		System.out.println(CountryCode);
		String Mobilenumber =reader.getCellData("RegData", "Mobilenumber", 2);
		System.out.println(Mobilenumber);
		String BirthMonth =reader.getCellData("RegData", "Birthmonth", 2);
		System.out.println(BirthMonth);
		String Day =reader.getCellData("RegData", "Day", 2);
		System.out.println(Day);
		String year =reader.getCellData("RegData", "Year", 2);
		System.out.println(year);
		String Gender =reader.getCellData("RegData", "Gender", 2);
		System.out.println(Gender);

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2Fsearch%3Fp%3Damazon%26type%3DE211IN826G0%26fr%3Dmcafee&src=noSrc&specId=yidReg");
        driver.findElement(By.className("ureg-fname")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys(Surname);
        driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(Emailaddress);
        
        driver.findElement(By.xpath("//input[@id='usernamereg-phone']"));
        driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys(Mobilenumber);
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
        select1.selectByVisibleText(BirthMonth);
        driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys(Day);
        driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys(year);
        
        driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys(Gender);
        
        
        
		
	}}


