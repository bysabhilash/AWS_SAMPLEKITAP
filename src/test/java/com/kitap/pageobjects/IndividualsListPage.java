package com.kitap.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

	public class IndividualsListPage extends SFPageBase {


	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Individual\"]/div/lightning-formatted-rich-text/span/p")
	    private WebElement individuals;


	    public IndividualsListPage(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	    }
	
	
	public void clickninesymbol() {
        try {

            SFClick(ninesymbol);
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }
	
	 public void enterindividuals(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	        }
	    }
	 
	 public void clickindividual() throws InterruptedException {

	        SFClick(individuals);

	        }
	 
	 public void clickNew(String lable) throws Exception {

	        clickSFbutton(lable);
	        waitForSFPagetoLoad();
   }
	 
	 public void setsalutation(String lable, String data) throws Exception {
	   try {
           selectdropdown(lable, data);
          } 
	     catch (Exception e) 
	     {
           System.out.println("In catch" + lable);
       }
   }
	 
	 public void setfirstname(String lable, String data) throws Exception {
		   try {
			  setinput(lable, data);
	       } 
		   catch (Exception e)
		   {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 public void setlastname(String lable, String data) throws Exception {
		 try {
			  setinput(lable, data);
	       } 
		   catch (Exception e)
		   {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 public void setbirthdate(String lable, String data) throws Exception {
		 try {
			  setinput(lable, data);
	       } 
		   catch (Exception e)
		   {
	           System.out.println("In catch" + lable);
	       }
	   }
	  
	  public void clickdontprocess(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	  
	  public void clickdontmarket(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	  
	  public void clickexportindividualdata(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	  
	  public void clickdataelsewhere(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	  
	  public void clickdontprofile(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	  
	  public void clickdonttrack(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	  
	  public void clickforgetindividual(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	  
	  public void setindividualsage(String lable, String data) throws Exception {
		   try {
	           selectdropdown(lable, data);
	          } 
		     catch (Exception e) 
		     {
	           System.out.println("In catch" + lable);
	       }
	   }
	  
	  public void clicksave(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	 
	 
}


