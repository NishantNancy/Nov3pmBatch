package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTiptext {
	


	public static void main(String[] args) {
		String	exepectedtooltiptext="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualtooltiptext = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		System.out.println(actualtooltiptext);
		
		if(actualtooltiptext.contains(exepectedtooltiptext))
		{
			System.out.println("pass:The tool tip text has verified");
		}
		else
		{
			System.out.println("fail:The tool tip text has not verified");
			driver.quit();

		}

	}

}
