package com.kitap.pageobjects;
import org.openqa.selenium.By;          
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import kitap.SFPageBase;

 /*
 * @KT1444
 * @date: 13/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of account creation
 */

public class AccountListPage extends SFPageBase {
	
	
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Account\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement accounts;
	    
	    @FindBy(xpath = "//button[@name='SaveEdit']")
	    private WebElement save;


	    
	    
	 public AccountListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	 }
	 
	 public void clickninesymbol() throws InterruptedException {
	        try {

	            SFClick(ninesymbol);
	        } catch (Exception e) {
	            System.out.println("in catch");
	            
	        }
	    }
	 
	 
	 public void enteraccounts(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	            
	        }
	    }

	 
	 public void clickaccounts() throws InterruptedException {

	        SFClick(accounts);
	        waitForSFPagetoLoad();

	   }
	 
	 public void Accounts(String label) throws Exception {

	        clickbutton(label);
	        waitForSFPagetoLoad();

	   }
	 
	 
	 
	 

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs clicking on new button on the account's page
	 * @Param: accepts one argument label as input
	 * @return values: opens new accounts page
    */
	public void clicknew(String label) throws Exception {
		try{
			clickbutton(label);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch"+label);
		}

	}
	

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs enters account's name on the account's page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates account name
	 */
	public void setAccountname(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
    

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs searching for parent account name on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates parent account name
	 */
	public void setParentAccount(String label, String data) throws InterruptedException  
	{
		try {

			selectcombobox(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}


	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's number on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account number
	 */
	public void setAccountnumber(String label,String data) throws Exception {

		try {

			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's rating on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account rating
	 */
	public void setRating(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's phone on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account phone
	 */
	public void setPhone(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's phone on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account fax
	 */
	public void setFax(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's phone on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account website
	 */
	public void setWebsite(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's accountsite on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates account site
	 */
	public void setAccountsite(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's ticker symbol on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates ticker symbol
	 */
	public void setTickersymbol(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's type on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates type
	 */
	public void setType(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's Ownership on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates ownership
	 */
	public void setOwnership(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's Industry on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Industry
	 */
	public void setIndustry(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Employee count on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Employee count
	 */
	public void setEmployees(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Annual revenue on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates annual revenue
	 */
	public void setAnnualrevenue(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Sic code on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates sic code
	 */
	public void setSiccode(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Billing Street on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Billing street
	 */
	public void setBillingStreet(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Billing City on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Billing city
	 */
	public void setBillingCity(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Billing State or province on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Billing State or Province
	 */
	public void setBillingStateOrProvince(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Billing Zip or Postal code on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Billing Zip or Postal Code
	 */
	public void setBillingZiporPostalCode(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Billing Country on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Billing Country
	 */
	public void setBillingCountry(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Shipping Street on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Shipping Street
	 */
	public void setShippingStreet(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Shipping city on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Shipping City
	 */
	public void setShippingCity(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Shipping state or province on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Shipping state or province
	 */
	public void setShippingStateOrProvince(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Shipping zip or postal code on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Shipping zip or postal code
	 */
	public void setShippingZiporPostalCode(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Shipping Country on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Shipping Country
	 */
	public void setShippingCountry(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's Customer Priority on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Customer priority
	 */
	public void setCustomerPriority(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's SLA on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates SLA
	 */
	public void setSLA(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's SLA expiration date on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates SLA expiration date
	 */
	public void setSLAexpirationdate(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's SLA Serial number on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates SLA serial number
	 */
	public void setSLASerialnumber(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Number of Locations on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Number of Locations
	 */
	public void setNoofLocations(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's Upselling Opportunity on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Upselling Opportunity
	 */

	public void setUpsellopportunity(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting account's Active field on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Active field
	 */
	public void setActive(String label,String data) throws Exception {

		try{
			selectoption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs entering account's Description on the account's page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates Description
	 */
	public void setDescription(String label,String data) throws Exception {

		try {
			setText(label, data);
			waitForSFPagetoLoad();
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs clicking save button on  account's page
	 * @Param: accepts one argument i.e label
	 * @return values: saving record
	 */
	public void clicksave(String label) throws Exception {
		try{
			clickbutton(label);
			waitForSFPagetoLoad();
			
			
			
		}
		catch (Exception c)
		{
			System.out.println("In catch");
		}

	}
	
	public void clickdelete(String label) throws Exception {
		try{
			delete(label);
			waitForSFPagetoLoad();
			
		}
		catch (Exception c)
		{
			System.out.println("In catch"+label);
		}

	}
}
	
	