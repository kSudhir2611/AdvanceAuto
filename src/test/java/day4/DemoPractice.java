package day4;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.JavaScriptExeUTIL;

public class DemoPractice extends BaseClass {
	
	//@Test(priority=1)
	public void demopractice() throws InterruptedException, IOException
	{
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = wd.findElement(By.xpath("//select[@id='countries']"));
		JavaScriptExeUTIL.drawBorder(wd, ele);
		TakesScreenshot ts = (TakesScreenshot)wd;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File(".//scr"+dtm()+" .png");
		FileUtils.copyFile(src, trg);

	}
	//@Test(priority=2)
	public void alertWithCancle() throws InterruptedException 
	{
		wd.get("https://jqueryui.com/droppable/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement dragable = wd.findElement(By.id("draggable"));
		WebElement droppable = wd.findElement(By.id("droppable"));
		
		Actions act = new Actions(wd);
		Action builder = act.clickAndHold(dragable).moveToElement(droppable)
				.release(droppable).build();
		builder.perform();
		
		
	}
	//@Test
	public void checkBox() throws InterruptedException 
	{
		wd.get("https://jqueryui.com/checkboxradio/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allbox = wd.findElements(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	
			for(WebElement ele:allbox) 
			{
				JavaScriptExeUTIL.clickByjs(wd, ele);
				Thread.sleep(1000);
			}
	
	}
	public static String dtm() 
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	@Test
	public void toolTip() 
	{
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
		wd.get("https://jqueryui.com/tooltip/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement tool = wd.findElement(By.xpath("//input[@id='age']"));
		wait.until(ExpectedConditions.visibilityOf(tool));
		
		
		System.out.println("Tooltip of age field: "+tool.getAttribute("title"));
	}
		
			
		
}

	
	
		
	
	

