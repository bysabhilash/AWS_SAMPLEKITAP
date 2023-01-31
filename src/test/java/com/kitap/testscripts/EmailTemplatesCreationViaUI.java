package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 23/08/2022
 * @Description: This test script covers the creation of an email templates via UI
 */

public class EmailTemplatesCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void EmailTemplatesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("EmailTemplatesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "EmailTemplatesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        emailTemplatesListPage.clickninesymbol();

        emailTemplatesListPage.enterEmailTemplates("Search apps and items...", data.get("Data_searchbar"));

        emailTemplatesListPage.clickEmailTemplates();

        emailTemplatesListPage.clickNewEmailTemplate("New Email Template");

        emailTemplatesListPage.setEmailTemplateName("Email Template Name", data.get("Email Template Name"));

        emailTemplatesListPage.setDescription("Description", data.get("Description"));

        emailTemplatesListPage.setRelatedEntityType("Related Entity Type", data.get("Related Entity Type"));

        emailTemplatesListPage.setFolder("Folder", data.get("Folder"));

        emailTemplatesListPage.setSubject("Subject", data.get("Subject"));

        emailTemplatesListPage.savebutton("Save");

    }
}
