
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldBrowserpoponNaukari {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		//count of windows
		Set<String> ref = driver.getWindowHandles();
		System.out.println( "total count of windows"+ref.size());
		
		//print all windows title as output
		Iterator<String> itr=ref.iterator();
		while(itr.hasNext())
		{
			String refID=itr.next();
			driver.switchTo().window(refID);
			String window_title=driver.getTitle();
			System.out.println(window_title);
		}
		//close all windows using close method
		Iterator<String> itr1=ref.iterator();
		while(itr1.hasNext())
		{
			String refId=itr1.next();
			driver.switchTo().window(refId);
		    driver.close();
		}
		//close only child window
		String parent_windowrefId=driver.getWindowHandle();
		Iterator<String> itr2= ref.iterator();
		while(itr2.hasNext())
		{
			String refId=itr2.next();
			if(!refId.equals(parent_windowrefId)) {
				driver.switchTo().window(refId);
				driver.close();
			}
		}
			
		
		//close only parent window
		String parent_windowrefId1=driver.getWindowHandle();
		Iterator<String> itr3= ref.iterator();
		while(itr3.hasNext())
		{
			String refId=itr3.next();
			if(refId.equals(parent_windowrefId1)) {
				driver.switchTo().window(refId);
				driver.close();
			}
		}
	}
}

		
		
		
		
		
		
		
		
		
		

	

	


