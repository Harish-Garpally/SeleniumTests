package Selenium1day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("garpallyharish@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9014536370");
		driver.findElement (By.id("loginbutton")).click();
		
}}
