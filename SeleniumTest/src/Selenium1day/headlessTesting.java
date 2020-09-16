package Selenium1day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class headlessTesting {

	WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		//FirefoxOptions options= new FirefoxOptions();
		
		//WebDriver driver= new FirefoxDriver(options);
		WebDriver driver= new ChromeDriver(); //launch chrome
		driver.get("https://www.google.co.in//"); //launch browser
		String title= driver.getTitle();
		driver.getCurrentUrl();
		//driver.getPageSource();
		System.out.println("Title of the page:"+driver.getTitle()+driver.getCurrentUrl());
		String Text = driver.findElement(By.className("gb_g")).getText();
		System.out.println (Text);
		
		if (title.equals("Google")) {
			System.out.println("correct title");}
			else {
				System.out.println("Incorrect title");
				
		}
	  driver.quit();
	//System.out.println(driver.getPageSource());

}}
