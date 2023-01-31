package com.kitap.testscripts;

import org.testng.SkipException; 
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1444
 * @date: 25/07/2022
 * @Description: This test script covers the creation of an return order creartion via UI
 */

public class ReturnOrderCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ReturnOrderCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ReturnOrderCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ReturnOrderCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        returnorderlistpage.clickninesymbol();
        returnorderlistpage.enterreturnorder("Search apps and items...",data.get("Data_searchbar"));
        returnorderlistpage.clickReturnOrder();
        returnorderlistpage.Newbutton("New");
        returnorderlistpage.setCase("Case",data.get("casesnumber"));
        returnorderlistpage.setAccount("Account",data.get("accountname"));
        returnorderlistpage.setPeople("Returned By",data.get("personname"));
        returnorderlistpage.setStatus("Status",data.get("Status"));
        returnorderlistpage.setContact("Contact",data.get("contactname"));
        returnorderlistpage.setShipmenttype("Shipment Type",data.get("Shipment Type"));
        returnorderlistpage.setAddress("Address",data.get("Address"));
        returnorderlistpage.setCity("City",data.get("City"));
        returnorderlistpage.setStateorProvince("State/Province",data.get("State/Province"));
        returnorderlistpage.setZiporPostal("Zip/Postal Code",data.get("Zip/Postal Code"));
        returnorderlistpage.setCountry("Country",data.get("Country"));
        returnorderlistpage.setDate("Date",data.get("Date"));
        returnorderlistpage.setDescription("Description",data.get("Description"));
        returnorderlistpage.clicksave("Save");

    }


}
