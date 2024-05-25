import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sript25 {

	public static void main(String[] args)  {
	
		// TODO Auto-generated method stub
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.google.com");
	
	WebElement gmail=driver.findElement(By.linkText("Gmail"));
  

boolean b = gmail.isDisplayed();
if(b)
{
	System.out.println("Gmail link displayed");
	gmail.click();
}
else
{
	System.out.println("gmail link not displayed");
}
 WebElement signin=driver.findElement(By.partialLinkText("Sign in"));
 
 boolean b1=signin.isEnabled();
 if(b1)
 {
	 System.out.println("sign in link enabled");
	 signin.click();
 }
 else 
 {
	 System.out.println("sign in link disabled");
 }
     WebElement email=driver.findElement(By.id("identifierId"));
     email.sendKeys("admin@123");
     
    
	
	}

}
