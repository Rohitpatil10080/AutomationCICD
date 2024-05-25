import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script8 {
	
	static WebDriver driver;
	public static void SelectBrowser(String browsername) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter browser name");
		String browsername1=sc1.nextLine();
		
			if(browsername1.equals("Firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(browsername1.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		
			else 
			{
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
			}
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Script8.SelectBrowser("ie");
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}


	
	}


