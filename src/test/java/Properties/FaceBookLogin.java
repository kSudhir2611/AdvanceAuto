package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookLogin  {
	public Properties prop;
	@Test
	public void loginFacebook() throws FileNotFoundException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhir Kupate\\AdvanceAuto\\AdvanceAutomation\\src\\test\\resources\\resources\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Sudhir Kupate\\AdvanceAuto\\AdvanceAutomation\\src\\test\\resources\\DemoProperty\\fb.property"));
		
		wd.get(prop.getProperty("url"));
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.findElement(By.id(prop.getProperty("username"))).sendKeys("9158832986");
		wd.findElement(By.id(prop.getProperty("password"))).sendKeys("shampatil@1992");
		wd.findElement(By.name(prop.getProperty("login"))).click();
		
		System.out.println(wd.getTitle());
	}
}