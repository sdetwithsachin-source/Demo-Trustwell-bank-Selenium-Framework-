package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@data-heal-id='userName4']")
	WebElement enterUsernam;

	@FindBy(xpath = "//input[@data-heal-id='password4']")
	WebElement enterPassword;

	@FindBy(xpath = "//button[@data-heal-id='loginButton3']")
	WebElement btnSignin;


	public void setEmail(String email) {
		enterUsernam.sendKeys(email);
	}

	public void setPassword(String pwd) {
		enterPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnSignin.click();
	}

	
	
	
}
