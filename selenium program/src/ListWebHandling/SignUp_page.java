package ListWebHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		//Enter URl
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//Click on create new account
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("rohit");
		
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys("patil");
		
		//Enter mail id
		driver.findElement(By.name("reg_email__")).sendKeys("rohitpatil1067@gmail.com");
		
		//confirm mail id
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rohitpatil1067@gmail.com");
		
		//enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Rohit3680#");
		
		//click on date
        driver.findElement(By.id("day")).sendKeys("9");
        
        //click on month
		driver.findElement(By.id("month")).sendKeys("Dec");
		
		//click on year
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(3000);
		
		//select male
		driver.findElement(By.xpath(".//*[contains(text(),'Male')]")).click();
		Thread.sleep(3000);
		
		//click  on signup button
		driver.findElement(By.name("websubmit")).click();

	}
}
