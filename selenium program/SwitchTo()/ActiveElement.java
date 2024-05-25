import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
	
		   WebDriverManager.firefoxdriver().setup();
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://en-gb.facebook.com/");
		   Thread.sleep(3000);
		   
		   //switchTo activeElement
		   
		   WebElement rv = driver.switchTo().activeElement();
		   rv.sendKeys("admin123");
		   
		 
		   
		
		

	}

}
