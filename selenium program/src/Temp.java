import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/user.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin@123");
		
		
		driver.findElement(By.cssSelector("input[password='text']")).sendKeys("admin123");

	}

}

