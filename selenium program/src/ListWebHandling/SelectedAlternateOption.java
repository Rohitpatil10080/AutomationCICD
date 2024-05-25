package ListWebHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectedAlternateOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   
	   	 driver.get("file:///D:/selenium%20html/IsMultiple.html");
		
		 WebElement rv = driver.findElement(By.id("list"));
		 Select s=new Select(rv);
		//count as output
		 List<WebElement> ref=s.getOptions();
		 System.out.println("no of element present in listbox "+ref.size());
		
		//All option text
		 for(int i=0; i < ref.size(); i++)
		{
		  String text = ref.get(i).getText();
			Thread.sleep(3000);
			
			System.out.println(text);
		}
		Thread.sleep(3000);
		
			
			//select alternate
		
		for(int i=0; i<ref.size();i=i+2)
		{
			s.selectByIndex(i);
		}
		   Thread.sleep(3000);
		
			//selected options count
			List<WebElement> ref1 = s.getAllSelectedOptions();
			System.out.println("=========================");
			
			
			//print selected option
			System.out.println("selected options count"+ref1.size());
			
			//print selected option text
			for(int i=0;i<ref1.size();i++)
			{
				String txt= ref1.get(i).getText();
				System.out.println(txt);
			}
		}
		
		
	
	}
	  


