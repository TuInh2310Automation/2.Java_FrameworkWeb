package PO.kendrix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUI.Kendrix.CreativeWorkNewPageUI;
import pageUI.Kendrix.HomePageUI;
import pageUI.Kendrix.RegisterPageUI;

public class Kendrix_CreativeWorkNewPageObject extends BasePage {

	private WebDriver driver;
	WebDriverWait explicitWait;
	public Kendrix_CreativeWorkNewPageObject(WebDriver driver) {
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

	public void selectAuthorInDropDown(String author) {
		// TODO Auto-generated method stub
		waitForElementClickable(driver,  CreativeWorkNewPageUI.PARENT_DROP_DOWN);
		selectItemInDropDown(driver, CreativeWorkNewPageUI.PARENT_DROP_DOWN, CreativeWorkNewPageUI.CHILD_DROP_DOWN, author);
		
	}

	public void inputSongNameTextBox(String songName) {
		// TODO Auto-generated method stub
		waitForAllElementVisible(driver, CreativeWorkNewPageUI.CREATIVEWORK_NAME_TEXTBOX);
		sendkeyToElement(driver, CreativeWorkNewPageUI.CREATIVEWORK_NAME_TEXTBOX, songName);
	}

	public void registerNewSong() {
		// TODO Auto-generated method stub
		waitForElementClickable(driver, CreativeWorkNewPageUI.REGISTER_NEW_CW_BUTTON);
		clickToElement(driver, CreativeWorkNewPageUI.REGISTER_NEW_CW_BUTTON);
		
	}

	
	
//	public void selectItemInDropDown(String parentCss, String allItemCss, String expectedTextItem)
//	{
//		//1 Click vào 1 thẻ bất kì để n xổ hết ra các item của dropdown
//		driver.findElement(By.cssSelector(parentCss)).click();
//		
//		//2 Chờ cho tất cả các item được load ra thành công
//		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(allItemCss)));
//		List<WebElement> sppedDropdownItemsElements =  driver.findElements(By.cssSelector(allItemCss));
//		for (WebElement tempItem : sppedDropdownItemsElements) {
//			String  tempText = tempItem.getText().trim();
//			System.out.println(tempText);
//			if (tempText.equals(expectedTextItem)) {
//				tempItem.click();
//				break;
//			}
//		}
//	}

}
