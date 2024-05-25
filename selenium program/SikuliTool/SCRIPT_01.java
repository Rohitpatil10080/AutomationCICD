import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SCRIPT_01 {

	public static void main(String[] args) throws FindFailed {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https:www.google.com");
	
	//identify search field
	
		String path1="../selenium program/sikuli image/Screenshot_2.png";
		File f=new File(path1);
	    String searchfield_path = f.getAbsolutePath();
	    Pattern search_field=new Pattern(searchfield_path);
	    
	    //enter text
	    Screen s=new Screen();
	    s.click(searchfield_path);
	    s.type("selenium");
	    
	    //identify autosuggestion
	    String path2="../selenium program/sikuli image/Screenshot_1.png";
	    File f2=new File(path2);
	    String autosuggestion_path=f2.getAbsolutePath();
	    Pattern autosuggestion=new Pattern(autosuggestion_path);
	    
	    //click on autosuggestion
	    s.click(autosuggestion);
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
