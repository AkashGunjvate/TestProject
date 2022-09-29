package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSerPage {
	
	@FindBy (xpath = "//div[@class='a-box-inner']") private WebElement yourOrder;
	
	@FindBy (xpath = "(//div[@class='a-box-inner'])[2]") private WebElement refund;
	
	public CustomerSerPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnYourOrder()
	{
		yourOrder.click();
	}
	public void clickOnRefund()
	{
		refund.click();
	}
}
