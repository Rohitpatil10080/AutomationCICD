import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement chk=driver.findElement(By.id("keepLoggedInCheckBox"));
		
		boolean value=chk.isSelected();
		
		if(value)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
			chk.click();
		}
			

	}

}
