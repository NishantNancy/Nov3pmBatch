package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Point usernameloc = driver.findElement(By.id("username")).getLocation();
		System.out.println(usernameloc);
		
		int usernamestartx = usernameloc.getX();
		int usernamestatrty = usernameloc.getY();
		
		System.out.println("The username startx is: "+usernamestartx);
		System.out.println("The username starty is: "+usernamestatrty);
		
		Point paswordloc = driver.findElement(By.name("pwd")).getLocation();
		
		int paswordstatrtx = paswordloc.getX();
		int paswordstatrty = paswordloc.getY();
		
		System.out.println("===========================");
		
		System.out.println("The password startx is:"+paswordstatrtx);
		System.out.println("The password starty is:"+paswordstatrty);
		
		if(usernamestartx==paswordstatrtx)
		{
			System.out.println("pass:The location are verified");
		}
		else
		{
			System.out.println("fail:The location are not verfied");
		}


		
		

	}

}
