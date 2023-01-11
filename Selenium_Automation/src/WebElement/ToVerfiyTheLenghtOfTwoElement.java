package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerfiyTheLenghtOfTwoElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension usernamedim = driver.findElement(By.id("username")).getSize();
		System.out.println(usernamedim);
		
		int usernameheight = usernamedim.getHeight();
		System.out.println("The value is:"+usernameheight);
		
		Point usernameloc = driver.findElement(By.id("username")).getLocation();
		
		int usernamestatrty = usernameloc.getY();
		
		System.out.println("The username starty is: "+usernamestatrty);
		
		Point paswordloc = driver.findElement(By.name("pwd")).getLocation();
		
		
		int paswordstatrty = paswordloc.getY();
		
		System.out.println("The password starty is:"+paswordstatrty);
		
		System.out.println("The lenght is:"+(paswordstatrty-(usernamestatrty+usernameheight)));
				
		
		

	}

}
