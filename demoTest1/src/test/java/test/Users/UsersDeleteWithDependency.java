package test.Users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;

public class UsersDeleteWithDependency extends BaseTest {

	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	Listeners listeners = new Listeners();

	@Test
	public void deleteUsersWithDependency() throws InterruptedException {
		driver = initializeDriver3333();
		listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish_1", "1");
		listeners.testStepDescription("Step 2: Click on SideNavigationMenuBar");
		nav.clickSideNavigationBtn();
		users.scrollSideNavigationBar();
		listeners.testStepDescription("Step 3: Click on USERS");
		users.clickUsersBtn();
		listeners.testStepDescription("Step 4: Click on users");
		Thread.sleep(1000);
		users.clickUsers();
		driver.switchTo().frame("contentFrame");
		listeners.testStepDescription("Step 5: Click on  Delete button");
		users.clickMonitorImgBtn();
		listeners.testStepDescription("Step 6: Click on YES button");
		Thread.sleep(3000);
		users.clickYESBtn();
		listeners.testStepDescription("Step 7: Click on ClickHere button");
		users.clickClickHereBtn();
		users.moveToAddPage();
		Thread.sleep(1000);
		listeners.testStepDescription("Step 8: Check the dependen data");
		users.clickDependentDataAvailable();
		listeners.testStepDescription("Step 9: Close that page");
		driver.close();
		users.moveToparentWindow();
		driver.switchTo().frame("contentFrame");
		listeners.testStepDescription("Step 10: Close the aggregation popup ");
		users.clickCloseAggregationPopUp();
	}
}
