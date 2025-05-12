package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_ValidateLoggingIntoTheApplicationUsingValidCredentials extends BaseClass{
	
	@Test(groups = {"sanity","master"})
	public void validLoginTest()
	{
		logger.info("******starting TC002_ValidateLoggingIntoTheApplicationUsingValidCredentials *");
		
		try
		{
			//home
			Home_Page hp = new Home_Page(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			//login
			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(p.getProperty("email"));
			lp.enterPassword(p.getProperty("password"));
			lp.click_login_btn();
			
			//myaccnt
			MyAccount ma = new MyAccount(driver);
			boolean targetPage = ma.isMyAccountPageExist();
			Assert.assertEquals(targetPage, true,"login Failed");
			
		}
		catch(Exception e)
		{
			e.getMessage();
			Assert.fail();
		}
		
		logger.info("******emding TC002_ValidateLoggingIntoTheApplicationUsingValidCredentials *");
		
	}
}
