package test.Users;

import java.io.IOException;

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

public class UsersAttributesForActiveUsers extends BaseTest {
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	
	@Test
	public void usersAttributesForInactiveUsers() throws InterruptedException, EncryptedDocumentException, IOException {
		driver = initializeDriver3333();
		//listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish_1", "1");
		//listeners.testStepDescription("Step 2: Click on SideNavigationMenuBar");
		nav.clickSideNavigationBtn();
		users.scrollSideNavigationBar();
		//listeners.testStepDescription("Step 3: Click on USERS");
		users.clickUsersBtn();
		//listeners.testStepDescription("Step 4: Click on Users");
		Thread.sleep(1000);
		users.clickUsers();
		driver.switchTo().frame("contentFrame");
		//listeners.testStepDescription("Step 5: Click on MORE ACTIONS");
		users.clickMOREACTIONBtn();
		//listeners.testStepDescription("Step 6: Click on Users Attribute");
		users.clickUsersAttribute();
		//listeners.testStepDescription("Step 7: Click on role to made inactive");
		users.clickInactiveAttribute();
		//listeners.testStepDescription("Step 8: Get the Attribute name which is inactive");
		users.getRole();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		//listeners.testStepDescription("Step 9: Click on WorkTime");
		users.clickWorkTime();
		//listeners.testStepDescription("Step 10: Click on Attendance");
		users.clickAttendance();
		//listeners.testStepDescription("Step 11: Click on filter");
		users.clickFilter();
		//listeners.testStepDescription("Step 12: Click on Users Attribute image");
		users.clickUserimg();
		//listeners.testStepDescription("Step 13: Get the user attribute list");
		users.GetUserArrtribute();
		//listeners.testStepDescription("Step 14: Check inactive attribute disable in users arrtibute list from attendance");
		boolean inactive = users.GetUserArrtribute().contains("Roles");
		Assert.assertTrue(inactive);
	}

}
