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

public class CasesListPage extends SFPageBase {
	
	
	 
	
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Case\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement cases;
	    		
	    @FindBy(xpath = "//*[@id=\"brandBand_2\"]/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___sfa__-case_rec_-l___-case___-v-i-e-w/forcegenerated-flexipage_case_rec_l_case__view_js/record_flexipage-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_case___0125i000000ljhzaaq___compact___view___recordlayout2/records-highlights2/div[1]/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[4]")
	    private WebElement button;
	    
	    @FindBy(xpath="//span[@class='toastMessage slds-text-heading--small forceActionsText']")
	    private WebElement savedtext;
	    
	  
	
	 public CasesListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	 
	 public void loginvalidation(String label ,String value) {
	        try {
             waitForSFPagetoLoad();
	         validation(label, value);
	         ExtentManager.pass("User  navigated to the  "  + label +  " page "  +  "and the  Expected text is ------> "  + value +  "   actual text-------> "  + label +  "");
	        } catch (Exception e) {
	           
	            ExtentManager.fail("User is not on  "  + label +  " page "  +  " Expected text is ------> "  + value +  " actual text-------> "  + label +  "");
	        }
	    }
	 
	 
	 public void clickninesymbol() {
	        try {

	            SFClick(ninesymbol);
	            ExtentManager.pass("User is able to perform click on the nineapps icon of home page  ");
	        } catch (Exception e) {
	            
	            ExtentManager.fail("User is not able to click the ninesymbol to enter the text value in search apps and items");
	        }
	    }
	 
	 public void clickcases() throws InterruptedException {

	        SFClick(cases);
	        waitForSFPagetoLoad();
	        ExtentManager.pass("User is able to perform a click on the cases  option  to navigate in the cases page");

	        }
	 
	 
	 

	public void enterCases(String label,String data) throws Exception {

		try {
			setText(label, data);
			 ExtentManager.pass("User is able to  search the "  +  label  +  " option while entering the keyword "+  data  +" in the search bar  ");
			
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able  to send  the cases text  in search apps and items");
		}
	}
	
	 public void casepagevalidation(String actual ,String expected) {
	        try {
                waitForSFPagetoLoad();
	            validation(expected, actual);
	            ExtentManager.pass("User is able to navigate  to the"  + actual +  " page "  +  " and the Expected text is ------> "  + value +  " actual text-------> "  + actual +  "");
	            
	        } catch (Exception e) {
	            
	            ExtentManager.fail("User is not on "  + actual +  " page "  +  " Expected text is ------> "  + value  +   " actual text-------> "  + actual +  "");
	        }
	    }
	 
	public void clicknew(String label) throws Exception {

		clickSFbutton(label);
		ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button of  cases home page to navigate to the New case creation screen/page ");
		
	}
	
	public void casecreationvalidate(String value) throws Exception {
        
		waitForSFPagetoLoad();
		validation2(value);
		ExtentManager.pass("User is on  the page "  + value);
		
	}
	
	 public void setAccountname(String label,String data) throws Exception {
		 
		 selectcombobox(label, data);
		 ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );

	    }
	 
	 public void setcontactperson(String label,String data) throws Exception
	    {

		 selectcombobox(label, data);
		 ExtentManager.pass("User is able to search and select the required option ---> "  +  data  +  " in  the " + label +  " field" );
	    }



	public void setStatus(String label,String data) throws Exception {

		try{
			selectOption(label,data);
			 ExtentManager.pass("User is able to  select the required options --> "  +  data  +  " from the  in the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the required status ------> "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}



	public void setPriority(String label,String data) throws Exception {

		try{
			
			selectdropdown(label, data);
			ExtentManager.pass("User is able to  select the priority----> "  +  data  +  "  from the dropdown options in  the " + label +  " field" );
			
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the priority----> "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}


	public void setCaseOrigin(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
			ExtentManager.pass("User is able to  select the required case origin -----> "  +  data  +  " from the dropdown options in the  " + label +  " field" );
		}
		catch (Exception e)
		{
		ExtentManager.fail("User is not able to  select the required case origin-----> "  +  data  +  " -from the dropdown options in the  " + label +  " field" );
		}
	}

	public void setType(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
			ExtentManager.pass("User is able to  select the type--- "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
		}
	}

	public void setCaseReason(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
			ExtentManager.pass("User is able to  select the case reason----- "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the case origin---- "  +  data  +  " from dropdown options in the " + label +  " field" );
		}
	}

	public void setWebEmail(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void setWebCompany(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}


	public void setWebName(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}


	public void setWebPhone(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void setProduct(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
			ExtentManager.pass("User is able to  select the required product---- "  +  data  +  " from the dropdown options in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the required product------ "  +  data  +  " from dropdown options in  the " + label +  " field" );
		}
	}

	public void setEngineeringReqNumber(String label,String data) throws Exception {

		try {
			settext1(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void setPotentialityLiability(String label,String data) throws Exception {

		selectdropdown(label, data);
		ExtentManager.pass("User is able to  select the required "  +  data  +  " from the dropdown options in  the " + label +  " field" );
		
	}

	public void setSlaViolation(String label,String data) throws Exception {

		try{
			selectdropdown1(label,data);
			ExtentManager.pass("User is able to  select the required "  +  data  +  " from the dropdown options in  the " + label +  " field" );
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to  select the required "  +  data  +  " from the dropdown options in  the " + label +  " field" );
		}
	}

	public void setSubject(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
		}
	}

	public void setDescription(String label,String data) throws Exception {

		try {
			settext(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in  the " + label +  " field" );
		}
	}


	public void setInternalCommands(String label,String data) throws Exception {

		try {
			setinput(label, data);
			ExtentManager.pass("User is able to send  the "  +  data  +  " in  the " + label +  " field" );
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User is not able to send  the "  +  data  +  " in  the " + label +  " field" );
		}
	}
	
	public void clicksave(String label) throws Exception {

		click(label);
		ExtentManager.pass("User able to perform a click function on  "  +  label  +  " button then it saves the creation data" );
		
	}
	
	public void saveddetails() throws Throwable {
       
		try {
			
			status(savedtext);
			ExtentManager.pass("case creation genearted status : "  +  details );
			
		}		
		catch (Exception e)
		{
			
			ExtentManager.fail("User  not able to create the case creation" );
		}
	}
	
	public void clickbutton() throws Exception {

		button.click();
		ExtentManager.pass("User able to perform a click on dropdown button for more options");
		
	}
	
	public void submitapproval(String label) throws Exception {

		try {
			clickaction(label);
			ExtentManager.pass("after the clicking the dropdown button User able to see the " +  label  + " perform a  click on  "  +  label  +   " its navigated  to approval comments");
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("after the clicking the drop button User not able to see the " +  label  + "");
		}
	}
	
	public void comments(String label ,String data) throws Exception {

		try {
			settext(label,data);
			ExtentManager.pass("User able to send a comments-----> "  +  data  + "  to the comment box ");
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User not bale  to see the comments box to send the "  +  data  + " in  "  +  label  +  " field");
		}
	}
	
	public void submit(String label) throws Exception {

		try {
			clickaction(label);
			waitForSFPagetoLoad();
			ExtentManager.pass("User able to perform a click function on "  +  label  +  " to send an approval request");
		}
		catch (Exception e)
		{
			
			ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
		}
	}
	
	public void approvalstatus() throws Throwable {

		try {
			status(savedtext);
			
		}
		catch (Exception e) {
			
			ExtentManager.fail("User  not able to send the approval request" );
			
			
		}
	}
	



}