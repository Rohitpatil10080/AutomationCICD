import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement errormsg=driver.findElement(By.xpath(".//span[@class='errormsg']"));
		
		String CssValue=errormsg.getText();
		
		if(errormsg.getCssValue("Username or Password is invalid. Please try again.") != null)
		{
			System.out.println("errormsg is not in bold text");
		}
		else
		{
			System.out.println("errormsg is  in bold text");
		}
			
		

	}

}
