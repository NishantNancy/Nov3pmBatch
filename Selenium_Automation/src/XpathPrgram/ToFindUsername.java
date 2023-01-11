package XpathPrgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindUsername {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone13&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']/../..//div[text()='₹59,990']")).getText();
		System.out.println(price);
		

	}

}
