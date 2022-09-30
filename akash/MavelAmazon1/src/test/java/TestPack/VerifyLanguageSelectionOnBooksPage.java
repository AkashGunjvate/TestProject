package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import PagesAmazon.BooksPage;
import PagesAmazon.HomePage;

public class VerifyLanguageSelectionOnBooksPage {
	
	private WebDriver driver;
	private HomePage homePage;
	private BooksPage booksPage;
	
    @Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName) throws InterruptedException
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			Thread.sleep(3000);
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		  if(browserName.equals("Firefox"))
		{
	        System.setProperty("webdriver.gecko.driver","C:\\Users\\vishi\\Desktop\\Automation\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}	
	}
	
	@BeforeClass
	public void createPOMObjects()
	{
		homePage = new HomePage(driver);
		booksPage = new BooksPage(driver);
	}
	
	@BeforeMethod
	public void openAmazonApp()
	{
		driver.get("https://www.amazon.in/");
		homePage.clickOnBooks();
		
	}
	
	@Test (priority=1)
	public void VerifyEUCanSelectMarathiBooks()
	{
		booksPage.clickOnMarathi();
		System.out.println("Pass1");
	}
	
	@Test (priority=2,invocationCount=1)
	public void VerifyEUCanSelectHindiBooks()
	{
	//	Assert.fail();
		booksPage.clickOnHindi();
		System.out.println("Pass2");
	}
	
	@Test (priority=3)
	public void VerifyEUCanSelectEnglishBooks()
	{
		booksPage.clickOnEnglish();
		System.out.println("Pass3");
	}
	
	@AfterClass
	public void CloseBrawser()
	{
		driver.close(); 
	}
}
