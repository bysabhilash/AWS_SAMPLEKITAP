package com.kitap.testscripts;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;

public class CasesWarrantyCreation extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void CasesWarrantyCreation(Hashtable<String, String> data) throws Throwable {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("CasesWarrantyCreation", excel))) {

            throw new SkipException("Skipping the test " + "CasesWarrantyCreation".toUpperCase() + "as the Run mode is NO");
        }
        ExtentManager.createTest("CasesWarrantyCreation","SalesforceDaikinDemo").assignAuthor("KT1461").assignCategory("Smoke").assignDevice("Chrome");
        ExtentManager.log("Starting CasesWarrantyCreation ...");
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        caseswarrantypage.clicknew("New");
        caseswarrantypage.scrolling();
        caseswarrantypage.clickwarranty();
        caseswarrantypage.clicknext("Next");       
        caseswarrantypage.setsubject("Subject", data.get("Subject"));
        caseswarrantypage.selectcontact("Contact Name", data.get("Contact Name"));
        caseswarrantypage.selectaccountname("Account Name", data.get("Account Name"));
        caseswarrantypage.selectparentcase("Parent Case",SFPageBase.casenumber);
        caseswarrantypage.setreason("Reason for Authorization Request", data.get("Reason For Authroisation Request"));
        caseswarrantypage.selectcaseorigin("Case Origin", data.get("caseorigin"));
        caseswarrantypage.selectpriority("Priority", data.get("Priority"));
        caseswarrantypage.setdeffectivemodel("Defective Compressor Model #", "gc1040");
        caseswarrantypage.setdeffectiveserial("Defective Compressor Serial #", "98745");
        caseswarrantypage.setreplaceserial("Replacement Compressor Serial #", "78965");
        caseswarrantypage.setemail("Web Email", data.get("Web Email"));
        caseswarrantypage.selectasset("Asset", "Test Asset 001");      
        caseswarrantypage.sethoursrequested("Hours Requested", data.get("Hours Requested"));
        caseswarrantypage.sethoursapproval("Labor Amount Requested", data.get("Labor Amount Requested"));
        caseswarrantypage.labouramountreq("Daikin Parts Amount Requested", data.get("Daikin Parts Amount Requested"));
        caseswarrantypage.labouramountapproval("Subcontractor Amount Requested", data.get("Subcontractor Amount Requested"));
        caseswarrantypage.daikinpartamountrequest("Additional Materials Amount Requested", data.get("Additional Materials Amount Approved"));
        caseswarrantypage.daikinpartamountapproved("Hours Approved", data.get("Hours Approved"));
        caseswarrantypage.subcontractamountrequest("Labor Amount Approved", data.get("Labor Amount Approved"));
        caseswarrantypage.subcontractamountapproved("Daikin Parts Amount Approved", data.get("Daikin Parts Amount Approved"));
        caseswarrantypage.materialsamountrequest("Subcontractor Amount Approved", data.get("SubContractor Amount Approved"));
        caseswarrantypage.materialsamountapproved("Additional Materials Amount Approved", data.get("Additional Materials Amount Approved"));
        caseswarrantypage.setwarrantyapproved("Warranty Approved Ttl",data.get("Warranty Approved Ttl"));
        caseswarrantypage.setwarrantyrequested("Warranty Requested Ttl",data.get("Warranty Requested Ttl"));
        caseswarrantypage.setconcessionapproved("Concessions Approved Ttl",data.get("Concessions Approved Ttl"));
        caseswarrantypage.setconcessionrequested("Concessions Requested Ttl",data.get("Concessions Requested Ttl"));
        caseswarrantypage.selectapprovalstatus("Approval Status", "Warranty Rejected/Denied");      
        caseswarrantypage.selectclosedreason("Closed Reason", "Rejected/Denied");      
        caseswarrantypage.setfailureresolution("Failure Resolution & Preventative Action", data.get("Failure Resolution & Preventive Action")); 
        caseswarrantypage.setdescription("Web Description","creating the child case");
        caseswarrantypage.setAPnumber("A/P Number", data.get("A/P Number"));
        caseswarrantypage.setAPamount("A/P Amount", data.get("A/P Amount"));
        caseswarrantypage.setAPcreatedate("A/P Paid Date", data.get("Appaiddate"));
        caseswarrantypage.selectstatus("Status", data.get("Status"));         
        caseswarrantypage.clicksave("Save");
        caseswarrantypage.getstatus();
        
        
        


    }
}



