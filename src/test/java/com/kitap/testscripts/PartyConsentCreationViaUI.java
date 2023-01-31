package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class PartyConsentCreationViaUI extends BaseTest
{

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
        public void PartyConsentCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("PartyConsentCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "PartyConsentCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        partyconsentlistpage.clickninesymbol();
        partyconsentlistpage.enterPartyConsent("Search apps and items...",data.get("Data_searchbar"));
        partyconsentlistpage.clickPartyConsent();
        partyconsentlistpage.clicknew("New");
        partyconsentlistpage.setName("Name",data.get("name"));
        partyconsentlistpage.setParty("Party",data.get("party"));
        partyconsentlistpage.setAction("Action",data.get("action"));
        partyconsentlistpage.setBusinessbrand("Business Brand",data.get("businessbrand"));
        partyconsentlistpage.setPrivacyConsentStatus("Privacy Consent Status",data.get("privacyconsentstatus"));
        partyconsentlistpage.setEffectiveTo("Effective To",data.get("effectiveto"));
        partyconsentlistpage.setEffectiveFrom("Effective From",data.get("effectivefrom"));
        partyconsentlistpage.setConsentCaptureContactPointType("Consent Capture Contact Point Type",data.get("consentcapturecontactpointtype"));
        partyconsentlistpage.setConsentCaptureSource("Consent Capture Source",data.get("consentcapturesource"));
        partyconsentlistpage.setDoubleConsentCaptureDateTime("Double Consent Capture Date Time",data.get("doubleconsentcapturedatetime"));
        partyconsentlistpage.setConsentCaptureDateTime("Consent Capture Date Time",data.get("consentcapturedatetime"));
        partyconsentlistpage.clicksave("Save");
    }
}
