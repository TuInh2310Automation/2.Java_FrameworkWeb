package PO.kendrix;

import java.util.Base64;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

import io.qameta.allure.Step;
import pageUI.Kendrix.RegisterPageUI;


public class Kendrix_RegisterPageObject extends BasePage {

	WebDriver driver;

	public Kendrix_RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Click to register Button")
	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
		// TODO Auto-generated method stub

	}

	public String getErrorMessageAtFirstNameTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.FIRSTNAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.FIRSTNAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastNameTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.LASTNAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.LASTNAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPwTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMessageAtConfirmPwTextBox() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	@Step("Enter to confirmPassword textbox with value is {0}")
	public void inputToConfirmPasswordTextBox(String confirmPassword) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.CONFRIM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.CONFRIM_PASSWORD_TEXTBOX, confirmPassword);

	}

	@Step("Enter to Firstname textbox with value is {0}")
	public void inputToPersonalNameTextBox(String personalName) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PERSONAL_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PERSONAL_NAME_TEXTBOX, personalName);

	}

	@Step("Enter to lastName textbox with value is {0}")
	public void inputToRealNameKatakanaTextBox(String realNameKatakana) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.REALNAME_KATAKANA_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.REALNAME_KATAKANA_TEXTBOX, realNameKatakana);

	}

	@Step("Enter to email textbox with value is {0}")
	public void inputToEmailTextBox(String email) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);

	}

	@Step("Enter to password textbox with value is {0}")
	public void inputToPasswordTextBox(String password) {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);

	}

	public String getRegisterSuccessMessage() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public String getErrorExistingEmailMessage() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, RegisterPageUI.EXISTING_EMAIL_ERROR);
		return getElementText(driver, RegisterPageUI.EXISTING_EMAIL_ERROR);
	}

	@Step("Go to homepage")
	public Kendrix_HomePageObject gotoHomePage() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
		return Kendrix_PageGeneratorManagement.getUserHomePageObject(driver);
	}

	public void clickToAgreeCheckbox() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, RegisterPageUI.KENDRIX_MEDIA_CHECKBOX);
		checkToDefaultCheckboxRadio(driver, RegisterPageUI.KENDRIX_MEDIA_CHECKBOX);
		
		waitForElementClickable(driver, RegisterPageUI.PRIVACY_CHECKBOX);
		checkToDefaultCheckboxRadio(driver, RegisterPageUI.PRIVACY_CHECKBOX);
		
		waitForElementClickable(driver, RegisterPageUI.TERM_OF_USE_CHECKBOX);
		checkToDefaultCheckboxRadio(driver, RegisterPageUI.TERM_OF_USE_CHECKBOX);
		
		
		
	}

}
