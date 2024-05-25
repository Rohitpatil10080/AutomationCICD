import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CalenderWay2 {

	public static void main(String[] args) throws InterruptedException {
	    
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	     Thread.sleep(3000);
	     
		driver.get("https://www.cleartrip.com");
		
		driver.findElement(By.xpath(".//div[@class='row pl-4 pr-4 p-relative']")).click();
		
		String target_month = "Mar 2022";
		Thread.sleep(3000);
		
	 while(true)
		{
			
		  String displayed_month = driver.findElement(By.xpath(".//div[contains(@class, 'bg-white br-4')]/ul/div[2]/div/div[2]/div[1]/div[1]")).getText();
	      if(displayed_month.contains(target_month))
	     {
	    	 break;
	     }
	   else
	     {
	    	Thread.sleep(3000);
	    	//click on forward Arrow
	    	
	    	driver.findElement(By.xpath(".//*[local-name() = 'svg' and @data-testid='rightArrow']")).click();
	     }
		}
	}
}
