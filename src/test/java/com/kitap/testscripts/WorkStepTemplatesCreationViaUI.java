package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTH1398
 * @date: 22/08/2022
 * @Description: This test script covers the creation of an  Work Step Templates via UI
 */
public class WorkStepTemplatesCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void WorkStepTemplatesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("WorkStepTemplatesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "WorkStepTemplatesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        worksteptemplateslistpage.clickninesymbol();
        worksteptemplateslistpage.WorkStepTemplates("Search apps and items...",data.get("Data_searchbar"));
        worksteptemplateslistpage.clickWorkStepTemplates();
        worksteptemplateslistpage.clickNew("New");
        worksteptemplateslistpage.setName("Name",data.get("Name"));
        worksteptemplateslistpage.selectActionDefinition("Action Definition",data.get("Action Definition"));
        worksteptemplateslistpage.clickActive("Active");
        worksteptemplateslistpage.setDescription("Description",data.get("Description"));
        worksteptemplateslistpage.clickSave("Save");

    }
}



