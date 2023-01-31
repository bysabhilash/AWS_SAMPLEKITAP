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

public class CasesWarranty extends SFPageBase {
	
	
	@FindBy(xpath="//div[text()='Used for Warranty case claims']")
	private WebElement ele;
	
	@FindBy(xpath="//span[@class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement savedtext;
	
	 public CasesWarranty(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	
	public void clicknew(String label) throws Exception {

		clickSFbutton(label);
		ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button of  warranty   home page to navigate to the New warranty  creation screen/page ");
		
	}

	public void scrolling() throws Throwable {
		 
		 scroll(ele);
		 ExtentManager.pass("User is able to Perform scroll the page until the warranty  is displayed" );
		
	    }
	 
	 public void clickwarranty() throws Exception
	    {
        ele.click();
        ExtentManager.pass("User is able to Perform a  click  on  the warranty  its  navigate to the  warranty  creation page " );
			 
	    }
	 
	public void clicknext(String label) throws Exception {

		try{
			click(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button its  navigate to the New warranty claim creation screen/page ");
			
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
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
	
	public void selectparentcase(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}
	
	
	
	public void setreason(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void selectcaseorigin(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
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
	
	public void selectasset(String label,String data) throws Exception {

		try{
			selectcombobox(label,data);
			ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
	//	ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
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
	
	public void setdeffectivemodel(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	
	public void setdeffectiveserial(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	
	public void setreplaceserial(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	

	public void sethoursrequested(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void sethoursapproval(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void labouramountreq(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void labouramountapproval(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void daikinpartamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void daikinpartamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void subcontractamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void subcontractamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void materialsamountrequest(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}
	
	public void materialsamountapproved(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to  send the ----> "  +  data  +  "  in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
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
	
	public void selectclosedreason(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
			ExtentManager.pass("User is  able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
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
		
	public void clickbypass(String label) throws Exception {

		try{
			clickaction(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
		}
		catch (Exception e)
		{
			
			//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}

	public void clicksave(String label) throws Exception {

		try{
			click(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
			
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}
	
	public void getstatus() throws Throwable {

		try{
			status1(savedtext);
			ExtentManager.pass("User is able to  get the status of the warranty claim creation ------------------->  "  +  SFPageBase.details  );
			
		}
		catch (Exception e)
		{
			
		//	ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}
	
	
}




