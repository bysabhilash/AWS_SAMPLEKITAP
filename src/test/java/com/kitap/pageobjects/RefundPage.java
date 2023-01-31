package com.kitap.pageobjects;

import org.openqa.selenium.Keys; 
   
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;
import kitap.SFPageClassic;

/*
* @KT1461
* @date: 13/07/2022
* @Description: This page object covers methods for all the fields in salesforce of Refunds creation
*/

public class RefundPage extends SFPageBase {

	  public RefundPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
		    // Creates instance for all web elements
	  
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
		
		@FindBy(xpath = "//*[@id=\"Refund\"]/div/lightning-formatted-rich-text/span/p/b")
		private WebElement clickrefund;
		
		 /*
	     * @KTV1461
	     * @date: 13/07/2022
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
	            System.out.println("In catch" );
	        }
	    }
	    
	    /*
	     * @KT1461
	     * @date: 13/07/2022
	     * @Description: This method performs entering input as refunds in app launcher of salesforce home page
	     * @Param: accepts two Param  label and value as input
	     * @return values: related screen name appear in applauncher
	     */
	    public void enterrefunds(String label,String data) throws Exception {

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
	     * @date: 13/07/2022
	     * @Description: This method performs clicking  on the refunds page
	     * @return values: opens dashboards page 
	     */

	    public void clickrefund() throws InterruptedException {
	    	
	    	try {
	    	
		    	SFClick(clickrefund);
		    	waitForSFPagetoLoad();
	    }
	    	catch (Exception e)
	        {
	            System.out.println("In catch" );
	        }
	    }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs clicking on new button on the refunds page
		 * @Param: accepts one argument label as input
		 * @return values: opens new refunds page
	    */
	    
	    public void clicknewbutton(String label) throws Exception {
	    	try{
				clickSFbutton(label);
			}
			catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs searching for  account name on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates parent account name
		 */
	    
	    public void selectaccountname(String label,String data) throws Exception {
	        try {
	    	selectcombobox(label, data);
	        waitForSFPagetoLoad();
	      }
	        catch (Exception e)
			{
				System.out.println("In catch" +label);
			}
		}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs enters amount on the refunds page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates amount
		 */
	    
	    public void setamount (String label,String data) throws Exception {
              
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
		 * @date: 13/07/2022
		 * @Description: This method performs selecting processingmode on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates processing mode
		 */
	    
	    public void selectprocessingmode(String label,String data) throws Exception {
               
	    	 try {
	    	   selectdropdown(label,data);
	    	   waitForSFPagetoLoad();
	    }
	    	 catch (Exception e)
	 		{
	 			System.out.println("In catch" +label);
	 		}
	 	}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs selecting status on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates status 
		 */
	    
	    public void selectstatus(String label,String data) throws Exception {
            
	    	try {
	    	selectdropdown(label,data);
	    	 waitForSFPagetoLoad();
	    }
	    	 catch (Exception e)
	 		{
	 			System.out.println("In catch" +label);
	 		}
	 	}
	    
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs selecting type on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates type 
		 */
	    
	    public void selecttype(String label,String data) throws Exception {
            
	    	try {
	    	selectdropdown(label,data);
	    	 waitForSFPagetoLoad();
	    }
	        catch (Exception e)
 		 {
 			System.out.println("In catch" +label);
 		 }
 	}
	    
		/*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering date on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates date
		 */
	    
	    public void setdate(String label,String data) throws Exception {
             
	    	try {
	    	   setText(label,data);
	    }
	    	 catch (Exception e)
	 		 {
	 			System.out.println("In catch" +label);
	 		 }
	 	}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering comments on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates comments
		 */

	    public void setcomments(String label,String data) throws Exception {
            
	    	try {
	    	settext(label,data);
	    }
	    	 catch (Exception e)
	 		 {
	 			System.out.println("In catch" +label);
	 		 }
	 	}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationdate on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellation date
		 */
	    
	    public void setcancellationdate(String label,String data) throws Exception {
            try {
	    	settext1(label,data);
	     }
            catch (Exception e)
	 		 {
	 			System.out.println("In catch" +label);
	 		 }
	 	}
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationeffectivedate on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellationeffective date
		 */
	    
	    public void setcancellationeffectivedate(String label,String data) throws Exception {
            
	    	try {
	    	settext1(label,data);
	    }
	       catch (Exception e)
		   {
			System.out.println("In catch" +label);
		   }
	   }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs selecting result code on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates result code 
		 */
	    
	    public void selectresultcode(String label,String data) throws Exception {
               
	    	try {
	    	   selectdropdown(label,data);
	    	   waitForSFPagetoLoad();
	    }
	    	 catch (Exception e)
			   {
				System.out.println("In catch" +label);
			   }
		 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationresultcode on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellationresultcode
		 */
	    
	    public void setcancellationresultcode(String label,String data) throws Exception {
               
	    	try {
	    	   settext1(label,data);
	   }
	    	 catch (Exception e)
			   {
				System.out.println("In catch" +label);
			   }
		 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering gatewayresultcode on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates gatewayresultcode 
		 */
	    
	    public void setgatewatyresultcode(String label,String data) throws Exception {
            
	    	try {
	    	settext1(label,data);
	    }
	    	 catch (Exception e)
			   {
				System.out.println("In catch" +label);
			   }
		 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering gatewayreferncenumber on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates gatewayreferncenumber
		 */
	    
	    public void setgatewatyreferncenumber(String label,String data) throws Exception {

	    	try {
	    	settext1(label,data);
	    }
	    	 catch (Exception e)
			   {
				System.out.println("In catch" +label);
			   }
		 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering gateway date on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates gateway date
		 */
	    
	    public void setgatewaydate(String label,String data) throws Exception {

	    	try {
	    	settext1(label,data);
	    }
	    	 catch (Exception e)
			   {
				System.out.println("In catch" +label);
			   }
		 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering gatewatyresultcodedescription on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates gatewayresultcode description
		 */
	    
	    public void setgatewatyresultcodedescription(String label,String data) throws Exception {
	    	
	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationgatewayresultcode on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellationgatewayresultcode
		 */
	    
	    public void setcancellationgatewayresultcode(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationgatewaydate on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellationgatewaydate
		 */
	    
	    public void setcancellationgatewaydate(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering cancellationgatewayreferncenumber on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates cancellationgatewayreferncenumber
		 */
	    
	    public void setcancellationgatewayreferncenumber(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering macaddress on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates macaddress
		 */
	    
	    public void setmacaddress(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering phone on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates phone
		 */
	    
	    public void setphone(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering ip-address on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates ip-address
		 */
	    
	    public void setipaddress(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs entering audit mail on the refunds page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates audit-mail
		 */
	    
	    public void setauditmail(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);
		    }
		    	 catch (Exception e)
				   {
					System.out.println("In catch" +label);
				   }
			 }
	    
	    /*
		 * @KT1461
		 * @date: 13/07/2022
		 * @Description: This method performs clicking save button on  refunds page
		 * @Param: accepts one argument i.e label
		 * @return values: saving record
		 */

	    public void clicksavebutton(String label) throws Exception {

	    	try {
	    	click(label);
	    	   waitForSFPagetoLoad();

	    }
	    	catch (Exception c)
			{
				System.out.println("In catch"+label);
			}

		}
}
	   




