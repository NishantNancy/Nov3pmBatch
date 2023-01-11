package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://demo.actitime.com/login.do");
	String parentwindowid = driver.getWindowHandle();
	
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> allwindowids = driver.getWindowHandles();
	for(String id:allwindowids)
	{  
		driver.switchTo().window(id);
		
		
		if(!id.equals(parentwindowid))
		{
		driver.findElement(By.linkText("Try Free")).click();
			break;
		}
	}
		

	}

}
