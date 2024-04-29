package com.leasecrunch.testscases.Firm;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.LoginPage;

public class SearchFirm {

	@BeforeTest
	public void beforetest() {

		Page.initConfig();
	}

	@Test
	public void searchfirm() throws InterruptedException {
		String expected = "0001";

		LoginPage lp = new LoginPage();

		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();
		Thread.sleep(3000);
		FirmPage fp = new FirmPage();
		fp.searchfirm(expected);

		String actual = fp.firmsearchresult();
	
		Assert.assertEquals(actual, expected);

	}

	@AfterTest
	public void aftertest() {
		if (Page.driver != null) {
			 Page.quitBrowser();
		}
	}
}