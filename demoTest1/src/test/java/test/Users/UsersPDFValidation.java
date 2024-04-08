package test.Users;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SideNavigationMenuPage;
import Pages.UsersPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;
import utilities.ReadXLSdata;

public class UsersPDFValidation extends BaseTest {
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	List<String> reportList1 = new ArrayList();
	List<String> reportList2 = new ArrayList();
	
	@Test
	public void usersExcelValidation() throws InterruptedException, EncryptedDocumentException, IOException {
		driver = initializeDriver3333();
		 //listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish_1", "1");
		 //listeners.testStepDescription("Step 2: Click on SideNavigationMenuBar");
		nav.clickSideNavigationBtn();
		users.scrollSideNavigationBar();
		// listeners.testStepDescription("Step 3: Click on USERS");
		users.clickUsersBtn();
		// listeners.testStepDescription("Step 4: Click on Users");
		Thread.sleep(1000);
		users.clickUsers();
		driver.switchTo().frame("contentFrame");
		Thread.sleep(6000);
		users.clickDisplayrecords("1000");
		 reportList1 = users.getUsersLists();
		 users.clickUserPdf();
		String actualPdfList=  excel.getListPDFData();
		 for(int i=0;i<reportList1.size();i++)
		    {
		    	String data = reportList1.get(i);
		    	System.out.println("the value is :" +data);
		    	boolean check = actualPdfList.contains(data);
		    	System.out.println(check);
		    	//Assert.assertTrue(check);
		    }
		 
	}

}
