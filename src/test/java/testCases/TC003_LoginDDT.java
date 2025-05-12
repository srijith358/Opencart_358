package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups ="dataDriven" )
	public void validate_ddt(String email , String passwd ,String result)
	{
		logger.info("******starting TC003_LoginDDT *** *");
		
		try
		{
			//home
			Home_Page hp = new Home_Page(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			//login
			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(email);
			lp.enterPassword(passwd);
			lp.click_login_btn();
			
			//my account
			MyAccount ma = new MyAccount(driver);
			boolean targetPage = ma.isMyAccountPageExist();
			
			
			//validations
			if(result.equalsIgnoreCase("Valid"))
			{
				if(targetPage== true)
				{
					ma.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(result.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					ma.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
			
		logger.info("******emding TC003_LoginDDT ** *");
		
	}

}
