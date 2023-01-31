package com.kitap.testscripts;

import java.util.Hashtable;   

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class PaymentCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void PaymentCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("PaymentCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"PaymentCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        paymentpage.clickninesymbol();
        
        paymentpage.setText("Search apps and items...",data.get("Data_searchbar"));
        
        paymentpage.clickpayments();
       
        paymentpage.clicknewbutton("New");
 
        paymentpage.selectaccountname("Account",data.get("accountname"));

        paymentpage.selectprocessingmode("Processing Mode",data.get("processingmode"));
        
        paymentpage.setdate("Date",data.get("date"));
        
        paymentpage.setamount("Amount",data.get("amount"));
        
        paymentpage.selectstatus("Status",data.get("status"));
        
        paymentpage.selecttype("Type",data.get("type"));
        
        paymentpage.seteffectivedate("Effective Date",data.get("effectivedate"));
 
        paymentpage.setcomments("Comments",data.get("comments")); 
        
        paymentpage.setcancellationdate("Cancellation Date",data.get("canceldate"));
        
        paymentpage.setcancellationeffectivedate("Cancellation Effective Date", data.get("cancellationeffectivedatedate"));
 
        paymentpage.selectresultcode("Salesforce ResultCode",data.get("salesforceresultcode"));
        
        paymentpage.setcancellationresultcode("Cancellation Salesforce ResultCode",data.get("cancellationresultcode"));

        paymentpage.setgatewatyresultcode("Gateway ResultCode",data.get("gatewayresultcode"));
        
        paymentpage.setgatewatyreferncenumber("Gateway Reference Number",data.get("gatewayreferncenumber"));
        
        paymentpage.setgatewaydate("Gateway Date", data.get("gatewaydate"));
        
        paymentpage.setgatewatyresultcodedescription("Gateway ResultCode Description",data.get("gatewatresultdescription"));
        
        paymentpage.setgatewatyreferncedetails("Gateway Reference Details", data.get("gatewaydetails"));
        
        paymentpage.setcancellationgatewayresultcode("Cancellation Gateway ResultCode",data.get("cancellationgatewaydescription"));
        
        paymentpage.setcancellationgatewaydate("Cancellation Gateway Date", data.get("cancellationgatewaydate"));
        
        paymentpage.setcancellationgatewayreferncenumber("Cancellation Gateway Reference Number",data.get("cancellationgatewayref-number"));
        
        paymentpage.setmacaddress("MAC Address",data.get("mac"));
        
        paymentpage.setphone("Phone",data.get("phone"));
        
        paymentpage.setipaddress("IP Address",data.get("ipaddress"));
        
        paymentpage.setauditmail("Audit Email",data.get("mail"));
            
        refundpage.clicksavebutton("Save");
    }
}







