package com.kitap.testscripts;

import org.testng.SkipException;

import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1444
 * @date: 22/07/2022
 * @Description: This test script covers the creation of an product via UI
 */

public class ProductCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void ProductCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ProductCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ProductCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        productlistpage.clickninesymbol();
        productlistpage.enterProducts("Search apps and items...", data.get("Data_searchbar"));
        productlistpage.clickProducts();
        productlistpage.clicknew("New");
        productlistpage.setProductname("Product Name",data.get("Productname"));
        productlistpage.setProductCode("Product Code",data.get("Productcode"));
        productlistpage.setActive("Active");
        productlistpage.setProductFamily("Product Family",data.get("ProductFamily"));
        productlistpage.setProductDescription("Product Description",data.get("ProductDescription"));
        productlistpage.clicksave("Save");
    }

}
