import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimePrintReport {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriverManager.firefoxdriver().setup();
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  Thread.sleep(3000);
		  driver.findElement(By.id("username")).sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(3000);
		  driver.findElement(By.name("remember")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("loginButtonContainer")).click();
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(3000);
		  r.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(3000);
		  r.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(3000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(.//table[@class='configItemContainer  TIME  enabled'])[3]")).click();
		
		
	}

}
