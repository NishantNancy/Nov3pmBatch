package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String parentid = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> AllwindowIds = driver.getWindowHandles();
		
		for(String id:AllwindowIds)
		{
			driver.switchTo().window(id);
			if(!id.equals(parentid))
			{  
				String childtitle = driver.getTitle();
				System.out.println(childtitle);
				driver.quit();
				break;
			}
		}
		driver.switchTo().window(parentid);
		String parenttitle = driver.getTitle();
		System.out.println(parenttitle);
		 

	}

}
