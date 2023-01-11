package Sysnchronazation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImlicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//manage method ke under option interface h aur interafce ke inside me timeouts()
		//h aur timeout ke insi de me implicitywait()
		driver.get("https://github.com/signup");
		
		driver.findElement(By.id("email")).sendKeys("nishantkumar@gmail.com");

	}  

}
