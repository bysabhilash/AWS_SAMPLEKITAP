package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1427
 * @date: 23/08/2022
 * @Description: This test script covers the creation of an images creation via UI
 */

public class ImagesCreationViaUI extends BaseTest  {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ImagesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ImagesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ImagesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        imageslistpage.clickninesymbol();

        imageslistpage.enterimages("Search apps and items...", data.get("Data_searchbar"));

        imageslistpage.clickimages();

        imageslistpage.clicknew("New");

        imageslistpage.setname("Name",data.get("Name"));

        imageslistpage.setimage("Image Orientation",data.get("Image Orientation"));

        imageslistpage.settitle("Title",data.get("Title"));

        imageslistpage.setaccessibilitytext("Accessibility Text",data.get("Accessibility Text"));
        
       // imageslistpage.seturl("URL",data.get("url"));

        imageslistpage.clickactive("Active");

        imageslistpage.setcategory("Category",data.get("Category"));

        imageslistpage.setimagetype("Image Type",data.get("Image Type"));

        imageslistpage.setfile("File",data.get("File"));

        imageslistpage.setcam("Camera Angle",data.get("Camera Angle"));

        imageslistpage.clicksave("Save");
    }
}
