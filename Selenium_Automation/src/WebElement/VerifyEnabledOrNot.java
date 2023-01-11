package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://github.com/signup");
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("nishantkumaryadav95@gmail.com");
	Thread.sleep(2000);
	WebElement continuebutton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
	boolean enabled = continuebutton.isEnabled();
	if(enabled)
	{
		System.out.println("pass:the button got anabled");
	}
	else
	{
		System.out.println("fail:the button not anabled");
	}

	}

}
