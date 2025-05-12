package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage{
	
	WebDriver driver;
	
	//constructors
	
	public Home_Page(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath = "//span[@class='caret']")
	WebElement InMyaccount;
	

	@FindBy(xpath ="//a[normalize-space()='Register']")
	WebElement InRegister;
	
	@FindBy(xpath= "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement LoginBtn;
	
	
	// Actions
	
	public void clickMyAccount()
	{
		InMyaccount.click();
	}
	
	public void clickRegister()
	{
		InRegister.click();
	}
	
	public void clickLogin()
	{
		LoginBtn.click();
	}
	

}
