import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllowNotification_popUp {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("incongnito");
    opt.addArguments("disable _Notification");
    opt.addArguments("start_maximized");
    
    WebDriver driver=new ChromeDriver(opt);
    driver.get("https://www.easymytrip.com/");
		
		
		
		
		
		
		
		
		
	}

}
