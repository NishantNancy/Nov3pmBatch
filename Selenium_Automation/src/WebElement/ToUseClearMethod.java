package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernametextfld = driver.findElement(By.id("username"));
		WebElement passwordtextfld = driver.findElement(By.id("password"));
		
		usernametextfld.clear();
		usernametextfld.sendKeys("admin");
		passwordtextfld.clear();
		passwordtextfld.sendKeys("Test@123");
		
		
		
		

}
}
