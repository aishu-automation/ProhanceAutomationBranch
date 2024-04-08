package test.Users;

import java.io.IOException;
import java.util.List;
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

public class UsersLoggedinUsersByClientMode extends BaseTest
{
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	List<String> getHostName = null;
	List<String> getexcelHostName = null;
	
	@Test
	public void usersLoggedinUsersByClientMode() throws InterruptedException, EncryptedDocumentException, IOException 
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
		listeners.testStepDescription("Step 5: Click on MORE ACTIONS");
		Thread.sleep(2000);
		users.clickMOREACTIONBtn();
		listeners.testStepDescription("Step 6: Click on SHOW LOGGED USERS");
		users.clickLoggedUsers();
		listeners.testStepDescription("Step 7: Click on DASHBOARD VIEW");
		users.clickDashboardVies();
		listeners.testStepDescription("Step 8: Click on Client and select having or not having");
		users.clickClient("Having");
		listeners.testStepDescription("Step 9: Click on HearBeat");
		users.clickHeart("30 days");
		listeners.testStepDescription("Step 10: Click on Fetch Btn");
		users.clickLoggedFetchBtn();
		Thread.sleep(1000);
		listeners.testStepDescription("Step 11: Click on filter Btn");
		users.clickClientFilter();
		listeners.testStepDescription("Step 12: Select By Activity");
		users.selectSlientByActivity("By Client Mode");
		listeners.testStepDescription("Step 13: Click on FECTH BUTTON");
		users.clickFetchBtn();
		if("Norecordstodisplay".equals(users.getNodataMsg()))
		{
			listeners.testStepDescription("Users not connectd from last 30 days");
			System.out.println("Users not connectd from last 30 days");
		}
		else
		{
		listeners.testStepDescription("Step 14: Click on count drill down");
		users.clickClientMode();
		listeners.testStepDescription("Step 15: Get list from web");
		getHostName = users.getByHearbeat();
		listeners.testStepDescription("Step 16: Click on Excel export to download");
		users.clickByHeartbeatexcel();
		listeners.testStepDescription("Step 17: Get List from excel");
		getexcelHostName = excel.getByHearBeatEcxel();
		listeners.testStepDescription("Step 18: Compare the list from web and excel are equal");
		boolean check =getHostName.equals(getexcelHostName);
		//System.out.println(check);
		Assert.assertTrue(check);
		listeners.testStepDescription("Step 19: Click on PDF export");
		users.clickbyHeartbeatPdf();
		listeners.testStepDescription("Step 20: Get List from Pdf");
		String actualPdfList=  excel.getHostNameListPDFData();
		listeners.testStepDescription("Step 21: Compare the list from web and pdf are equal");
		 for(int i=0;i<getHostName.size();i++)
		    {
		    	String data = getHostName.get(i);
		    	System.out.println("the value is :" +data);
		    	boolean checkPdf = actualPdfList.contains(data);
		    	Assert.assertTrue(checkPdf);
		    }
		}
	}
	
}
