package ListWebHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/IsMultiple.html");
		
		WebElement rv = driver.findElement(By.id("list"));
		Thread.sleep(3000);
		
		Select s=new Select(rv);
		
	List<WebElement> ref1=s.getOptions();
	
	for(int i=0;i<ref1.size();i++)
	{
		String str1 = ref1.get(i).getAttribute("value");
		s.selectByValue(str1);
			
	}
	Thread.sleep(3000);
	s.deselectByIndex(2);
	Thread.sleep(3000);
	s.deselectAll();

	}

}
