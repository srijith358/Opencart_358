package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {
	
	WebDriver driver;
	
	//con
	public MyAccount(WebDriver driver)
	{
		super(driver);
	}
	
	// locators
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement myAccntTxt;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logoutBtn;
	
	
	//aactions
	public boolean isMyAccountPageExist()
	{
		try
		{
			return myAccntTxt.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		logoutBtn.click();
	}
	
}
