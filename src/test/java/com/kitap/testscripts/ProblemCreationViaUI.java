package com.kitap.testscripts;

import java.util.Hashtable ; 

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class ProblemCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void ProblemCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("ProblemCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"ProblemCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
       
        problemspage.clickninesymbol();
        
        problemspage.setText("Search apps and items...",data.get("Data_searchbar"));
        
        problemspage.problem();
        
        problemspage.clicknewbutton("New");
        
        problemspage.setsubject("Subject", data.get("subject"));
        
        problemspage.setdescription("Description", data.get("Description"));
        
        problemspage.selectstatus("Status",data.get("status"));
        
        problemspage.selectparentproblem("Parent Problem",data.get("parentproblem"));
        
        problemspage.selectpriority("Priority",data.get("priority"));
        
        problemspage.selecturgency("Urgency", data.get("urgencylevl"));
        
        problemspage.selectimpact("Impact", data.get("impactlevel"));
		
        problemspage.setpriorityreason("Priority Override Reason", data.get("reason"));
		  
        problemspage.setrootsummary("Root Cause Summary",data.get("rootsummary"));
	        		  
        problemspage.setresolvedperson("Resolved By",data.get("resolvedpersons"));
		  
        problemspage.setdate("Date", data.get("date"));
		  
        problemspage.setresolutionsummary("Resolution Summary", data.get("resolutionsummary"));
		  
        problemspage.clicksavebutton("Save");

    }
}
