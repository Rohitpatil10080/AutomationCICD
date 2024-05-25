import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("admin");
		
		un.sendKeys(Keys.CONTROL+"a");
		un.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(3000);
		
		un.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));
		
		
		

	}

}
