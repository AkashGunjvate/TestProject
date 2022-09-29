package PagesAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	@FindBy (xpath = "//input[@id='ap_email']") private WebElement mobNo;
	
	@FindBy (xpath = "//input[@id='continue']") private WebElement continueButton;
	
     public LogIn(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void use () {
    	 mobNo.sendKeys("1234567899");
    	 continueButton.click();
     }
}
