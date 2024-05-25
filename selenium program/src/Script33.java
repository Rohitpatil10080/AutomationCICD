import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script33 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//identify Actitimelogo
		
		 WebElement logo=driver.findElement(By.xpath(".//div[@class='atLogoImg']"));
		 String logo_tagname=logo.getTagName();
		 if(logo_tagname.equalsIgnoreCase("Img"))
		 {
			 System.out.println("app logo created using image");
		 }
		 else
		 {
			 System.out.println("app logo not created using image"); 
		 }
		 //identify usename
		 WebElement username=driver.findElement(By.id("username"));
		 String placeholder_value=username.getAttribute("placeholder");
		 if(placeholder_value.isEmpty())
		 {
			 System.out.println("userame field not contains default text");
		 }
		 else
		 {
			 System.out.println("userame field  contains default text");
		 }
		 // click on login button
		 driver.findElement(By.id("loginButton")).click();
		//identify errormsg
		 WebElement errormsg=driver.findElement(By.xpath(".//span[@class='errormsg']"));
		 
		 Thread.sleep(6000);
		 String txt=errormsg.getText();
		 System.out.println("Error msg text is"+txt);
		 
		 }
		 
		 
		
		
				
	
	}


