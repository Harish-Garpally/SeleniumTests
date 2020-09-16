package Selenium1day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("garpallyharish@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9014536370");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//div[@class='j83agx80 l9j0dhe7']//img[@class='hu5pjgll lzf7d6o1']")).click();
		driver.quit();
	
}}
