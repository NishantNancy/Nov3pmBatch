package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernametextfield = driver.findElement(By.name("username"));
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		WebElement logintextfield = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin'", usernametextfield);
		js.executeScript("arguments[0].value='manager'", passwordtextfield);
		js.executeScript("arguments[0].click()", logintextfield);


	}

}
