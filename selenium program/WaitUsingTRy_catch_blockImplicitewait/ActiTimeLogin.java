import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLogin {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.elementToBeSelected(chk));
			System.out.println("checkbox alredy selected");
		}
		catch(TimeoutException e)
		{
			chk.click();
		}
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
			driver.findElement(By.id("loginButton")).click();
		}
		catch(TimeoutException e)
		{
			System.out.println("Login button not clickable");
		}
		try
		{
			WebElement errormsg = driver.findElement(By.xpath(".//span[contains(text(),username)]"));
			wait.until(ExpectedConditions.visibilityOf(errormsg));
		}
		catch(TimeoutException e)
		{
			System.out.println("error msg not displayed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
