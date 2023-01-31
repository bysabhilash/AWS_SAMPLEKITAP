package com.kitap.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Mob_SfHospitalmanagement   {
	
	AndroidDriver driver;
	public Mob_SfHospitalmanagement(AndroidDriver driver)
	{
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.salesforce.chatter:id/mi_accept")
	public WebElement agree;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Menu']")
	public WebElement menu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Hospital Management']")
	public WebElement hospitalmanagement;
	
	@AndroidFindBy(id="com.salesforce.chatter:id/object_list_new_button")
	public WebElement New;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@index='1']")
	public WebElement hospitalname;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Services']")
	public WebElement clickservices;
		
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='General Check-up']")
	public WebElement services;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement fees;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement doctorname;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[7]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement telephone;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement patientname;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement patientaddress;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement email;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement zipcode;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement phone;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement city;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.widget.Spinner")
	public WebElement date;
	
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.widget.EditText")
	public WebElement state;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Payment Mode']")
	public WebElement clickpaymentmode;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Cash']")
	public WebElement selectpaymentmode;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Save']")
	public WebElement save;
	
	

	 public void clickagree() throws InterruptedException {
			
	    	try {
			     agree.click();
	    	}
	    	catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
		}
	 
	
    public void clickmenu() throws InterruptedException {
		
    	try {
		     menu.click();
    	}
    	catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
 public void clickhospitalmanagement() throws InterruptedException {
		
    	try {
    		hospitalmanagement.click();
    	}
    	catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
 
 public void clicknew() throws InterruptedException {
		
 	try {
 		New.click();
 	}
 	catch (Exception e) {
         System.out.println(e.getMessage());
     }
 	
  }
 
 public void enterhospitalname(String text) throws InterruptedException {
		
	 	try {
	 		hospitalname.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 public void selectdropdown() throws InterruptedException {
		
	 	try {
	 		clickservices.click();
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 public void selectservices() throws InterruptedException {
		
	 	try {
	 		services.click();
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 public void setfees(String text) throws InterruptedException {
		
	 	try {
	 		fees.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 public void setdname(String text) throws InterruptedException {
		
	 	try {
	 		doctorname.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void settelephone(String text) throws InterruptedException {
		
	 	try {
	 		telephone.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setpatientname(String text) throws InterruptedException {
		
	 	try {
	 		patientname.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setpatientaddress(String text) throws InterruptedException {
		
	 	try {
	 		patientaddress.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setmail(String text) throws InterruptedException {
		
	 	try {
	 		email.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setcode(String text) throws InterruptedException {
		
	 	try {
	 		zipcode.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setphone(String text) throws InterruptedException {
		
	 	try {
	 		phone.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setcity(String text) throws InterruptedException {
		
	 	try {
	 		city.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setdate(String text) throws InterruptedException {
		
	 	try {
	 		date.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void setstate(String text) throws InterruptedException {
		
	 	try {
	 		state.sendKeys(text);
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void clickingpayemnetmode() throws InterruptedException {
		
	 	try {
	 		clickpaymentmode.click();
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 
 public void selectingpaymentmode() throws InterruptedException {
		
	 	try {
	 		selectpaymentmode.click();
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
 public void clicksave() throws InterruptedException {
		
	 	try {
	 		save.click();
	 	}
	 	catch (Exception e) {
	         System.out.println(e.getMessage());
	     }
	 	
	  }
 
    
	
}

