package com.kitap.testscripts;

import java.util.Hashtable;      

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;


/*
 * @KT1444
 * @date: 13/07/2022
 * @Description: This test script covers the creation of an account via UI
 */

public class AccountCreationViaUI extends BaseTest {

	@Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
	public void AccountCreationViaUI(Hashtable<String, String> data) throws Exception {

		if (!(com.kitap.utilities.TestUtil.isTestRunnable("AccountCreationViaUI", excel))) {

			throw new SkipException("Skipping the test " + "AccountCreationViaUI".toUpperCase() + "as the Run mode is NO");
		}
		ExtentManager.createTest("AccountCreationViaUI","SalesforceDemo").assignAuthor("KT1461").assignCategory("Smoke").assignDevice("Chrome");
	    lightningloginpage.openHomepage(SFBaseURL);
	
		lightningloginpage.login(SFUserId, SFPassword);
		
		//lightningloginpage.applauncher("Account");
		
		accountlistpage.clickninesymbol();
		
		accountlistpage.enteraccounts("Search apps and items...", data.get("Data_searchbar"));
		
		accountlistpage.clickaccounts();
		
		accountlistpage.Accounts("Accounts");
		
		accountlistpage.clicknew("New");
		
		accountlistpage.setAccountname("Account Name", data.get("accountname"));
	  		
		//  accountlistpage.setParentAccount("Parent Account",data.get("parentaccount"));
		  
		  accountlistpage.setAccountnumber("Account Number",data.get("Accountnumber"));
		  
		  accountlistpage.setRating("Rating",data.get("rating"));
		  
		  accountlistpage.setPhone("Phone", data.get("phone"));
		  
		  accountlistpage.setFax("Fax", data.get("fax"));
		  
		  accountlistpage.setWebsite("Website", data.get("website"));
		  
		  accountlistpage.setAccountsite("Account Site", data.get("accountsite"));
		  
		  accountlistpage.setTickersymbol("Ticker Symbol", data.get("tickersymbol"));
		  
		  accountlistpage.setType("Type",data.get("type"));
		  
		  accountlistpage.setOwnership("Ownership",data.get("ownership"));
		  
		  accountlistpage.setIndustry("Industry",data.get("industry"));
		  
		  accountlistpage.setEmployees("Employees", data.get("employees"));
		  
		  accountlistpage.setAnnualrevenue("Annual Revenue",data.get("annualrevenue"));
		  
		  accountlistpage.setSiccode("SIC Code", data.get("sic_code"));
		  
		  accountlistpage.setBillingStreet("Billing Street",data.get("BillingStreet"));
		  
		  accountlistpage.setBillingCity("Billing City",data.get("Billingcity"));
		  
		  accountlistpage.setBillingStateOrProvince("Billing State/Province",data.get("BillingStateorProvince"));
		  
		  accountlistpage.setBillingZiporPostalCode("Billing Zip/Postal Code",data.get("BillingZiporPostalCode"));
		  
		  accountlistpage.setBillingCountry("Billing Country",data.get("BillingCountry"));
		  
		  accountlistpage.setShippingStreet("Shipping Street",data.get("ShippingStreet"));
		  
		  accountlistpage.setShippingCity("Shipping City",data.get("Shippingcity"));
		  
		  accountlistpage.setShippingStateOrProvince("Shipping State/Province",data.get("ShippingStateorProvince"));
		  
		  accountlistpage.setShippingZiporPostalCode("Shipping Zip/Postal Code",data.get("ShippingZipOrPostalCode"));
		  
		  accountlistpage.setShippingCountry("Shipping Country",data.get("ShippingCountry"));
		  
		  accountlistpage.setCustomerPriority("Customer Priority",data.get("customerpriority"));
		  
		  accountlistpage.setSLA("SLA",data.get("sla"));
		  
		  accountlistpage.setSLAexpirationdate("SLA Expiration Date",data.get("slaexpirationdate"));
		  
		  accountlistpage.setSLASerialnumber("SLA Serial Number",data.get("slaserialnumber"));
		  
		  accountlistpage.setNoofLocations("Number of Locations",data.get("NumberofLocations"));
		  
		  accountlistpage.setUpsellopportunity("Upsell Opportunity",data.get("opportunity"));
		  
		  accountlistpage.setActive("Active",data.get("active"));
		  
		  accountlistpage.setDescription("Description",data.get("Description"));
		 
		accountlistpage.clicksave("Save");
		
		accountlistpage.clickdelete("Delete");

		
}
}
