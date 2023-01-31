package com.kitap.testscripts;
import java.util.Hashtable ;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;


/*
 * @KT1456
 * @date: 03/08/2021
 * @Description: This test covers the creation of an contactpage via UI
 */

public class ContactsCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void ContactsCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("ContactsCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"ContactsCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        //lightningloginpage.applauncher("Contact");
        
        contactpage.clickninesymbol();
        
        contactpage.entercontacts("Search apps and items...", data.get("Data_searchbar"));
        
        contactpage.clickcontacts();
 
        contactpage.clicknewbutton("New");
        
		/*
		 * driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * driver.findElement(By.
		 * xpath("//a[normalize-space()='Switch to Salesforce Classic']")).click();
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath("//input[@title='New']")).click();
		 * Thread.sleep(2000);
		 */
        contactpage.selectOption("Salutation", data.get("salutation"));
        
        contactpage.setFirstname("First Name",data.get("contactfirstname"));
        
        contactpage.setLastname("Last Name",data.get("contactlastname"));
       
          contactpage.setTitle("Title", data.get("title"));
        
          contactpage.setDepartment("Department", data.get("department"));
		
	//	  contactpage.setBirthdate("Birthdate", data.get("BirthDate"));
	        		  
		  contactpage.selectLeadsource("Lead Source",data.get("lead"));
		  
		  contactpage.setassistantNo("Asst. Phone", data.get("AssistantNo"));
		  
		  contactpage.setAssistantname("Assistant", data.get("Assistantname"));
		  
		  contactpage.setEmailid("Email", data.get("email"));
		  
		  contactpage.setPhonenumber("Phone", data.get("PhoneNo"));
		  
		  contactpage.setHomenumber("Home Phone", data.get("HomeNo"));
		  
	//	  contactpage.entersearchcontact("Reports To",data.get("searchcontactname"));
		  
	//	  contactpage.enterParentAccount("Account Name",data.get("searchaccountname"));
		  
		  contactpage.setMobilenumber("Mobile", data.get("MobileNo"));
		  
		  contactpage.setOthernumber("Other Phone", data.get("OtherNo"));
		  
		  contactpage.setFaxnumber("Fax",data.get("Fax"));
		  
		  contactpage.setMailingstreet("Mailing Street", data.get("MailingStreet"));
		  
		  contactpage.setMailingcity("Mailing City", data.get("MailingCity"));
		  
		  contactpage.setMailingstate("Mailing State/Province", data.get("MailingState"));
		  
		  contactpage.setMailingcode("Mailing Zip/Postal Code", data.get("MailingCode"));
		  
		  contactpage.setMailingcountry("Mailing Country", data.get("Mailingcountry"));
		  
		  contactpage.setOtherstreet("Other Street", data.get("OtherStreet"));
		  
		  contactpage.setOthercity("Other City", data.get("OtherCity"));
		  
		  contactpage.setOtherstate("Other State/Province", data.get("OtherState"));
		  
		  contactpage.setOthercode("Other Zip/Postal Code", data.get("OtherCode"));
		  
		  contactpage.setOthercountry("Other Country", data.get("Othercountry"));
		  
		  contactpage.setlanguages("Languages",data.get("Languages"));
		  
		  contactpage.selectlevel("Level", data.get("stagelevel")); 
		  
		  contactpage.setdescription("Description", data.get("Description")); 
      
          contactpage.clicksavebutton("Save");
        
         // contactpage.clickdelete("Delete");
		
    }
}



	


