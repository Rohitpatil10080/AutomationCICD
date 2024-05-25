import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartUsingDragAndDropHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(.//div[@class='_3FdLqY'])[1]"));
		Thread.sleep(2000);
		WebElement tgt_element= driver.findElement(By.xpath("(.//div[@class='_1ftpgI'])[7]"));
		Thread.sleep(2000);
		
		//Approach-01
		//a.dragAndDrop(src, tgt_element).perform();
		
		//Approach-02
		//a.moveToElement(src).clickAndHold().moveToElement(tgt_element).release().build().perform();
		
		//Approach-03
		/*int src_xloc = src.getLocation().getX();
		int src_yloc = src.getLocation().getY();
	    int tgt_xloc = tgt_element.getLocation().getX();
	    int tgt_yloc = tgt_element.getLocation().getY();
	    
	    a.moveByOffset(src_xloc, src_yloc).clickAndHold().moveByOffset(tgt_xloc, tgt_yloc).release().build().perform();
	    */
		
		//Approach-04
		
	      int tgt_xloc = tgt_element.getLocation().getX();
	      int tgt_yloc = tgt_element.getLocation().getY();
	      Thread.sleep(2000);
	       a.dragAndDropBy(src, tgt_xloc, tgt_yloc).perform();
	    
            
	}

}
