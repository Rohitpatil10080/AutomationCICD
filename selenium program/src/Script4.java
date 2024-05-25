import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		

		
		
	     System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	          driver.get("http://www.facebook.com");
	          Thread.sleep(3000);
	          driver.get("http://Amazon.com");
	          Thread.sleep(3000);
	          driver.get("http://www.myntra.com");
	          Thread.sleep(3000);
	          driver.get("http://www.snapdeal.com");
	          Thread.sleep(3000);
	          driver.get("http://www.google.com");
	          while(true)
	          {
	        	  String Expected_title="facebook";
	        			  String page_title=driver.getTitle();
	        	  if(page_title.contains(Expected_title))
	        	  {
	        		  break;
	        	  }
	        	  else
	        	  {
	        		  Thread.sleep(3000);
	        		  driver.navigate().back();
	        	  
	          
	     String title=driver.getTitle();
	     System.out.println(title);
	    
	}

}
	}
}