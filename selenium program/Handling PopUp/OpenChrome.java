import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {


	public static void main(String[] args) {
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("rohitpatil10080@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Rohit3680#");
	    driver.findElement(By.name("login")).click();*/
	    //disabe notificatons
		
		
	  ChromeOptions op=new ChromeOptions();
	  op.addArguments("disable notification");
	  WebDriver driver1=new ChromeDriver(op);
	  
	 // wait
	  FluentWait wait=new FluentWait(driver1);
	  wait.withTimeout(10, TimeUnit.SECONDS);
	  wait.pollingEvery(10,TimeUnit.SECONDS);
	  wait.ignoring(NoSuchElementException.class);
		
		
		
		
		
		
		
		
		
		

	}

}
