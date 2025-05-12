package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
	//constructors
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement email_input;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password_input;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement clickLoginBtn;
	
	
	//Actions
	
	public void enterEmail(String email)
	{
		email_input.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		password_input.sendKeys(password);
	}
	
	public void click_login_btn()
	{
		clickLoginBtn.click();
	}

}
