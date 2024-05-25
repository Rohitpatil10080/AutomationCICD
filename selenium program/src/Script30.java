import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	driver.findElement(By.xpath(".//input[@ name='email']")).sendKeys("admin@123");
	driver.findElement(By.xpath(".//input[@ id='pass']")).sendKeys("manager");
	driver.findElement(By.xpath(".//button[@ name='login']")).click();
	}

}

