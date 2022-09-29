package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesAmazon.CustomerSerPage;
import PagesAmazon.HomePage;
import PagesAmazon.MobilesAndAcce;
import PagesAmazon.MobilesPhones;

public class VerifyServicePage {

	private WebDriver driver;
	private HomePage homepage;
	private CustomerSerPage customerSerPage;
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("BeforeClass");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openMobilesAndAccePage()
	{
		driver.get("https://www.amazon.in/");
		
		homepage = new HomePage(driver);
		homepage.clickOnCustomerService();
		
		customerSerPage = new CustomerSerPage(driver);
		
		
	}
	@Test (priority=1)
	public void VerifyEUCanClickOnYourOrder()
	{
		System.out.println("A");
		customerSerPage.clickOnYourOrder();
		
	    String url = driver.getCurrentUrl();
	    String title = driver.getTitle();
	    
	    if (url.equals("akash")&& title.equals("Gunjavte"))
	    {
	    	System.out.println("Pass");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    }
	}
	    @Test (priority= -1)
		public void VerifyEUCanClickOnRefund()
		{
	    	System.out.println("B");
			customerSerPage.clickOnRefund();
			
		    String url = driver.getCurrentUrl();
		    String title = driver.getTitle();
		    
		    if (url.equals("akash")&& title.equals("Gunjavte"))
		    {
		    	System.out.println("Pass");
		    }
		    else
		    {
		    	System.out.println("Fail");
		    }
	}
	@AfterClass
	public void closeBrowser()
	{
		
		driver.close();
	}
}
