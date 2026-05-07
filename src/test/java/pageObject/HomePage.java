package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	// Constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	// Locator
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	WebElement Signuplnk;
	@FindBy(xpath="//a[normalize-space()='Log In']") 
	WebElement LogInlnk;
	@FindBy(xpath="//a[normalize-space()='Catalog']") 
	WebElement Cataloglnk;
	@FindBy(xpath="//a[normalize-space()='Blog']")
	WebElement Bloglnk;
	
	// Action
	public void clickSignUp()
	{
		Signuplnk.click();
	}
	public void clickLogIn()
	{
		LogInlnk.click();
	}

}
