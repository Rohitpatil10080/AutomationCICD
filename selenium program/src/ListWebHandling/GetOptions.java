package ListWebHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/selenium%20html/IsMultiple.html");
		
		Thread.sleep(3000);
		WebElement rv = driver.findElement(By.id("list"));
		Thread.sleep(3000);
		
		Select s=new Select(rv);
		
		//identify all options
		
		List<WebElement> ref = s.getOptions();
		int count=ref.size();
		System.out.println("total element present in listbox "+count);
	
		
		//get all options text
		for(int a=0; a<ref.size();a++)
		{
		   String text = ref.get(a).getText();
		
		   Thread.sleep(3000);
		   System.out.println(text);
		}
		//select all optons
		for(int i=0;i<ref.size();i++)
		{
			s.selectByIndex(i);
		}
		//select alternate options
		
		for(int i=0;i<ref.size();i=i+2)
		{
			s.selectByIndex(i);
		}
		
		
		//select only  testing option
		
		for(int i=0; i<ref.size();i++)
		{
			String text = ref.get(i).getText();
			if(text.contains("Testing"));
			{
				s.selectByIndex(i);
			}
		}

	}

}
