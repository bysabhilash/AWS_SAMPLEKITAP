package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;

public class CaseslistApprovalpage extends SFPageBase {
	
	
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Case\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement cases;
	    
	    @FindBy(xpath = "//span[@title='Case History']")
	    private WebElement scrolltoapproval;
	    
	   
	    		
	
	 public CaseslistApprovalpage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	 
	 public void clickninesymbol() {
	        try {

	            SFClick(ninesymbol);
	            ExtentManager.pass("user is able to click the ninesymbol to enter the text value in to search apps and items");
	        } catch (Exception e) {
	            System.out.println("in catch");
	            ExtentManager.fail("user is not able to click the ninesymbol to enter the text value in to search apps and items");
	        }
	    }
	 
	 public void clickcases() throws InterruptedException {

	        SFClick(cases);
	        waitForSFPagetoLoad();
	        ExtentManager.pass("user is able to click the cases text  to navigate in to the cases page");

	        }
	 
	 
	 

	public void enterCases(String label,String data) throws Exception {

		try {
			setText(label, data);
			 ExtentManager.pass("user is able to send  the cases text  in to search apps and items");
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail("user is not able  to send  the cases text  in to search apps and items");
		}
	}
	
	
	public void notification(String label) throws Exception {

		try {
			click(label);
			ExtentManager.pass("user is able to see  the notification button with numbers click on the particular button. it navigates to see the all notifications");
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail("user is not able to see  the notification button with numbers click on the particular button");
		}
	}
	
	public void clickrelatedCasenumber(String label) throws Exception {

		try {
			clickrelated(label);
			ExtentManager.pass("user need to click the particular casenumber "  +  label  +  " which ever was able to see in the notifications ");
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail("user unable to click the particular casenumber "  +  label  +  " which ever was able to see in the notifications ");
		}
	}
	
	
	
	public void enterCasenumber(String label,String data) throws Exception {

		try {
			setText(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	public void clickCasenumber(String label) throws Exception {

		try {
			clickaction(label);
			ExtentManager.pass("click the case number "  +  label  +  " which it navigates in to the overview of the case creation");
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail(" not able click the case number "  +  label  +  " which it navigates in to the overview of the case creation");
		}
	}
	
	public void approvedetails(String label) throws Exception {

		try {
			clickrelated(label);
			ExtentManager.pass("click the "  +  label  +  " which it navigates in to the details of the case creation");
			
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail("not able to click the "  +  label  +  " which it navigates in to the details of the case creation");
		}
	}
	
	public void scrooltoelement() throws Exception {

		try {
			Thread.sleep(5000);
			scrollToElementview(scrolltoapproval);
			Thread.sleep(20000);

		}
		catch (Exception e)
		{
			System.out.println("In catch" );
		}
	}
	
	public void clickstatus(String label ) throws Exception {

		try {
			clickSFbutton(label);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	public void comments(String label ,String data) throws Exception {

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
			ExtentManager.pass("after mentioning the comments in to the box click the "  +  label  +  " button for accepting the request");
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
			ExtentManager.fail("after mentioning the comments in to the box unable to click the "  +  label  +  " button for accepting the request");
		}
	}
	
	
}