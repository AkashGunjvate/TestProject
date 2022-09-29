package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PagesAmazon.HomePage;
import PagesAmazon.MobilesAndAcce;
import PagesAmazon.MobilesPhones;

public class VerifyTestCasesOnMobileAndAccePage {
	
	private WebDriver driver;
	private MobilesPhones mobilesPhones;
	private MobilesAndAcce mobilesAndAcce;
    private HomePage homePage;
    
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
		
		homePage = new HomePage(driver);
		homePage.clickOnMobiles();
		
		mobilesPhones = new MobilesPhones(driver);
		mobilesPhones.clickOnMobilesAccesories();
		
		mobilesAndAcce = new MobilesAndAcce (driver);
		
    }
	
	@Test 
	public void VerifyEUCanClickOnCablesField()
	{
		
		System.err.println("Test1Pass");
		mobilesAndAcce.clickOnchargers();
		
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














