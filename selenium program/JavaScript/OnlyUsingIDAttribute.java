import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlyUsingIDAttribute {

	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 //Enter email
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('email').value='admin@123'");
		 
		 //enter password
		 
		 js.executeScript("document.getElementById('pass').value='admin'");
		
		
		
		
		
		
		
		
		
		
		

	}

}
