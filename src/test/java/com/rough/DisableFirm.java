package com.rough;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.actions.FirmPage;
import com.leasecrunch.pages.actions.HomePage;
import com.leasecrunch.pages.actions.LoginPage;

public class DisableFirm {

	public static void main(String[] args) throws InterruptedException {

		Page.initConfig();
		LoginPage lp = new LoginPage();
		lp.loginwithSysAdmin("shah@xdsol.com");
		lp.continue_btn();
		// Page.quitBrowser();
		
			FirmPage fp = new FirmPage();

			fp.searchFirm("Firm1");
			Thread.sleep(2000);
			for (int i = 1; i < 5; i++) {
			fp.editFirm();

			Thread.sleep(3000);
			fp.disableFirm();
			fp.save_firm();
			HomePage hp= new HomePage();
			Thread.sleep(10000);
			hp.Signout();
			Page.quitBrowser();
		}

	}

}
