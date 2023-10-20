package PO.kendrix;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

import io.qameta.allure.Step;
import pageUI.Kendrix.LoginPageUI;

public class Kendrix_LoginPageObject extends BasePage {

	WebDriver driver;

	public Kendrix_LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public Kendrix_HomePageObject clickLoginButton() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return Kendrix_PageGeneratorManagement.getUserHomePageObject(driver);
	}

	public String getErrorMessageAtEmailTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
	}

	@Step("Enter to email textbox with value is {0}")
	public void inputToEmailTextBox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);

	}

	public String getUnSuccessMessage() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.UNSUCCESS_MESSAGE);
		return getElementText(driver, LoginPageUI.UNSUCCESS_MESSAGE);
	}

	@Step("Enter to password textbox with value is {0}")
	public void inputToPasswordTextBox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public Kendrix_HomePageObject loginAsUser(String email, String password) {
		inputToEmailTextBox(email);
		inputToPasswordTextBox(password);
		return clickLoginButton();
	}

}
