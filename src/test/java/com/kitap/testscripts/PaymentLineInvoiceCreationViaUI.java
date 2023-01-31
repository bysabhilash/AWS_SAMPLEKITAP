package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class PaymentLineInvoiceCreationViaUI extends BaseTest
{

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void PaymentLineInvoiceCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("PaymentLineInvoiceCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "PaymentLineInvoiceCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);
        paymentlineinvoicelistpage.clickninesymbol();
        paymentlineinvoicelistpage.enterPaymentlineInvoice("Search apps and items...",data.get("Data_searchbar"));
        paymentlineinvoicelistpage.clickPaymentLineInvoice();
        paymentlineinvoicelistpage.clicknew("New");
        paymentlineinvoicelistpage.setPayment("Payment",data.get("payment"));
        paymentlineinvoicelistpage.setHasbeenUnapplied("Has Been Unapplied",data.get("hasbeenunapplied"));
        paymentlineinvoicelistpage.setType("Type",data.get("type"));
        paymentlineinvoicelistpage.setPayment("Invoice",data.get("invoice"));
        paymentlineinvoicelistpage.setcomments("Comments",data.get("comments"));
        paymentlineinvoicelistpage.setAmount("Amount",data.get("amount"));
        paymentlineinvoicelistpage.setAssociateAccount("Associated Account",data.get("associatedaccount"));
        paymentlineinvoicelistpage.setAssociatePaymentLineInvoice("Associated Payment Line Invoice",data.get("associatedpaymentlineinvoice"));
        paymentlineinvoicelistpage.setDate("Date",data.get("date"));
        paymentlineinvoicelistpage.setAppliedDate("Applied Date",data.get("applieddate"));
        paymentlineinvoicelistpage.setUnappliedDate("Unapplied Date",data.get("unapplieddate"));
        paymentlineinvoicelistpage.clicksave("Save");


    }

}
