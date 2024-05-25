import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script39 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		 List<WebElement> ref = driver.findElements(By.tagName("a"));
		 
		 //count tota\l no of links-------size of list
		 
	
		int count=ref.size();
		 System.out.println(count);
	
	
		 
		 
		 for(int a=0;a<ref.size();a++)
		 {
			
			WebElement rv=ref.get(a);
			String str=rv.getText();
			System.out.println(str);
		 }
			
			//all links half attribute value
			
			for(int i=0; i<ref.size();i++)
			{
				WebElement rv1=ref.get(i);
				String href_value=rv1.getAttribute("href");
				System.out.println(href_value);
			}
				
				
	        int visible_links=0;
	        int invisible_links=0;
	        
	    	System.out.println("total links visisble"+ref.size());
	    	for(int a1=0;a1<ref.size();a1++)
	    	{
	    		WebElement link=ref.get(a1);
	    		if(link.isDisplayed())
	    		{
	    		visible_links++;
	    		System.out.println("visible links are"+visible_links);
	    	}
	    	else
	    	{
	    		invisible_links++;
	    		System.out.println("invisible links are"+invisible_links);
	    		
	    	}
	    	}
			}
		 
	}

			
		
				
			
				
				
			
			
			
		 
			 
			
		

	




