package com.kitap.testscripts;

import java.util.Hashtable ;
 

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class IncidentCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void IncidentCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("IncidentCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"IncidentCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
       // lightningloginpage.applauncher("Accounts");
        
        incidentpage.clickninesymbol();
        
        incidentpage.setText("Search apps and items...",data.get("Data_searchbar"));
        
        incidentpage.Incident();
        
        incidentpage.clicknewbutton("New");
        
		
	  incidentpage.setsubject("Subject", data.get("subject"));
	  
	  incidentpage.setdescription("Description", data.get("Description"));
	  
	  incidentpage.selectstatus("Status",data.get("status"));
	  
	  incidentpage.selectparentincident("Parent Incident",data.get("incidentnumber"));
 
	  incidentpage.selecturgency("Urgency", data.get("urgencylevl"));
	  
	  incidentpage.selectpriority("Priority",data.get("priority"));
	  
	  incidentpage.selectimpact("Impact", data.get("impact"));
		 
	    incidentpage.setpriorityreason("Priority Override Reason", data.get("reason"));
	    
	    incidentpage.selectentitlement("Entitlement",data.get("entitlement"));
	    
	    incidentpage.setdetecteddate("Detected Date Time",data.get("detectdate"));
	    
	    incidentpage.setstartdate("Start Date Time",data.get("startdate"));
	        		  
	    incidentpage.setresolvedperson("Resolved By",data.get("resolvedpersons"));
	    
	    incidentpage.setresolutiondate("Resolution Date Time",data.get("resolutiondate"));
	    
	    incidentpage.setenddate("End Date Time", data.get("enddate"));
	    
	    incidentpage.setresolutionsummary("Resolution Summary", data.get("resolutionsummary"));
	
	    incidentpage.clicksavebutton("Save");

    }
}



