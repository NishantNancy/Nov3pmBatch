package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseTagNameForverify {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameid = driver.findElement(By.name("username"));
		
		String usertagname = usernameid.getTagName();
		System.out.println(usertagname);
		if(usertagname.equals("input"))
		{
			usernameid.sendKeys("admin");
			
		}
		WebElement passwordid = driver.findElement(By.name("pwd"));
		String passwortagname = passwordid.getTagName();
		System.out.println(passwortagname);
		if(passwortagname.equals("input"))
		{
			passwordid.sendKeys("password");
		}
		WebElement loginid = driver.findElement(By.xpath("//div[text()='Login ']"));
		String logintagname = loginid.getTagName();
		System.out.println(logintagname);
		if(logintagname.equals("div"))
		{
			loginid.click();
		}
		else
		{
			System.out.println("it is not matching");
		}
		

	}

}



