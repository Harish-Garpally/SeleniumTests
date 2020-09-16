package Selenium1day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopuphandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert(); //switch to foreground screen
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct error message");
			}
		else {
			System.out.println("incorrect error message");
		}
		alert.accept();//click on ok button
		//alert.dismiss(); //click on cancel button
		driver.quit();

	}

}
