import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		Thread.sleep(2000);
		WebElement source =driver.findElement(By.id("draggable"));
	    WebElement target =driver.findElement(By.id("droppable"));
	    Thread.sleep(3000);
	    //Approach-01
	    a.dragAndDrop(source, target).perform();
	    
	    //Approach-02
	    //a.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
	    
	    //Approach-03
	    
	   /* int src_xloc = source.getLocation().getX();
		int src_yloc =source.getLocation().getY();
	    int tgt_xloc = target.getLocation().getX();
	    int tgt_yloc = target.getLocation().getY();
	    
	    a.moveByOffset(src_xloc, src_yloc).clickAndHold().moveByOffset(tgt_xloc, tgt_yloc).release().build().perform();
	    */
	    
	   // Approach-04
	    

	      int tgt_xloc =target.getLocation().getX();
	      int tgt_yloc = target.getLocation().getY();
	      Thread.sleep(2000);
	       a.dragAndDropBy(source, tgt_xloc, tgt_yloc).perform();
	    

		
		
		
		
		
		
		

	}

}
