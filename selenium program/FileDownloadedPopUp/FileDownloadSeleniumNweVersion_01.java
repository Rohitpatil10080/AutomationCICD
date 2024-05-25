import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadSeleniumNweVersion_01 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
        driver.findElement(By.xpath(".//a[text()='3.141.59']")).click();
        Thread.sleep(3000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        
        
		
        
		
		
		
		
		
		
		
		
		
		
		

	}

}
