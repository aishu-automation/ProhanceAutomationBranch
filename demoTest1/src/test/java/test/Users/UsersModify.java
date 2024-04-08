package test.Users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;

public class UsersModify extends BaseTest{
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	Listeners listeners = new Listeners();
	@Test
	public void usersmodify() throws InterruptedException
	{
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
	listeners.testStepDescription("Step 5: Click on Monitor button");
	users.clickModifyBtn1();
	listeners.testStepDescription("Step 6: Select User type");
	users.selectUserType("Agentless");
	listeners.testStepDescription("Step 7: Click on inactive check box");
	users.clickInactiveChkBoc();
	listeners.testStepDescription("Step : Click on SAVE");
	users.clickSaveBtn();
	//users.clickCloseAggregationPopUp();
	//users.clickBackBtn();
	}

}
