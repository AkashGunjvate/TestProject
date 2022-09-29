package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAmazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	
	}

}
