import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script32 {

	public static void main(String[] args) {
	
		//open browser
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//open app
		
		driver.get("https://demo.actitime.com/login.do");
		
	//identify element
		WebElement rv=driver.findElement(By.id("toPasswordRecoveryPageLink"));
		
		//identify element tag
		
		String element_tagname = rv.getTagName();
		System.out.println("forgot password element is"+element_tagname);
		
		//identify Attribute value
		
		String element_attributevalue = rv.getAttribute("onclick");
		System.out.println("forgot password element attribute value"+element_attributevalue);
		
		//identify text
		
		String element_text = rv.getText();
		System.out.println("forgot password element text is"+element_text);
		
		
		
		
		

	}

}
