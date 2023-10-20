package pageUI.Kendrix;

import org.openqa.selenium.By;

public class HomePageUI {
	public static final String REGISTER_LINK = "xpath=//a[@href='/register' and @class='kd-landing-page__nav-link']";
	// "css=a.ico-login";
	public static final String LOGIN_LINK = "xpath=//a[@href='/login' and @class='kd-landing-page__nav-link']";
	public static final String MY_ACCOUNT_LINK = "xpath=//a[@class='ico-account']";
	public static final String REGISTER_SONG_BUTTON = "xpath=//span[text()='楽曲を登録']//parent::button";
	public static final String LOADING_ICON = "xpath=//div[@class='kd-loading kd-loading--full']";
	public static final String SONG_MENU_LINK="xpath=//span[text()='楽曲']//parent::a";
	public static final String SONG_LIST_LINK="xpath=//a[text()='楽曲リスト']//parent::li";
	public static final String SONG_REGISTER_LINK="xpath=//a[text()='楽曲を登録']//parent::li";

}
