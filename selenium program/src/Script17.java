import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un=driver.findElement(By.id("username"));
		
		un.sendKeys("admin");
	
		un.sendKeys(Keys.CONTROL+"a");
		
		un.sendKeys(Keys.DELETE);
		

	}

}
