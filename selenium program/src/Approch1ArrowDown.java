import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Approch1ArrowDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://www.google.com");
	
		
		WebElement rv = driver.findElement(By.name("q"));
		rv.sendKeys("selenium");

		Thread.sleep(3000);
	//approach =01 keystroke
		
		/*rv.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		rv.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		rv.sendKeys(Keys.ENTER);
		
		
		//Approach-02
		  driver.findElement(By.xpath(".//b[text()=' maven dependency']")).click();*/
		
		//Approach-03
		
		List<WebElement> ref = driver.findElements(By.xpath(".//span[contains(text(),'selenium')]"));
		String str="webdriver";
		
		for(int i=0; i<ref.size(); i++)
	    
		{
			String text = ref.get(i).getText();
			if(text.contains(str))
			{
				ref.get(i).click();
				break;
			}
		}
		
		
		

		


	}

}
