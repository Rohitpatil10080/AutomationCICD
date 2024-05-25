import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
	int un=driver.findElement(By.id("username")).getLocation().getX();
	
	System.out.println("print x value"+un);
	
	int un1=driver.findElement(By.id("username")).getLocation().getY();
	System.out.println("print y value"+un1);
	
	int sz=driver.findElement(By.id("username")).getSize().getHeight();
	
	System.out.println("print height"+sz);
	
	int sz1=driver.findElement(By.id("username")).getSize().getWidth();
	System.out.println("print width"+sz1);
	
		

	}

}
