
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement un=driver.findElement(By.id("username"));
		
		 Dimension unD= un.getSize();
			WebElement pwd=driver.findElement(By.name("pwd"));
			
			 Dimension pwdD= pwd.getSize();
			 
			 if(unD.equals(pwdD))
			 {
				 System.out.println("username field and password field are same");
			 }
			 else
			 {
				 System.out.println("username field and password field not same");
				 
			 }

	}

}
