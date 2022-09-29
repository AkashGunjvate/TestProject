package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	@FindBy (xpath = "//span[text()='Marathi']") private WebElement marathi;
	
	@FindBy (xpath = "//span[text()='Hindi']") private WebElement hindi;
	
	@FindBy (xpath = "//span[text()='English']") private WebElement english;
	

	public BooksPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMarathi()
	{
		marathi.click();
	}
	public void clickOnHindi()
	{
		hindi.click();
	}
	public void clickOnEnglish()
	{
		english.click();
	}
}
