

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingGetLocation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("mi");
		
		driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
	     WebElement element = driver.findElement(By.xpath("(.//div[@class='_4rR01T'])[4]"));
	     Thread.sleep(3000);
	     
	     int x_loc = element.getLocation().getX();
	     int y_loc = element.getLocation().getY();
	  
	     Thread.sleep(3000);
	   
	    
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy("+x_loc+","+y_loc+")");
	    
		
		
		
		

	}

}
