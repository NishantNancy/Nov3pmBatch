package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTheSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Rectangle usernameRect = driver.findElement(By.name("username")).getRect();
		Rectangle passwordRect= driver.findElement(By.name("pwd")).getRect();
		
		int usernameEndy = usernameRect.getY()+usernameRect.getHeight();
		int passwordendy = passwordRect.getY();
		int space = passwordendy-usernameEndy;
		
		System.out.println("The space is:"+space);

	}

}
