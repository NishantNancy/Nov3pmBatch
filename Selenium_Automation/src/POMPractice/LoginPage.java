package POMPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement usernametxtfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbutton;

	public WebElement getUsernametxtfield() {
		return usernametxtfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	

}
