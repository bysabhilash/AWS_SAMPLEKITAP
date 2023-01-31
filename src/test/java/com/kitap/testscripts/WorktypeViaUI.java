package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;



public class WorktypeViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void WorktypeViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("WorktypeViaUI", excel))) {

            throw new SkipException("Skipping the test " + "WorktypeViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        worktype.clickninesymbol();

        worktype.enterWorktype("Search apps and items...",data.get("Data_searchbar"));

        worktype.WorkType();

        worktype.clicknew("New");

        worktype.typename("Work Type Name",data.get("work type name"));
        
        worktype.setdescription("Description", data.get("description"));

        worktype.selectOH("Operating Hours",data.get("operatinghours"));

        worktype.setestimatedduration("Estimated Duration",data.get("estimatedduration"));

        worktype.Durationtype("Duration Type",data.get("duration type"));

        worktype.blocktime("Block Time Before Appointment",data.get("blocktimebeforeappointment"));

        worktype.blocktimebefore("Block Time Before Unit",data.get("blocktimebeforeunit"));

        worktype.blocktimeafter("Block Time After Appointment",data.get("blocktimeafterappointment"));

        worktype.blocktimeafter2("Block Time After Unit",data.get("blocktimeafterunit"));

        worktype.Timeframe("Timeframe Start",data.get("timeframestart"));

        worktype.Timestart("Time Frame Start Unit",data.get("timeframestartunit"));

        worktype.Timeframe2("Timeframe End",data.get("timeframeend"));

        worktype.Timeend("Time Frame End Unit",data.get("timeframeendunit"));

        worktype.clicksavebutton("Save");

    }
}