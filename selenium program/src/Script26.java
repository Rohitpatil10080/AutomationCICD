import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		WebElement sf=driver.findElement(By.name("q"));
		
		sf.sendKeys("selenium");
		Thread.sleep(3000);
		
		sf.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		sf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		
		sf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		sf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		sf.sendKeys(Keys.CONTROL+"a") ; 
		 
		sf.sendKeys(Keys.ENTER);
		
		
	}

}
