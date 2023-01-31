package com.kitap.testscripts;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;


/*
 * @KT1461
 * @date: 24/08/2022
 * @Description: This test script covers the creation of an BankingManagemeny via UI
 */

public class BankingManagementCreationViaUI extends BaseTest {

	@Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
	public void BankingManagementCreationViaUI(Hashtable<String, String> data) throws Exception {

		if (!(com.kitap.utilities.TestUtil.isTestRunnable("BankingManagementCreationViaUI", excel))) {

			throw new SkipException("Skipping the test " + "BankingManagementCreationViaUI".toUpperCase() + "as the Run mode is NO");
		}
		ExtentManager.createTest("BankingManagementCreationViaUI","SalesforceDemo").assignAuthor("KT1451").assignCategory("Regression").assignDevice("Chrome");
		ExtentManager.log("Starting BankingManagementCreationViaUI ...");
	    lightningloginpage.openHomepage(SFBaseURL);

		lightningloginpage.login(SFUserId, SFPassword);
		
		/*
		 * driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//a[normalize-space()='Switch to Salesforce Classic']")).click();
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath("//a[text()='Banking Management']")).click();
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath("//input[@title='New']")).click();
		 * Thread.sleep(2000);
		 */
		
		  bankingmanagement.clickninesymbol();
		  
		  bankingmanagement.enterWorktype("Search apps and items...",data.get("Data_searchbar"));
		  
		  bankingmanagement.clickbankingmanagement();
		  
		  bankingmanagement.Bankingmanagement("Banking Management");
		 
		bankingmanagement.clicknew("New");

		bankingmanagement.setbankingname("Banking Name", data.get("bankname"));

		bankingmanagement.clickindian("Indian");

		bankingmanagement.selectservices("Services", data.get("Services"));

		bankingmanagement.setdate("Date",data.get("date"));

		bankingmanagement.setTelePhone("Telephone", data.get("phone"));

		bankingmanagement.setcustomerfirstname("Customer First Name", data.get("customerfirstname"));

		bankingmanagement.setcustomerlastname("Customer Last Name", data.get("customerlastname"));

		bankingmanagement.setAnnualincome("Annual Income",data.get("income"));
		
		bankingmanagement.setaddress("Customer Address", data.get("address"));

		bankingmanagement.setzipcode("Zip Code",data.get("code"));

		bankingmanagement.setCity("City",data.get("city"));
		
		bankingmanagement.setnominee("Nominee", data.get("nominee"));

		bankingmanagement.setState("State", data.get("state"));

		bankingmanagement.setCountry("Country", data.get("country"));

		bankingmanagement.clicksave("Save");

		
}
}



