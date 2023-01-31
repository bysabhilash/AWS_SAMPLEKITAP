package com.kitap.testscripts;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1461
 * @date: 13/07/2022
 * @Description: This test script covers the creation of an refunds  via UI
 */

public class RefundCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void RefundCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("RefundCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"RefundCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        refundpage.clickninesymbol();
        
        refundpage.enterrefunds("Search apps and items...",data.get("Data_searchbar"));
        
        refundpage.clickrefund();
       
        refundpage.clicknewbutton("New");
        
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
		 * driver.findElement(By.xpath("//a[text()='Refunds']")).click();
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath("//input[@title='New']")).click();
		 * Thread.sleep(2000);
		 */
        refundpage.selectaccountname("Account",data.get("accountname"));
        
        refundpage.selecttype("Type",data.get("type"));

        refundpage.selectprocessingmode("Processing Mode",data.get("processingmode"));
        
        refundpage.setamount("Amount",data.get("amount"));
        
        refundpage.selectstatus("Status",data.get("status"));
        
        refundpage.setdate("Date",data.get("date"));
 
        refundpage.setcomments("Comments",data.get("comments")); 
        
        refundpage.setcancellationdate("Cancellation Date",data.get("canceldate"));
        
        refundpage.setcancellationeffectivedate("Cancellation Effective Date",data.get("cancellationeffectivedatedate"));
 
        refundpage.selectresultcode("Salesforce ResultCode",data.get("salesforceresultcode"));
        
        refundpage.setcancellationresultcode("Cancellation Salesforce ResultCode",data.get("cancellationresultcode"));

        refundpage.setgatewatyresultcode("Gateway ResultCode",data.get("gatewayresultcode"));
        
        refundpage.setgatewatyreferncenumber("Gateway Reference Number",data.get("gatewayreferncenumber"));
        
        refundpage.setgatewaydate("Gateway Date",data.get("gatewaydate"));
        
        refundpage.setgatewatyresultcodedescription("Gateway ResultCode Description",data.get("gatewatresultdescription"));
        
        refundpage.setcancellationgatewayresultcode("Cancellation Gateway ResultCode",data.get("cancellationgatewaydescription"));
        
        refundpage.setcancellationgatewaydate("Cancellation Gateway Date",data.get("cancellationgatewaydate"));
        
        refundpage.setcancellationgatewayreferncenumber("Cancellation Gateway Reference Number",data.get("cancellationgatewayref-number"));
        
        refundpage.setmacaddress("MAC Address",data.get("mac"));
        
        refundpage.setphone("Phone",data.get("phone"));
        
        refundpage.setipaddress("IP Address",data.get("ipaddress"));
        
        refundpage.setauditmail("Audit Email",data.get("mail"));
            
        refundpage.clicksavebutton("Save");
    }
}




