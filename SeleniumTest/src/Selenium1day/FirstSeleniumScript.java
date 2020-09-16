package Selenium1day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {
  
	WebDriver driver;
	
	public  void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
		
	}
	public static void main(String[] args) {
	
		FirstSeleniumScript obj = new FirstSeleniumScript();
		obj.launchBrowser();
	
	}

}
