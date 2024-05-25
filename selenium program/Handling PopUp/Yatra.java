import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Yatra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("(.//a[@class='dropdown-toggle'])[1]")).click();
	    WebElement tgt_element = driver.findElement(By.id("SignUpBtn"));
		Thread.sleep(3000);
	    tgt_element.click();
	    driver.findElement(By.xpath(".//button[@id='fb-login-btn']")).click();
	    
	   Set<String> ref = driver.getWindowHandles();
	   
	   Iterator<String> itr = ref.iterator();
	   itr.next();
	   String a = itr.next();
	   driver.switchTo().window(a);
	   
	   driver.findElement(By.id("email")).sendKeys("admin@123");
	   Thread.sleep(3000);
	   driver.findElement(By.id("pass")).sendKeys("manager");
	   Thread.sleep(3000);
	   driver.findElement(By.name("login")).click();
        
    
	 		

	}


		
	}


