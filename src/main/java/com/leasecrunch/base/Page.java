package com.leasecrunch.base;

import java.lang.module.ModuleDescriptor.Exports;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.naming.ldap.ExtendedRequest;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leasecrunch.utilities.ExcelReader;
import com.leasecrunch.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.DisplayOrder;

public class Page {

	public static WebDriver driver;

	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\logintestdata.xlsx");

	public static WebDriverWait wait;

	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;

	public void setTest(ExtentTest test) {

		this.test = test;
	}

	public static void initConfig() {

		if (Constants.browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

			String userprofilepath = "C:\\Users\\SHAHKH~1\\AppData\\Local\\Google\\Chrome\\User\\Default";
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			options.addArguments("--user-data-dir=" + userprofilepath);
			// options.addArguments("--incognito=true");
			driver = new ChromeDriver(options);
			log.debug("Launching Chrome browser");

		} else if (Constants.browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\msedgedriver.exe");

			driver = new EdgeDriver();
			log.debug("Launching edge browser");

		} else if (Constants.browser.equals("Firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");

			driver = new FirefoxDriver();
			log.debug("Launching Firefox browser");

		}

		driver.get(Constants.testurl);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Constants.implicitwait,
		// TimeUnit.SECONDS);
	}

	// Common Keywords
	public static void click(WebElement element) {

		element.click();
		log.debug("Clicking on an Element : " + element);
		try {
			if (test != null) {
				test.log(LogStatus.INFO, "Clicking on : " + element);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void type(WebElement element, String value) {

		element.sendKeys(value);
		log.debug("Typing in an Element : " + element + " entered value as : " + value);
		try {
			if (test != null) {
				test.log(LogStatus.INFO, "Typing in : " + element + " entered value as " + value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void quitBrowser() {

		driver.quit();
	}

}
