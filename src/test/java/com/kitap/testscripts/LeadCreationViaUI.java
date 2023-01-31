package com.kitap.testscripts;
import java.util.Hashtable;

import com.kitap.base.BaseTest;
import com.kitap.utilities.TestUtil;

import org.testng.SkipException;
import org.testng.annotations.Test;

/*
 * @KT1456
 * @date: 15/07/2022
 * @Description: This test script covers the creation of an account via UI
 */

public class LeadCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass= TestUtil.class,dataProvider="dp")

	public void LeadCreation(Hashtable<String,String> data) throws Exception {
		
		if(!(TestUtil.isTestRunnable("LeadCreation", excel))){
			
			throw new SkipException("Skipping the test "+"LeadCreation".toUpperCase()+ "as the Run mode is NO");
		}

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
      //  lightningloginpage.applauncher("Lead");
        leadspage.clickninesymbol();
        leadspage.enterasset("Search apps and items...",data.get("Data_searchbar"));		  
        leadspage.clickleads();
        leadspage.clickSFbutton("New");
        leadspage.setSalutation("Salutation",data.get("salutation"));
        leadspage.setFirstname("First Name",data.get("firstname"));
        leadspage.setLastname("Last Name",data.get("lastname"));
        leadspage.setCompanyname("Company",data.get("companyname"));
        leadspage.setPhone("Phone",data.get("phone"));
        leadspage.setMobile("Mobile",data.get("Mobile"));
        leadspage.setFax("Fax",data.get("fax"));
        leadspage.setTitle("Title",data.get("title"));
        leadspage.setEmail("Email",data.get("email"));
        leadspage.setLeadSource("Lead Source",data.get("lead"));
        leadspage.setWebsite("Website",data.get("website"));
        leadspage.setIndustry("Industry",data.get("industry"));
        leadspage.setLeadStatus("Lead Status",data.get("leadstatus"));
        leadspage.setAnnualRevenue("Annual Revenue",data.get("annual revenue"));
        leadspage.setRating("Rating",data.get("rating"));
        leadspage.setNoofEmployees("No. of Employees",data.get("No. of Employees"));
        leadspage.setStreet("Street",data.get("Street"));
        leadspage.setCity("City",data.get("city"));
        leadspage.setStateOrProvince("State/Province",data.get("State/Province"));
        leadspage.setZiporPostalCode("Zip/Postal Code",data.get("Zip/Postal Code"));
        leadspage.setCountry("Country",data.get("Country"));
        leadspage.setProductInterest("Product Interest",data.get("productinterest"));
        leadspage.setCurrentGenerator("Current Generator(s)",data.get("Current Generator(s)"));
        leadspage.setSicCode("SIC Code","sic code");
        leadspage.setPrimary("Primary",data.get("primary"));
        leadspage.setNoofLocations("Number of Locations",data.get("Number of Locations"));
        leadspage.setDescription("Description",data.get("Description"));
        leadspage.clicksave("Save");


    }
}


