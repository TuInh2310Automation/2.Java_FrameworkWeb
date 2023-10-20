package PO.kendrix;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUI.Kendrix.HomePageUI;

public class Kendrix_HomePageObject extends BasePage {

	private WebDriver driver;

	public Kendrix_HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Navigate to register Page")
	public Kendrix_RegisterPageObject clickToRegisterLink() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver,HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return Kendrix_PageGeneratorManagement.getUserRegisterPage(driver);

	}

	@Step("Navigate to login Page")
	public Kendrix_LoginPageObject openLoginPage() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return Kendrix_PageGeneratorManagement.getUserLoginPage(driver);

	}

	@Step("Verify to 'MyAccount' link is displayed")
	public boolean isMyAccountLinkDisplayed() {
		// TODO Auto-generated method stub
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplay(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public Kendrix_CreativeWorkNewPageObject clickRegisterNewSong() {
		// TODO Auto-generated method stub
		waitForElementInvisible(driver, HomePageUI.LOADING_ICON);
		waitForElementClickable(driver, HomePageUI.REGISTER_SONG_BUTTON);
		clickToElement(driver, HomePageUI.REGISTER_SONG_BUTTON);
		return Kendrix_PageGeneratorManagement.getCreativeWorkNewPage(driver);
	}

	public void clickSongMenu() {
		waitForElementClickable(driver, HomePageUI.SONG_MENU_LINK);
		clickToElement(driver,  HomePageUI.SONG_MENU_LINK);
	}

	public void clickSongListMenu() {
		waitForElementClickable(driver, HomePageUI.SONG_LIST_LINK);
		clickToElement(driver,  HomePageUI.SONG_LIST_LINK);
		
	}
	
	public void clickSongRegisterMenu() {
		waitForElementClickable(driver, HomePageUI.SONG_REGISTER_LINK);
		clickToElement(driver,  HomePageUI.SONG_REGISTER_LINK);
		
	}

	

}
