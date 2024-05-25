import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/Script4.html");
		
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("123");
		driver.findElement(By.xpath("./html/body/div[1]/input[3]")).sendKeys("admin123");
		driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("admin@123");
		driver.findElement(By.xpath("./html/body/div[3]/input[1]")).sendKeys("MAHARASHTRA");
		driver.findElement(By.xpath("./html/body/div[2]/a[1]")).click();
		
		
		

	}

}
