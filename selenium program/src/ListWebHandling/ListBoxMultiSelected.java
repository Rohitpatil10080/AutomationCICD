package ListWebHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxMultiSelected {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/IsMultiple.html");
		
		
		WebElement tgt = driver.findElement(By.id("list"));
		
		Select s=new Select(tgt);
		
		boolean value=s.isMultiple();
		
		if(value)
		{
			System.out.println("List box is multi selectable");
		}
		else
		{
			System.out.println("List box is single selectable");
		}
		

	}

}
