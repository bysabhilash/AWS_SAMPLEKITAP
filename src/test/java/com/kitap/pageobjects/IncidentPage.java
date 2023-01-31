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

import kitap.SFPageBase;

public class IncidentPage extends SFPageBase{
	 public IncidentPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	   @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
	 
	   @FindBy(xpath="//*[@id=\"Incident\"]/div/lightning-formatted-rich-text/span/p")
	    private WebElement clickincident;

	    public void clickninesymbol() throws InterruptedException {
			SFClick(ninesymbol);
			 waitForSFPagetoLoad();
		}
	    
	    public void Incident() throws InterruptedException {
	    	
	    	SFClick(clickincident);
	    	waitForSFPagetoLoad();

	    }
	    
	    public void clicknewbutton(String label) throws Exception {

	    	clickSFbutton(label);
	    	waitForSFPagetoLoad();
	    }

	    public void setsubject(String label,String data) throws Exception {

	    	setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }
		public void setdescription(String label,String data) throws Exception {

			setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectstatus(String label,String data) throws Exception {

	    	selectdropdown(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectparentincident(String label,String data) throws Exception {

	    	selectcombobox(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    	    
	    public void selectpriority(String label,String data) throws Exception {

	    	selectdropdown(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    public void selecturgency(String label,String data) throws Exception {

	    	selectdropdown(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    public void selectimpact(String label,String data) throws Exception {

	    	selectdropdown1(label,data);
	    	   waitForSFPagetoLoad();

	    } 
	    public void setpriorityreason(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectentitlement(String label,String data) throws Exception {

	    	selectcombobox(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    

		  public void setresolvedperson(String label,String data) throws Exception {
		  selectcombobox(label, data);
		  waitForSFPagetoLoad(); 
		}
		 
	    public void setdetecteddate(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }

	    public void setstartdate(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }

	    public void setresolutiondate(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }


	    public void setenddate(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }

	    public void setresolutionsummary(String label,String data) throws Exception {

	    	   setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    
	    public void clicksavebutton(String label) throws Exception {

	    	click(label);
	    	 waitForSFPagetoLoad();

	    }


}




