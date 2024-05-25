package ListWebHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FatCow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.fatcow.com/");
		
        WebElement tdt_listbox = driver.findElement(By.id("countrySelect"));
        
        Select s=new Select(tdt_listbox);
        Thread.sleep(5000);
        
        s.selectByIndex(2);
        Thread.sleep(5000);
        
        s.selectByValue("AUD");
        Thread.sleep(5000);
        s.selectByVisibleText("Europe");
        
        

	}

}
