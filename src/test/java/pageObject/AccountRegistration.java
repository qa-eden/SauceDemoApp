package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage{
   // Constructor Needed
	public AccountRegistration(WebDriver driver)
	{
		super(driver);
	}
	
	// Locators 
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@value='Create']")
	WebElement createbtn;
	
	@FindBy(xpath="//a[normalize-space()='My Account']")
	WebElement validateMyAccointisDisplayed;
	
	
	// Actions
	public void setFirstName(String firstname) {
		txtFirstName.sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		txtLastName.sendKeys(lastname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd){
		txtpwd.sendKeys(pwd);
	}
	
	public void clickCreatebtn() {
		createbtn.click();
	}
	
	public String validateMyAccount() {
		try
		{
			return (validateMyAccointisDisplayed.getText());
		}
		catch (Exception e)
		{
			return(e.getMessage());
		}
	}
	
}
