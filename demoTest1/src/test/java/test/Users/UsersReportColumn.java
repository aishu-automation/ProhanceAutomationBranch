package test.Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class UsersReportColumn extends BaseTest {

	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	String reportList1 = null;
	List<String> reportList2 = new ArrayList();

	@Test
	public void usersReportColumn() throws InterruptedException, EncryptedDocumentException, IOException {
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
		 listeners.testStepDescription("Step 5: Click on Report Columns");
		users.clickReportColumn();
		Thread.sleep(1000);
		 listeners.testStepDescription("Step 6: Click on some column to drag and drop fron Selected Cloumns to Availabel Columns");
		users.clickClientDrag();
		Thread.sleep(1000);
		 listeners.testStepDescription("Step 7: Click on some column to drag and drop fron Availabel Cloumns to Selected Columns");
		users.clickClientDragAndDrop();
		 listeners.testStepDescription("Step 8: Get clumns list from report columns");
		reportList1 = users.getReportColumnList();
		 listeners.testStepDescription("Step 9: Click on fetch button");
		users.clickReportColumnFetchBtn();
		 listeners.testStepDescription("Step 10:  Get clumns list from web");
		reportList2 = users.getReportColumnLists();
		 listeners.testStepDescription("Step 11:  Compare two lists are equal or not");
		for (int i = 0; i < reportList2.size(); i++) {
			String data = reportList2.get(i); // System.out.println("the value is :" +data);
			Assert.assertTrue(reportList1.contains(data));
		}

	}
}
