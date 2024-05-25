import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script10 {

	public static void main(String[] args) throws InterruptedException {
				WebDriverManager.firefoxdriver().setup();

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://facehrm.orangehrmlive.com/login");
		
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		
		un.sendKeys("Admin");
		
		WebElement PWD=driver.findElement(By.id("password"));
		Thread.sleep(2000);
		
		PWD.sendKeys("admin123");
		
		WebElement checkbox=driver.findElement(By.id("remember_me"));
		Thread.sleep(2000);
		
		checkbox.click();
		WebElement loginbutton=driver.findElement(By.id("_submit"));
		Thread.sleep(2000);
		
		loginbutton.click();
		
		
				
		
		
		
	}

}
