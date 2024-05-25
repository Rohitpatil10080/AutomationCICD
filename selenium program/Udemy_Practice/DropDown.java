import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
	   /* int i=1;
		while(i<5)
		{
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
		}
			 
			 driver.findElement(By.id("btnclosepaxoption")).click();*/
		
		/*for(int i=1;i<5;i++)
		{
			 driver.findElement(By.id("hrefIncAdt")).click();	
		}
		     driver.findElement(By.id("btnclosepaxoption")).click(); */
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		staticDropdown.click();
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		WebElement rv = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		rv.click();
		rv.sendKeys(Keys.ARROW_DOWN);
		rv.sendKeys(Keys.ARROW_DOWN);
		rv.sendKeys(Keys.ENTER);
		WebElement Arrivel = driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		Arrivel.click();
		Arrivel.sendKeys(Keys.ARROW_DOWN);
		Arrivel.sendKeys(Keys.ARROW_DOWN);
		Arrivel.sendKeys(Keys.ENTER);
		WebElement date = driver.findElement(By.xpath("(.//button[@class='ui-datepicker-trigger'])[1]"));
		date.click();
		driver.findElement(By.xpath("(.//div[@class='ui-datepicker-title'])[2]")).click();
		driver.findElement(By.xpath(".//a[@class='ui-state-default ui-state-active']")).click();
	    WebElement Return = driver.findElement(By.xpath("(.//button[@class='ui-datepicker-trigger'])[2]"));
	    Return.click();
		driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	
	}

		
	   
	      
	      
	      
	      
	   
		                                                                                                                                                                                  	
}




