package com.kitap.pageobjects;

import java.util.List;        


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageClassic;

/*
 * @KT1461 
 * @date: 20/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of entitlement creation
 */

public class EntitlementPage extends SFPageClassic{
	 public EntitlementPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	   @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
	 
	   @FindBy(xpath="//*[@id=\"Entitlement\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement clickEntitlement;
	   
	   /*
	     * @KT1461
	     * @date:20/07/2022
	     * @Description: This method performs clicking on app launcher in the salesforce home page
	     * @return values: opens app launcher
	     */

	    public void clickninesymbol() throws InterruptedException {
	    	try {
		    	SFClick(ninesymbol);
		    	waitForSFPagetoLoad();

		    }
		    catch (Exception e)
	        {
	            System.out.println("In catch");
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs entering input as entitlement in app launcher of salesforce home page
	     * @Param: accepts two Param  label and value as input
	     * @return values: related screen name appear in applauncher
	     */
	    public void enterentitlement(String label,String data) throws Exception {

	        try {
	            setText(label, data);
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch" +label);
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 25/08/2022
	     * @Description: This method performs clicking  on the entitlement page
	     * @return values: opens dashboards page 
	     */
	    
	    public void Entitlement() throws InterruptedException {
	    try {
	    	SFClick(clickEntitlement);
	    	waitForSFPagetoLoad();

	    }
	    catch (Exception e)
        {
            System.out.println("In catch");
        }
    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs clicking on new button on the entitlement page
	     * @Param: accepts one argument label as input
	     * @return values: opens new entitlement page
	     */
	    
	    public void clicknewbutton(String label) throws Exception {

	    	try {
	    	clickSFbutton(label);
	    	waitForSFPagetoLoad();
	    }
	    	 catch (Exception e)
	        {
	            System.out.println("In catch");
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs enters entitlement name on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates entitlement name
	     */

	    public void setEntitlename(String label,String data) throws Exception {

	    	try {
	    	setinput(label,data);
	    	   
	    }
	    	 catch (Exception e)
	        {
	            System.out.println("In catch" +label);
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs selecting type on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates type
	     */
	    
		public void settype(String label,String data) throws Exception {

			try {
	    	   selectdropdown(label,data);
	    	  
	    }
			 catch (Exception e)
	        {
	            System.out.println("In catch" +label);
	        }
	    }
		
		 /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs searching for accountname on entitlement page
	     * @Param: accepts two Param label and targetvalue as input
	     * @return values: populates account name
	     */
		
		 public void setaccountname(String label,String data) throws Exception {
			 try {
			        selectcombobox(label, data);
			    } 
			    catch (Exception e) 
			 {
			     System.out.println("Sent values as " + data);
			    }
			}
		 
		 /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs searching for assetname on entitlement page
	     * @Param: accepts two Param label and targetvalue as input
	     * @return values: populates asset name
	     */
		 
		 public void setassetname(String label,String data) throws Exception {
			 try {
			        selectcombobox(label, data);
			    } 
			    catch (Exception e) 
			 {
			     System.out.println("Sent values as " + data);
			    }
			}
		 
		 /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs click action on incident on entitlement page
	     * @Param: accepts arguments label  as input
	     * @return values: clicking the checkbox of incident.
	     */

		 public void clickincident(String label) throws Exception {

		    	click(label);
		       

      }
		 
		 /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs enters case entitlement name on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates caseentitlement
	     */
	    public void setcasesentitlement(String label,String data) throws Exception {

	    	try {
	    	   settext1(label,data);
	    	  
	       } 
	    	  catch (Exception e)  
	        {
	         System.out.println("Sent values as " + data);
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs enters startdate name on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates start date
	     */

	    public void setstartdate(String label,String data) throws Exception {

	    	try {
		    	setinput(label,data);
		    	
		    }
		    	 catch (Exception e)
		        {
		            System.out.println("In catch" +label);
		        }
		    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs enters end date on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates end date 
	     */

		  public void setenddate(String label,String data) throws Exception {
		  
			  try {
			    	setinput(label,data);
			    	
			    }
			    	 catch (Exception e)
			        {
			         System.out.println("In catch" +label);
			        }
			    }
		  
		 /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs enters remainingcase on the entitlement page
	     * @Param: accepts two Param label and data as input
	     * @return values: populates remainingcases
	     */
		    
	    public void setremainingcases(String label,String data) throws Exception {

	    	try {
		    	   settext1(label,data);
		    	  
		       } 
		    	  catch (Exception e)  
		        {
		         System.out.println("Sent values as " + data);
		        }
		    }
	    
	    /*
	     * @KT1461
	     * @date: 20/07/2022
	     * @Description: This method performs click action on save on entitlement page
	     * @Param: accepts arguments label  as input
	     * @return values: saves data
	     */

	    public void clicksavebutton(String label) throws Exception {

	    	try {
	    	click(label);
	    	  
	    	}
	    	   catch (Exception e)  
		        {
		         System.out.println("Sent values as ");
		        }
	    	}

	    


}
