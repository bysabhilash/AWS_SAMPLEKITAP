package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class ServiceTerritoriesCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void ServiceTerritoriesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ServiceTerritoriesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ServiceTerritoriesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        serviceterritorylistpage.clickninesymbol();
        serviceterritorylistpage.enterServiceTerritories("Search apps and items...",data.get("Data_searchbar"));
        serviceterritorylistpage.clickServiceTerritories();
        serviceterritorylistpage.clicknew("New");
        serviceterritorylistpage.setName("Name",data.get("name"));
        serviceterritorylistpage.setParentTerritory("Parent Territory",data.get("parentterritory"));
        serviceterritorylistpage.setOperatingHour("Operating Hours",data.get("operatinghours"));
        serviceterritorylistpage.setActive("Active");
        serviceterritorylistpage.setAddress("Address",data.get("street"));
        serviceterritorylistpage.setCity("City",data.get("city"));
        serviceterritorylistpage.setZiporPostalcode("Zip/Postal Code",data.get("postalcode"));
        serviceterritorylistpage.setStateorProvince("State/Province",data.get("state"));
        serviceterritorylistpage.setCountry("Country",data.get("country"));
        serviceterritorylistpage.setDescription("Description",data.get("description"));
        serviceterritorylistpage.clicksave("Save");


    }

}

