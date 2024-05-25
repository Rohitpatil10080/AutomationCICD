import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingContextClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.easemytrip.com");
		WebElement tgt_element = driver.findElement(By.xpath(".//i[@class='fl_hp_i']"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(tgt_element).perform();
		a.contextClick().perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_P);
		
		//using build
		//This method is used to combine multiple action into single action
		//a.moveToElement(tgt_element).contextClick().build().perform();
		
		

	}

}
