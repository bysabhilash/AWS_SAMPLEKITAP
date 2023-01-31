package com.kitap.testscripts;

import java.util.Hashtable;      

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1461
 * @date: 03/08/2022
 * @Description: This test script covers the creation of work order via UI
 */

public class WorkOrderCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void WorkOrderCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("WorkOrderCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"WorkOrderCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        lightningloginpage.applauncher("WorkOrder");
        
        workorder.clicknewbutton("New");
        
        workorder.selectstatus("Status",data.get("status"));
        
        workorder.selectparentworkorder("Parent Work Order",data.get("parentworkorder"));
        
        workorder.selectaccount("Account",data.get("accountname"));
        
        workorder.selectcases("Case",data.get("cases"));
        
        workorder.selectpriority("Priority",data.get("priority"));
        
        workorder.selectcontact("Contact",data.get("contact"));
        
        workorder.selectasset("Asset",data.get("asset"));
        
        workorder.selectentitlement("Entitlement",data.get("entitlement"));
        
        workorder.setsubject("Subject",data.get("subject"));
        
        workorder.setdescription("Description",data.get("description"));
                
        workorder.clicksavebutton("Save"); 
        
    }
}


