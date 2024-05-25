package ListWebHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class DefaultSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		
		WebElement tgt_listbox= driver.findElement(By.id("month"));
		Select s=new Select(tgt_listbox);
		//identify default selected option
		
		WebElement defaultselectedoption = s.getFirstSelectedOption();
		System.out.println(defaultselectedoption.getText());
		
		//select june month
		
		s.selectByVisibleText("Jun");
		
		
		//print selected option
		
		WebElement selectedoption = s.getFirstSelectedOption();
		System.out.println(selectedoption.getText());
		
		
		
		
		
		

	}

}
