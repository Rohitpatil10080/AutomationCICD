package ListWebHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	  	driver.get("file:///D:/selenium%20html/IsMultiple.html");
		
		WebElement rv = driver.findElement(By.id("list"));
		Select s=new Select(rv);
		Thread.sleep(3000);
		
		//select all option
		List<WebElement> ref1 = s.getOptions();
		for(int i=0; i<ref1.size();i++)
		{
			s.selectByIndex(i);
		}
			
			//select first option
			
			for(int a=0; a <ref1.size();a++)
			{
				
				WebElement first = s.getFirstSelectedOption();
		       String str = first.getText();
				System.out.println(str);
			}
	

	}

}

