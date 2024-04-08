package test.Users;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;
import utilities.ReadXLSdata;

public class UsersLicenseReport extends BaseTest {
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	Set<String> getLicence = null;
	Set<String> getexcelLicence = null;

	@Test
	public void usersLicenseReport() throws InterruptedException, EncryptedDocumentException, IOException {
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
		listeners.testStepDescription("Step 6: Click on LICENsE REPORTS");
		users.clickLicencereport();
		listeners.testStepDescription("Step 7: Get license reports list");
		getLicence = users.getLicenceList();
		listeners.testStepDescription("Step 8: Click on excel to download");
		users.clicklicenceExcelImg();
		listeners.testStepDescription("Step 9: Get license reports list from excel");
		getexcelLicence = excel.getUserLicenceList();
		listeners.testStepDescription("Step 10: Compare list from excel and web equal or not");
		boolean licenceEql = getLicence.equals(getexcelLicence);
		Assert.assertTrue(licenceEql);
	}

}
