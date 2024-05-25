import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script40 {

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
	  
	  //3rd row text
  String ref2=driver.findElement(By.xpath(".//tr[3]")).getText();
	  System.out.println(ref2);
	  System.out.println();
	  
	  //sum of all subject cost =total cost
	  List<WebElement> ref3=driver.findElements(By.xpath(".//td[3]"));
	  
	  int sum=0;
	
	  
	  for(int a=0;a<ref3.size();a++)
	  {
		  WebElement rv1=ref3.get(a);
		  String str3=rv1.getText();
		  int b=Integer.parseInt(str3);
		  sum=sum+b;
	  }
	  System.out.println();
	  
	  String ref4=driver.findElement(By.xpath(".//tr[6]/th[3]")).getText();
	  int c=Integer.parseInt(ref4);
	  
		 
		  
		  if(sum==c)
		  {
			  System.out.println("sum of all the subject cost is equal to totalof the table");
		  }
		  else
		  {
			  System.out.println("sum of all the subject cost is not equal to totalof the table");
		  }
		
		
		
	  
		
		
		
		

	}

}
