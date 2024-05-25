import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facehrm.orangehrmlive.com/login");
		
	WebElement un=driver.findElement(By.id("username"));
	
	boolean un_status=un.isDisplayed();
	if (un_status)
	{
	
	un.sendKeys("admin");
	}
	else
	{
		System.out.println("not displayed");
		
		WebElement pwd=driver.findElement(By.id("password"));
		
		boolean pwd_status=pwd.isDisplayed();
		
		if(pwd_status)

		{
			pwd.sendKeys("admin123");
		}
		else
		{
			System.out.println("pwd is not displayed");
		}
		
	}
	}
}


