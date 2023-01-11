package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension usernamedim = driver.findElement(By.id("username")).getSize();
		System.out.println(usernamedim);
		
		int usernamewidth = usernamedim.getWidth();
		int usernameheight = usernamedim.getHeight();
		
		System.out.println("The width of username is:"+usernamewidth);
		System.out.println("The height os username is:"+usernameheight);
		
		Dimension pasworddim = driver.findElement(By.name("pwd")).getSize();
		
		int passwordwidth = pasworddim.getWidth();
		int passwordheight = pasworddim.getHeight();
		
		System.out.println("The width of password is:"+passwordwidth);
		System.out.println("the hight of password is:"+passwordheight);
		
		if(usernamewidth==passwordwidth && usernameheight==passwordheight )
		{
			System.out.println("pass:The Dimension are verified");
		}
		else
		{
			System.out.println("fail:The Dimension are not verfied");
		}
	}

}
