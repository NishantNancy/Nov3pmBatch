package webDriver;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class ToUserQuitMethod {

		public static void main(String[] args) throws InterruptedException {
			  
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.linkText("actiTIME INC.")).click();
			Thread.sleep(3000);
			driver.quit ();
			
				

		}

	}



