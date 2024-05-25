import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploadpopup {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online2pdf.com/");
		Thread.sleep(3000);
		String path1="../selenium program/sikuli image/Screenshot_3.png";
		File f1=new File(path1);
		String selectfile_path = f1.getAbsolutePath();
		Pattern searchfile=new Pattern(selectfile_path);
		
		//click on select file
		Screen s=new Screen();
		s.click(searchfile);
		
		//identify exefile
		
		String path2 = "/selenium program/sikuli image/Screenshot_4.png";
		File f2=new File(path2);
		String exefile_path = f2.getAbsolutePath();
		Pattern exefile=new Pattern(exefile_path);
		
		//click on exefile
		
		s.click(exefile);
		
		//identify open button
		String path3 = "/selenium program/sikuli image/Screenshot_5.png";
		File f3=new File(path3);
		String openButton_path = f3.getAbsolutePath();
		Pattern openButton = new Pattern(openButton_path);
		
		//click on open button
		
		 s.click(openButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
