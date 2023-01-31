package com.kitap.testscripts;


import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class ChangeRequestCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ChangeRequestCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ChangeRequestCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ChangeRequestCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        changerequestlistpage.clickninesymbol();
        changerequestlistpage.enterChangeRequest("Search apps and items...",data.get("Data_searchbar"));
        changerequestlistpage.clickchangerequest();
        changerequestlistpage.clicknew();
        changerequestlistpage.setSubject("Subject",data.get("Subject"));
        changerequestlistpage.setDescription("Description",data.get("description"));
        changerequestlistpage.setStatus("Status",data.get("status"));
        changerequestlistpage.setPriority("Priority",data.get("priority"));
        changerequestlistpage.setImpact("Impact",data.get("impact"));
        changerequestlistpage.setRisklevel("Risk Level",data.get("risklevel"));
        changerequestlistpage.setTypeofChange("Type of Change",data.get("typeofchange"));
        changerequestlistpage.enterReviewer("Reviewer",data.get("reviewer"));
        changerequestlistpage.setReviewedon_Date("Reviewed On",data.get("reviewedon"));
        changerequestlistpage.setFinalReviewnotes("Final Review Notes",data.get("finalreviewnotes"));
        changerequestlistpage.setBusinessJustification("Business Justification",data.get("businessjustification"));
        changerequestlistpage.setImpactAnalysis("Impact Analysis",data.get("impactanalysis"));
        changerequestlistpage.setRemediationPlan("Remediation Plan",data.get("remediationplan"));
        changerequestlistpage.setStartDate("Start Time (Estimated)",data.get("starttime"));
        changerequestlistpage.setEndDate("End Time (Estimated)",data.get("endtime"));
        changerequestlistpage.clicksave("Save");

    }
}
