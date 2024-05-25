import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script27 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/Scripytcss.html");
		
		
	    driver.findElement(By.cssSelector("input  [rype='test']")).sendKeys("admin");
		
        
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		
	}

}
