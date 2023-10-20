package pageUI.Kendrix;

import org.openqa.selenium.By;

public class RegisterPageUI {
	public static final String REGISTER_BUTTON = "xpath=//span[text()='上記の内容で登録(メールを送信)']//parent::button";
	public static final String EMAIL_TEXTBOX = "css=input[name='email']";
	public static final String PERSONAL_NAME_TEXTBOX = "css=input[name='identityName']";
	public static final String REALNAME_KATAKANA_TEXTBOX = "css=input[name='identityNameKana']";
	public static final String PASSWORD_TEXTBOX = "css=input[name='password']";
	public static final String CONFRIM_PASSWORD_TEXTBOX = "css=input[name='rePassword']";
	public static final String FIRSTNAME_ERROR_MESSAGE = "xpath=//span[@id='FirstName-error']";
	public static final String LASTNAME_ERROR_MESSAGE = "xpath=//span[@id='LastName-error']";
	public static final String EMAIL_ERROR_MESSAGE = "xpath=//span[@id='Email-error']";
	public static final String PASSWORD_ERROR_MESSAGE = "xpath=//span[@id='Password-error']";
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = "xpath=//span[@id='ConfirmPassword-error']";
	public static final String REGISTER_SUCCESS_MESSAGE = "xpath=//div[@class='result']";
	public static final String LOGOUT_LINK = "";
	public static final String EXISTING_EMAIL_ERROR="xpath=//div[@class='message-error validation-summary-errors']";
	public static final String CONTINUE_BUTTON = "xpath=//a[@class='button-1 register-continue-button']";
	public static final String TERM_OF_USE_CHECKBOX = "xpath=//a[text()='利用規約']//ancestor::label[@class='kd-checkbox']";
	public static final String PRIVACY_CHECKBOX= "xpath=//a[text()='プライバシーポリシー']//ancestor::label[@class='kd-checkbox']//span[@class='kd-checkbox__icon']";
	public static final String KENDRIX_MEDIA_CHECKBOX = "xpath=//a[text()='KENDRIX Media']//ancestor::label[@class='kd-checkbox media']";
}
