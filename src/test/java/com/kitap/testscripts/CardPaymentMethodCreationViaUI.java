package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1444
 * @date: 22/08/2022
 * @Description: This test script covers the creation of card payment method via UI
 */

public class CardPaymentMethodCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void CardPaymentMethodCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("CardPaymentMethodCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "CardPaymentMethodCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        cardpaymentmethodlistpage.clickninesymbol();

        cardpaymentmethodlistpage.entercardpaymentmethods("Search apps and items...",data.get("Data_searchbar"));

        cardpaymentmethodlistpage.clickCardpaymentmethods();

        cardpaymentmethodlistpage.clicknew("New");

        cardpaymentmethodlistpage.setNickname("Nickname",data.get("nickname"));

        cardpaymentmethodlistpage.setInputcardnumber("Input Card Number",data.get("inputcardnumber"));

        cardpaymentmethodlistpage.setcardType("Card Type",data.get("cardtype"));

        cardpaymentmethodlistpage.setcardHoldername("Card Holder Name",data.get("cardholdername"));

        cardpaymentmethodlistpage.setExpiryMonth("Expiry Month",data.get("expirtmonth"));

        cardpaymentmethodlistpage.setcardCategory("Card Category",data.get("cardcategory"));

        cardpaymentmethodlistpage.setAutocardType("Auto Card Type",data.get("autocardtype"));

        cardpaymentmethodlistpage.setStatus("Status",data.get("status"));

        cardpaymentmethodlistpage.setExpiryYear("Expiry Year",data.get("expiryyear"));

        cardpaymentmethodlistpage.setExpiryMonth("Expiry Month",data.get("expirymonth"));

        cardpaymentmethodlistpage.setcardLastfour("Card Last Four",data.get("cardlastfour"));

        cardpaymentmethodlistpage.setCardBin("Card BIN",data.get("cardbin"));

        cardpaymentmethodlistpage.setStartYear("Start Year",data.get("startyear"));

        cardpaymentmethodlistpage.setStartmonth("Start Month",data.get("startmonth"));

        cardpaymentmethodlistpage.setCardHolderLastname("Card Holder Last Name",data.get("cardholderlastname"));

        cardpaymentmethodlistpage.setCardHolderfirstname("Card Holder First Name",data.get("cardholderfirstname"));

        cardpaymentmethodlistpage.setprocessingmode("Processing Mode",data.get("processingmode"));

        cardpaymentmethodlistpage.setGatewaytoken("GatewayToken",data.get("gatewaytoken"));

        cardpaymentmethodlistpage.setCompanyname("Company Name",data.get("companyname"));

        cardpaymentmethodlistpage.setAccount("Account",data.get("account"));

        cardpaymentmethodlistpage.setStreet("Street",data.get("street"));

        cardpaymentmethodlistpage.setComments("Comments",data.get("comments"));

        cardpaymentmethodlistpage.setcity("City",data.get("city"));

        cardpaymentmethodlistpage.setPostalcode("Postal Code",data.get("postalcode"));

        cardpaymentmethodlistpage.setState("State",data.get("state"));

        cardpaymentmethodlistpage.setCountry("Country",data.get("country"));

        cardpaymentmethodlistpage.setRegisteredCardEmail("Registered Card Email",data.get("registeredcardemail"));

        cardpaymentmethodlistpage.clicksave("Save");

    }

}
