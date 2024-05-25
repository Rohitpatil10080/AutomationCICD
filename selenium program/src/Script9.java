import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/Scripytcss.html");
		WebElement un=driver.findElement(By.tagName("input"));
		 un.sendKeys("admin123");
		 WebElement pwd=driver.findElement(By.id("pass"));
		 
		 pwd.sendKeys("manager");
		

	}

}
