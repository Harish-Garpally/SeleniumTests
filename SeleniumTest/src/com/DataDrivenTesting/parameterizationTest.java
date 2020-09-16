package com.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class parameterizationTest {

	public static void main(String[] args) {
		//launching browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2Fsearch%3Fp%3Damazon%26type%3DE211IN826G0%26fr%3Dmcafee&src=noSrc&specId=yidReg");
	// getting data from excel	
		Xls_Reader reader = new Xls_Reader("D:\\workspace\\SeleniumTest\\src\\com\\testData\\YahooTestData.xlsx");
		int rowcount=reader.getRowCount("RegData");
		reader.addColumn("RegData", "Pass/Fail");

	// parameterization	
		for(int rownum=2;rownum<=rowcount;rownum++) {
			
			String firstname= reader.getCellData("RegData", "Firstname", rownum);
			System.out.println(firstname);
			String Surname =reader.getCellData("RegData", "Surname", rownum);
			System.out.println(Surname);
			String Emailaddress =reader.getCellData("RegData", "Emailaddress", rownum);
			System.out.println(Emailaddress);
			String CountryCode =reader.getCellData("RegData", "CountryCode", rownum);
			System.out.println(CountryCode);
			String Mobilenumber =reader.getCellData("RegData", "Mobilenumber", rownum);
			System.out.println(Mobilenumber);
			String BirthMonth =reader.getCellData("RegData", "Birthmonth", rownum);
			System.out.println(BirthMonth);
			String Day =reader.getCellData("RegData", "Day", rownum);
			System.out.println(Day);
			String year =reader.getCellData("RegData", "Year", rownum);
			System.out.println(year);
			String Gender =reader.getCellData("RegData", "Gender", rownum);
			System.out.println(Gender);
			
			//entering Data
			driver.findElement(By.className("ureg-fname")).clear();
	        driver.findElement(By.className("ureg-fname")).sendKeys(firstname);
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

	}

}
