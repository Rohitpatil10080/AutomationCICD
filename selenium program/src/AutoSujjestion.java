import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSujjestion {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		//identify count
		List<WebElement> ref = driver.findElements(By.xpath(".//span[contains (text(),'selenium')]"));
		Thread.sleep(4000);
		System.out.println("total optins displayed"+ref.size());
		
		//print each option/sujjestion text
		
		for(int i=0;i<ref.size();i++)
		{
		String text = ref.get(i).getText();
		Thread.sleep(4000);
		
		System.out.println(text);
		}
		
		

	}

}
