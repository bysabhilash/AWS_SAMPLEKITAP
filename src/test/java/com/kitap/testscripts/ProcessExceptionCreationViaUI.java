package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class ProcessExceptionCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void ProcessExceptionCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ProcessExceptionCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ProcessExceptionCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        processexceptionlistpage.clickninesymbol();
        processexceptionlistpage.enterProcessException("Search apps and items...", data.get("Data_searchbar"));
        processexceptionlistpage.clickProcessexception();
        processexceptionlistpage.clicknew("New");
        processexceptionlistpage.setStatus("Status",data.get("status"));
        processexceptionlistpage.setSeverity("Severity",data.get("severity"));
        processexceptionlistpage.setCategory("Category",data.get("category"));
        processexceptionlistpage.setPriority("Priority",data.get("priority"));
        processexceptionlistpage.setMessage("Message",data.get("message"));
        processexceptionlistpage.setDescription("Description",data.get("description"));
        processexceptionlistpage.setCase("Case",data.get("cases"));
        processexceptionlistpage.setExternalReference("External Reference",data.get("externalreference"));
        processexceptionlistpage.clicksave("Save");
    }

}
