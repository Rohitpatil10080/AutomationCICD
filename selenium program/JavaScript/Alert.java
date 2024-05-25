import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver=new FirefoxDriver();
		
		   driver.get("https://en-gb.facebook.com/");
		
	    	//print alert pop-up
		
		   JavascriptExecutor js= (JavascriptExecutor)driver;
		    
		   js.executeScript("alert('Hello Selenium')");
		   
		   //if you want to enter any text
		   // alert("hello selenium")
		
		

	}

}
