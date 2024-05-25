import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/selenium%20html/Table.html");
	
		List<WebElement> ref=driver.findElements(By.tagName("tr"));
		
		System.out.println("total rows in webtable"+ref.size());
		
		
	//all subject cost as output
		
		List<WebElement> ref1=driver.findElements(By.xpath(".//td[3]"));
		
	  for (int a=0;a<ref1.size();a++)
	  {
		  WebElement rv=ref1.get(a);
		  String str=rv.getText();
		  System.out.println(str);
		 
	  }
	

	}

}
