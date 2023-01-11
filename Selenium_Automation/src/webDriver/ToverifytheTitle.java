package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifytheTitle {

		
	public static void main(String[] args) { 
		String expectedTitle="Facebook";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		String actualTitle = driver.getTitle();
		System.out.println("The title of the webpage is:"+actualTitle);
		
			if(expectedTitle.contains(actualTitle))
			{
				System.out.println("Pass:The title is verified");
			}
			else
			{
				System.out.println("Fail:The title is not verified");
			}
		
		
		}
	}


