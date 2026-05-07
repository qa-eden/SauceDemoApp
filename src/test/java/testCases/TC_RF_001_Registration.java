package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistration;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_RF_001_Registration extends BaseClass{
		
	@Test
	public void verify_account_registration() {
		try
		{
		HomePage hp=new HomePage(driver); // Home Page
		hp.clickSignUp();
		
		// FIll Form Fields
		AccountRegistration regpage=new AccountRegistration(driver); // Account Registration
		regpage.setFirstName(randomString().toLowerCase()); // Set First name
		regpage.setLastName(randomString().toLowerCase()); // Set Last Name
		regpage.setEmail(randomString()+"@gmail.com"); // Set Email
		regpage.setPassword(randomString()); // Set Passsword
		regpage.clickCreatebtn(); // Click the Create Button
		
		Thread.sleep(5000);
		
		// Validation
		String confirmMyAccountisDisplayed=regpage.validateMyAccount();
		Assert.assertEquals(confirmMyAccountisDisplayed, "My Account");
		} catch (Exception e)
		{
			Assert.fail();
		}
		
		
	}
}
