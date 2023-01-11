package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimention {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		int width = dim.getHeight();
		int height = dim.getWidth();
		System.out.println(height);
		System.out.println(width);
		

	}

}
