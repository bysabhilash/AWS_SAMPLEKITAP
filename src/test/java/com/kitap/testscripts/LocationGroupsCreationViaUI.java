package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 16/08/2022
 * @Description: This test script covers the creation of an location groups via UI
 */

public class LocationGroupsCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void LocationGroupsCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("LocationGroupsCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "LocationGroupsCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        locationGroupsListPage.clickninesymbol();

        locationGroupsListPage.enterLocationGroups("Search apps and items...",data.get("Data_searchbar"));

        locationGroupsListPage.clickLocationGroups();

        locationGroupsListPage.clickNew("New");

        locationGroupsListPage.setLocationGroupsNumber("Location Group Number", data.get("Location Group Number"));
 
        locationGroupsListPage.setExternalReference("External Reference", data.get("External Reference"));
        
        locationGroupsListPage.setDescription("Description", data.get("Description"));

        locationGroupsListPage.clickSync("Sync with OCI");

        locationGroupsListPage.clickEnabled("Enabled");

        locationGroupsListPage.savebutton("Save");

    }
}
