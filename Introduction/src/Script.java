import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("Webdriver.gecko.driver", "D:\\Rgeckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.get("http://www.google.com");
		driver.quit();
		

	}

}
