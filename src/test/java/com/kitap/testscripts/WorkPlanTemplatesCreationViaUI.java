package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 17/08/2022
 * @Description: This test script covers the creation of an work plan templates via UI
 */

public class WorkPlanTemplatesCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void WorkPlanTemplatesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("WorkPlanTemplatesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "WorkPlanTemplatesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        workPlanTemplatesListPage.clickninesymbol();

        workPlanTemplatesListPage.enterWorkPlanTemplates("Search apps and items...",data.get("Data_searchbar"));

        workPlanTemplatesListPage.clickWorkPlanTemplates();

        workPlanTemplatesListPage.clickNew("New");

        workPlanTemplatesListPage.setName("Name", data.get("Name"));

        workPlanTemplatesListPage.setRelativeExecutionOrder("Relative Execution Order", data.get("Relative Execution Order"));

        workPlanTemplatesListPage.setDescription("Description", data.get("Description"));

        workPlanTemplatesListPage.clickActive("Active");

        workPlanTemplatesListPage.savebutton("Save");

    }
}
