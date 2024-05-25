import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script24 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://touch.facebook.com/");
		
		
		WebElement email=driver.findElement(By.name("reg_email_"));
		email.sendKeys("admin@xyz.com");
		
		WebElement rv=driver.findElement(By.name("reg_email_confirmation_"));
		boolean status=rv.isDisplayed();
		if(status)
		{
			System.out.println("Re-enter EmailId Displayed");
			rv.sendKeys("admin@.gmail.com");
			
		}
		else
		{
			System.out.println("Re-enter EmailId is not Displayed");
		}
	}

}
