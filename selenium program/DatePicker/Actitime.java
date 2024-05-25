import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://demo.actitime.com/user/submit_tt.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButtonContainer")).click();
		driver.findElement(By.xpath("(.//div[@class='addTasksButton '])[2]")).click();
		
		

	}

}
