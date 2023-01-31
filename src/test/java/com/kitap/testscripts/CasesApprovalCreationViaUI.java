package com.kitap.testscripts;


import java.util.Hashtable; 
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;

public class CasesApprovalCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void CasesApprovalCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("CasesApprovalCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"CasesApprovalCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
		 ExtentManager.log("Starting CasesApprovalCreationViaUI ...");	
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(data.get("username"), data.get("password"));
        //lightningloginpage.login(SFUserId, SFPassword);
       // lightningloginpage.applauncher("Case");
        casesapprovalpage.clickninesymbol();
        casesapprovalpage.enterCases("Search apps and items...", data.get("Data_searchbar"));
        casesapprovalpage.clickcases();
        casesapprovalpage.notification("Notifications");
        casesapprovalpage.clickrelatedCasenumber(SFPageBase.value);
        casesapprovalpage.clickCasenumber(SFPageBase.value);
        casesapprovalpage.approvedetails("Related");   
        casesapprovalpage.scrooltoelement();
        casesapprovalpage.clickstatus("Approve");
        casesapprovalpage.comments("Comments", "approved successfull");
        casesapprovalpage.Approve("Approve");
      
       
        
       
    }
}