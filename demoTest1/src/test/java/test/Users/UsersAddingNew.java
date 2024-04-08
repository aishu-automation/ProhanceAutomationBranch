package test.Users;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;

public class UsersAddingNew extends BaseTest {
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	Listeners listeners = new Listeners();

	@Test(retryAnalyzer = Pages.RetryAnalyzer.class)
	public void addNewUsers() throws InterruptedException {
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
		listeners.testStepDescription("Step 5: Click on ADD button");
		users.clickADDNEWbtn();
		listeners.testStepDescription("Step 6: Enter role");
		users.selectRole("Team Member");
		listeners.testStepDescription("Step 7: Enter Login id");
		String loginId = RandomStringUtils.randomAlphabetic(6).toUpperCase();
		System.out.println("Aishwarya@JAMOCHAlOCAL");
		users.enterLoginIdTxtBox("Aishwarya12@JAMOCHAlOCAL");
		listeners.testStepDescription("Step 8: Click Console Authentication radion button ");
		users.clickConsoleAuthChkBox();
		listeners.testStepDescription("Step 9: Enter  Login id");
		users.enterLoginIdConXTxtBox("Aishwarya12@JAMOCHAlOCAL");
		listeners.testStepDescription("Step 10: Enter Password");
		users.enterPasswordTxtBox(loginId);
		listeners.testStepDescription("Step 11: Enter Confirm Password");
		users.enterConfirmPassTxtBox(loginId);
		listeners.testStepDescription("Step 12: Enter Username");
		String name = RandomStringUtils.randomAlphabetic(5);
		users.enterFirstNameTxtBox("AAAAAishwarya_auto_test");
		listeners.testStepDescription("Step 13: Select Time Zone");
		users.selectTimeZone("(GMT +05:30) India Standard Time");
		listeners.testStepDescription("Step 14:Click on SAVE button");
		 users.clickSaveBtn();
		Thread.sleep(2000);
		listeners.testStepDescription("Step 15:Click on success message close icon");
		 users.clickAddClose();
		listeners.testStepDescription("Step 16:Click on BACK button");
		users.clickBackBtn();
		users.moveToparentWindow();
		driver.switchTo().frame("contentFrame");
		Thread.sleep(1000);
		listeners.testStepDescription("Step 17:Click on modify image");
		Thread.sleep(7000);
		users.clickModifyIcon();
		listeners.testStepDescription("Step 18: Change user type");
		users.selectUserType("Agentless");
		listeners.testStepDescription("Step 19: Check inactive check box");
		users.clickInactiveChkBoc();
		listeners.testStepDescription("Step 20:Click on SAVE button");
		users.clickSaveBtn();
		listeners.testStepDescription("Step 21: Click on ADD popup to close");
		users.clickAddClose();
		listeners.testStepDescription("Step 22: Click on BACK button");
		users.clickBackBtn();
		users.moveToparentWindow();
		driver.switchTo().frame("contentFrame");
		listeners.testStepDescription("Step 23: Click on Delete image");
		Thread.sleep(1000);
		users.clickDeleteIcon();
		Thread.sleep(1000);
		listeners.testStepDescription("Step 6: Click on YES button");
		users.clickYESBtn();

	}

}
