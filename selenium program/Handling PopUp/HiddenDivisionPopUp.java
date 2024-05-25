import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.goibibo.com/");
	    
	    driver.findElement(By.xpath(".//div[@class='login__tab gotrible']")).click();
	    Thread.sleep(3000);
		
		driver.findElement(By.name("phone")).sendKeys("9545823216");
		
		
		
		
		
		
		
		

	}

}
