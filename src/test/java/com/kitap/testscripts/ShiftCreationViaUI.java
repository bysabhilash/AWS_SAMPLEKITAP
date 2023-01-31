package com.kitap.testscripts;

import org.testng.SkipException; 
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1461
 * @date: 22/08/2022
 * @Description: This test script covers the creation of an shift creation via UI
 */

public class ShiftCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void ShiftCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ShiftCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "QuickTextCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        shiftpage.clickninesymbol();
        shiftpage.entershift("Search apps and items...", data.get("Data_searchbar"));
        shiftpage.clickshift();
        shiftpage.clickNew("New");
        shiftpage.setstarttime("Start Time",data.get("starttime"));
        shiftpage.setendtime("End Time",data.get("endtime"));
        shiftpage.setstatus("Status",data.get("status"));
        shiftpage.settimeslottype("Time Slot Type",data.get("typeoftimeslot"));
        shiftpage.enterworktypegroup("Work Type Group",data.get("groups"));
        //shiftpage.enterserviceterritory("Service Territory",data.get("serviceterritory"));
        shiftpage.enterserviceresource("Service Resource", data.get("serviceresources"));
        shiftpage.setlabel("Label",data.get("label"));
        shiftpage.clicksave("Save");
    }
}



