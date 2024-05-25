import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FileUploadUsingApproach1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/selenium%20html/FileUpload.html");
		
		//Approach-01
		
		String relative_path = "//selenium program//excel//rohitpatil manual testing resume.docx";
		File f=new File(relative_path);
		String path = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("ele")).sendKeys(path);	
		

	}

}
