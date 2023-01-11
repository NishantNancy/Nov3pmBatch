package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToMainURL {

	public static void main(String[] args) {

		String expectedurl="facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver =new ChromeDriver(); 
				driver.get("https://www.facebook.com/login/");
				 
				String actualurl = driver.getCurrentUrl();
				System.out.println("The url of the page is:"+actualurl);
				
				if(actualurl.contains(expectedurl))
				{
					System.out.println("pass:The url is verified");
				}
				else
				{
					System.out.println("fail:The url is not verified");
				}
	}

}
