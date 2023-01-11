package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		
		String expectedalttext = "Flipkart";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String actualalttext = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("alt");
		
		System.out.println(actualalttext);
		
		if(actualalttext.contains(expectedalttext))
		{
			System.out.println("Pass:The alttext has verified");
		}
		else
		{
			System.out.println("Fail:The alttext has not verified");
			
		}
		driver.quit();

	}

}
