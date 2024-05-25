import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YatraScrollUpToJan22 {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.yatra.com/");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.id("BE_flight_origin_date")).click();
		 Thread.sleep(3000);
		 WebElement tgt_element= driver.findElement(By.id("month-scroll4"));
		 Thread.sleep(3000);
		 JavascriptExecutor js=( JavascriptExecutor) driver;
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView(true)",tgt_element);
		 Thread.sleep(2000);
		 driver.findElement(By.id("18/01/2022")).click();
		 
		
		 
		 
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
