package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class OrderCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void OrderCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("OrderCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "OrderCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }


        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        lightningloginpage.applauncher("Order");
        orderlistpage.clickSFbutton("New");
        orderlistpage.setAccountname(data.get("accountname"));
        orderlistpage.setOrderStartdate("Order Start Date",data.get("orderstartdate"));
        orderlistpage.setContractnumber(data.get("contractnumber"));
        orderlistpage.setStatus("Status",data.get("status"));
        orderlistpage.setShippingStreet("Shipping Street", data.get("ShippingStreet"));
        orderlistpage.setShippingCity("Shipping City", data.get("Shippingcity"));
        orderlistpage.setShippingStateOrProvince("Shipping State/Province", data.get("ShippingStateorProvince"));
        orderlistpage.setShippingZiporPostalCode("Shipping Zip/Postal Code", data.get("ShippingZipOrPostalCode"));
        orderlistpage.setShippingCountry("Shipping Country", data.get("ShippingCountry"));
        orderlistpage.setCustomerAuthorizedby(data.get("contactname"));
        orderlistpage.setCompanyAuthorizedby(data.get("authorizedperson"));
        orderlistpage.setBillingStreet("Billing Street", data.get("BillingStreet"));
        orderlistpage.setBillingCity("Billing City", data.get("Billingcity"));
        orderlistpage.setBillingStateOrProvince("Billing State/Province", data.get("BillingStateorProvince"));
        orderlistpage.setBillingZiporPostalCode("Billing Zip/Postal Code", data.get("BillingZiporPostalCode"));
        orderlistpage.setBillingCountry("Billing Country", data.get("BillingCountry"));
        orderlistpage.setDescription("Description", data.get("Description"));
        orderlistpage.save("Save");

    }
}
