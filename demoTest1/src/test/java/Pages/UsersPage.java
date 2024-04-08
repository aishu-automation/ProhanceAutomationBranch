package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import test.BaseTest;
import utilities.ReadXLSdata;

public class UsersPage {
	WebDriver driver;

	@FindBy(xpath = "//li/a[contains(text(),\"Users\")]")
	WebElement UsersBtn;

	@FindBy(xpath = "//ul[@id =\"level2_109\"]/li[contains(text(),\"Users\")]")
	WebElement Users;

	@FindBy(xpath = "//label[contains(text(),\"ADD NEW\")]")
	WebElement AddNewBtn;

	@FindBy(id = "userRoleStr")
	WebElement role;

	@FindBy(id = "probeLoginId")
	WebElement loginId;

	@FindBy(id = "webLoginId")
	WebElement loginIdCon;

	@FindBy(id = "webAuthType_NATIVE")
	WebElement consoleAuth;

	@FindBy(xpath = "//input[@id =\"webPassword\"]")
	WebElement password;

	@FindBy(xpath = "//input[@id =\"webConfirmPassword\"]")
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id =\"firstName\"]")
	WebElement firstName;

	@FindBy(id = "timeZoneId")
	WebElement timezone;

	@FindBy(xpath = "//button[contains(text(),\"SAVE\")]")
	WebElement savebtn;

	@FindBy(xpath = "//table[@id =\"tab_table\"]/tbody/tr[2]/td/span[2]")
	WebElement teamMapping;

	@FindBy(xpath = "(//input[@type='button'])[3]")
	WebElement addTeamsBtn;

	@FindBy(xpath = "(//input[@name='userGroupSelectCheckbox'])[1]")
	WebElement selectSuperGrp;

	@FindBy(xpath = "//button[contains(text(),'ADD')]")
	WebElement addBtn;

	@FindBy(xpath = "//li/label[contains(text(),\"BACK\")]")
	WebElement backBtn;

	@FindBy(id = "inactivateUser_Y")
	WebElement inactive;

	@FindBy(id = "userTypeId")
	WebElement userType;

	@FindBy(xpath = "//a[contains(text(),\"Aishwarya1\")]")
	WebElement modifyBtn;

	@FindBy(linkText = "×")
	WebElement closeAggregationPopUp;

	@FindBy(xpath = "//td[contains(text(),\"Team Member\")]/../td[1]/a[2]/i")
	WebElement deleteBtn;

	@FindBy(xpath = "//button[contains(text(),'YES')]")
	WebElement yesBtn;

	@FindBy(xpath = "//span/span[contains(text(),\"Click here\")]")
	WebElement clickHereBtn;

	@FindBy(xpath = "//a[contains(text(),\"Aayesha\")]/../../td[1]/a[2]/i")
	WebElement monitorimgBtn;
	
	@FindBy(xpath = "//td[contains(text(),\"Aishwarya12@JAMOCHAlOCAL [NATIVE]\")]/../td[1]/a[1]/i")
	WebElement modify;
	
	@FindBy(xpath = "//td[contains(text(),\"Aishwarya12@JAMOCHAlOCAL [NATIVE]\")]/../td[1]/a[2]/i")
	WebElement delete;
	
	@FindBy(xpath = "//a[contains(text(),\"Aayesha\")]/../../td[1]/a[1]/i")
	WebElement monitorimgBtn1;

	@FindBy(xpath = "//table[@id='CommonDataTableId']/tbody/tr/td[7][not(img)]/../td[1]/a[2]/i")
	WebElement monitorBtn;

	@FindBy(xpath = "//label[contains(text(),\"MORE ACTION\")]")
	WebElement moreActionBtn;

	@FindBy(xpath = "//li/a[contains(text(),\"USER ATTRIBUTES\")]")
	WebElement userAttributes;

	@FindBy(xpath = "//li/a[contains(text(),\"BULK UPLOAD\")]")
	WebElement bulkUpload;

	@FindBy(xpath = "//li/a[contains(text(),\"USER ATTRIBUTES\")]")
	WebElement userAttribute;

	@FindBy(xpath = "//li/a[contains(text(),\"LICENSE REPORT\")]")
	WebElement licencereport;

	@FindBy(xpath = "//li/a[contains(text(),\"SHOW LOGGED IN USERS\")]")
	WebElement loggedUsers;

	@FindBy(xpath = "//span[contains(text(),\" Click here\")]")
	WebElement clickHere;

	@FindBy(id = "userType")
	WebElement template;

	@FindBy(xpath = "//table[@id='userUploadTable']/tbody/tr[1]/td/div/span[2]/span/span/input[@id ='userXLUpload']")
	WebElement chooseFileBtn;

	@FindBy(id = "userUploadButton")
	WebElement upload;

	@FindBy(id = "userCondition")
	WebElement condition;

	@FindBy(xpath = "//li/a[contains(text(),\"DEFINE TENURE RANGE\")]")
	WebElement defineTenure;

	@FindBy(id = "userStatusCondition")
	WebElement userStatus;

	@FindBy(id = "reportUnit")
	WebElement tenureMes;

	@FindBy(xpath = "//div[@id=\"edit\"]/table/tbody/tr[1]/td[2]/div/span/input[@id=\"fromRange\"]")
	WebElement rangeFrom;

	@FindBy(xpath = "//div[@id=\"edit\"]/table/tbody/tr[1]/td[4]/div/input")
	WebElement rangeTo;

	@FindBy(xpath = "//div[@id=\"edit\"]/table/tbody/tr[1]/td[5]/input")
	WebElement tenureAddBtn;

	@FindBy(xpath = "//tr[@id =\"row_1\"]/td/i")
	WebElement deletetenure;

	@FindBy(xpath = "//div[@id =\"editTenureDialog\"]/div/div/div[3]/div/span[2]/input")
	WebElement tenureSavebtn;

	@FindBy(xpath = "//img[@src='/prohance/images/dialog-close.png']")
	WebElement deleteicon;

	@FindBy(id = "associateUserReportLevel")
	WebElement selectTeams;

	@FindBy(xpath = "//div[@class =\"row message-area\"]/div[4]/span")
	WebElement successMsg;

	@FindBy(xpath = "//div[@class =\"row message-area\"]/div[4]/span")
	WebElement failMsg;

	@FindBy(xpath = "//table[@id =\"CommonDataTableId\"]/tbody/tr[10]/td[7]/span/i")
	WebElement inactiveAttribute;

	@FindBy(xpath = "//li[@id =\"workTimeLi\"]/a[contains(text(),\"WORK TIME\")]")
	WebElement workTime;

	@FindBy(xpath = "//li[@id =\"menuitem_96\"]/a[contains(text(),\"ATTENDANCE\")]")
	WebElement attendance;

	@FindBy(xpath = "//img[@id =\"dropDownFilterAttendence\"]")
	WebElement filter;

	@FindBy(xpath = "//img[@src=\"images/popup_icon.gif\"]")
	WebElement userImg;

	@FindBy(xpath = "//img[@src=\"/prohance/images/email.png\"]")
	WebElement email;

	@FindBy(xpath = "//div[@class=\"slimScrollDiv\"]/div/table/tbody/tr")
	List<WebElement> getUserArrtribute;

	@FindBy(xpath = "//label[contains(text(),\"User Type\")]")
	WebElement endOfUserAtt;

	@FindBy(xpath = "//table[@id =\"CommonDataTableId\"]/tbody/tr[10]/td[3]/div")
	WebElement getRole;

	@FindBy(xpath = "//table[@id=\"licenseVoList\"]/tbody/tr/td[1]")
	List<WebElement> licenceList;

	@FindBy(xpath = "//img[@src=\"/prohance/images/excel.png\"]")
	WebElement licenceExcelImg;

	@FindBy(xpath = "//img[@src=\"/prohance/images/pdf.png\"]")
	WebElement licenceEPdfImg;

	@FindBy(xpath = "//div[@id =\"navBarFilterLinks\"]/label[2]")
	WebElement dashboardVies;

	@FindBy(xpath = "//div[@id=\"dashboardContainer1\"]/div/div/div/div/span")
	WebElement clientFilter;

	@FindBy(id = "reportType1")
	WebElement reportBy;

	@FindBy(xpath = "//td[@id=\"filterFormbuttons_container_1\"]/span[2]")
	WebElement Fetch;

	@FindBy(xpath = "//div[@id=\"dashboardContainer1\"]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/span")
	WebElement count;

	@FindBy(xpath = "//table[@class =\"table table-widget newsortable1 tableFilter\"]/tbody/tr[1]/td[2]/span")
	WebElement clientMode;

	@FindBy(xpath = "//table[@id=\"CommonDataTableId\"]/tbody/tr/td[2]")
	List<WebElement> byHearbeat;

	@FindBy(xpath = "//table[@id=\"CommonDataTableId\"]/tbody/tr/td[2]")
	List<WebElement> byActivity;

	@FindBy(xpath = "//img[@src=\"/prohance/images/excel.png\"]")
	WebElement byHeartbeatexcel;
	
	@FindBy(xpath = "//img[@src=\"/prohance/images/pdf.png\"]")
	WebElement byHeartbeatPdf;

	@FindBy(xpath = "//label[contains(text(),\"REPORT COLUMNS\")]")
	WebElement reportColumn;

	@FindBy(xpath = "//ul[@id=\"sortable2\"]/li[1]")
	WebElement clientdrag;

	@FindBy(xpath = "//ul[@id=\"sortable1\"]")
	WebElement clientdrop;

	@FindBy(xpath = "//div[@class=\"col-lg-12 col-md-12\"]/span[2]/input[@value=\"FETCH\"]")
	WebElement reportColumnFetch;

	@FindBy(id = "sortable2")
	List<WebElement> reportCloumnList;

	@FindBy(xpath = "//ul[@id=\"sortable1\"]/li[1]")
	WebElement clientdragFromAvailabelCol;

	@FindBy(xpath = "//ul[@id=\"sortable2\"]")
	WebElement clientdropFromAvailabelCol;

	@FindBy(xpath = "//div[@class=\"dataTables_scroll\"]/div/div/table/thead/tr/th")
	List<WebElement> reportCloumnLists;

	@FindBy(xpath = "//table[@id=\"CommonDataTableId\"]/tbody/tr/td[3]")
	List<WebElement> usersLists;
	
	@FindBy(xpath = "//table[@id=\"CommonDataTableId\"]/tbody/tr/td[3]")
	List<WebElement> usersList;

	@FindBy(xpath = "//img[@src=\"/prohance/images/excel.png\"]")
	WebElement userExcel;

	@FindBy(xpath = "//img[@src=\"/prohance/images/pdf.png\"]")
	WebElement userPdf;

	@FindBy(xpath = "//select[@name=\"CommonDataTableId_length\"]")
	WebElement displayrecords;

	@FindBy(xpath = "//select[@id =\"userViewBy\"]")
	WebElement reportViewBy;

	@FindBy(xpath = "//span[@id=\"htmlAttachSpan\"]/input")
	WebElement htmlView;
	
	@FindBy(xpath = "//span[@id=\"excelAttachSpan\"]/input")
	WebElement excelView;
	
	@FindBy(xpath = "//span[@id=\"pdfAttatchSpan\"]/input")
	WebElement pdflView;

	@FindBy(xpath = "//tr[@id=\"row_1\"]/td[2]/textarea")
	WebElement recipients;

	@FindBy(xpath = "//div[@id=\"schedulerDialogFooter\"]/span[2]")
	WebElement submit;

	@FindBy(xpath = "//table[@class =\"table table-widget newsortable1 tableFilter\"]/tbody/tr/td[2]/span")
	WebElement trayMomory;

	@FindBy(xpath = "//table[@class=\"table table-widget newsortable1 tableFilter\"]/tbody/tr[2]/td[2]/span")
	WebElement serviceMomory;

	@FindBy(xpath = "//table[@class =\"table table-widget newsortable1 tableFilter\"]/tbody/tr[1]/td[2]/span")
	WebElement byProxy;

	@FindBy(xpath = "//table[@class =\"table table-widget newsortable1 tableFilter\"]/tbody/tr[1]/td[2]/span")
	WebElement operatingSystem;

	@FindBy(xpath = "//table[@class=\"table table-widget newsortable1 tableFilter\"]/tbody/tr[1]/td[2]/span")
	WebElement dotnet;

	@FindBy(xpath = "//table[@class =\"table table-widget newsortable1 tableFilter\"]/tbody/tr[1]/td[2]/span")
	WebElement clientVersion;

	@FindBy(xpath = "//table[@class =\"configtable table-bordered-rl\"]/tbody/tr[2]/td[3]")
	WebElement dependentDataAvailable;

	@FindBy(xpath = "//table[@class =\"configtable table-bordered dependencytable\"]/tbody/tr[2]/td[1]")
	WebElement jobdetails;

	@FindBy(xpath = "//div[@class=\"messagefailure\"]/div/span")
	WebElement reportsFailMsg;

	@FindBy(xpath = "//div[@class=\"messagefailure\"]/div/button/span")
	WebElement reportsFailMsgClose;

	@FindBy(xpath = "//div[@class =\"messagefailure\"]/div/span")
	WebElement recipientsFailMsg;

	@FindBy(xpath = "//div[@id =\"schedulerDialogFooter\"]/span[1]")
	WebElement mailClose;

	@FindBy(xpath = "//span[@id =\"dialogsuccessspan\"]/span/a")
	WebElement addClose;

	@FindBy(xpath = "//div[@class =\"modal fade undraggable ui-draggable in\"]/div/div/div[2]/div[2]")
	WebElement alertMsg;
	
	@FindBy(xpath = "//span[contains(text(),\"Email sent successfully\")]")
	WebElement mailSuccessMsg;
	
	@FindBy(id ="i0116")
	WebElement outlookUserName;
	//input[@id ="i0116"]
	
	@FindBy(id ="idSIButton9")
	WebElement nextBtn;
	
	@FindBy(id ="i0118")
	WebElement outlookPassword;
	
	@FindBy(id ="idSIButton9")
	WebElement signIn;
	
	@FindBy(id ="idSIButton9")
	WebElement staySignIn;
	
	@FindBy(id ="ms-searchux-input-0")
	WebElement search;
	
	@FindBy(xpath ="//span[contains(text(),\"Outlook\")]")
	WebElement outlook;
	
	@FindBy(xpath ="//button[@name=\"Download\"]//span[contains(text(),'Download')]")
	WebElement mailDownload;
	
	@FindBy(xpath ="//div[@id=\"rec-item-1\"]/div/div/div[2]/div[2]")
	WebElement exexcel;
	
	@FindBy(xpath ="//div[@id=\"m_excelWebRenderer_ewaCtl_sheetContentDiv_Flow_0\"]/div/div[2]/div/canvas")
	List<WebElement> exexcelList;
	
	@FindBy(xpath ="//div[@class =\"ppeSg VZHTX\"]/iframe")
	WebElement switchFrame;
	
	@FindBy(xpath ="//div[@class =\"zKDWD YbB6r IKvQi epBmH EhiOs _KLsp\"]/div[2]/div[2]/div[4]/div/div")
	WebElement sendedMail;
	
	@FindBy(xpath ="//div[@id =\"edgeworthbase\"]/div/div/div/a/div/div/div[2]")
	WebElement recentDownload;
	
	@FindBy(id ="probeType")
	WebElement client;
	
	@FindBy(id ="heartbeatType")
	WebElement heartBeatType;
	
	@FindBy(id ="fetchId")
	WebElement fetchBtn;
	
	@FindBy(xpath ="//div[@id =\"container\"]/div[contains(text(),'No records to display')]")
	WebElement loggedUserwithNodata;
	
	public UsersPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void scrollSideNavigationBar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'Business Hierarchy')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Element);
	}
	

	public void clickUsersBtn() {
		this.UsersBtn.click();
	}

	public void clickUsers() {
		this.Users.click();
	}

	public void clickADDNEWbtn() {
		this.AddNewBtn.click();
	}

	public void selectRole(String role) {
		Select clickRole = new Select(this.role);
		clickRole.selectByVisibleText(role);
	}

	public void enterLoginIdTxtBox(String loginid) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(this.loginId)).sendKeys(loginid);
	}

	public void clickConsoleAuthChkBox() {
		this.consoleAuth.click();
	}

	public void enterLoginIdConXTxtBox(String loginid) {
		System.out.println(loginid);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(this.loginIdCon)).sendKeys(loginid);
	}

	public void enterPasswordTxtBox(String loginid) {
		System.out.println(loginid);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(this.password)).sendKeys(loginid);
	}

	public void enterConfirmPassTxtBox(String loginid) {
		System.out.println(loginid);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(this.confirmpassword)).sendKeys(loginid);
	}

	public void enterFirstNameTxtBox(String name) {
		this.firstName.sendKeys(name);
	}

	public void selectTimeZone(String timezone) {
		Select clickTimeZone = new Select(this.timezone);
		clickTimeZone.selectByVisibleText(timezone);
	}

	public void clickSaveBtn() {
		this.savebtn.click();
	}

	public void clickteamMapping() {
		this.teamMapping.click();
	}

	public void clickADDTEAMSBtn() {
		this.addTeamsBtn.click();
	}

	public void checkCheckBoxJavaScipt(WebElement locator) {
		JavascriptExecutor jsexecutour = (JavascriptExecutor) driver;
		if (!locator.isSelected()) {
			jsexecutour.executeScript("arguments[0].click();", locator);
		}

	}

	public void clickSelectSuperGrp() throws InterruptedException {
		// Thread.sleep(2000);
		// this.selectSuperGrp.click();
		checkCheckBoxJavaScipt(selectSuperGrp);

	}

	public void clickSuperGrpAddBtn() throws InterruptedException {
		// Thread.sleep(2000);
		this.addBtn.click();
	}

	public void moveToAddPage() {

		Set<String> handles = this.driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parentwindow = (String) it.next();
		String childwindow = (String) it.next();
		driver.switchTo().window(childwindow);

	}

	public void moveToparentWindow() {

		System.out.println("parent window");
		Set<String> ids = this.driver.getWindowHandles();
		Iterator<String> i = ids.iterator();
		String parentID = i.next();
		while (i.hasNext()) {
			String childID = i.next();
			this.driver.switchTo().window(childID);
		}

		this.driver.switchTo().window(parentID);

	}

	public void clickBackBtn() {
		this.backBtn.click();
	}

	public void clickInactiveChkBoc() {
		this.inactive.click();
	}

	public void selectUserType(String userType) {
		Select clickUserType = new Select(this.userType);
		clickUserType.selectByVisibleText(userType);
	}

	public void clickModifyBtn() {
		this.monitorimgBtn.click();
	}

	public void clickDeleteBtn(String name) {
		System.out.println(name);
		driver.findElement(By.xpath("//a[contains(text(),\" + name + \")]/../../td[1]/a[2]")).click();
		System.out.println("//a[contains(text(),\" + name + \")]/../../td[1]/a[2]");
		System.out.println("//a[contains(text(),\"Aishwarya1\")]");
		
	}

	public void clickCloseAggregationPopUp() {
		this.closeAggregationPopUp.click();
	}

	public void clickDeleteBtn() {
		this.deleteBtn.click();
	}

	public void clickYESBtn() {
		this.yesBtn.click();
	}

	public void clickClickHereBtn() {
		this.clickHereBtn.click();

	}

	public void clickMonitorImgBtn() {
		this.monitorimgBtn.click();
	}

	public void clickMonitorBtn() {
		this.monitorBtn.click();

	}
	public void clickDeleteIcon()
	{
		this.delete.click();
	}

	public void clickMOREACTIONBtn() {
		//this.moreActionBtn.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", this.moreActionBtn);
	}

	public void clickBulkUploadBtn() {
		this.bulkUpload.click();
	}

	
	public void selectTemplateDropDown(String temp) {
		Select clicktemp = new Select(this.template);
		clicktemp.selectByVisibleText(temp);
	}

	public void clickHereBtn() {

		this.clickHere.click();
	}

	public String clickChooseFileBtn(String url) {
		System.out.println("enter");
		System.out.println(url);
		WebElement choose = this.chooseFileBtn;
		choose.sendKeys(url);
		this.upload.click();
		return url;

	}

	public void clickChooseFileForInactiveBtn(String url) {
		System.out.println("enter");
		System.out.println(url);
		WebElement choose = this.chooseFileBtn;
		choose.sendKeys(url);
		this.upload.click();
		// return url;

	}

	public void clickUpload() {
		this.upload.click();
	}

	public void selectUserConditione(String userCondition) {
		Select clickUserCondition = new Select(this.condition);
		clickUserCondition.selectByVisibleText(userCondition);
	}

	public void selectUserStatus(String userStatus) {
		Select clickUserStatusCondition = new Select(this.userStatus);
		clickUserStatusCondition.selectByVisibleText(userStatus);
	}

	public void clickDefineTenureBtn() {
		this.defineTenure.click();
	}

	public void selectTenure(String tenure) {
		Select clickTenure = new Select(this.tenureMes);
		clickTenure.selectByVisibleText(tenure);
	}

	public int fillRangeFrom() {
		String fromValue = this.rangeFrom.getAttribute("value");
		int range = Integer.valueOf(fromValue);
		// System.out.println("get from data");
		// System.out.println(this.rangeFrom.getAttribute("value"));
		// this.rangeFrom.sendKeys(from);
		return range;
	}

	public void fillRangeTo(int to) {
		this.rangeTo.clear();
		String ran = String.valueOf(to);
		this.rangeTo.sendKeys(ran);
	}

	public void clickTenureAddBtn() {
		this.tenureAddBtn.click();
	}

	public void clickTenureDelete() {
		this.deletetenure.click();
	}

	public void clickTenureSaveBtn() {
		this.tenureSavebtn.click();
	}

	public void selectAssociateUser(String user) {
		Select clickAssUser = new Select(this.selectTeams);
		clickAssUser.selectByVisibleText(user);
	}

	public void ClickDeleteIcon() {
		this.deleteicon.click();
	}

	public boolean getMsg() {
		String ms = this.successMsg.getText();
		String msg = ms.substring(1, ms.length()).replaceAll("\\s+", "");
		String compareMsg = "Uploadwassuccessful";
		boolean check = msg.equals(compareMsg);
		return check;

	}

	
	public boolean getFailMsg() {
		String ms = this.failMsg.getText();
		String msg = ms.substring(1, ms.length()).replaceAll("\\s+", "");
		String compareMsg = "Uploadcompletedwitherror(s)";
		boolean check = msg.equals(compareMsg);
		return check;

	}

	public void clickUsersAttribute() {
		this.userAttribute.click();
	}

	public void clickInactiveAttribute() {
		this.inactiveAttribute.click();

	}

	public void clickWorkTime() {
		this.workTime.click();
	}

	public void clickAttendance() {
		this.attendance.click();
	}

	public void clickFilter() {
		this.filter.click();
	}

	public void clickUserimg() {
		this.userImg.click();
	}

	public List<String> GetUserArrtribute() {
		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.getUserArrtribute;
		int len = col.size();
		System.out.println(len);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < len; i++) {
			WebElement ele = this.endOfUserAtt;

			teamsList.add(this.getUserArrtribute.get(i).getText());
			js.executeScript("arguments[0].scrollIntoView();", ele);
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public Object getRole() throws InterruptedException {
		// Thread.sleep(3000);
		String attribute = this.getRole.getText();
		System.out.println(this.getRole.getText());
		return attribute;
	}

	public void clickLicencereport() {
		this.licencereport.click();
	}

	public Set<String> getLicenceList() {
		List<WebElement> col = null;
		Set<String> teamsList = new TreeSet();
		col = this.licenceList;
		int len = col.size();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.licenceList.get(i).getText().replaceAll("\\s+", ""));
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public List<String> getLicenceListForPDF() {
		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.licenceList;
		int len = col.size();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.licenceList.get(i).getText());
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public void clicklicenceExcelImg() {
		this.licenceExcelImg.click();
	}

	public void clickLicencePdfImg() {
		this.licenceEPdfImg.click();
	}

	public void clickLoggedUsers() {
		this.loggedUsers.click();
	}

	public void clickDashboardVies() {
		this.dashboardVies.click();
	}

	public void clickClientFilter() {
		this.clientFilter.click();
	}

	public void selectSlientByActivity(String user) {
		Select clickAssUser = new Select(this.reportBy);
		clickAssUser.selectByVisibleText(user);
	}

	public void clickFetchBtn() {
		this.Fetch.click();
	}

	public void clickCount() {
		// this.count.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", this.count);
	}

	public List<String> getByHearbeat() {

		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.byHearbeat;
		int len = col.size();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.byHearbeat.get(i).getText());
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public void clickByHeartbeatexcel() {
		this.byHeartbeatexcel.click();
	}

	public void clicktenureDeleteBtn() {
		driver.switchTo().alert().accept();
	}

	public void clickReportColumn() {
		this.reportColumn.click();
	}

	public void clickClientDrag() {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(clientdrag).moveToElement(clientdrop).release(clientdrop).build();
		dragAndDrop.perform();
	}

	public void clickClientDragAndDrop() {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(clientdragFromAvailabelCol).moveToElement(clientdropFromAvailabelCol)
				.release(clientdropFromAvailabelCol).build();
		dragAndDrop.perform();
	}

	public void clickReportColumnFetchBtn() {
		this.reportColumnFetch.click();
	}

	public String getReportColumnList() {

		List<WebElement> col = null;
		String teamsList = null;
		col = this.reportCloumnList;
		int len = col.size();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			teamsList = (this.reportCloumnList.get(i).getText());
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public List<String> getReportColumnLists() throws InterruptedException {

		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.reportCloumnLists;
		int len = col.size();
		System.out.println(len);
		Thread.sleep(1000);
		for (int i = 1; i < len - 1; i++) {
			teamsList.add(this.reportCloumnLists.get(i).getText());
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		return teamsList;
	}

	public List<String> getUsersLists() throws InterruptedException {

		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.usersList;
		int len = col.size();
		System.out.println(len);
		Thread.sleep(1000);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.usersList.get(i).getText());
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		// teamsList.add(5,"Aishwarya");;
		System.out.println(teamsList);
		return teamsList;
	}

	public List<String> getUsersListsForExcel() throws InterruptedException {

		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.usersLists;
		int len = col.size();
		System.out.println(len);
		Thread.sleep(1000);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.usersLists.get(i).getText().replaceAll("\\s+", ""));
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		teamsList.add(6, "Aishwarya");
		;
		System.out.println(teamsList);
		return teamsList;
	}

	public void clickUserExcel() {
		this.userExcel.click();
	}

	public void clickDisplayrecords(String count) {
		Select clickAssUser = new Select(this.displayrecords);
		clickAssUser.selectByVisibleText(count);
	}

	public void clickUserPdf() {
		this.userPdf.click();
	}

	public void clickClientMode() {
		this.clientMode.click();

	}

	public void clickEmailImg() {
		this.email.click();
	}

	public void clickReportViewBy(String report) {
		// this.reportViewBy.click();
		Select clickAssUser = new Select(this.reportViewBy);
		clickAssUser.selectByVisibleText(report);
	}

	public void clickHtmlRadioBtn() {
		this.htmlView.click();
	}

	public void fillrecipients(String mailId) {
		this.recipients.sendKeys(mailId);
	}

	public void clickSubmitBtn() {
		this.submit.click();
	}

	public void clickTrayMomory() {
		this.trayMomory.click();
	}

	public void clickServiceMomory() {
		this.serviceMomory.click();
	}

	public void clickByProxy() {
		this.byProxy.click();
	}

	public void clickOperatingSystem() {
		this.operatingSystem.click();
	}

	public void clickDotnet() {
		this.dotnet.click();
	}
	
	public void clickModifyIcon()
	{
		this.modify.click();
	}

	public void clickClientVersion() {
		this.clientVersion.click();
	}

	public void clickDependentDataAvailable() throws InterruptedException {
		boolean result = false;
		String dependentData = this.dependentDataAvailable.getText();
		Thread.sleep(1000);
		String job = this.jobdetails.getText();
		boolean dependent = dependentData.equals("Yes");
		boolean jobdetail = job.equals("JAMINT13432");
		if ((dependent == true) && (jobdetail == true)) {
			result = true;
		}
		Assert.assertTrue(result);
	}

	public void getReportsFailMsg() {
		System.out.println("msg");
		String msg = this.recipientsFailMsg.getText();
		System.out.println(msg);
		boolean res = msg.equals("Report View By is required information");
		System.out.println(res);
		Assert.assertTrue(res);
	}

	public void getReportsFailMsg1() {
		System.out.println("msg");
		String msg = this.reportsFailMsg.getText();
		System.out.println(msg);
		boolean res = msg.equals("Recipients is invalid information");
		System.out.println(res);
		Assert.assertTrue(res);
	}

	public void clickRecipientsFailMsgCloseBtn() {
		this.reportsFailMsgClose.click();
	}

	public void getRecipientsFailMsg() {
		System.out.println("msg");
		String msg = this.recipientsFailMsg.getText();
		System.out.println(msg);
		boolean res = msg.equals("Recipients is required information");
		System.out.println(res);
		Assert.assertTrue(res);
	}

	public void clickMailClose() {
		this.mailClose.click();
	}

	public void clickAddClose() {
		this.addClose.click();
	}

	public void clickAlertMsg() {
		String msg = this.alertMsg.getText();
		boolean res = msg.equals("Range To field is required information");
		System.out.println(res);
		Assert.assertTrue(res);
	}
	public void getMailSuccessMsg()
	{
		String msg = this.mailSuccessMsg.getText();
		//System.out.println(msg);
		boolean res = msg.equals("Email sent successfully");
		System.out.println(res);
	}
	public void sendoutlookUserName(String username)
	{
		this.outlookUserName.sendKeys(username);
	}
	public void clickNextBtn()
	{
		this.nextBtn.click();
	}
	
	public void sendoutlookPassword(String password)
	{
		this.outlookPassword.sendKeys(password);
	}
	public void clickSignInBtn()
	{
		this.signIn.click();
	}
	
	public void clickStaySignInBtn()
	{
		this.staySignIn.click();
	}
	public void clickSearchBtn()
	{
		this.search.click();
	}
	public void clickOutlook()
	{
		this.outlook.click();
	}
	
	public void clickExcelView()
	{
		this.excelView.click();
	}
	public void clickExexcel()
	{
		this.exexcel.click();
	}
	public void clickbyHeartbeatPdf()
	{
		this.byHeartbeatPdf.click();
	}
	public void clickMailDownload()
	{
		this.mailDownload.click();
	}
	public void clickToSwitchtab()
	{
		String currentHandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
			//Switch to the opened tab
			driver.switchTo().window(actual); 
			//opening the URL saved.
			//driver.get(urlToClick);
			}
			}
	}
	public void getexexcelList() throws InterruptedException
	{
		System.out.println("check");
		//String msg = this.exexcelList();
		//System.out.println(msg);
		List<WebElement> col = null;
		List<String> teamsList = new ArrayList();
		col = this.exexcelList;
		int len = col.size();
		System.out.println(len);
		Thread.sleep(1000);
		for (int i = 0; i < len; i++) {
			teamsList.add(this.exexcelList.get(i).getText().replaceAll("\\s+", ""));
			// System.out.println( teamsList.add(this.getUserArrtribute.get(i).getText()));
		}
		System.out.println(teamsList);
		//return teamsList;
		
	}
	public void switchFrame()
	{
		driver.switchTo().frame("//div[@class ='ppeSg VZHTX']/iframe");
	}
	public void clickPdflView()
	{
		this.pdflView.click();
	}
	public void clickModifyBtn1()
	{
		this.monitorimgBtn1.click();
	}
	public void clickOnSendedMail()
	{
		this.sendedMail.click();
	}
	public void clickOnRecentDownload()
	{
		//this.recentDownload.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(this.recentDownload)).click();
	}
	
	public void clickClient(String client) {
		// this.reportViewBy.click();
		Select clickclient = new Select(this.client);
		clickclient.selectByVisibleText(client);
	}
	
	public void clickHeart(String hearBeat) {
		// this.reportViewBy.click();
		Select clickhearBeat = new Select(this.heartBeatType);
		clickhearBeat.selectByVisibleText(hearBeat);
	}
	
	public void clickLoggedFetchBtn()
	{
		this.fetchBtn.click();
	}
	
	public String getNodataMsg()
	{
		String msg = this.loggedUserwithNodata.getText().replaceAll("\\s+", "");
		System.out.println(msg);
		//boolean res = msg.equals("Email sent successfully");
		//System.out.println(res);
		return msg;
	}
}