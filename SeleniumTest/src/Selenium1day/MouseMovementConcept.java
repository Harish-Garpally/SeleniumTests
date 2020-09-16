package Selenium1day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Senior Citizen Discount')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]")).click();
		driver.findElement(By.xpath("//input[@id='ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID']")).sendKeys("9014536370");
		driver.findElement(By.xpath("//a[@class='color-gray']")).click();
		driver.findElement(By.xpath("//a[@class='spicejet_logo']")).click();

	}

	
}
