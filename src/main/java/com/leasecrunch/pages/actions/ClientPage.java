package com.leasecrunch.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.leasecrunch.base.Page;
import com.leasecrunch.pages.locators.ClientPageLocator;

public class ClientPage extends Page {

	public ClientPageLocator cpl;

	public ClientPage() {

		this.cpl = new ClientPageLocator();

		PageFactory.initElements(driver, this.cpl);
	}

	public void searchClient(String clientname) {

		// Find the shadow host element
		WebElement shadowHost = driver.findElement(By.cssSelector("#client-microapp"));

		// Access the shadow root
		// WebElement shadowRoot = (WebElement) ((JavascriptExecutor)
		// driver).executeScript("return arguments[0].shadowRoot", shadowHost);
		WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot.querySelector('#filter')", shadowHost);
		// Find the shadow element within the shadow root
		// WebElement shadowElement = shadowRoot.findElement(By.cssSelector("#filter"));

		// Now you can interact with the shadow element
		shadowElement.sendKeys(clientname);

	}

	public void clientsearchresult() {
		WebElement shadowHost = driver.findElement(By.cssSelector("#client-microapp"));
		WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].shadowRoot.querySelector('#clientList > tbody > tr:nth-child(1) > td.sorting_1.dtr-control > a')",
				shadowHost);
		shadowElement.click();
	}

	public void addClient() {
		WebElement shadowHost = driver.findElement(By.cssSelector("#client-microapp"));
		WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].shadowRoot.querySelector('.btn.btn-primary.btn-filter')", shadowHost);
		shadowElement.click();
		//click(shadowElement);

	}

	public void typeclientname(String clientname) throws InterruptedException {
	
		
		String cssSelectorForHost1 = "#client-microapp";
		String script = "arguments[0].shadowRoot.querySelector('#Name').value = '" + clientname + "'";
		WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
		((JavascriptExecutor) driver).executeScript(script, hostElement);
		
		

	}

	public void typedescription(String description) throws InterruptedException {
	
		
		String cssSelectorForHost1 = "#client-microapp";
		String script = "arguments[0].shadowRoot.querySelector('#Description').value = '" + description + "'";
		WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
		((JavascriptExecutor) driver).executeScript(script, hostElement);

	}
	
public void selectfasbaccountingstandard() throws InterruptedException {
	
	

	String cssSelectorForHost1 = "#client-microapp";
	String script = "arguments[0].shadowRoot.querySelector('#IsGovernment').value = 'false'";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);


	}
	
public void selectgasbaccountingstandard() throws InterruptedException {
	

	String cssSelectorForHost1 = "#client-microapp";
	String script = "arguments[0].shadowRoot.querySelector('#IsGovernment').value = 'true'";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);


	}

public void lcvproductleasecrunch() throws InterruptedException {
	

	/*
	 * String cssSelectorForHost1 = "#client-microapp"; String script =
	 * "arguments[0].shadowRoot.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)').click()"
	 * ; WebElement hostElement =
	 * driver.findElement(By.cssSelector(cssSelectorForHost1));
	 * ((JavascriptExecutor) driver).executeScript(script, hostElement);
	 */

	String cssSelectorForHost1 = "#client-microapp";
	String script = "var shadow = arguments[0].shadowRoot; var radioBtn = shadow.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)'); radioBtn.checked = true;";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);

	
	}
	

public void lcproductleasecrunch() throws InterruptedException {
	

	/*
	 * String cssSelectorForHost1 = "#client-microapp"; String script =
	 * "arguments[0].shadowRoot.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)').click()"
	 * ; WebElement hostElement =
	 * driver.findElement(By.cssSelector(cssSelectorForHost1));
	 * ((JavascriptExecutor) driver).executeScript(script, hostElement);
	 */

	String cssSelectorForHost1 = "#client-microapp";
	String script = "var shadow = arguments[0].shadowRoot; var radioBtn = shadow.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)'); radioBtn.checked = true;";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);

	
	}


public void contracttypecommited() throws InterruptedException {
	

	String cssSelectorForHost1 = "#client-microapp";
	String script = "arguments[0].shadowRoot.querySelector('#ContractType').value = 'Committed'";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);


	}


public void contracttypepayasyougo() throws InterruptedException {
	

	String cssSelectorForHost1 = "#client-microapp";
	String script = "arguments[0].shadowRoot.querySelector('#ContractType').value = 'PayAsYouGo'";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);


	}


public void contractpricing(String pricing) {

	
	
	String cssSelectorForHost1 = "#client-microapp";
	String script = "arguments[0].shadowRoot.querySelector('#ContractPricing').value = '" + pricing + "'";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);
	
	
}


public void clientaccessallfirmusers() {
	
	String cssSelectorForHost1 = "#client-microapp";
	String script = "var shadow = arguments[0].shadowRoot; var radioBtn = shadow.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)'); radioBtn.checked = true;";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);

	
	
}



public void clientaccessallcustom() {
	
	String cssSelectorForHost1 = "#client-microapp";
	String script = "var shadow = arguments[0].shadowRoot; var radioBtn = shadow.querySelector('div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(10) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)'); radioBtn.checked = true;";
	WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	((JavascriptExecutor) driver).executeScript(script, hostElement);

	
	
}


public void saveclient() {
	
	
	
	
	  String cssSelectorForHost1 = "#client-microapp"; String script
	  ="arguments[0].shadowRoot.querySelector('#saveClient').click()"; WebElement
	  hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	  ((JavascriptExecutor) driver).executeScript(script, hostElement);
	 
	
	/*
	 * String cssSelectorForHost1 = "#client-microapp"; String script =
	 * "var form = arguments[0].shadowRoot.querySelector('#ClientModalForm'); form.dispatchEvent(new Event('submit', { bubbles: true, cancelable: false }))"
	 * ; WebElement hostElement =
	 * driver.findElement(By.cssSelector(cssSelectorForHost1));
	 * ((JavascriptExecutor) driver).executeScript(script, hostElement);
	 */
	 
	/*
	 * WebElement formElement = driver.findElement(By.
	 * cssSelector("#client-microapp form[name=\"clientModalForm\"]"));
	 * formElement.click();
	 */
}


public void cancelclient() {
	
	
	  String cssSelectorForHost1 = "#client-microapp";
	  String script ="arguments[0].shadowRoot.querySelector('#cancelClient').click()"; 
	  WebElement hostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
	  ((JavascriptExecutor) driver).executeScript(script, hostElement);
	 

}




}
