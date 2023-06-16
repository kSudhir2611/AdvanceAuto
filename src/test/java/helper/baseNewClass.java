package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseNewClass 
{
	public WebDriver wd ;
	@BeforeClass
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\resources\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		wd = new ChromeDriver(co);
		
	}
	@AfterClass
	public void quitBrowser() 
	{
		wd.quit();
	}

}
