package com.kitap.testscripts;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;



public class OperatinghoursviaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void OperatinghoursviaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("OperatinghoursviaUI", excel))) {

            throw new SkipException("Skipping the test " + "OperatinghoursviaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        operatinghours.clickninesymbol();

        operatinghours.enterOperatinghours("Search apps and items...",data.get("Data_searchbar"));

        operatinghours.OperatingHours1();

        operatinghours.clicknew("New");

        operatinghours.name("Name", data.get("name"));

        operatinghours.description("Description",data.get("description"));

        operatinghours.Timezone("Time Zone",data.get("time zone"));

        operatinghours.clickadd("Add Row");

        operatinghours.Day("Day",data.get("day"));

        operatinghours.Starttime("Start Time",data.get("start time"));

        operatinghours.Endtime("End Time",data.get("end time"));

        operatinghours.clicksave("Save");

    }


}
