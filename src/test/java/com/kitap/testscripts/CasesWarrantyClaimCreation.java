package com.kitap.testscripts;

import java.util.Hashtable; 

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;
import com.kitap.utilities.Sendmail;

public class CasesWarrantyClaimCreation extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void CasesWarrantyClaimCreation(Hashtable<String, String> data) throws Throwable {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("CasesWarrantyClaimCreation", excel))) {

            throw new SkipException("Skipping the test " + "CasesWarrantyClaimCreation".toUpperCase() + "as the Run mode is NO");
        }
        ExtentManager.createTest("CasesWarrantyClaimCreation","SalesforceDaikinDemo").assignAuthor("KT1461").assignCategory("Smoke").assignDevice("Chrome");
        ExtentManager.log("Starting CasesWarrantyClaimCreation ...");
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        //caseswarrantyclaimpage.loginvalidation("Cases");
        caseswarrantyclaimpage.clicknew("New");
        caseswarrantyclaimpage.scrolling();
        caseswarrantyclaimpage.clickwarrantyclaim();
        caseswarrantyclaimpage.clicknext("Next");
        caseswarrantyclaimpage.warrantypagevalidation("New Case: Warranty Claim Authorization","New Case: Warranty Claim Authorization");
        //caseswarrantyclaimpage.setasteasv("Astea SV", data.get("Astea Sv"));
        caseswarrantyclaimpage.setsubject("Subject", data.get("Subject"));
        caseswarrantyclaimpage.selectcontact("Contact Name", data.get("Contact Name"));
        caseswarrantyclaimpage.selectaccountname("Account Name", data.get("Account Name"));
        caseswarrantyclaimpage.setdate("Date of Failure", data.get("Date Of Failure"));
        caseswarrantyclaimpage.setinquirydate("Original Inquiry Date/Time", data.get("Original Inquiry Date/Time"));
        caseswarrantyclaimpage.setreason("Reason for Authorization Request", data.get("Reason For Authroisation Request"));
        caseswarrantyclaimpage.setfailureresolution("Failure Resolution & Preventative Action", data.get("Failure Resolution & Preventive Action"));
        caseswarrantyclaimpage.setapprovalreason("Approval Notes", data.get("Approval Notes"));
        caseswarrantyclaimpage.setoriginalamount("Original Request Amount", data.get("Original Request"));
        caseswarrantyclaimpage.setapprovalquery("Approval Comments", data.get("Approval Comment"));
        caseswarrantyclaimpage.setdenialreasons("Reason for Denial", data.get("Reason For Denial"));
        caseswarrantyclaimpage.setcustomernotes("Customer Notes", data.get("Customer Notes"));
        caseswarrantyclaimpage.setrejectnotes("Reject Comments", data.get("Reject Comments"));
        caseswarrantyclaimpage.selectflagchecker("Flag Checker", data.get("FlagChecker"));
        caseswarrantyclaimpage.setreopeneddate("Date/Time Re-Opened", data.get("Date/Time Re-Opened"));
        caseswarrantyclaimpage.selectcaseorigin("Case Origin", data.get("caseorigin"));
        caseswarrantyclaimpage.selectpriority("Priority", data.get("Priority"));
        caseswarrantyclaimpage.selectcasecategory("Case Category", data.get("casecategory"));
        caseswarrantyclaimpage.selectstatus("Status", data.get("Status"));
        caseswarrantyclaimpage.clickworkcompleted("Work Already Completed");
        caseswarrantyclaimpage.clicksenttoquality("Sent to Quality");
        caseswarrantyclaimpage.clickimagesincluded("Images Included");
        caseswarrantyclaimpage.clicktemplateforqacase("Template for QA Case Plans");
        caseswarrantyclaimpage.selectbusinessunit("Business Unit", data.get("Business Unit"));          
        caseswarrantyclaimpage.setreferncenumber("Reference Number", data.get("Reference Number"));
       // caseswarrantyclaimpage.selectvendorname("Vendor Name", data.get("vendorname"));                 
        caseswarrantyclaimpage.selectvendorcontact("Contact (at Vendor)", data.get("Contact (at Vendor)"));
        caseswarrantyclaimpage.selectrecoverstatus("Recovery Status", data.get("Recovery Status"));
        caseswarrantyclaimpage.setacctnumber("Acct# to Credit", data.get("Acct# to Credit"));
        caseswarrantyclaimpage.setvendorrecoverynotes("Vendor Recovery Notes", data.get("Vendor Recovery Notes"));
        caseswarrantyclaimpage.setvendorrefernce("Vendor Reference #", data.get("Vendor Reference #"));
        caseswarrantyclaimpage.setvendorreqamount("Vendor Requested Amount", data.get("Vendor Requested Amount"));
        caseswarrantyclaimpage.setvendorreceivedamount("Vendor Received Amount", data.get("Vendor Received Amount"));
        caseswarrantyclaimpage.setvendorrequestdate("Vendor Requested Date", data.get("Vendor Requested Date"));
        caseswarrantyclaimpage.setvendorreceiveddate("Vendor Received Date", data.get("Vendor Received Date"));
        caseswarrantyclaimpage.sethoursrequested("Hours Requested", data.get("Hours Requested"));
        caseswarrantyclaimpage.sethoursapproval("Labor Amount Requested", data.get("Labor Amount Requested"));
        caseswarrantyclaimpage.labouramountreq("Daikin Parts Amount Requested", data.get("Daikin Parts Amount Requested"));
        caseswarrantyclaimpage.labouramountapproval("Subcontractor Amount Requested", data.get("Subcontractor Amount Requested"));
        caseswarrantyclaimpage.daikinpartamountrequest("Additional Materials Amount Requested", data.get("Additional Materials Amount Approved"));
        caseswarrantyclaimpage.daikinpartamountapproved("Hours Approved", data.get("Hours Approved"));
        caseswarrantyclaimpage.subcontractamountrequest("Labor Amount Approved", data.get("Labor Amount Approved"));
        caseswarrantyclaimpage.subcontractamountapproved("Daikin Parts Amount Approved", data.get("Daikin Parts Amount Approved"));
        caseswarrantyclaimpage.materialsamountrequest("Subcontractor Amount Approved", data.get("SubContractor Amount Approved"));
        caseswarrantyclaimpage.materialsamountapproved("Additional Materials Amount Approved", data.get("Additional Materials Amount Approved"));              
        caseswarrantyclaimpage.selectwarrantyapprover("Warranty Approver", data.get("Warranty Approver"));
        caseswarrantyclaimpage.selectsecondwarrantyapprover("Warranty Approver II", data.get("Warranty Approver II"));
        caseswarrantyclaimpage.selectrgmapprover("RGM Approver", data.get("RGM Approver"));
        caseswarrantyclaimpage.selectpgmapprover("PGM Approver", data.get("PGM Approver"));
        caseswarrantyclaimpage.setwarrantyapproved("Warranty Approved Ttl",data.get("Warranty Approved Ttl"));
        caseswarrantyclaimpage.setwarrantyrequested("Warranty Requested Ttl",data.get("Warranty Requested Ttl"));
        caseswarrantyclaimpage.setconcessionapproved("Concessions Approved Ttl",data.get("Concessions Approved Ttl"));
        caseswarrantyclaimpage.setconcessionrequested("Concessions Requested Ttl",data.get("Concessions Requested Ttl"));     
        caseswarrantyclaimpage.setauthorizeddate("Authorized Date","11/20/2022");     
        caseswarrantyclaimpage.setrgmapproveddate("RGM Approved Date", data.get("RGM Approver Date"));
        caseswarrantyclaimpage.setrgmrejecteddate("RGM Rejected Date", data.get("RGM Rejected Date"));
        caseswarrantyclaimpage.selectcancelledreason("Closed Reason", data.get("closedreason"));
        caseswarrantyclaimpage.setsubmitteddate("Submitted Date", data.get("Submitted Date"));
        caseswarrantyclaimpage.setinvoicenumber("Invoice Number", data.get("Invoice Number"));
        caseswarrantyclaimpage.setinvoiceamount("Invoice Amount", data.get("Invoice Amount"));
        caseswarrantyclaimpage.setinvoicedate("Invoice Date", data.get("Invoice Date"));
        caseswarrantyclaimpage.setAPaiddate("A/P Paid Date", data.get("A/P Paid Date"));
        caseswarrantyclaimpage.setAPnumber("A/P Number", data.get("A/P Number"));
        caseswarrantyclaimpage.setAPamount("A/P Amount", data.get("A/P Amount"));
        caseswarrantyclaimpage.setAPcreatedate("A/P Created Date", data.get("A/P Created Date"));
        caseswarrantyclaimpage.clicksubmitforconcessionclaim("Submitted for Concession Claim");
        caseswarrantyclaimpage.clicksubmitforwarrantyclaim("Submitted for Warranty Approval");
        caseswarrantyclaimpage.setdateconcessionapprl("Date/Time submitted for Concession Apprl", data.get("Date/Time submitted for Concession Apprl"));
        caseswarrantyclaimpage.setoriginaldate("Original Submitted Date/Time", data.get("Original Submitted Date/Time"));
        caseswarrantyclaimpage.setwarrantyapprldate("Date/Time Submitted for Warranty Apprl", data.get("Date/Time submitted for Warranty Apprl"));
        caseswarrantyclaimpage.setfinalapprovaldate("Final Approval Date/Time", data.get("Final Approval Date/Time"));
        caseswarrantyclaimpage.clickapprovalcommentsnotreceived("Approval Comments not received - WA");
        caseswarrantyclaimpage.setdescription("Web Description", data.get("Web Description"));
        caseswarrantyclaimpage.clickbankclass("HasBlankClasses");
        caseswarrantyclaimpage.setserialnumber("Serial Number", data.get("Serial Number"));
        caseswarrantyclaimpage.setemail("Web Email", data.get("Web Email"));
        caseswarrantyclaimpage.setactivitydate("First Activity Date",data.get("First Activity Date"));
        caseswarrantyclaimpage.setdatecurrentstatus("Date Set to Current Status", data.get("Date Set to Current Status"));
        caseswarrantyclaimpage.setdatereceived("Date Received", data.get("Date Received"));                 
        caseswarrantyclaimpage.clicksave("Save");
        caseswarrantyclaimpage.submitstatus();
        caseswarrantyclaimpage.savevalidation("Warranty Review","Warranty Review");
       
      

    }
}
