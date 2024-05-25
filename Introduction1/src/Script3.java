import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 String title=driver.getTitle();
		 System.out.println(title);

	}

}
