import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByUsingOnlyXpathCss {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://demo.actitime.com/login.do");
		
		  //enter user-name
		
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   Thread.sleep(3000);
		
		   WebElement username = driver.findElement(By.xpath(".//input[@id='username']"));
		 
		   js.executeScript("arguments[0].value='admin'",username);
		   Thread.sleep(3000);
		   
		   //disabled user-name
		   js.executeScript("arguments[0].setAttribute('disabled',true)",username);
		   Thread.sleep(3000);
		   
		   //remove disabled
		   js.executeScript("arguments[0].removeAttribute('disabled')",username);
		
		
	}

}
