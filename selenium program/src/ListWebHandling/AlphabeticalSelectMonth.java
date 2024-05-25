package ListWebHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AlphabeticalSelectMonth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriverManager.firefoxdriver().setup();
     WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(3000);
		driver.get("https://en-gb.facebook.com/");
		
	    driver.findElement(By.linkText("Create New Account")).click();
	    Thread.sleep(3000);
	    
       WebElement month_listbox = driver.findElement(By.id("month"));
       
       Select s=new  Select(month_listbox);
       
      List<WebElement> ref = s.getOptions();
    	System.out.println("month "+ref.size());
    	
    	for(int i=0;i<ref.size();i++)
    	{
    		String text = ref.get(i).getText();
    		System.out.println(text);
    		
    		
    	}
    	ArrayList<String> sorted_month = new ArrayList<String>();
    	for(int i=0;i<ref.size();i++)
    	{
    		String month = ref.get(i).getText();
    		sorted_month.add(month);
    	}
    	Collections.sort(sorted_month);
    	System.out.println("Alphabetical sorted Months are");
    	System.out.println(sorted_month);
    		  		   
    		   
    		   
		}
		
	    
	    

	}


