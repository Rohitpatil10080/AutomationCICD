import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//scroll down
		
		for(int i=0; i<5; i++)
		{
			Thread.sleep(3000);
		
			js.executeScript("window.scrollBy(0,200)");
		}
		
		
		  //scroll up
		
		for(int i=0; i<5; i++)
		{
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-200)");
		}
	}
}
		
		
	