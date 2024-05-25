import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script13 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		WebElement Searchfield=driver.findElement(By.name("q"));
		
		Searchfield.sendKeys("selenium");
		Thread.sleep(3000);
		
            Searchfield.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		Searchfield.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	}

}
