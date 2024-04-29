package com.leasecrunch.testscases.Firm;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.LoginPage;

public class EditFirm {
	@BeforeTest
	public void beforetest() {
		Page.initConfig();
	}

	@Test
	public void editFirm() throws InterruptedException {

		LoginPage lp = new LoginPage();

		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();
		Thread.sleep(3000);
		FirmPage fp = new FirmPage();
		fp.editFirm();
		Thread.sleep(3000);
		fp.editFirmname();
		fp.editFirmContracttype();
		fp.save_firm();
		Thread.sleep(3000);
	}

	@AfterTest
	public void aftertest() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}
	}
}