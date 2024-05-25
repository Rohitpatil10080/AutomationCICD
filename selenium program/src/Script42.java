import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script42 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//button[@ class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		driver.findElement(By.xpath(".//button[@ class='L0Z3Pu']")).click();
		
		Thread.sleep(7000);
		
		List<WebElement> ref1 = driver.findElements(By.xpath(".//div[@class='_4rR01T']"));
		List<WebElement> ref2 = driver.findElements(By.xpath(".//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int a=0; a<ref1.size(); a++)
		{
			String mobile_name = ref1.get(a).getText();
			String mobile_price=ref2.get(a).getText();
			
			System.out.println(mobile_name+"mobile_price is"+mobile_price);
		}
		

}
		
		

	}


