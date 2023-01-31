package com.kitap.testscripts;
import java.util.Hashtable;  
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;

public class CasesCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void CasesCreationViaUI(Hashtable<String,String> data) throws Throwable {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("CasesCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"CasesCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
		ExtentManager.log("Starting CasesCreationViaUI ...");		
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(data.get("username"), data.get("password"));
        //lightningloginpage.login(SFUserId, SFPassword);
       // lightningloginpage.applauncher("Case");
        casespage.loginvalidation("Home", "Home");
        casespage.clickninesymbol();
        casespage.enterCases("Search apps and items...", data.get("Data_searchbar"));
        casespage.clickcases();
        casespage.casepagevalidation("Cases","Cases");
        casespage.clicknew("New");
        casespage.casecreationvalidate("New Case: Warranty Claim Auth | Salesforce");
        casespage.setStatus("Status",data.get("status"));
        casespage.setPriority("Priority",data.get("priority"));
        casespage.setCaseOrigin("Case Origin",data.get("caseorigin"));
        casespage.setAccountname("Account Name",data.get("accountname"));
        casespage.setcontactperson("Contact Name",data.get("contactname"));    
        casespage.setType("Type",data.get("type"));
        casespage.setCaseReason("Case Reason",data.get("casereason"));
        casespage.setWebEmail("Web Email",data.get("WebEmail"));
        casespage.setWebCompany("Web Company",data.get("Webcompany"));
        casespage.setWebName("Web Name",data.get("Webname"));
        casespage.setWebPhone("Web Phone",data.get("Webphone"));
        casespage.setProduct("Product",data.get("product"));
        casespage.setPotentialityLiability("Potential Liability",data.get("potentiality"));
        casespage.setEngineeringReqNumber("Engineering Req Number",data.get("EngineeringReqNumber"));
       // casespage.setSlaViolation("SLA Violation",data.get("violation"));
       // casespage.setSubject("Subject",data.get("subject"));
        casespage.setDescription("Description",data.get("Description"));
        //casespage.setInternalCommands("Internal Comments",data.get("InternalComments"));
        casespage.clicksave("Save");       
        casespage.saveddetails();
      //  casespage.getcasenumber();
        casespage.clickbutton();
        casespage.submitapproval("Submit for Approval");
        casespage.comments("Comments", "submitting for approval");
        casespage.submit("Submit");
        casespage.approvalstatus();
    }
}
