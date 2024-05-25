import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopDisplay_01 {

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on button
		driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();
		
		//verify alert popup displayed
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			
			
			wait.until(ExpectedConditions.alertIsPresent());
			
			//handle alert pop-up
			
		    driver.switchTo().alert().accept();
		}
		  catch(TimeoutException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Alert popup is  not displayed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
