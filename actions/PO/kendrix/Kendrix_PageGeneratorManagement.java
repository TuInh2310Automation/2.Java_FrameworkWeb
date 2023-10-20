package PO.kendrix;

import org.openqa.selenium.WebDriver;



public class Kendrix_PageGeneratorManagement {
	public static Kendrix_HomePageObject getUserHomePageObject(WebDriver driver) {
		return new Kendrix_HomePageObject(driver);
	}
	
	public static Kendrix_LoginPageObject getUserLoginPage(WebDriver driver) {
		return new Kendrix_LoginPageObject(driver);
	}
	
	public static Kendrix_RegisterPageObject getUserRegisterPage(WebDriver driver) {
		return new Kendrix_RegisterPageObject(driver);
	}
	
	public static Kendrix_CreativeWorkNewPageObject getCreativeWorkNewPage(WebDriver driver) {
		return new Kendrix_CreativeWorkNewPageObject(driver);
	}
}
