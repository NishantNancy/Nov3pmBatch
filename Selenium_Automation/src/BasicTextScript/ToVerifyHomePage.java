package BasicTextScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import POM.HomePage;
import POM.LoginPage;

public class ToVerifyHomePage extends BaseClass {

	/*public static void main(String[] args) throws IOException {*/
		@Test
		public void toVerifyHomePageTest() throws IOException
		{
		
		String exepectedTitle = eUtils.fetchStringDataFromExcelSheets("Sheet1", 1, 0);
		HomePage home=new HomePage(driver);
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitforTile(driver, "Enter");
		
		
		
		String actualTitle = home.verifyingpageTitle();
		
	/*	if(actaulTitle.equals(exepectedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}*/
		
		Assert.assertEquals(actualTitle, exepectedTitle);
		System.out.println("Pass");
		
		
		
		
		
		
	}

}
 