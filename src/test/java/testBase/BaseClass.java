package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass()
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://sauce-demo.myshopify.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass()
	public void teardown()
	{
		driver.quit();
	}
	
	// Using a User Defined Method
	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(7);
		return generatedstring;
		
	}

	public String randomNumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
}







