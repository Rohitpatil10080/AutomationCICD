import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSwitchToScript_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20html/Page_02.html");
		Thread.sleep(3000);
		//enter username
		driver.findElement(By.id("user")).sendKeys("admin");
		Thread.sleep(3000);
		
		//switch from main page to frame
		
		//method=01- driver.switchTo().frame(0);
		//method-02- driver.switchTo().frame("xyz");
		
		//method-03
		WebElement rv = driver.findElement(By.id("xyz"));
		driver.switchTo().frame(rv);
		Thread.sleep(3000);
		
		//enter password
		driver.findElement(By.id("pwd")).sendKeys("admin123");
		Thread.sleep(3000);
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		Thread.sleep(3000);
		
		//switch from frame to main page
		
		//method_01- driver.switchTo().parentFrame();
		
		//method_02
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//enter country
		
		driver.findElement(By.id("country")).sendKeys("india");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	