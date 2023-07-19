package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlatShopRegistrationWithProperty 
{
	Properties prop;
	public static WebDriver wd;
  @Test
  public void flatshopRegister() throws FileNotFoundException, IOException 
  {
	  prop = new Properties();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhir Kupate\\AdvanceAuto\\AdvanceAutomation\\src\\test\\resources\\resources\\chromedriver.exe");
		
	  wd = new ChromeDriver();
		
	  prop.load(new FileInputStream("C:\\Users\\Sudhir Kupate\\AdvanceAuto\\AdvanceAutomation\\src\\test\\resources\\DemoProperty\\flatshop.property"));
		
	  wd.get(prop.getProperty("url"));
	  wd.manage().window().maximize();
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  getLocator(prop.getProperty("rbutton")).click();
	  getLocator(prop.getProperty("firstname")).sendKeys("anup");
	  getLocator(prop.getProperty("lastname")).sendKeys("mishra");
	  getLocator(prop.getProperty("emal")).sendKeys("anupmishra@gmail.com");
	  getLocator(prop.getProperty("pass")).sendKeys("anup@123");
	  getLocator(prop.getProperty("regi")).click();
	  
	  System.out.println(wd.getTitle());
	  
  }
  public static WebElement getLocator(String element) 
  {
	  WebElement ele = null;
	  String[] str = element.split(":=");

	  String locvalue = str[0];
	  String loctype = str[1];
	  
	  if(loctype.equals("id"))
		  ele = wd.findElement(By.id(locvalue));
	  else if(loctype.equals("name"))
		  ele = wd.findElement(By.id(locvalue));
	  else if(loctype.equals("linkText"))
		  ele = wd.findElement(By.id(locvalue));
	  else if(loctype.equals("xpath"))
		  ele = wd.findElement(By.id(locvalue));
	  return ele;
  }
}
