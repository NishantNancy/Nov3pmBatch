package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernametextfield = driver.findElement(By.name("username"));
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		
		usernametextfield.sendKeys("trainee");
		usernametextfield.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		usernametextfield.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		passwordtextfield.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		passwordtextfield.sendKeys(Keys.ENTER);
		
		
		

	}

}
