package TestNGPractice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}
