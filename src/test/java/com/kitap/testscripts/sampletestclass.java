package com.kitap.testscripts;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;


/*
 * @KT1444
 * @date: 13/07/2022
 * @Description: This test script covers the creation of an account via UI
 */

public class sampletestclass extends BaseTest {

	@Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
	public void sampletestclass(Hashtable<String, String> data) throws Exception {

		if (!(com.kitap.utilities.TestUtil.isTestRunnable("sampletestclass", excel))) {

			throw new SkipException("Skipping the test " + "sampletestclass".toUpperCase() + "as the Run mode is NO");
		}
		
		  lightningloginpage.openHomepage(SFBaseURL);
		  
		  lightningloginpage.login(SFUserId, SFPassword);
		  
		 // lightningloginpage.applauncher("Account");
		  
		//  accountlistpage.clicknew("New");
		 
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("bysani@gmail.com");
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
		 * "Jasper@143");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 * Thread.sleep(11000);
		 */
	        driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
	        Thread.sleep(3000);



	       driver.findElement(By.xpath("//a[normalize-space()='Switch to Salesforce Classic']")).click();
	        Thread.sleep(6000);

	       driver.findElement(By.xpath("//a[text()='Cases']")).click();
	        Thread.sleep(6000);

	       driver.findElement(By.xpath("//input[@title='New']")).click();
	        Thread.sleep(2000);
	        
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
	        casespage.setSubject("Subject",data.get("subject"));
	        casespage.setDescription("Description",data.get("Description"));
	        casespage.setInternalCommands("Internal Comments",data.get("InternalComments"));
	        casespage.clicksave("Save");

		
}
}

