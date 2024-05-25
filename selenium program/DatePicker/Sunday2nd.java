import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sunday2nd {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.com/");
	    Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//div[contains(@class, 'gtm-onwardCalendar')]")).click();
		Thread.sleep(3000);
		String target_month= "Jan";
		while(true)
		{
			String displayed_month=driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2])")).getText();
			if(displayed_month.contains(target_month))
			{
				break;
			}
			else
			{
				Thread.sleep(3000);
				
				//click on forward arrow
				driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td[7])[2]")).click();
				
			}
		}
	
		
		

	}

}
