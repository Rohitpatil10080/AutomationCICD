package ListWebHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CleanTrip1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
		 
		driver.get("https://www.cleartrip.com/");
		
	    driver.findElement(By.xpath("(.//input[@placeholder='Any worldwide city or airport'])[1]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(".//p[contains(text(),'Mumbai')]")).click();
	
		
		//to filed
		
		driver.findElement(By.xpath("(.//input[@placeholder='Any worldwide city or airport'])[2]")).click();
		 Thread.sleep(3000);
		
		 driver.findElement(By.xpath("(.//p[contains(text(),'New Delhi')])")).click();

	}

}
