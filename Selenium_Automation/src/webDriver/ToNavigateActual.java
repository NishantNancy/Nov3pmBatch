package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateActual {

	public static void main(String[] args) {
		String expectedTitle="Facebook";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				
			 String actualTitle = driver.getTitle();
			 System.out.println("The actualtitle is:"+actualTitle);
			 
			 if(actualTitle.contains(expectedTitle))
			 {
				 System.out.println("It is Verified");
			 }
			 else
			 {
				 System.out.println("It is not verified");
			 }
				
				
				
			
				

	}

}
