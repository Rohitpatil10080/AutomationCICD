import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		//switch to alert popup
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		//print popup text
		String txt = a.getText();
		Thread.sleep(3000);
		System.out.println(txt);
		//click on ok button
		a.accept();
		
		
		driver.findElement(By.xpath(".//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//switch to alert popup
		Alert b=driver.switchTo().alert();
		Thread.sleep(3000);
		//print popup text
		String txt1 = b.getText();
		Thread.sleep(3000);
		System.out.println(txt1);
		//click on ok button
		b.accept();
		
		
		WebElement rv = driver.findElement(By.xpath(".//button[text()='Click for JS Prompt']"));
		rv.click();
		Thread.sleep(3000);
		//switch to alert popup
		Alert a2=driver.switchTo().alert();
		//print popup text
		Thread.sleep(3000);
		String txt2 = a2.getText();
		Thread.sleep(3000);
		System.out.println(txt2);
		//enter text
		a2.sendKeys("java");
		Thread.sleep(3000);
		//check box click
	   Robot r=new Robot();
		/*r.keyPress(KeyEvent.VK_P);
		a2.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		//aceept
		a2.accept();
*/
		
		
		
		
		
		
		
		
		

	}

}
