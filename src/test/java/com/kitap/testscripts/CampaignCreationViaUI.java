package com.kitap.testscripts;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import kitap.SFPageBase;

public class CampaignCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void CampaignCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("CampaignCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "CampaignCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        lightningloginpage.applauncher("WorkOrder");
        campaignlistpage.clicknewbutton();
        campaignlistpage.setCampaignName("Campaign Name",data.get("Campaignname"));
        campaignlistpage.setActive("Active");
        campaignlistpage.setType("Type",data.get("Type"));
        campaignlistpage.setStatus("Status",data.get("Status"));
        campaignlistpage.setStartdate("Start Date",data.get("Startdate"));
        campaignlistpage.setEnddate("End Date",data.get("Enddate"));
        campaignlistpage.setExpectedRevenueinCampaign("Expected Revenue in Campaign",data.get("ExpectedRevenueinCampaign"));
        campaignlistpage.setBudgetcostinCampaign("Budgeted Cost in Campaign",data.get("BudgetedCostinCampaign"));
        campaignlistpage.setActualcostinCampaign("Actual Cost in Campaign",data.get("ActualCostinCampign"));
        campaignlistpage.setExpectedResponse("Expected Response (%)",data.get("ExpectedResponce"));
        campaignlistpage.setNumsetinCampaign("Num Sent in Campaign",data.get("Numsent"));
        campaignlistpage.setParentCampaign("Parent Campaign",data.get("Parentcampaign"));
        campaignlistpage.setDescription("Description",data.get("Description"));
        campaignlistpage.clicksave("Save");
    }
}
