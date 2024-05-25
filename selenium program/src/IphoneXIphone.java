import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IphoneXIphone {

	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.name("q")).sendKeys("iphonex");
		
		driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
		
		
		//identified only iphone X
		
		List<WebElement> ref=driver.findElements(By.xpath(".//a[@class='_1fQZEK']//.//div[contains (text(), 'APPLE iPhone X ')]"));
		
		//identified only iphone X price
		List<WebElement> ref1=driver.findElements(By.xpath(".//div[contains (text(), 'APPLE iPhone X ')]/../..//div[@class='_30jeq3 _1_WHN1']"));
		
		
		//Accessing mobile model and price for the list
		
		for(int a=0; a<ref.size(); a++)
		{
		 String mobile_name = ref.get(a).getText();
		 String mobile_price=ref1.get(a).getText();
		 
		
		 
		 System.out.println(mobile_name+"mobile prices is"+mobile_price);
		}
		 
		 //display Highest and lowest price of only iphone x
		 
		 List<Integer> rv=new ArrayList<Integer>();
		 
		 for(int a=0; a<ref1.size(); a++)
		 {
			String mobile_price = ref.get(a) .getText();
			String str2=mobile_price.substring(1);
			String str3=str2.replaceAll(",", "");
			
			int price=Integer.parseInt(str3);
			
			System.out.println(price);
			rv.add(price);
		 }
		   System.out.println(rv);
		   Collections.sort(rv);
		   System.out.println("Lowest price is:: "+rv.get(0));
		   System.out.println("highest price is:: "+rv.get(ref1.size()-1));
		 
			
			
			
		 }
		 
		 
		}

	


