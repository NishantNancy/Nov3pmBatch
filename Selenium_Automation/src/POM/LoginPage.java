package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Constructor: @Findby ko dostikarwane ke liye
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//identify elemnet
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbutton;
	
    //private member access 
	public WebElement getUsernameTextField() {
		return usernameTextField; 
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	// Business Logic(repeative task in a page)
	public void loginAction(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginbutton.click();
		
	}

}
