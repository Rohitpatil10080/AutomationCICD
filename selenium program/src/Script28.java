import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/Script3.html");
		
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("./html/body/input[3]")).sendKeys("admin123");
		driver.findElement(By.xpath("./html/body/input[4]")).sendKeys("admin@123");
		
		

	}

}
