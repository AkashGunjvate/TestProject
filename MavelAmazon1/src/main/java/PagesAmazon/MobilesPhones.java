package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPhones {
	                  
	@FindBy (xpath = "//span[text()='Mobile Accessories']")
     private WebElement mobileAccessories;
	
	
	public MobilesPhones(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	
	public void clickOnMobilesAccesories()
	{
		mobileAccessories.click();
	}
}
