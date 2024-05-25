import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.getTitle();
		driver.get("http://www.Amazone.com");
		driver.get("http://www.google.com");

	}

}
