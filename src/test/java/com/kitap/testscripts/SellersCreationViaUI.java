package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
@KTV1296
@date: 23/08/2022
@Description: This page object covers methods for all the fields in Sellers
*/
public class SellersCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void SellersCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("SellersCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "SellersCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        sellerslistpage.clickninesymbol();
        sellerslistpage.enterSellers("Search apps and items...",data.get("Data_searchbar"));
        sellerslistpage.ClickSellers();
        sellerslistpage.Newbutton("New");
        sellerslistpage.selectParty("Party",data.get("Party"));
        sellerslistpage.setName("Name",data.get("Name"));
        sellerslistpage.sellerType("Seller Type",data.get("Seller Type"));
        sellerslistpage.sellerTier("Seller Tier",data.get("Seller Tier"));
        sellerslistpage.SalesAmount("Sales Amount",data.get("Sales Amount"));
        sellerslistpage.setactivedate("Active To Date",data.get("activedate"));
        sellerslistpage.setactivefromdate("Active From Date",data.get("activefromdate"));
        sellerslistpage.clicksavebutton("Save");


    }
}
