import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	
		//class name=ChromeDriver,
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium chrome and browser zip files\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 Navigation nvg= driver.navigate();
		
		 nvg.to("http://www.yatra.com");
		 nvg.to("http://www.Amazone.com");
		 nvg.to("http://www.mintra.com");
		 nvg.to("http://www.snapdeal.com");
		 nvg.to("http://www.facebook.com");
		 driver.manage().window().setPosition(new Point(300,600));
		System.out.println( driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.toString());
		System.out.println (driver.manage());
		System.out.println(driver.navigate());
		driver.manage().window().maximize();
		nvg.back();
		nvg.refresh();
		driver.close();
		
		
		
	}
}




	


