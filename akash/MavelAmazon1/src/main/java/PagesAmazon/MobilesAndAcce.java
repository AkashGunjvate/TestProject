package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesAndAcce {

	@FindBy (xpath = "//span[text()='Cables & Adapters']")
    private WebElement cablesAndAdapters;
	
	@FindBy (xpath = "//span[text()='Chargers']")
    private WebElement chargers;
	
	public MobilesAndAcce(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	
	public void clickOnMobilesAccesories()
	{
		cablesAndAdapters.click();
	}
	
	public void clickOnchargers()
	{
		chargers.click();
	}
}
