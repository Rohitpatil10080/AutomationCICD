import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.easemytrip.com");
		WebElement tgt_element = driver.findElement(By.id("spnMyAcc"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(tgt_element).perform();
		driver.findElement(By.id("shwlogn"));	

	}

}
