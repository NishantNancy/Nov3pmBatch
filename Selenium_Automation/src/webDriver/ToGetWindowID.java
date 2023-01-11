package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String windowId = driver.getWindowHandle();
		System.out.println("The address1 is: "+windowId);
		 
		WebDriver driver1=new ChromeDriver();
		String windowId1 = driver1.getWindowHandle();
		System.out.println("The address1 is: "+windowId1);

		

	}

}
