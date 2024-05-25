import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTop {

	public static void main(String[] args) {
		
		
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor ) driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollTop)");


	}

}
