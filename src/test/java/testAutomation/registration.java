package testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class registration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://sauce-demo.myshopify.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Home Page
		// Get Title
		// System.out.println("The Home Page Title is" +driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement createbtn=driver.findElement(By.xpath("//input[@value='Create']"));
		act.click(createbtn).perform();
		Thread.sleep(5000);
		
		//driver.quit();

	}

}
