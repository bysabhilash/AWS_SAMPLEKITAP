package com.kitap.pageobjects;

import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class PaymentPage extends SFPageBase {

	  public PaymentPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
		    // Creates instance for all web elements
	  
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
		
		@FindBy(xpath = "//*[@id=\"Payment\"]/div/lightning-formatted-rich-text/span/p/b")
		private WebElement clickpayments;
   
	    public void clickninesymbol() throws InterruptedException {
			SFClick(ninesymbol);
			 waitForSFPagetoLoad();
		}

	    public void clickpayments() throws InterruptedException {
	    	
	    	SFClick(clickpayments);
	    	waitForSFPagetoLoad();
	    }
	    
	    public void clicknewbutton(String label) throws Exception {

	    	clickSFbutton(label);
	    	 waitForSFPagetoLoad();

	    }

	    public void selectaccountname(String label,String data) throws Exception {
            selectcombobox(label, data);
	        waitForSFPagetoLoad();
	      }
	    
	    public void setamount (String label,String data) throws Exception {

	    	   setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectprocessingmode(String label,String data) throws Exception {

	    	   selectdropdown(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setdate(String label,String data) throws Exception {

	    	   setText(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectstatus(String label,String data) throws Exception {

	    	selectdropdown(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void selecttype(String label,String data) throws Exception {

	    	selectdropdown(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void seteffectivedate(String label,String data) throws Exception {

	    	   settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setcomments(String label,String data) throws Exception {

	    	setinput(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationdate(String label,String data) throws Exception {

	    	   settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationeffectivedate(String label,String data) throws Exception {

	    	   settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void selectresultcode(String label,String data) throws Exception {

	    	   selectdropdown(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationresultcode(String label,String data) throws Exception {

	    	   settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setgatewatyresultcode(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setgatewatyreferncenumber(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setgatewaydate(String label,String data) throws Exception {

	    	 settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setgatewatyresultcodedescription(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setgatewatyreferncedetails(String label,String data) throws Exception {

	    	setinput(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationgatewayresultcode(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationgatewaydate(String label,String data) throws Exception {

	    	 settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    
	    public void setcancellationgatewayreferncenumber(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setmacaddress(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setphone(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    
	    public void setipaddress(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }
	    public void setauditmail(String label,String data) throws Exception {

	    	settext1(label,data);
	    	 waitForSFPagetoLoad();

	    }

	    public void clicksavebutton(String label) throws Exception {

	    	click(label);
	    	   waitForSFPagetoLoad();

	    }
}
	   


