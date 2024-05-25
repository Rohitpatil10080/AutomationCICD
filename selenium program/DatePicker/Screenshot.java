import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver=new FirefoxDriver();
	   Thread.sleep(3000);
	   
		driver.get("https://www.google.com/");
		
		//step-01
		
		TakesScreenshot s=(TakesScreenshot)driver;
		
		//step-02
		
		File image = s.getScreenshotAs(OutputType.FILE);
		
		//step-03
		File loc = new File("../selenium_3.0/Screenshot/Img_01.png");
			
		//step-04
		
		FileUtils.copyFile(image, loc);

	}

}
