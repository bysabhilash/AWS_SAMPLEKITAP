package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 18/08/2022
 * @Description: This test script covers the creation of an scorecards via UI
 */

public class ScoreCardsCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ScoreCardsCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ScoreCardsCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ScoreCardsCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        scoreCardsListPage.clickninesymbol();

        scoreCardsListPage.enterScoreCards("Search apps and items...", data.get("Data_searchbar"));

        scoreCardsListPage.clickScoreCards();

        scoreCardsListPage.clickNew("New");

        scoreCardsListPage.setName("Name", data.get("Name"));

        scoreCardsListPage.setDescription("Description", data.get("Description"));

        scoreCardsListPage.savebutton("Save");
    }
}
