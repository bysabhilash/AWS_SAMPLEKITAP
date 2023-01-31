package com.kitap.testscripts;

import java.util.Hashtable ;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1461
 * @date: 20/07/2022
 * @Description: This test script covers the creation of an entitlement via UI
 */

public class EntitlementCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void EntitlementCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("EntitlementCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"EntitlementCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
    //    entitlementpage.clickninesymbol();
        
    //    entitlementpage.enterentitlement("Search apps and items...",data.get("Data_searchbar"));
        
    //    entitlementpage.Entitlement();
        
    //    entitlementpage.clicknewbutton("New");
        
        driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
        Thread.sleep(3000);

       driver.findElement(By.xpath("//a[normalize-space()='Switch to Salesforce Classic']")).click();
        Thread.sleep(6000);

       driver.findElement(By.xpath("//a[text()='Entitlements']")).click();
        Thread.sleep(6000);

       driver.findElement(By.xpath("//input[@title='New']")).click();
        Thread.sleep(2000);
        
        entitlementpage.setEntitlename("Entitlement Name", data.get("entitlementnames"));
        
        entitlementpage.settype("Type", data.get("type"));
        
        entitlementpage.setaccountname("Account Name",data.get("accountname"));
        
        entitlementpage.setassetname("Asset Name",data.get("assetname"));
        
        entitlementpage.clickincident("Per Incident");
        
        entitlementpage.setcasesentitlement("Cases Per Entitlement",data.get("cases"));
        
        entitlementpage.setstartdate("Start Date", data.get("startdate"));
        
        entitlementpage.setenddate("End Date", data.get("enddate"));
		
        entitlementpage.setremainingcases("Remaining Cases", data.get("remainingcases"));
		  
        entitlementpage.clicksavebutton("Save");

    }
}
