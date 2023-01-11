package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.to("https://www.facebook.com/login/");
		Thread.sleep(2000);
		nav.back();   
		Thread.sleep(2000);
		nav.forward(); 
		Thread.sleep(2000);
		nav.refresh();
		
		URL url=new URL("instagram.com/");
		nav.to(url);
		System.out.println("program is ended");
		

	}

}