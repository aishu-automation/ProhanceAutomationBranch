package test.AssertOptimization;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AssertOptimizationPage.SoftwareDefinitionPage;
import AssertOptimizationPage.WorkStationGroupsPages;
import Pages.SideNavigationMenuPage;
import Pages.loginPage;
import test.BaseTest;
import test.Listeners;
import utilities.ReadXLSdata;

public class SoftwareDefinitationForSoftwareTagsClear extends BaseTest{
	
	WebDriver driver;
	loginPage loginPage = new loginPage(BaseTest.driver);

	SideNavigationMenuPage nav = new SideNavigationMenuPage(BaseTest.driver);
	WorkStationGroupsPages workStation = new WorkStationGroupsPages(BaseTest.driver);
	SoftwareDefinitionPage softwareDef = new SoftwareDefinitionPage(BaseTest.driver);
	ReadXLSdata excel = new ReadXLSdata(BaseTest.driver);
	Listeners listeners = new Listeners();
	List<String> hostNameList = null;
	List<String> hostNameExcelList = null;

	
	@Test(retryAnalyzer = Pages.RetryAnalyzer.class)
	public void softwareDefinitationForSoftwareTagsCURD() throws InterruptedException, EncryptedDocumentException, IOException {
		driver = initializeDriver6688();
		// listeners.testStepDescription("Step 1: Login to ProHance Application");
		loginPage.clickLogin("adminaish", "1");
		// listeners.testStepDescription("Step 2: Click on Work Flow");
		workStation.clickAssertOptimization();
		Thread.sleep(1000);
		workStation.switchTabs();
		// listeners.testStepDescription("Step 3: Click on Side Navigation bar");
		nav.clickWorkFlowSideNavigationArrow();
		// listeners.testStepDescription("Step 4: Scroll down the navigation");
		workStation.scrollSideNavigationBar();
		workStation.clickAdministration();
		Thread.sleep(1000);
		softwareDef.clickSoftwareDefinition();
		driver.switchTo().frame("contentFrame");
		softwareDef.clikSoftwareTagsBtn();
		softwareDef.sClearmodify();
		softwareDef.clicksCLEARBtn();
	}

}
