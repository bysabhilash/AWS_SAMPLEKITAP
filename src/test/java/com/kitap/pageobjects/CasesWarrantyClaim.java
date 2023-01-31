package com.kitap.pageobjects;

import org.openqa.selenium.By;   
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;

public class CasesWarrantyClaim extends SFPageBase {
	
	
	@FindBy(xpath="//div[text()='Leveraged for Warranty Claim Authorization asset claims (children of WAR Header)']")
	private WebElement ele;
	
	@FindBy(xpath="//span[@class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement savedtext;
	
	 public CasesWarrantyClaim(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	 public void loginvalidation(String expected) {
	        try {
	            waitForSFPagetoLoad();
	            validation2(expected);
	            ExtentManager.pass("User is able to navigate  to the"  + expected +  " page "  +  " and the Expected text is ------> "  + value +  " actual text-------> "  + SFPageBase.actualvalue +  "");
	            
	        } catch (Exception e) {
	            
	            ExtentManager.fail("User is not on "  + expected +  " page "  +  " Expected text is ------> "  + value  +   " actual text-------> "  + SFPageBase.actualvalue +   "");
	        }
	    }
	
	public void clicknew(String label) throws Exception {

		clickbutton(label);
		ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button of  warranty claim  home page to navigate to the New warranty claim creation screen/page ");
		
	}

	public void scrolling() throws Throwable {
		 
		 scroll(ele);
		 ExtentManager.pass("User is able to Perform scroll the page until the warranty claim is displayed" );
		
	    }
	 
	 public void clickwarrantyclaim() throws Exception
	    {
        ele.click();
		
		 ExtentManager.pass("User is able to Perform a  click  on  the warranty claim its  navigate to the  warranty claim creation page " );
	    }



	public void clicknext(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button its  navigate to the New warranty claim creation screen/page ");
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}
	
	public void warrantypagevalidation(String actual ,String expected) {
        try {
            waitForSFPagetoLoad();
            validation(expected, actual);
            ExtentManager.pass("User is able to navigate  to the"  + actual +  " page "  +  " and the Expected text is ------> "  + value +  " actual text-------> "  + actual +  "");
            
        } catch (Exception e) {
            
            ExtentManager.fail("User is not on "  + actual +  " page "  +  " Expected text is ------> "  + value  +   " actual text-------> "  + actual +  "");
        }
    }
	
	public void setquality(String label,String data) throws Exception {

		try{
			
			settext(label, data);
			//ExtentManager.pass("User is able to  select the priority----> "  +  data  +  "  from the dropdown options in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setasteasv(String label,String data) throws Exception {

		try{
			
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}



	public void setsubject(String label,String data) throws Exception {

		try{
			
			setinput(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}


	public void selectcontact(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void selectaccountname(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}

	public void setdate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}

	public void setinquirydate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the case origin---- "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}

	public void setreason(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	

	public void setfailureresolution(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	

	public void setapprovalreason(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void setoriginalamount(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void setapprovalcomments(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	
	public void selectflagchecker(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void selectvendorname(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void selectvendorcontact(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}

	
	
	public void selectcaseorigin(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void selectrecoverstatus(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void setacctnumber(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void setvendorrecoverynotes(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void sethoursrequested(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void sethoursapproval(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void labouramountreq(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void labouramountapproval(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void daikinpartamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void daikinpartamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void subcontractamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void subcontractamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void materialsamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void materialsamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}


	public void selectpriority(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}


	public void selectcasecategory(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void selectstatus(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void selectbusinessunit(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void selectwarrantyapprover(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void selectsecondwarrantyapprover(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void selectrgmapprover(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void selectpgmapprover(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	public void setrgmapproveddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setrgmrejecteddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void selectcancelledreason(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void setsubmitteddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setinvoicenumber(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setinvoiceamount(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setinvoicedate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setAPaiddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setAPnumber(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setAPamount(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setAPcreatedate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	
	public void setdateconcessionapprl(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setoriginaldate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setwarrantyapprldate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setfinalapprovaldate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setdescription(String label,String data) throws Exception {

		try{
			
			settext(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setserialnumber(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setemail(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setdatecurrentstatus(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setdatereceived(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setdenialreasons(String label,String data) throws Exception {

		try{
			
			settext(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setcustomernotes(String label,String data) throws Exception {

		try{
			
			settext(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setrejectnotes(String label,String data) throws Exception {

        try{
			
			settext(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setvendorrefernce(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setvendorreqamount(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setvendorreceivedamount(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setvendorrequestdate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setvendorreceiveddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickadditinalsupport(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickworkcompleted(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clicksenttoquality(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickimagesincluded(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clicktemplateforqacase(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clicksubmitforconcessionclaim(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clicksubmitforwarrantyclaim(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickapprovalcommentsnotreceived(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickbankclass(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void clickclosedtime(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setreferncenumber(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setwarrantyapproved(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setwarrantyrequested(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setconcessionapproved(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setconcessionrequested(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setapprovalquery(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setreopeneddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setauthorizeddate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void setactivitydate(String label,String data) throws Exception {

		try{
			settext1(label,data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}
	
	public void selectapprovalstatus(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	
	
	public void clicksave(String label) throws Exception {

		try{
			clickbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
			
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}
	
	public void submitstatus() throws Throwable {

		try{
			status(savedtext);
			 ExtentManager.pass("User is able to  get the status of the warranty claim creation ------------------->  "  +  SFPageBase.details  );
			
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}
	
	public void savevalidation(String actual ,String expected) {
        try {
            waitForSFPagetoLoad();
            validation(actual, expected);
            ExtentManager.pass("User is able to navigate  to the"  + actual +  " page "  +  " and the Expected text is ------> "  + value +  " actual text-------> "  + actual +  "");
            
        } catch (Exception e) {
            
            ExtentManager.fail("User is not on "  + actual +  " page "  +  " Expected text is ------> "  + value  +   " actual text-------> "  + actual +  "");
        }
    }
	
	

}


