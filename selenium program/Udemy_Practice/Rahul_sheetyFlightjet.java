import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rahul_sheetyFlightjet {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver=new FirefoxDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//input[@id='autosuggest']")).sendKeys("IND");
    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//a[@value='BLR']")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//a[@value='MAA'])[2]")).click();
    Thread.sleep(2000);
   /* driver.findElement(By.xpath("(.//button[@class='ui-datepicker-trigger'])[1]")).click();
    driver.findElement(By.xpath(".//div[@id='ui-datepicker-div']"));
    driver.findElement(By.cssSelector("div[class='ui-datepicker-header']"));*/
    driver.findElement(By.xpath("(.//a[@class='ui-state-default'])[1]")).click();
    driver.findElement(By.xpath(".//div[@class='paxinfo']")).click();
    Thread.sleep(2000);
    for(int i=1;i<5;i++)
    {
    	driver.findElement(By.id("hrefIncAdt")).click();
    	driver.findElement(By.id("hrefIncChd")).click();
    }
    driver.findElement(By.xpath(".//input[@id='btnclosepaxoption']")).click();
    driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
    driver.findElement(By.xpath(".//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//button[@class='ui-datepicker-trigger'])[2]")).click();
    driver.findElement(By.xpath("(.//a[@class='ui-state-default'])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
    driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(".//li[@class='myspice_trip']")).click();
    driver.findElement(By.id("ctl00_mainContent_txtOriginStation1_MST")).sendKeys("pune");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(.//div[@class='ui-datepicker-title'])[2]")).click();
    driver.findElement(By.xpath("(.//span[@class='ui-state-default'])[33]"));
    driver.findElement(By.xpath("ddl_Adult_MST")).click();
    driver.findElement(By.xpath(".//select[@id='ddl_Adult_MST']")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
