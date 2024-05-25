import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
     System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
     FirefoxDriver rv=new FirefoxDriver();

     String title=rv.getTitle();
     System.out.println(title);
    
     Navigation nvg=rv.navigate();
     rv.get("http://www.google.com");
     rv.get("http://www.facebook.com");
        Thread.sleep(3000);
     rv.get("http://Amazon.com");
     Thread.sleep(3000);
     rv.get("http://www.myntra.com");
     Thread.sleep(3000);
     rv.get("http://www.snapdeal.com");
     Thread.sleep(3000);
     rv.get("http://www.google.com");
     String url=rv.getCurrentUrl();
     System.out.println(url);
    
     rv.manage().window().setSize(new Dimension(400,500));
    
     while(true)
     {
    	 String expected_title="facebook";
    	 String page_title=rv.getTitle();
     
    	 if(page_title.contains(expected_title))
    	 {
    		 break;
    	 }
    	 else
    	 {
    	 
    	 
    		
    		 rv.navigate().back();
     }
    	
    	 rv.manage().window().setPosition(new Point(300,600));
    	
    	
    	 nvg.forward();
    	
    	rv.manage().window().maximize();
    	
    	nvg.refresh();
    	rv.close();
    	
    	 }
	}
}



