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

public class UsersEmailExportForPdf extends BaseTest{

	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	UsersPage users = new UsersPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	List<String> reportList1 = new ArrayList();
	List<String> reportList2 = new ArrayList();

	@Test
	public void usersEmailExportForPdf() throws InterruptedException, EncryptedDocumentException, IOException {
		driver = initializeDriver6688();
		 //listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish", "1");
		 //listeners.testStepDescription("Step 2: Click on SideNavigationMenuBar");
		nav.clickSideNavigationBtn();
		users.scrollSideNavigationBar();
		// listeners.testStepDescription("Step 3: Click on USERS");
		users.clickUsersBtn();
		// listeners.testStepDescription("Step 4: Click on Users");
		Thread.sleep(1000);
		users.clickUsers();
		driver.switchTo().frame("contentFrame");
		//listeners.testStepDescription("Step 5: Click on Mail");
		users.clickEmailImg();
		//listeners.testStepDescription("Step 6: Select any report by view");
		users.clickReportViewBy("Users not mapped to any Group");
		//listeners.testStepDescription("Step 7: Click on HTML radio button");
		users.clickPdflView();
		//listeners.testStepDescription("Step 8: Fill the recipients by email id");
		Thread.sleep(1000);
		users.fillrecipients("aishwarya.k@prohance.net");
		//listeners.testStepDescription("Step 9: Click on Submit button");
		users.clickSubmitBtn();
		Thread.sleep(30000);
		users.getMailSuccessMsg();
		driver.get("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?client_id=4765445b-32c6-49b0-83e6-1d93765276ca&redirect_uri=https%3A%2F%2Fwww.microsoft365.com%2Flandingv2&response_type=code%20id_token&scope=openid%20profile%20https%3A%2F%2Fwww.office.com%2Fv2%2FOfficeHome.All&response_mode=form_post&nonce=638404830422100424.YTgyMDVjZGQtMDJjMC00ODM1LTgwNjgtMTY0NGE5NjYyODA3NGU5N2QzYmUtYzU3Yy00ODk3LThjYmQtOTU3MTQ1NTYyNjg4&ui_locales=en-US&mkt=en-US&client-request-id=4f9014c6-fea2-4520-89c4-352d8f736089&state=1gQxkFf0dU6yquWDe9igz1wvUr7ZhaSFrVD_TQCiPXJXAUAfiXKOoVhAfXrOtQSTabSqkY_8mW98AcykTdAWumIAQyauN4otRWj6ziGhKbvRYnXuYPlk9aEWnWEH5y-ER8bth1e50_I3T2_ua_PV4NhlWYPCZ0_fUs_LUWS4vQhqSueFwCovIrbalTP-MMGjCCMq_IhHR-71CUKWWCusKF3D7p6m9dzkrwLA3O2bJ3OTAsOrkTTM2xUEIxTMu29ip1QfEwri86ISACLhJTNXnQqQQsL1GWIABNfbZizg5HM&x-client-SKU=ID_NET6_0&x-client-ver=6.34.0.0");
		users.sendoutlookUserName("aishwarya.k@prohance.net");
		users.clickNextBtn();
		users.sendoutlookPassword("AishProh@03");
		Thread.sleep(1000);
		users.clickSignInBtn();
		Thread.sleep(1000);
		users.clickStaySignInBtn();
		Thread.sleep(1000);
		//users.clickOnRecentDownload();
		//users.clickToSwitchtab();
		//Thread.sleep(5000);
		
	
		
	}

}
