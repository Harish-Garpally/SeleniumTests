package Selenium1day;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		//Thread.sleep(5000);//static wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//Dynamic wait
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);//Dynamic wait.
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		driver.switchTo().defaultContent();
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contribute')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Bug Triage')]")).click();
		driver.quit();

	}

}
