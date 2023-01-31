package com.kitap.testscripts;
import java.util.Hashtable;

import com.kitap.base.BaseTest;
import com.kitap.utilities.TestUtil;

import org.testng.SkipException;
import org.testng.annotations.Test;

/*
 * @KTV1362
 * @date: 22/08/2022
 * @Description: This test script covers the creation of an contact request via UI
 */

public class ContactRequestCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ContactRequestCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(TestUtil.isTestRunnable("ContactRequestCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ContactRequestCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        contactRequestListPage.clickninesymbol();

        contactRequestListPage.enterContactRequest("Search apps and items...", data.get("Data_searchbar"));

        contactRequestListPage.clickContactRequest();

        contactRequestListPage.clickNew("New");

        contactRequestListPage.enterRequestedBy("Requested By", data.get("Requested By"));

        contactRequestListPage.entRelatedTo("Related To", data.get("Related To"));
        
        contactRequestListPage.setprefferedchannel("Preferred Channel", data.get("preferredchannel"));

        contactRequestListPage.setPreferredPhoneNumber("Preferred Phone Number", data.get("Preferred Phone Number"));

        contactRequestListPage.setRequestStatus("Request Status", data.get("Request Status"));

        contactRequestListPage.setRequestReason("Request Reason", data.get("Request Reason"));

        contactRequestListPage.setDescription("Request Description", data.get("Request Description"));

        contactRequestListPage.savebutton("Save");
    }
}
