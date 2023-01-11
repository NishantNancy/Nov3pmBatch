package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver 	driver=new ChromeDriver();
	 
	 Point position = driver.manage().window().getPosition();
	 System.out.println(position);
	 
	 int startx = position.getX();
	 int starty = position.getY();
	 
	 System.out.println("The x co-ordinate is:"+startx);
	 System.out.println("The y co-ordinate is:"+starty);
				

	}

}
