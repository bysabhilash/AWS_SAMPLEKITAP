package com.kitap.testscripts;

import org.testng.SkipException; 
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1444
 * @date: 27/07/2022
 * @Description: This test script covers the creation of an alternativepaymentr creartion via UI
 */

public class AlternativePaymentCreationViaUI extends BaseTest
{
    @Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

    public void AlternativePaymentCreationViaUI(Hashtable<String,String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("AlternativePaymentCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "AlternativePaymentCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        alternativepaymentlistpage.clickninesymbol();
        alternativepaymentlistpage.enteralternativepayment("Search apps and items...",data.get("Data_searchbar"));
        alternativepaymentlistpage.clickAlternativepayments();
        alternativepaymentlistpage.Newbutton("New");
        alternativepaymentlistpage.setNickname("Nickname",data.get("Nickname"));
        alternativepaymentlistpage.setRegisterdEmail("Registered Email",data.get("Registered Email"));
        alternativepaymentlistpage.setAccount("Account",data.get("accountname"));
        alternativepaymentlistpage.setStatus("Status",data.get("Status"));
        alternativepaymentlistpage.setProcessingmode("Processing Mode",data.get("Processing Mode"));
        alternativepaymentlistpage.setAutopay("Auto Pay");
        alternativepaymentlistpage.setGatewayToken("Gateway Token",data.get("Gateway Token"));
        alternativepaymentlistpage.setGatewayTokenDetails("Gateway Token Details",data.get("Gateway token details"));
        alternativepaymentlistpage.setCompanyname("Company Name",data.get("Company name"));
        alternativepaymentlistpage.setStreet("Street",data.get("Street"));
        alternativepaymentlistpage.setCity("City",data.get("City"));
        alternativepaymentlistpage.setState("State",data.get("State"));
        alternativepaymentlistpage.setPostalCode("Postal Code",data.get("Postal code"));
        alternativepaymentlistpage.setcountry("Country",data.get("Country"));
        alternativepaymentlistpage.setComments("Comments",data.get("Comments"));
        alternativepaymentlistpage.setMACAddress("MAC Address",data.get("MAC Address"));
        alternativepaymentlistpage.setIPAddress("IP Address",data.get("IP Address"));
        alternativepaymentlistpage.setPhone("Phone",data.get("Phone"));
        alternativepaymentlistpage.setAuditEmail("Audit Email",data.get("Audit Email"));
        alternativepaymentlistpage.clicksave("Save");


    }

}
