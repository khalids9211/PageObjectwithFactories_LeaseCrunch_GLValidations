package com.leasecrunch.testscases.Firm;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.LoginPage;

public class DisableFirm extends Page {

	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}

	@Test()
	public void disableFirm() throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();

		FirmPage fp = new FirmPage();

		fp.searchFirm("Firm");
		Thread.sleep(2000);

		fp.editFirm();

		Thread.sleep(3000);
		fp.disableFirm();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		fp.save_firm();
		Thread.sleep(3000);

	}

	@AfterTest
	public void aftertest() {
		 Page.quitBrowser();
	}
}
