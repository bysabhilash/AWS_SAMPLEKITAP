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

public class CaseServiceApproval extends SFPageBase {
	

	
	@FindBy(xpath="//table//tbody//tr//th//following::input[@value='Save']")
	private WebElement ele;
	
	@FindBy(xpath="//div//div[@class='windowViewMode-normal oneContent active lafPageHost']//div[@class='actionBody']//following::iframe")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='oneWorkspaceTabWrapper']//div//following::iframe")
	private WebElement frame2;
	
	@FindBy(xpath="//button[normalize-space()='Submit for Approval']")
	private WebElement button;
	
	@FindBy(xpath="//*[@id=\"topButtonRow\"]/input[4]")
	private WebElement login;
	
	@FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;//*[@id="07p0y00000001FRAAY"]/div/lightning-formatted-rich-text/span/p
	
	@FindBy(xpath = "//*[@id=\"07p0y00000001FRAAY\"]/div/lightning-formatted-rich-text/span/p")
    private WebElement warranty;
	
	@FindBy(xpath = "//lightning-button-menu[@data-target-reveals='sfdc:CustomButton.Case.Select_Assets,sfdc:CustomButton.Case.Clone_Header,sfdc:StandardButton.Case.Submit,sfdc:StandardButton.Case.CaseHierarchy']//button[@type='button']")
    private WebElement dropbutton;
	 
	 @FindBy(xpath = "(//span[text()='Parent Escape Type'])[2]")
	 private WebElement ele2;
	 
	 @FindBy(xpath = "(//span[text()='Case Origin'])[2]")
	 private WebElement ele3;
	 
	 @FindBy(xpath = "(//span[text()='Parent Case'])[2]")
	 private WebElement ele4;
	 
	 @FindBy(xpath = "(//span[text()='Date/Time Closed'])[3]")
	 private WebElement ele5;
	 
	 @FindBy(xpath = "//button[text()='Edit']")
	 private WebElement edit;
	 
	 
	
	
	 public CaseServiceApproval(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	 public void clickchildcase(String value) throws Exception {

			try{
				clickrelated(value);
				waitForSFPagetoLoad();
				ExtentManager.pass("User is able to Perform a  click  on  the "  + value   );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
			}
		}
	 
	 
	 public void clickcaseservice(String label) throws Exception {

			try{
				clickaction(label);
				ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
			}
		}
		
		public void clicknew(String label) throws Exception {

			clickSFbutton(label);
			ExtentManager.pass("User is able to Perform a  click  on  the "  + label +  " button  ");
			waitForSFPagetoLoad();
		}
		
		public void selectunit(String data) throws Exception {

			try {
				swtich_actionperformance( data);
				//ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void setdescription(String label,String data) throws Exception {

			try {
				driver.switchTo().frame(frame);
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void sethoursrequested(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void sethoursapproval(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void labouramountreq(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void labouramountapproval(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void daikinpartamountrequest(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void daikinpartamountapproved(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void subcontractamountrequest(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void subcontractamountapproved(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void materialsamountrequest(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void materialsamountapproved(String label,String data) throws Exception {

			try {
				setText(label, data);
				ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		public void clicksave() throws Exception {

			try {
				
				ele.click();
				driver.switchTo().defaultContent();
				waitForSFPagetoLoad();
				ExtentManager.pass("User is able to Perform a  click  on  the save button  ");
			}
			catch (Exception e)
			{
				
				//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
			}
		}
		
		 public void clickcasenumber(String label) throws Exception {

				try{
					performclick(label);
					waitForSFPagetoLoad();
					ExtentManager.pass("User is able to Perform a  click  on  the " +  label  +  " button  ");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
				}
			}
		 
		 public void clickparentnumber(String label) throws Exception {

				try{
					performclick(label);
					waitForSFPagetoLoad();
					ExtentManager.pass("User is able to Perform a  click  on  the " +  label  +  " button  ");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
				}
			}
		 
		 public void clickbutton() throws Exception {

				dropbutton.click();
				ExtentManager.pass("User able to perform a click on dropdown button for more options");
				
			}
		 
		 
		 
		 public void clicksubmitapprovalbutton() throws Exception {

				try{
					button.click();
					ExtentManager.pass("User is able to Perform a  click  on  the submit for approval  button  ");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
				}
			}
		 
		 public void comments(String label ,String data) throws Exception {

				try {
					settext(label,data);
					ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
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
			
			public void scrolling() throws Throwable {

				try {
					scroll(ele2);
					ExtentManager.pass("User able to perform a scroll function until approval history is displayed");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
				
			public void clickapprovalhistory(String label) throws Exception {

				try {
					clicklink(label);
					ExtentManager.pass("User able to perform a click function on "  +  label    );
				}
				catch (Exception e)
				{
					
					ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clickapprover(String label) throws Exception {

				try {
					clicklink(label);
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					
					ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clickuserdetail(String label) throws Exception {

				try {
					clickSFbutton(label);
					ExtentManager.pass("User able to perform a click function on "  +  label    );
					waitForSFPagetoLoad();
				}
				catch (Exception e)
				{
					
					ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clicklogin() throws Exception {

				try {
					driver.switchTo().frame(frame2);
					Thread.sleep(2000);
					login.click();
					driver.switchTo().defaultContent();
					
					ExtentManager.pass("User able to perform a click function on login ");
				}
				catch (Exception e)
				{
					
				//	ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clicknotification(String label) throws Exception {

				try {
					click(label);
					waitForSFPagetoLoad();
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					
				//	ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clickapprovalcase(String label) throws Exception {

				try {
					clickrelated(label);
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					
				//	ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
			
			public void clickapprovalstatus(String label ) throws Exception {

				try {
					clickSFbutton(label);
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					System.out.println("In catch" +label);
				}
			}
			
			public void entercomments(String label ,String data) throws Exception {

				try {
					settext(label,data);
					ExtentManager.pass("user able to see the comments box to send the "  +  data  + " in to "  +  label  +  " field");
				}
				catch (Exception e)
				{
					System.out.println("In catch" +label);
					ExtentManager.fail("user not able  to see the comments box to send the "  +  data  + " in to "  +  label  +  " field");
				}
			}
			
			public void Approve(String label) throws Exception {

				try {
					clickaction(label);
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					System.out.println("In catch" +label);
					ExtentManager.fail("after mentioning the comments in to the box unable to click the "  +  label  +  " button for accepting the request");
				}
			}
			
			public void clicklogout(String label) throws Exception {

				try {
					clickaction(label);
					ExtentManager.pass("User able to perform a click function on "  +  label  );
				}
				catch (Exception e)
				{
					System.out.println("In catch" +label);
					ExtentManager.fail("after mentioning the comments in to the box unable to click the "  +  label  +  " button for accepting the request");
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
			
			public void clickwarranty() {
		        try {

		            warranty.click();
		            ExtentManager.pass("User is able to perform click on the nineapps icon of home page  ");
		        } catch (Exception e) {
		            
		            ExtentManager.fail("User is not able to click the ninesymbol to enter the text value in search apps and items");
		        }
			}
		        
	        public void clickparentcases(String label) throws Exception {

				try{
					clickrelated(label);
					//ExtentManager.pass("User is able to  select the type--- "  +  data  +  " from dropdown options in the " + label +  " field" );
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
				}
			}
	        
	        public void clickedit() throws Exception {

				try{
					edit.click();
					//ExtentManager.pass("User is able to  select the type--- "  +  data  +  " from dropdown options in the " + label +  " field" );
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User is not able to  select the type---- "  +  data  +  "  from dropdown options in the " + label +  " field" );
				}
			}
	        
	        public void scroll() throws Throwable {

				try {
					scroll(ele4);
				//	ExtentManager.pass("User able to perform a click function on "  +  label  +  " to send an approval request");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
	        
	        public void scrolltoele() throws Throwable {

				try {
					scroll(ele5);
				//	ExtentManager.pass("User able to perform a click function on "  +  label  +  " to send an approval request");
				}
				catch (Exception e)
				{
					
					//ExtentManager.fail("User not able to perform a click function on "  +  label  +  " to send an approval request");
				}
			}
	        
	        public void selectstatus(String label,String data) throws Exception {

	    		try {
	    			selectdropdown(label, data);
	    			//ExtentManager.pass("User is able to send  the "  +  data  +  " in the " + label +  " field" );
	    		}
	    		catch (Exception e)
	    		{
	    			
	    			//ExtentManager.fail("User is not able to send  the "  +  data  +  " in the " + label +  " field" );
	    		}
	    	}
		    }
			
			
		


