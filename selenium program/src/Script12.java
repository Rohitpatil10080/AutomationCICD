import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		WebElement Email=driver.findElement(By.id("email"));
		
		Email.sendKeys("admin@123");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("admin123");

	}

}
