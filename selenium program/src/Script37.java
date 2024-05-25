import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script37 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		int un=driver.findElement(By.id("username")).getLocation().getX();
		
		int un1=driver.findElement(By.id("username")).getLocation().getY();
		
		int pwd=driver.findElement(By.name("pwd")).getLocation().getX();
		
		int pwd1=driver.findElement(By.name("pwd")).getLocation().getY();
		
		if(pwd1>(un1))
		{
		
		System.out.println("password field is aligned below username field");
		
	}
	    else
	{
		
		
		System.out.println("password field not aligned below username field");

	}

	}
}
