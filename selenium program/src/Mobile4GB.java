import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobile4GB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
	driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("(.//div[@class='_24_Dny'])[2]")).click();
        Thread.sleep(3000);
        
        
        List<WebElement> rv =driver.findElements(By.xpath(".//li[@class='rgWa7D'][1]"));
        
        int countA=0;
        int countB=0;
        
        for(int i=0;i<rv.size();i++) {
        	String ref = rv.get(i).getText();
        	if(ref.contains("4 GB"))
        	{
        		countA++;
        	}
        	else
        	{
        		countB++;
         		
        	}
        	
        }
        
        
        		
      	System.out.println("mobile with 4GB RAM are"+countA);
        System.out.println("mobile without 4GB RAM are"+countB);
        		
        		
       
		

	}

}
