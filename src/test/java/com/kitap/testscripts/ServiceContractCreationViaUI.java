package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class ServiceContractCreationViaUI extends BaseTest
{

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void ServiceContractCreationViaUI(Hashtable<String, String> data) throws Exception
    {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ServiceContractCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ServiceContractCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        servicecontractlistpage.clickninesymbol();
        servicecontractlistpage.enterServiceContract("Search apps and items...", data.get("Data_searchbar"));
        servicecontractlistpage.clickServiceContract();
        servicecontractlistpage.clicknew("New");
        servicecontractlistpage.setContractname("Contract Name", data.get("contractname"));
        servicecontractlistpage.setDescription("Description",data.get("Description"));
        servicecontractlistpage.setStartdate("Start Date",data.get("startdate"));
        servicecontractlistpage.setEnddate("End Date",data.get("enddate"));
        servicecontractlistpage.setTerm("Term (months)",data.get("term"));
        servicecontractlistpage.setSpecialTerms("Special Terms",data.get("specialterms"));
        servicecontractlistpage.setAccount("Account",data.get("account"));
        servicecontractlistpage.setContact("Contact",data.get("contact"));
        servicecontractlistpage.setShippingandHandling("Shipping and Handling",data.get("shippingandHandling"));
        servicecontractlistpage.setTax("Tax",data.get("tax"));
        servicecontractlistpage.setBillingStreet("Billing Street", data.get("BillingStreet"));
        servicecontractlistpage.setBillingCity("Billing City", data.get("Billingcity"));
        servicecontractlistpage.setBillingState("Billing State", data.get("BillingState"));
        servicecontractlistpage.setBillingZip("Billing Zip", data.get("BillingZip"));
        servicecontractlistpage.setBillingCountry("Billing Country", data.get("BillingCountry"));
        servicecontractlistpage.setShippingStreet("Shipping Street", data.get("ShippingStreet"));
        servicecontractlistpage.setShippingCity("Shipping City", data.get("Shippingcity"));
        servicecontractlistpage.setShippingState("Shipping State", data.get("ShippingState"));
        servicecontractlistpage.setShippingZip("Shipping Zip", data.get("ShippingZip"));
        servicecontractlistpage.setShippingCountry("Shipping Country", data.get("ShippingCountry"));
        servicecontractlistpage.clicksave("Save");




    }
}

