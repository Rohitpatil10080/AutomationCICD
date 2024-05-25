import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facehrm.orangehrmlive.com/login");
		
	WebElement un=driver.findElement(By.id("username"));
		
		un.sendKeys("admin");
	
		 WebElement pwd=driver.findElement(By.id("password"));
		 
		 pwd.sendKeys("admin123");
		 
		 WebElement checkbox=driver.findElement(By.id("remember_me"));
		 checkbox.click();
		 
		// driver.findElement(ById.xpath("//*[@id=\"remember_me\"]")).click();
		 
		 WebElement loginbutton=driver.findElement(By.id("_submit"));
		 loginbutton.click();
		 

	}

}
