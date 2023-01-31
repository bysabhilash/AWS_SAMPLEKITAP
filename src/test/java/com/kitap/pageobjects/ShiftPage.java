package com.kitap.pageobjects;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
* @KT1461
* @date: 22/08/2022
* @Description: This page object covers methods for all the fields in salesforce of shift creation
*/

	public class ShiftPage extends SFPageBase {


	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Shift\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement shifts;


	    public ShiftPage(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);// Creates instance for all web elements
	    }
	    
	    /*
	     * @KT1461
	     * @date:22/08/2022
	     * @Description: This method performs clicking on app launcher in the salesforce home page
	     * @return values: opens app launcher
	     */
	
	
	public void clickninesymbol() {
        try {

            SFClick(ninesymbol);
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }
	
	 /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs entering shift on searchbox in ninesymbol
	 * @Param: accepts arguments label and data as input
	 * @return values: entering Description asset
	 */
	
	 public void entershift(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	        }
	    }
	 
 /*
	* @KT1461
	* @date: 22/08/2022
	* @Description: This method performs clicking on entered value  on the nine symbol search box
	* @return values: opens new dashboard  page of shift
	*/
	 
	 public void clickshift() throws InterruptedException {
       
		 try {
	        SFClick(shifts);
		 } 
		 catch (Exception e) {
			 
	            System.out.println("In catch");
	        }
	    }

	 
 /*
	* @KT1461
	* @date: 22/08/2022
	* @Description: This method performs clicking on new button on the shift's page
	* @Param: accepts one argument label as input
	* @return values: opens new shift's page
	*/
	 
	 public void clickNew(String lable) throws Exception {

	        clickSFbutton(lable);
	        waitForSFPagetoLoad();
   }
	 
	 /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs entering starttime on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: entering starttime
	 */
	 
	 public void setstarttime(String lable, String data) throws Exception {
	   try {
           setinput(lable, data);
       } catch (Exception e) {
           System.out.println("In catch" + lable);
       }
   }
	 
	 /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs entering end time on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: entering endtime 
	 */
	 
	 public void setendtime(String lable, String data) throws Exception {
		   try {
			   setinput(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
    /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs selecting status on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: selecting status
	 */
 
	 public void setstatus(String lable, String data) throws Exception {
		   try {
	           selectdropdown(lable, data);
	           waitForSFPagetoLoad();
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
    /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs selecting timeslot on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: selecting timeslot
	 */
	 
	 public void settimeslottype(String lable, String data) throws Exception {
		   try {
	           selectdropdown(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
    /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs selecting worktype on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: selecting worktype
	 */
	 
	 public void enterworktypegroup(String label,String data) throws InterruptedException {
	    	try {
	        selectcombobox(label, data);      
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
   /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs selecting service territory on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: selecting service territory
	 */
	 
	 public void enterserviceterritory(String label,String data) throws InterruptedException {
	    	
	    	try {
	       selectcombobox(label, data);
	       
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
    /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs selecting service resources on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: selecting service resources
	 */
	 
	 public void enterserviceresource(String label,String data) throws InterruptedException {
	    	
	    	try {
	       selectcombobox(label, data);
	       
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
	 /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs entering label on shift's page
	 * @Param: accepts arguments label and data as input
	 * @return values: entering label in shift page
	 */
	 
	 public void setlabel(String lable, String data) throws Exception {
		   try {
	           settext1(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 /*
	 * @KT1461
	 * @date: 22/08/2022
	 * @Description: This method performs saving shift's page
	 * @Param: accepts argument label as input
	 * @return values: saving record
	 */
	 
	  public void clicksave(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	 
}