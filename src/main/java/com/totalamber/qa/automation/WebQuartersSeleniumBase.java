package com.totalamber.qa.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WebQuartersSeleniumBase {

	// public static WebDriver DRIVER;
	public static WebDriver driver;

	String browserName;

	private boolean isElementEnabled;
	String chromeDriverPath = "src\\resource\\chromedriver_win32\\";



	public WebDriver getdriver() {

		WebDriver driver = null;


		browserName = WebQuartersTestBase.data.getValueByName("browser");

		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("STARTING FIREFOX BROWSER..............");
		}

		if (browserName.equals("chrome")) {
			System.out.println( "Driver path is " + chromeDriverPath);
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


	public WebQuartersSeleniumBase(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Set the site URL
	 *
	 * @param siteUrl
	 *            - site URL
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
	 *
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
	 *
	 * @param objectName
	 * @param textToEnter
	 */
	public void type(String objectName, String textToEnter) {
		WebElement textBox = driver.findElement(By.name(objectName));
		textBox.sendKeys(textToEnter);

	}

	/**
	 *
	 * @param cSS
	 * @param objectName
	 * @param xPath
	 * @param textToEnter
	 */
	public void type(String cSS, String objectName, String xPath, String textToEnter) {
		getElement(cSS, objectName, xPath).sendKeys(textToEnter);
	}

	/**
	 *
	 * @param cSS
	 * @param xPath
	 * @param textToEnter
	 */
	public void type(String cSS, String xPath, String textToEnter) {
		getElement(cSS, xPath).sendKeys(textToEnter);
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
	 *
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
		// WebElement available = driver.findElement(By.name(xPath));
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
	public String selectRadioButton() {
		WebElement k = driver.findElement(
				By.xpath("//*[@id='ctl00_ctl39_g_20FD40B8_A9C7_4F4A_BE0C_9888B6CC76E5_ctl00_RadioButtonClient']"));
		k.click();
		return null;
	}

	// Email confirmation
	public String confirmationEmail(String email) {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
		WebElement e = driver.findElement(By.xpath(email));
		e.click();
		return email;

	}

	// Click on verification link
	public String clickOnTheVerificationLink(String linkXpath) {

		driver.switchTo().frame("emailframe");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath(linkXpath)).sendKeys(selectLinkOpeninNewTab);
		return null;
	}

	// Click on verification link
	public String clickOnLogInLink() throws InterruptedException {

		driver.switchTo().frame("emailframe");
		Thread.sleep(3000);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/div")).click();
		driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/div/p[3]/a")).sendKeys(selectLinkOpeninNewTab);
		return null;
	}

	// Spit words
	public String splitTexts(String word, String delimiter) {

		String[] sp = word.split(delimiter);
		System.out.println("Splited data is " + sp[1]);

		String second = sp[1];
		return second;

	}

	//Hard reload the
	public void hardReaload() {
		Keys.chord(Keys.CONTROL, Keys.SHIFT, "R");

	}

	public void waitForEmail(String email) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.switchTo().frame("emailframe");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(email)));
		// ExpectedConditions.
	}

	//Switch to a popup
	public void swichToPopup(int frameIndex) throws InterruptedException {

		driver.switchTo().frame(frameIndex);
	}

	//Check whether the element is enabled
	public void checkIsElementEnabled(String elementPath) {

		WebElement element = driver.findElement(By.xpath(elementPath));
		isElementEnabled = element.isEnabled();

		System.out.println("Clickable? " + isElementEnabled);

		if (isElementEnabled = true) {
			System.out.println("Element Enabled");
		}
		else
		{
			System.out.println("Element not Enabled");
		}

	}

	//Check data equals
	public String verifyDataEquals(String data) {
		// TODO Auto-generated method stub
		return getText("", data);
	}


	//Upload files
	public void uploadFiles(String filePath, String elementName) {
		// TODO Auto-generated method stub
		WebElement element= driver.findElement(By.name(elementName));
		element.sendKeys(filePath);
	}

	// Replace Texts
	public void replaceText(String cSS, String xPath, String textToReplace) {
		getElement(cSS, xPath).sendKeys(Keys.chord(Keys.CONTROL, "a"), textToReplace);
	}

	public void clickBrowserBackButton() {
		// TODO Auto-generated method stub
		driver.navigate().back();
	}

	public void backToMain() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
	}

	public void switchToNewTab(){
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
	   /* driver.close();
	    driver.switchTo().window(tabs2.get(0));*/
	}

	//Select Drop down values with list
	public void switchToDropDown(String divxpath) {
		driver.findElement(By.xpath(divxpath)).click();
	}

	public void selectSysAidDropDown(String listItem){

		driver.findElement(By.xpath("//li[contains(text(),'"+listItem+"')][@class='option_"+listItem+"_option']")).click();
	}


	//Select Drop down list with option value
	public void selectSysAidDropDownTextAndOption(String textValue, String optionValue){

		driver.findElement(By.xpath("//li[contains(text(),'"+textValue+"')][@class='option_"+optionValue+"_option']")).click();
	}


}