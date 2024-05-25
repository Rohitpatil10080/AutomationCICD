import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSujjestiononiphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(6000);
		
		List<WebElement> ref1 = driver.findElements(By.xpath(".//div[@class='lrtEPN _17d0yO']"));
	
		System.out.println("total mobile displayed"+ref1.size());
		
		for(int i=0;i<ref1.size();i++)
		{
		String text = ref1.get(i).getText();
		System.out.println(text);
		
		List<WebElement> ref2 = driver.findElements(By.xpath(".//div[@class='lrtEPN _17d0yO']"));
		 String str = "xr";
		 
		 for(int a=0;a<ref2.size();a++)
		 {
			 String txt = ref2.get(a).getText();
			 if(text.contains(str))
			 {
				 ref2.get(i).click();
				 break;
			 }
		 }
				 
		
		}
		
		
		
	}

}
