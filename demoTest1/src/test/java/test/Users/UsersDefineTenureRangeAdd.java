package test.Users;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;
import utilities.ReadXLSdata;

public class UsersDefineTenureRangeAdd extends BaseTest {

	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();

	@Test
	public void defineTenureRageAdd() throws InterruptedException, EncryptedDocumentException, IOException {
		driver = initializeDriver3333();
		listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish_1", "1");
		listeners.testStepDescription("Step 2: Click on SideNavigationMenuBar");
		nav.clickSideNavigationBtn();
		users.scrollSideNavigationBar();
		listeners.testStepDescription("Step 3: Click on USERS");
		users.clickUsersBtn();
		listeners.testStepDescription("Step 4: Click on Users");
		Thread.sleep(1000);
		users.clickUsers();
		driver.switchTo().frame("contentFrame");
		listeners.testStepDescription("Step 5: Click on MORE ACTIONS");
		users.clickMOREACTIONBtn();
		listeners.testStepDescription("Step 6: Click on Define Tenure Range");
		users.clickDefineTenureBtn();
		listeners.testStepDescription("Step 7: Select Days from the dropdown");
		users.selectTenure("Days");
		listeners.testStepDescription("Step 8: Click on Users");
		// users.fillRangeFrom();
		listeners.testStepDescription("Step 9: Fill the To range");
		users.fillRangeTo(users.fillRangeFrom() + 2);
		listeners.testStepDescription("Step 10: Click on ADD button");
		users.clickTenureAddBtn();
		listeners.testStepDescription("Step 11: Click on SAVE button");
		users.clickTenureSaveBtn();
		Thread.sleep(1000);
		listeners.testStepDescription("Step 12: Click on Delete button");
		users.clickTenureDelete();
		listeners.testStepDescription("Step 11: Click on OK button");
		users.clicktenureDeleteBtn();
		listeners.testStepDescription("Step 11: Click on SAVE button");
		users.clickTenureSaveBtn();

	}
}
