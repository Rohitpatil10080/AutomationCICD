package ListWebHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DOBFacebook {

	public static void main(String[] args) throws  AWTException, InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("नवीन खाते तयार करा")).click();
		
		Thread.sleep(5000);
		
		//Approach-01
		
		driver.findElement(By.id("day")).click();
		Thread.sleep(5000);
		
		//Approach-02
		
		driver.findElement(By.id("month")).click();
		Thread.sleep(5000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//Approach-03
		
		WebElement tdt_listbox = driver.findElement(By.id("year"));
		
		
		Select s=new Select(tdt_listbox);
		
		s.selectByIndex(5);
		s.selectByValue("2013");
		s.selectByVisibleText("2011");
		
	
		

	}

	}


