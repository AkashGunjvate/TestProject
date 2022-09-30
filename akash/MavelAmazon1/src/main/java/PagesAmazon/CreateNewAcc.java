package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAcc {
	
	@FindBy (xpath = "//input[@id='ap_customer_name']") private WebElement name;
	
	@FindBy (xpath = "//input[@id='ap_phone_number']") private WebElement mobNo;
	
	@FindBy (xpath = "//input[@id='ap_email']") private WebElement password;
	
	@FindBy (xpath = "//input[@id='continue']") private WebElement contineuButton;
	
    public CreateNewAcc(WebDriver driver)
  {
	PageFactory.initElements(driver, this);
  }

    public void useOfMethods() 
  {
	name.sendKeys("Virat Kohli");
	mobNo.sendKeys("0987654321");
	password.sendKeys("klrahul01");
	contineuButton.click();
  }

}
