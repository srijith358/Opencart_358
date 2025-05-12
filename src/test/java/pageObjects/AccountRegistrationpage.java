package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationpage  extends BasePage{
	
	WebDriver driver;
	
	//contructors
	
	public AccountRegistrationpage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath ="//input[@id='input-firstname']")
	WebElement txtfirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastName;
	
	@FindBy(xpath ="//input[@id='input-email']" )
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtconfirmPasswd;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement agreeChxBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	//Actions
	
	public void setFirstName(String fname)
	{
		txtfirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) 
	{
		txtlastName.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void settelephone(String tele)
	{
		txttelephone.sendKeys(tele);
	}
	
	public void setpassword(String paswd)
	{
		txtpassword.sendKeys(paswd);
	}
	
	public void confirmpassword(String paswd)
	{
		txtconfirmPasswd.sendKeys(paswd);
	}
	
	public void agreeBtn()
	{
		agreeChxBox.click();
	}
	
	public void continueClick()
	{
		//sol_1
		continueBtn.click();
		
		//sol_2
		//Actions a = new Actions(driver);
		//a.moveToElement(continueBtn).click().build().perform();
		
		//sol_3
		//continueBtn.sendKeys(Keys.RETURN);
	}
	
	public String getconfirmMessage()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}

}





