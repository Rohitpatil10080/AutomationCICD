import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saveFileselenium {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath(".//a[text()='3.141.59']")).click();
		//Runtime.getRuntime().exec("D:\autoit\AutoIt_script1.exe");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
