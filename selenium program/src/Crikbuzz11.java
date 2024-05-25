import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crikbuzz11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@id='match_menu_container']/div/div[2]/ul/li[1])")).click();

		Thread.sleep(7000);

		driver.findElement(By.linkText("Scorecard")).click();
	
		Thread.sleep(7000);
		List<WebElement> ref1 = driver.findElements(By.xpath("(.//a[@class='cb-text-link'])[position()<=11]"));
		Thread.sleep(7000);
		List<WebElement> ref2 = driver.findElements(By.xpath("(.//a[@class='cb-text-link'])[position()<=11]/../following-sibling::div[@class='cb-col cb-col-8 text-right text-bold']"));
		
		
		for(int a=0; a<ref1.size(); a++)
		{
			String playername = ref1.get(a).getText();
		    String runs = ref2.get(a).getText();
		    System.out.println(playername+"scored runs"+runs);
		}
		
		

	}

}
