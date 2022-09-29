package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//a[@id='nav-logo-sprites']") private WebElement logo;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']") private WebElement searchBox;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']") private WebElement searchButton;
	
	@FindBy (xpath = "//a[text()='Mobiles']") private WebElement mobiles;
	
	@FindBy (xpath = "//a[text()='Customer Service']") private WebElement customerService;

	@FindBy (xpath = "//a[text()='Books']") private WebElement books;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void methosUse()
	{
		logo.click();
		searchBox.sendKeys("Oneplus mobiles");
		searchButton.click();
	}
	public void clickOnMobiles()
	{
		mobiles.click();
	}
	public void clickOnCustomerService()
	{
		 customerService.click();
	}
	public void clickOnBooks()
	{
		books.click();
	}

}
 