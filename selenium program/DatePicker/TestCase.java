import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	driver.getTitle();
	System.out.println("Title");
		
		
		
		
		
		
		
		
		

	}

}
