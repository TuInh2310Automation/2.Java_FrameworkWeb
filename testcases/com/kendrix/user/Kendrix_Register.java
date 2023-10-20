package com.kendrix.user;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nopcommerce.data.UserDataMapper;

import PO.kendrix.Kendrix_CreativeWorkNewPageObject;
import PO.kendrix.Kendrix_HomePageObject;
import PO.kendrix.Kendrix_LoginPageObject;
import PO.kendrix.Kendrix_PageGeneratorManagement;
import PO.kendrix.Kendrix_RegisterPageObject;
import commons.BasePage;
import commons.BaseTest;
import commons.PageGeneratorManagement;
import pageObjectsl.nopCommerce.user.User_CustomerInfoPageObject;
import pageObjectsl.nopCommerce.user.User_RewardPointsPageObject;

public class Kendrix_Register extends BaseTest {

	private WebDriver driver;

	BasePage basePage;
	private Kendrix_HomePageObject homePage;
	private String personalName, katakanaName, password, confirmPw, email, author, songName, year;
	private Kendrix_RegisterPageObject registerPage;
	private Kendrix_LoginPageObject loginPage;

	private Kendrix_CreativeWorkNewPageObject creativeWorkNewPage;
	User_RewardPointsPageObject rewardPointsPage;
	UserDataMapper userData;
	

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriverLocal(browserName, appUrl);
//		userData = UserDataMapper.getUserData();
//		firstName = userData.getFirstName();
//		lastname =userData.getLastName();
//		password = userData.getPassword();
//		confirmPw = userData.getPassword();
//		email = userData.getEnailAddress() + generateRandomNumber() + "@fakemail.vn";
//		date = userData.getDate();
//		month = userData.getMonth();
//		year = userData.getYear();
		personalName = "Osaka Yama";
		katakanaName = "カタカナ";
		email = "leetuinhimperia@gmail.com";
		password = "Aa@123456";
		confirmPw =  "Aa@123456";
		homePage = Kendrix_PageGeneratorManagement.getUserHomePageObject(driver);
		author = "Osaka Yama";
		songName = "Song No "+ generateRandomNumber();
		
	}

	//@Test
	public void User_01_Register() {
		log.info("Register - Step 01 : Navigate to register Page");
		registerPage = homePage.clickToRegisterLink();

		registerPage.inputToPersonalNameTextBox(personalName);

		
		registerPage.inputToRealNameKatakanaTextBox(katakanaName);
		registerPage.inputToEmailTextBox(email);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(confirmPw);

		registerPage.clickToAgreeCheckbox();
		
		homePage = registerPage.gotoHomePage();

//		log.info("Register - Step 07: Click to Register Button");
//		registerPage.clickButtonByText(driver, "Register");
//
//		log.info("Register - Step 08 : Verify register success");
//		verifyEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
//
//		log.info("Register - Step 09 : Go to HomePage");
//		homePage = registerPage.gotoHomePage();
	}

	@Test
	public void User_02_Login() {
		
		loginPage = homePage.openLoginPage();
		loginPage.inputToEmailTextBox(email);
		loginPage.inputToPasswordTextBox(password);
		homePage = loginPage.clickLoginButton();
	}

	//@Test
	public void User_03_Register_New_Song() {		
		creativeWorkNewPage = homePage.clickRegisterNewSong();	
		creativeWorkNewPage.inputSongNameTextBox(songName);
		creativeWorkNewPage.selectAuthorInDropDown(author);
		creativeWorkNewPage.registerNewSong();	
	}
	
	@Test
		public void User_04_Check_Song_List() {		
			homePage.clickSongMenu();
			homePage.clickSongListMenu();
			
		}
		
	

	public int generateRandomNumber() {
		return new Random().nextInt(9999);
	}

	@AfterClass
	public void afterClass() {
		 //driver.quit();
	}

}
