package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class FinanceTransactionCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void FinanceTransactionCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("FinanceTransactionCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "FinanceTransactionCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);
        financetransactionlistpage.clickninesymbol();
        financetransactionlistpage.enterFinanceTransactions("Search apps and items...",data.get("Data_searchbar"));
        financetransactionlistpage.clickFinanceTransactions();
        financetransactionlistpage.clicknew("New");
        financetransactionlistpage.enterAccount("Account",data.get("account"));
        financetransactionlistpage.enterLegalEntities("Legal Entity",data.get("legalentity"));
        financetransactionlistpage.setreferenceEntity("Reference Entity",data.get("refernceentity"),data.get("refernceentitynumber"));
        financetransactionlistpage.setparentreferenceEntity("Parent Reference Entity",data.get("parententity"),data.get("parententitynumber"));
        financetransactionlistpage.setreferenceEntityType("Reference Entity Type",data.get("referenceentitytype"));
        financetransactionlistpage.setEventAction("Event Action",data.get("eventaction"));
        financetransactionlistpage.setEventType("Event Type",data.get("eventtype"));
        financetransactionlistpage.setTotalAmountwithTax("Total Amount With Tax",data.get("totalamountwithtax"));
        financetransactionlistpage.setChargeAmount("Charge Amount",data.get("chargeamount"));
        financetransactionlistpage.setSubtotal("Subtotal",data.get("subtotal"));
        financetransactionlistpage.setImpactAmount("Impact Amount",data.get("impactamount"));
        financetransactionlistpage.setResultingbalance("Resulting Balance",data.get("resultingbalance"));
        financetransactionlistpage.setAdjustmentAmount("Adjustment Amount",data.get("adjustmentamount"));
        financetransactionlistpage.setTaxAmount("Tax Amount",data.get("taxamount"));
        financetransactionlistpage.setTransactionDate("Transaction Date",data.get("transactiondate"));
        financetransactionlistpage.setEffectivedate("Effective Date",data.get("effectivedate"));
        financetransactionlistpage.setDuedate("Due Date",data.get("duedate"));
        financetransactionlistpage.setsourceEntity("Source Entity",data.get("sourceentity"),data.get("sourceentitynumber"));
        financetransactionlistpage.setdestinationEntity("Destination Entity",data.get("destinationentity"),data.get("destinationentitynumber"));
        financetransactionlistpage.setFinanceSystemName("Finance System Name",data.get("financesystemname"));
        financetransactionlistpage.setFinanceSystemIntegrationMode("Finance System Integration Mode",data.get("financesystemintegrationmode"));
        financetransactionlistpage.setFinanceSystemTransactionNumber("Finance System Transaction Number",data.get("financesystemtransactionnumber"));
        financetransactionlistpage.setFinanceSystemIntegrationStatus("Finance System Integration Status",data.get("financesystemintegrationstatus"));
        financetransactionlistpage.clicksave("Save");

    }
}
