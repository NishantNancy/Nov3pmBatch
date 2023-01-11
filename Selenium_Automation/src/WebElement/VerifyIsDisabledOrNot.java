package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIsDisabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://github.com/signup");
	Thread.sleep(2000);
	WebElement emailtextField = driver.findElement(By.id("email"));
			boolean displayed = emailtextField.isDisplayed();
			if(displayed)
			{
				System.out.println("Pass:The text field is dispalyed");
			}
			else
			{
				System.out.println("fail:The text field is not dispalyed");
			}
	

	}

}
