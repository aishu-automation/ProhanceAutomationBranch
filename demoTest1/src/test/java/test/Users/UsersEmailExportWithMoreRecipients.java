package test.Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;
import utilities.ReadXLSdata;

public class UsersEmailExportWithMoreRecipients extends BaseTest{

	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	List<String> reportList1 = new ArrayList();
	List<String> reportList2 = new ArrayList();
	
	@Test
	public void usersEmailExportWithMoreRecipients() throws InterruptedException, EncryptedDocumentException, IOException {
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
		listeners.testStepDescription("Step 5: Click on Mail");
		users.clickEmailImg();
		listeners.testStepDescription("Step 6: Fill the report view by");
		users.clickReportViewBy("Users with no Supervisor 2");
		listeners.testStepDescription("Step 7: Fill the recipients ");
		Thread.sleep(2000);
		users.fillrecipients("aishwarya.k@prohance.net;krishnanaish948845@gmail.com");
		listeners.testStepDescription("Step 9: Click on Submit button");
		Thread.sleep(1000);
		users.clickSubmitBtn();
		listeners.testStepDescription("Step 19: Compare the fail message");
		users.getReportsFailMsg1();
		Thread.sleep(1000);
		listeners.testStepDescription("Step 11: Close the failure message popup icon");
		users.clickRecipientsFailMsgCloseBtn();
	}
	
}
