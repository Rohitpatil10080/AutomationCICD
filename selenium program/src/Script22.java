import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/signUP.html");
		
		WebElement l1=driver.findElement(By.id("link"));
		l1.click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("LoginLink")).click();

	}

}
