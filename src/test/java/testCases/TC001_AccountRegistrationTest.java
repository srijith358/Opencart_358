package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationpage;
import pageObjects.Home_Page;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest  extends BaseClass {
	
	@Test(groups = {"regression","master"})
	public void verify_Account_registration()
	{
		
		logger.info("***********Starting  TC001_AccountRegistrationTest  *************");
		try
		{
		Home_Page hp = new Home_Page(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationpage arp = new AccountRegistrationpage(driver);
		arp.setFirstName(randomeString().toUpperCase());
		arp.setLastName(randomeString().toUpperCase());
		arp.setEmail(randomeString()+"@gmail.com");
		arp.settelephone(randomeNumber());
		
		String passwd =  randomeAlphaNumberic();
		arp.setpassword(passwd);
		arp.confirmpassword(passwd);
		
		arp.agreeBtn();
		arp.continueClick();
		
		String comfirmation = arp.getconfirmMessage();
		if(comfirmation.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed");
			logger.debug("debug logs");
			Assert.assertTrue(false);
		}
		
		}
		catch (Exception e) {
			
			Assert.fail(); 
		}
		
		logger.info("********** Finished  TC001_AccountRegistrationTest ******");
	}
}
