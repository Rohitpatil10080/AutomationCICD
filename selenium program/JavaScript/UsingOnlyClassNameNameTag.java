import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingOnlyClassNameNameTag {

	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		 
		 driver.get("https://demo.actitime.com/login.do");
		 
		 //enter username
		 
		 JavascriptExecutor js=( JavascriptExecutor)driver;
		 
		 js.executeScript("document.getElementsByClassName('textField')[0].value='admin'");
		 
		 //enter password
		 
		 js.executeScript("document.getElementsByClassName('textField')[1].value='admin'");
		 
		 //select checkbox
		 
		 js.executeScript("document.getElementsByName('remember')[0].click()");
		 
		 //click on login
		 
		 js.executeScript("document.getElementsByClassName('initial')[0].click()");
		
		
		
	}

}
