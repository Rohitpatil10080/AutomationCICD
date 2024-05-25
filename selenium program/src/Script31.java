import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath(".//input[@ name=\"usename\"]")).sendKeys("username");
		
		driver.findElement(By.xpath(".//input[@ name=\"password\"]")).sendKeys("pw");
		
		driver.findElement(By.xpath(".//button[@ type='submit']")).click();
		
	

	}

}
