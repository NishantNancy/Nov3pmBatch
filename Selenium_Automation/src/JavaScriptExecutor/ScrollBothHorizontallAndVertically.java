package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBothHorizontallAndVertically {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_3_3_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_3_na_na_na&as-p"
				+ "os=3&as-type=RECENT&suggestionId=iphone&requestId=4c5c9521-a0a0-4f8f-b57b-82068feb9d8e&as-searchtext=iph");
		
		driver.manage().window().setSize(new Dimension(200,500));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(100,500)");
		//To refresh the webpage
		js.executeScript("history.go(0)");

	}

}
