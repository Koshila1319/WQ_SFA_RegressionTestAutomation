package com.totalamber.qa.automation;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SeleniumBase {

	// public static WebDriver DRIVER;
	public static WebDriver driver;
	String browserName;
	private boolean isElementEnabled;
	private boolean isElementDisplayed;
	private boolean isElementDisplayedByText;
	String chromeDriverPath = "src\\resource\\chromedriver_win32\\";


	public WebDriver getdriver() {

		WebDriver driver = null;


		browserName = TestBase.data.getValueByName("browser");

		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("STARTING FIREFOX BROWSER..............");
		}

		if (browserName.equals("chrome")) {
			System.out.println("Driver path is " + chromeDriverPath);
			driver = initChromeDriver();
			System.out.println("STARTING CHROME BROWSER..............");
		}

		if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "..\\resource\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("STARTING IE BROWSER..............");
		}
		return driver;

	}


	private WebDriver initChromeDriver() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", chromeDriverPath + "chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		capabilities.setCapability("chrome.binary", chromeDriverPath);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
		return driver;
	}


	public SeleniumBase(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Set the site URL
	 *
	 * @param siteUrl - site URL
	 */
	public void enterURL(String siteUrl) {
		driver = getdriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();
	}

	public void endDriver() {
		// TODO Auto-generated method stub
		System.out.println("CLOSING BROWSER...........");
		driver.quit();
		System.out.println("***************** END TESTING *****************");
	}

	public void openTab(String mailinatorURL) {
		driver = getdriver();
		driver.get(mailinatorURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}

	// *******************getEliment functions*************************

	// Get element by CSS, ID, name and xPath

	/**
	 * This is to find the element by CSS, ID, Name and XPath.
	 *
	 * @param cSS
	 * @param id
	 * @param name
	 * @param xPath
	 * @return Return the created object of the element
	 */
	public WebElement getElement(String cSS, String id, String name, String xPath) {

		WebElement element;

		try {
			element = driver.findElement((By.id(id)));

		} catch (Exception e) {

			try {
				element = driver.findElement((By.name(name)));

			} catch (Exception e1) {

				try {
					element = driver.findElement((By.xpath(xPath)));
				} catch (Exception e2) {

					element = driver.findElement((By.cssSelector(cSS)));
				}

			}

		}

		return element;
	}

	/**
	 * This is to find the element by CSS, Name and XPath.
	 *
	 * @param cSS
	 * @param name
	 * @param xPath
	 * @return Return the created object of the element
	 */
	// Get element by CSS, name and xPath
	public WebElement getElement(String cSS, String name, String xPath) {

		WebElement element;

		try {
			element = driver.findElement((By.name(name)));

		} catch (Exception e) {

			try {
				element = driver.findElement((By.xpath(xPath)));

			} catch (Exception e1) {

				element = driver.findElement((By.cssSelector(cSS)));

			}

		}

		return element;
	}

	/**
	 * This is to find the element by CSS and XPath.
	 *
	 * @param cSS
	 * @param xPath
	 * @return Return the created object of the element
	 */
	// Get element by CSS and xPath
	public WebElement getElement(String cSS, String xPath) {

		WebElement element;

		try {
			element = driver.findElement((By.xpath(xPath)));

		} catch (Exception e) {

			element = driver.findElement((By.cssSelector(cSS)));
		}

		return element;
	}

	/**
	 * This is to find the list of element by CSS and XPath.
	 *
	 * @param cSS
	 * @param xPath
	 * @return Return the created list object of the element
	 */
	// Get list of element by CSS and xPath
	public List<WebElement> getElements(String cSS, String xPath) {

		List<WebElement> elements;

		try {
			elements = driver.findElements((By.xpath(xPath)));

		} catch (Exception e) {
			elements = driver.findElements((By.cssSelector(cSS)));

		}

		return elements;
	}

	// Get list of element by tag

	/**
	 * @param tag
	 * @return
	 */
	public List<WebElement> getElements(String tag) {

		List<WebElement> elements;

		elements = driver.findElements((By.tagName(tag)));

		return elements;
	}

	// ******************************* function for type
	// *********************************
	// Selenium type function with parameter CSS, id, name and xPath

	/**
	 * @param objectName
	 * @param textToEnter
	 */
	public void type(String objectName, String textToEnter) {
		WebElement textBox = driver.findElement(By.name(objectName));
		textBox.sendKeys(textToEnter);

	}



	/**
	 * @param cSS
	 * @param objectName
	 * @param xPath
	 * @param textToEnter
	 */
	public void type(String cSS, String objectName, String xPath, String textToEnter) {
		getElement(cSS, objectName, xPath).sendKeys(textToEnter);
	}

	/**
     * @param cSS
     * @param xPath
     * @param textToEnter
     */
	public boolean type(String cSS, String xPath, String textToEnter) {
		getElement(cSS, xPath).sendKeys(textToEnter);
        return false;
    }

	// ******************************* function for click
	// *********************************

	/**
	 * Click event by CSS, ID, Name and XPath
	 *
	 * @param xPath
	 * @param cSS
	 * @param id
	 * @param name
	 */
	public void click(String xPath, String cSS, String id, String name) {
		getElement(cSS, id, name, xPath).click();
	}

	/**
	 * @param xPath
	 * @param cSS
	 */
	public void click(String xPath, String cSS) {
		getElement(cSS, xPath).click();


	}

	/**
	 *
	 */

	public void switchedToiFrame(String frame) {
		driver.switchTo().frame(frame);
	}

	public void chromeSwitchToTab() {
		// TODO Auto-generated method stub
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	// ******************************* function for get the text
	// *********************************

	public String getText(By by) {

		return driver.findElement(by).getText();


	}

	public String getText(String css, String id, String name, String xpath) {

		String text;

		text = getElement(css, id, name, xpath).getText();

		return text;

	}

	public String getText(String css, String xpath) {

		String text;

		text = getElement(css, xpath).getText();

		return text;


	}

	public String getTextCSS(String css) {

		String text;

		text = getText(By.cssSelector(css));

		return text;

	}

	public String getTextXPATH(String xpath) {

		String text;

		text = getText(By.xpath(xpath));

		return text;

	}

	public String getTextByAttribute(String css, String xpath, String attribute) {

		String text;

		text = getElement(css, xpath).getAttribute(attribute);

		return text;

	}


	// ******************************* function for select value from dropdown
	// *********************************

	public void selectByValue(By by, String value) {

		new Select(driver.findElement(by)).selectByValue(value);

	}

	public void selectByVisibleText(By by, String text) {

		new Select(driver.findElement(by)).selectByVisibleText(text);

	}

	public void selectByVisibleText(String css, String id, String name, String xpath, String text) {

		new Select(getElement(css, id, name, xpath)).selectByVisibleText(text);

	}

	public void selectByVisibleText(String css, String xpath, String text) {

		new Select(getElement(css, xpath)).selectByVisibleText(text);

	}

	public void selectByVisibleTextAndWait(By by, String text) {

		new Select(driver.findElement(by)).selectByVisibleText(text);

	}

	public String getSelectedText(By by) {

		return new Select(driver.findElement(by)).getFirstSelectedOption().getText();
	}

	public String getSelectedText(String css, String id, String name, String xpath) {

		return new Select(getElement(css, id, name, xpath)).getFirstSelectedOption().getText();
	}

	public int getOptionCount(String css, String id, String name, String xpath) {

		return new Select(getElement(css, id, name, xpath)).getOptions().size();
	}

	public void setdropdownValues(String objectName, String textToSelect) {
		WebElement identifier = driver.findElement(By.id(objectName));
		Select select = new Select(identifier);
		select.selectByVisibleText(textToSelect);

	}

	public List<String> getSelectList(String css, String id, String name, String xpath) {

		List<String> list = null;
		List<WebElement> options;
		Select select;

		select = new Select(getElement(css, id, name, xpath));

		options = select.getOptions();

		for (WebElement option : options) {

			list.add(option.getText());

		}

		return list;

	}

	public void selectDateFromDatepicker(String datePickerXpath, String selectDate) throws InterruptedException {
		// TODO Auto-generated method stub
		String day;
		String monthYear;
		String currMonthYear;

		// Splitting a date and month
		String dateSplitter[] = selectDate.split("-");
		day = dateSplitter[0];
		monthYear = dateSplitter[1];
		System.out.println(day);
		System.out.println(monthYear);

		Thread.sleep(2000);

		WebElement calElement = driver.findElement(By.xpath(datePickerXpath));
		calElement.click();

		currMonthYear = driver
				.findElement(By
						.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_header']/tbody/tr/td[@class='dp_caption']"))
				.getText();

		if (currMonthYear.equals(monthYear)) {
			List<WebElement> days = driver.findElements(By
					.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_daypicker']/tbody/tr/td"));

			for (WebElement d : days) {
				if (d.getText().equals(day)) {
					d.click();
				}
			}
		} else {
			do {
				driver.findElement(By
						.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_header']/tbody/tr/td[3]"))
						.click();
				currMonthYear = driver
						.findElement(By
								.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_header']/tbody/tr/td[@class='dp_caption']"))
						.getText();
			} while (!currMonthYear.equals(monthYear));
			List<WebElement> days = driver.findElements(By
					.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_daypicker']/tbody/tr/td"));
			for (WebElement d : days) {
				if (d.getText().equals(day)) {
					d.click();
				}
			}
		}
	}

	public void selectDateFromBasicDatepicker(String datePickerXpath, String selectDate) {

		String day;
		String month;
		String year;
		String monthYear;
		String monthInThree;

		// Splitting day, Month and Year
		String dateSplitter[] = selectDate.split("-");
		day = dateSplitter[0];
		monthYear = dateSplitter[1];
		String yerMonthSplit[] = monthYear.split(",");
		month = yerMonthSplit[0].trim();
		year = yerMonthSplit[1].trim();

		monthInThree = month.substring(0, 3);

		System.out.println(monthInThree);

		WebElement calElement = driver.findElement(By.xpath(datePickerXpath));
		calElement.click();

		driver.findElement(
				By.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_header']/tbody/tr/td[2]"))
				.click();
		driver.findElement(
				By.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_header']/tbody/tr/td[2]"))
				.click();

		// Select year
		List<WebElement> yearLists = driver.findElements(
				By.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_yearpicker']/tbody/tr/td"));

		for (WebElement yearList : yearLists) {

			if (year.equals(yearList.getText())) {
				yearList.click();
			}

		}

		// Select month
		List<WebElement> monthLists = driver.findElements(
				By.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_monthpicker']/tbody/tr/td"));

		for (WebElement monthList : monthLists) {

			if (monthInThree.equals(monthList.getText())) {
				monthList.click();
			}

		}

		// Select date
		List<WebElement> days = driver.findElements(
				By.xpath("//div[2][@class='Zebra_DatePicker dp_visible']/table[@class='dp_daypicker']/tbody/tr/td"));
		for (WebElement d : days) {
			if (d.getText().equals(day)) {
				d.click();
			}
		}
	}

	// Verify disable objects
	public String verifyDesableObject(String xPath) {
		WebElement disable = driver.findElement(By.xpath(xPath));
		String disableAttribute = disable.getAttribute("disabled");
		return disableAttribute;
	}

	public boolean verifyAvailableObject(String xPath) {
		WebElement available = driver.findElement(By.xpath(xPath));
		boolean disableAttribute = available.isDisplayed();
		return disableAttribute;
	}

	// Create random number
	public String createRandomNumber() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmss");
		String randomNumber = ft.format(dNow);
		return randomNumber;

	}

	// Get tag count under specific tag
	public int getTagCount(String xPath) {
		List<WebElement> tagType = driver.findElements(By.xpath(xPath));
		int tagCount = tagType.size();
		return tagCount;
	}

	// Koshi

	// Select Radio Button
	public void selectRadioButton(String xPath) {
		// TODO Auto-generated method stub
		List<WebElement> radioButton = driver.findElements(By.xpath(xPath));

		for (WebElement element : radioButton) {
			if (!element.isSelected()) {
				element.click();
			}
		}
	}

	// Select Check Box
	public void selectCheckBox(String xpath) {
		// TODO Auto-generated method stub
		List<WebElement> checkBox = driver.findElements(By.xpath(xpath));

		for (WebElement element : checkBox) {
			if (!element.isSelected()) {
				element.click();
			}
		}
	}

	// Select a checkbox inside a dropdown
	public void setdropdownElements(String divxpath, String dropdownelement) {
		driver.findElement(By.xpath(divxpath)).click();
		driver.findElement(By.xpath(dropdownelement)).click();
		driver.findElement(By.xpath(divxpath));

	}

	// Get current URL
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}

	// Pass values through URL
	public void passValuesThroughUrl(String userName, String password) {

		driver.get("http://" + userName + ":" + password + "@qa.webquarters.com:33366/_login/default.aspx ");

	}

	// login to mail through URL

	// public void passValuesThroughUrl(String userName, String password) {
	//
	// driver.get("http://" + userName + ":" + password +
	// "@qa.webquarters.com:33366/_login/default.aspx ");
	//
	// }
	// http://mailcatch.com/en/temporary-inbox?box=492df9c7-a061-478e-87f2-317c86c145ca
	//

	// Print previous console value
	public void printPrevoiusConsoleValues() {

	}

	// Click on a link by LinkText
	public void clickOnLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	// Shammi
	public String selectSoftware() {
		Select s = new Select(driver.findElement(By.id(
				"ctl00_ctl39_g_7B6AE4AA_1CED_4039_AB72_0DE8298BCFF3_ctl00_ApplicationDetaisDataList_ctl01_ApplicationNameDropDownList")));
		s.selectByIndex(3);
		return null;
	}

	public String selectVersions() {

		WebElement elementToClick = driver.findElement(By.xpath(".//*[@id='caption'and contains(text(),'Versions')]"));
		elementToClick.click();

		return null;

	}

	public String selectSignInOption()

	{
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_PlaceHolderMain_ClaimsLogonSelector']")));
		s.selectByIndex(1);
		return null;
	}

	public void login(String uname, String pwd) throws InterruptedException {

		String TEST_ENVIRONMENT = "qa.webquarters.com:33366/_login/default.aspx";
		String URL = "http://" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;
		driver.get(URL);
		Thread.sleep(2000);

	}

	public void clearCache() {
		// TODO Auto-generated method stub
		driver.manage().deleteAllCookies();
	}

	// Select Radio Button
	/*public String selectRadioButton() {
		WebElement k = driver.findElement(
				By.xpath("//*[@id='ctl00_ctl39_g_20FD40B8_A9C7_4F4A_BE0C_9888B6CC76E5_ctl00_RadioButtonClient']"));
		k.click();
		return null;

	}*/

	// Email confirmation
	public String confirmationEmail(String email) {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
		WebElement e = driver.findElement(By.xpath(email));
		e.click();
		return email;

	}

	// Open link in a new tab
	public void linkOpenInANewTab(String linkXpath) throws InterruptedException {

		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath(linkXpath)).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(5000);

	}

	// Spit words
	public String splitTexts(String word, String delimiter) {

		String[] sp = word.split(delimiter);
		System.out.println("Splited data is " + sp[1]);

		String second = sp[1];
		return second;

	}

	//Hard reload the page - koshi
	public void hardReaload() {
		Keys.chord(Keys.CONTROL, Keys.SHIFT, "R");

	}

	public void waitForEmail(String email) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.switchTo().frame("emailframe");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(email)));
		// ExpectedConditions.
	}

	//Switch to a popup - koshi
	public void swichToPopup(int frameIndex) throws InterruptedException {

		driver.switchTo().frame(frameIndex);
	}

	//Check whether the element is enabled - koshi
	public boolean checkIsElementEnabled(String elementPath) {

		WebElement element = driver.findElement(By.xpath(elementPath));
		isElementEnabled = element.isEnabled();

		System.out.println("Clickable? " + isElementEnabled);

		if (isElementEnabled == true) {
			System.out.println("Element Enabled");
		} else {
			System.out.println("Element not Enabled");
		}

		return isElementEnabled;

	}

	//Check whether the element is available - koshi
	public boolean checkElementIsDisplayed(String elementPath) {

		WebElement element = driver.findElement(By.xpath(elementPath));
		isElementDisplayed = element.isDisplayed();

		if (isElementDisplayed == true) {
			System.out.println("Element available !");
		} else {
			System.out.println("Element not Available !");
		}

		return isElementDisplayed;
	}

	//Check data equals - koshi
	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return getText("", data);

	}

	//Upload files - koshi
	public void uploadFiles(String filePath, String xPath) {
		WebElement upload = driver.findElement(By.xpath(xPath));
		upload.sendKeys(filePath);

	}

	// Replace Texts - koshi
	public void replaceText(String cSS, String xPath, String textToReplace) {
		getElement(cSS, xPath).sendKeys(Keys.chord(Keys.CONTROL, "a"), textToReplace);
	}

	//click browser back button - koshi
	public void clickBrowserBackButton() {
		// TODO Auto-generated method stub
		driver.navigate().back();
	}

	//Back to main window - koshi
	public void backToMain() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
	}

	//switch ti new tab - koshi
	public void switchToNewTab() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
	   /* driver.close();
	    driver.switchTo().window(tabs2.get(0));*/
	}

	//Select Drop down values with list
	public void switchToDropDown(String divxpath) {
		driver.findElement(By.xpath(divxpath)).click();
	}

	public void selectSysAidDropDown(String listItem) {

		driver.findElement(By.xpath("//li[contains(text(),'" + listItem + "')][@class='option_" + listItem + "_option']")).click();
	}


	//Select Drop down list with option value
	public void selectSysAidDropDownTextAndOption(String textValue, String optionValue) {

		driver.findElement(By.xpath("//li[contains(text(),'" + textValue + "')][@class='option_" + optionValue + "_option']")).click();
	}

	//calculate total time(SysAid) - koshi
	public Integer calculateTotalTime(int startTime, int endTime) {

		int total = endTime - startTime;
		return total;
	}

	// Spit words and replace - koshi
	public String splitReplaceConcatText(String word, String delimiter, String concatValue) {

		String[] sp = word.split(delimiter);
		System.out.println("Splited data 1 is " + sp[0]);
		System.out.println("Splited data 2 is " + sp[1]);

		String first = sp[0];
		String second = sp[1];

		String concatText = first + concatValue + second;
		System.out.println("concat is " + concatText);
		return concatText;

	}

	//Get alert text - koshi
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	//Dismiss alert - koshi
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	//Get alert Text- koshi
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	//Send text to alert - koshi
	public void sentTextToAlert() {
		driver.switchTo().alert().sendKeys("Text");
	}

	//Check whether the value is exist
	public String checkIsValueExist(String tablePath, String value) {
		String str = null;
		WebElement table = driver.findElement(By.xpath(tablePath));
		List<WebElement> columns = table.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			if (cell.getText().equals(value)) {
				System.out.println("webQuarters value : " + cell.getText() + " is Match with SysAid value : " + value);
				str = cell.getText();
			}
			break;
		}
		return str;
	}

	// Get no of rows in a table - koshi
	public Integer getNoOfRowsInATable(String xpathVal) {

		List<WebElement> ElementCollectionHead = driver.findElements(By.xpath(xpathVal+"/tbody/tr"));
		int rowCount = ElementCollectionHead.size();

		System.out.println("rows = " + rowCount);

		return rowCount;
	}

	// Get no of columns in a table - koshi
	public Integer getNoOfColumnsInATable(String xpathVal) {

		List<WebElement> ElementCollectionHead = driver.findElements(By.xpath(xpathVal+"/tbody/tr"));
		int rowCount = ElementCollectionHead.size();

		System.out.println("rows = " + rowCount);

		List<WebElement> ElementCollectionHead1 = ElementCollectionHead.get(0).findElements(By.tagName("td"));
		int columnCount = ElementCollectionHead1.size();

		System.out.println("columns = " + columnCount);

		return columnCount;
	}

	//Retrieve row values match with a given value - koshi
	public List<String> matchWithRowValue(String xpathToTable, String value) {


		int row = getNoOfRowsInATable(xpathToTable);
		int column = getNoOfColumnsInATable(xpathToTable);

		List<String> list = new ArrayList<String>();

		for (int i=1;i<=row;i++){
			String sValue = null;
			String sRowValue = null;

			sValue = driver.findElement(By.xpath(xpathToTable+"/tbody/tr["+i+"]/td[1]")).getText();

			if(sValue.equalsIgnoreCase(value)) {

				for (int j = 1; j <= column; j++) {
					list.add(sRowValue = driver.findElement(By.xpath(xpathToTable+"/tbody/tr["+i+"]/td[" + j + "]")).getText());

					System.out.println(sRowValue);
				}
				//break;
			}
		}
		System.out.println(list);
		return list;
	}


	//Retrieve table header values - koshi
	public List<String> matchWithTableHeaderValue(String xpathToTable) {

		int column = getNoOfColumnsInATable(xpathToTable);

		List<String> list = new ArrayList<String>();

			String sColValue = null;

				for (int j = 1; j <= column; j++) {
					list.add(sColValue = driver.findElement(By.xpath(xpathToTable+"/thead/tr/th[" + j + "]")).getText());

					System.out.println(sColValue);
				}

		System.out.println(list);
		return list;
	}

	//Click view button of a case in Resolve Case Page - koshi
	public void clickResolveCaseViewButton(String value) {

		String text = null;

		for (int i = 2; i <= 2; i++) {

			for (int j = 2; j <= 3; i++) {
				String xpathValue = null;

				xpathValue = driver.findElement(By.xpath("//*[@id='ctl00_ctl39_g_E3A572C8_40D0_4EE1_B662_3E7A56472F80_ctl00_SupportCaseDataList']/tbody/tr[" + i + "]/td/li/table/tbody/tr/td[" + j + "]")).getText();

				if (xpathValue.equalsIgnoreCase(value)) {

					text = "//*[@id='ctl00_ctl39_g_E3A572C8_40D0_4EE1_B662_3E7A56472F80_ctl00_SupportCaseDataList']/tbody/tr[" + i + "]/td/li/table/tbody/tr[1]/td[4]/a";
					System.out.println(text);

					break;
				}
			}
		}

		click(text, "");
	}

	//Click accept button of a case in Resolve Case Page - koshi
	public void clickResolveCaseAcceptButton(String caseID) {

		String text = null;

		for (int i = 2; i <= 2; i++) {

			for (int j = 2; j <= 3; i++) {
				String xpathValue = null;

				xpathValue = driver.findElement(By.xpath("//*[@id='ctl00_ctl39_g_E3A572C8_40D0_4EE1_B662_3E7A56472F80_ctl00_SupportCaseDataList']/tbody/tr[" + i + "]/td/li/table/tbody/tr/td[" + j + "]")).getText();

				if (xpathValue.equalsIgnoreCase(caseID)) {

					text = "//*[@id='ctl00_ctl39_g_E3A572C8_40D0_4EE1_B662_3E7A56472F80_ctl00_SupportCaseDataList']/tbody/tr[" + i + "]/td/li/table/tbody/tr[2]/td[4]/div/input";
					System.out.println(text);

					break;
				}
			}
		}

		click(text, "");


	}


	public void checkDropdownCount(String xPath) {
		WebElement dropdown = SeleniumBase.driver.findElement(By.xpath(xPath));
		Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		System.out.print(allOptions.size());
	}

	public String checkDropdownTextValue(String xPath) {
		String value = null;
		WebElement dropdown = SeleniumBase.driver.findElement(By.xpath(xPath));
		Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			value = allOptions.get(i).getText();
			System.out.println(value);
		}
		return null;
	}

	//Coded by: Shammi
	//Used to track the page title
	public String getTitle() {
		return driver.getTitle();
	}

	//Coded by: Shammi
	//Used to validate the email address
	public void validate_Email_Address(String name) {

		if (null != name) {
			String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			if (!matcher.matches()) {


				System.out.println("Invalid Username Feild. Please re-enter the username");
			}
			else
				System.out.println("Valid Email(Username) Feild");
		}
	}

	//Coded By : Shammi
	//Match only letters, numbers and spaces (Removes special characters)
	public void alphanumeric(String inputtxt) {
		if (null != inputtxt) {
			String letterNumber = "(?i)^([[a-z][^a-z0-9\\\\s\\\\(\\\\)\\\\[\\\\]\\\\{\\\\}\\\\\\\\^\\\\$\\\\|\\\\?\\\\*\\\\\u200C\u200B+\\\\.\\\\<\\\\>\\\\-\\\\=\\\\!\\\u200C\u200B\\_]]*)$";
			Pattern pattern = Pattern.compile(letterNumber);
			Matcher matcher = pattern.matcher(inputtxt);
			if (matcher.matches()) {
				System.out.println("Valid Text");
			} else {
				System.out.println("Please enter a valid text.");
			}
		}
	}


    public String checkDropdownTextValue(String xPath, String option) {
        String value= null;
        WebElement dropdown = SeleniumBase.driver.findElement(By.xpath(xPath));
        Select select = new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        for (int i=0; i<allOptions.size(); i++){
            value = allOptions.get(i).getText();
            //System.out.println(value);

        }
        return value;
    }

    //read a Value attribute from Textbox
    public String readValueFromTextBox(String xpath){

        return driver.findElement(By.xpath(xpath)).getAttribute("value");
    }

	public String getClassValue(String xpath){

		return driver.findElement(By.xpath(xpath)).getAttribute("class");
	}

    public String splitTextGetNthWord(String word, String delimeter, Integer nthWord){


        String[] sp = word.split(delimeter);
        System.out.println("Splited data is "+ sp[nthWord-1]);
        String nthWordtext = sp[nthWord-1];
        return nthWordtext;
    }

    //To Clear a Textbox
    public void clearTextBox(String xPath){
        driver.findElement(By.xpath(xPath)).clear();
    }

    //Get the placeholder value of an element
    public String getPlaceHolderValueFromTextBox(String xPath){
        return driver.findElement(By.xpath(xPath)).getAttribute("placeholder");
    }

	public String verifyElementExist(String data){
		List<WebElement> linksearch = driver.findElements(By.xpath(data));
		String checkLink = linksearch.toString();
		return checkLink;
	}

	//Tiresha
	//Check a value from a table is existing - WQ
	public String checkIsValueExistInArea(String tablePath, String value) {
		WebElement table = driver.findElement(By.xpath(tablePath));
		List<WebElement>  columns = table.findElements(By.tagName("td"));
		String str = null;
		for(WebElement cell : columns){
			String clientName = splitTextGetNthWord(cell.getText()," -", 1);
			System.out.println(clientName);
			if(clientName.equals(value)){
				System.out.println("Table Value : " +clientName+" is Matching with searching value : "+value);
				str = clientName;
				break;
			}
		}
		return str;
	}
	//Tiresha
	//Click an existing value from a table - WQ
	public String clickAValueExistsInArea(String tablePath, String value){
		WebElement table = driver.findElement(By.xpath(tablePath));
		List<WebElement>  columns = table.findElements(By.tagName("a"));
		String str = null;
		for(WebElement cell : columns){
			String clientName = splitTextGetNthWord(cell.getText()," -", 1);
			System.out.println(clientName);
			if(clientName.equals(value)){
				System.out.println("Table Value : " +cell.getText()+" is Matching with searching value : "+value);
				cell.click();
				break;
			}
		}
		return str;
	}


	//Coded by : Shammi
	//Used to track whether element is avaialable
    public boolean isElementPresent(String elementName){
        WebElement element = driver.findElement(By.xpath(elementName));
        return element.isDisplayed();
    }

    //Coded by :Shammi
	//Used to track modules and versions dropdowns are empty without selecting the SW App

    public boolean check_Text_Feild_Data_Equal(String a,String b,String name) {

        String x=getText(a,b);

        if(x.equals(name)){
            System.out.println("Please select the Software application");
            return true;
        }
        else

            System.out.println("Items available in the dropdown");
            return false;



    }

    //Coded by :Shammi
	//Used to track the mandatory fields higlighted with red border only
    public String check_CSS_Value(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element.getCssValue("border-bottom-color");
	}



	//get newly opened tab title - koshi
	public String getNewlyOpenedTabTitle() {

		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles()); //get window handlers as list
		driver.switchTo().window(browserTabs.get(1)); //switch to new tab
		return getTitle();
	}

	// Get no of options in a dropdown - koshi
	public Integer getNoOfOptionsInADropdown(String xpath) {

		List<WebElement> ElementCollectionHead = driver.findElements(By.xpath(xpath+"/option"));
		int optionCount = ElementCollectionHead.size();

		System.out.println("options = " + optionCount);

		return optionCount;
	}

	//Get options in a drop down - koshi
	public List<String> listDropdownOptions(String xpath) {

		int noOfOptions = getNoOfOptionsInADropdown(xpath);
		List<String> list = new ArrayList<String>();

		for (int j = 1; j <= noOfOptions; j++) {
			list.add(driver.findElement(By.xpath(xpath+"/option[" + j + "]")).getText());
		}

		System.out.println(list);
		return list;
	}

	//Check element is displayed by Text - koshi
	public boolean checkIsElementDisplayedByText(String text) {
		WebElement element = driver.findElement(By.linkText(text));
		isElementDisplayedByText = element.isDisplayed();

		if (isElementDisplayedByText == true) {
			System.out.println("Element available !");
		} else {
			System.out.println("Element not Available !");
		}
		return isElementDisplayedByText;

	}

	public boolean isElementNotAvailable(String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}


	//Tiresha
	//MouseHovering an Element
	public void mouseHoverAnElement(String xPath) {
		WebElement element = driver.findElement(By.xpath(xPath));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	// Tiresha - Radio Button is deselected - Suranjith to change
	public boolean deselectedRadioButton(String xPath) {
		List<WebElement> radioButton = driver.findElements(By.xpath(xPath));
		boolean bool = false;
		for (WebElement element : radioButton) {
			if (element.isSelected()) {
				bool = true;
			}
			bool = false;
		}
		return bool;
	}


	//Coded By:Shammi
	//Handle Unexpected alert windows
	public boolean isAlertPresent(){
		try{
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			Alert a=driver.switchTo().alert();
			a.accept();
			//System.out.println("Alert is present");
			return true;
		}
		catch (NoAlertPresentException e) {
			//System.out.println("Alert is not present");
			return false;
		}
		finally{
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}


	//Tiresha
	//Loadthe URL in current Browser

	public void loadURLInCurrentBrowser(String url){
		driver.navigate().to(url);
	}


	//Coded By:Shammi
	//Click on enter button
	public void pressEnter() {
		Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();
		kb.pressKey(Keys.RETURN);
	}

	//Tiresha
	//Check a value from a table is existing - WQ
	public String checkIsValueExistInTable(String tablePath, String value) {
		WebElement table = driver.findElement(By.xpath(tablePath));
		List<WebElement>  columns = table.findElements(By.tagName("td"));
		String str = null;
		for(WebElement cell : columns){
			if(cell.getText().equals(value)){
				System.out.println("Table Value : " +cell.getText()+" is Matching with searching value : "+value);
				str = cell.getText();
				break;
			}
		}
		return str;
	}

	//Tiresha
	// Select a Check Box from a Value List
	public void selectCheckBoxFromAList(String tableXPath,String value) {

		List<WebElement> checkBox = driver.findElements(By.xpath(tableXPath));

		for (WebElement element : checkBox) {
			if (element.getText().equals(value)) {
				element.click();
				break;
			}
		}
	}


	//Coded By:Shammi
	//Used to overwrite the value
	public void clear_Data_Feilds(String xpath)
	{
		WebElement element = driver.findElement(By.xpath(xpath));
		element.clear();
	}

	//Tiresha
	//Check the selected option exist in List box
	public String checkDropdownTextValueInList(String xPath, String option) {
		String value= null;
		WebElement list = SeleniumBase.driver.findElement(By.xpath(xPath));
		Select select = new Select(list);
		List<WebElement> allOptions = select.getOptions();
		for (int i=0; i<allOptions.size(); i++){
			value = allOptions.get(i).getText();
			if(option.equals(value)) {
				System.out.println("Selected Option Value : " + option + " is existing in List as : " + value);
				break;
			}
		}
		return value;
	}

	//Tiresha
	//Click the option exist in List box
	public void clickTextValueInList(String xPath, String option) {
		String value= null;
		WebElement list = SeleniumBase.driver.findElement(By.xpath(xPath));
		Select select = new Select(list);
		List<WebElement> allOptions = select.getOptions();
		for (int i=0; i<allOptions.size(); i++){
			value = allOptions.get(i).getText();
			if(option.equals(value)) {
				System.out.println("Selected Option Value : " + option + " is existing in List as : " + value);
				allOptions.get(i).click();
				break;
			}
		}
	}




}







