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
 * @date: 19/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of contract creation
 */


public class ContractsPage extends SFPageBase {

	  public ContractsPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	
	  /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs clicking on new button on the contract's page
		 * @Param: accepts one argument label as input
		 * @return values: opens new contract page
		 */

	    public void clicknewbutton(String label) throws Exception {

	    	try {
	    	      clickSFbutton(label);
	    	      
	    	 }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs entering accountname  on the contracts page
         * @Param: accepts two Param label &data as input
         * @return values: populates Reports to accountname
	     */

	    public void selectaccountname(String label,String data) throws Exception {
	    	
	    	try {
	              selectcombobox(label, data);
	          
	      }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs entering customersignedperson  on the contracts page
         *@Param: accepts two Param label &data as input
         * @return values: populates Reports to customersignedbyperson
	     */
	    
	    public void selectcustomersignedby(String label,String data) throws Exception {
	    	try {
	              selectcombobox(label, data);
	             
	      }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters customer sign title name on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates customersignedtitle name
		 */
	    
	    public void setcustomersigntitle (String label,String data) throws Exception {
            
	    	try {
	    	settext1(label,data);    	   
	    }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters date of customer signed name on the contrats page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates customersign date
		 */
	    
	    public void setcustomersigndate (String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs entering selectingbook  on the contracts page
         *@Param: accepts two Param label &data as input
         * @return values: populates Reports to price book
	     */
	    
	    public void selectpricebooks(String label,String data) throws Exception {
	    	try {
	    		selectcombobox(label,data);
    	        
    }
    	catch (Exception e)
		{
			System.out.println("In catch"+label);
		}

	}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs selecting Status on the contracts page
         * @Param: accepts two Param label and data as input
         * @return values: populates Status
	     */
	    
	    
	    public void selectstatus(String label,String data) throws Exception {

	    	try {
	    	        selectdropdown(label,data);
	    	       
	    }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enterscontractsigndate on the contract page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates contract sign date
		 */
	    
	    public void setcontractsigndate (String label,String data) throws Exception {

	    	try {
	    	   setinput(label,data);
	    }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}

		}
	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters contractterm on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates term
		 */
	    
	    public void setcontractterm (String label,String data) throws Exception {

	    	try {
		    	   setinput(label,data);
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs selecting Ownersnotice on the contracts page
         * @Param: accepts two Param label and data as input
         * @return values: populates OnersExpiratonnotice
	     */
	    
	    public void selectownerexpiratonnotice(String label,String data) throws Exception {

	    	try {
    	        selectdropdown(label,data);
    	       
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}
		
			}
	    
	    /*
	     * @KT1461
	     * @date: 19/07/2022
	     * @Description: This method performs entering signedperson  on the contracts page
         *@Param: accepts two Param label &data as input
         * @return values: populates Reports to signedperson
	     */

	    public void selectsignedperson(String label,String data) throws Exception {
	    	
	    	try {
	    	selectcombobox(label, data);
		       
	    }
	    	catch (Exception e)
			{
				System.out.println("In catch"+label);
			}
	
		}
	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters companysigndate on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates date
		 */
	    
	    public void setcompanysigneddate(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters billing street on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates billingstreet
		 */
	    
	    public void setbillingstreet(String label,String data) throws Exception {

	    	try {
	    		settext(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters billingcity on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates billingcity 
		 */
	    
	    public void setbillingcity(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters billingstate on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates billingstate
		 */
	    
	    public void setbillingstate(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters billingcode on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates billingcode
		 */
	    
	    public void setbillingcode(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters billingcountry on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates billingcountry
		 */
	    
	    public void setbillingcountry(String label,String data) throws Exception {

	    	try {
		    	settext1(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters specialterms on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates Specialterm
		 */
	    
	    public void setspecialterms(String label,String data) throws Exception {

	    	try {
	    		settext(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs enters description on the contracts page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates description
		 */
	    
	    public void setdescription(String label,String data) throws Exception {

	    	try {
	    		settext(label,data);    	   
		    }
		    	catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

			}

	    
	    /*
		 * @KT1461
		 * @date: 19/07/2022
		 * @Description: This method performs selecting save button on  contracts page
		 * @Param: accepts one argument i.e label
		 * @return values: saving record
		 */
	    

	    public void clicksavebutton(String label) throws Exception {

	    	try {    		
	    	       click(label);
	    	       waitForSFPagetoLoad();

			 }
			    catch (Exception e)
				{
					System.out.println("In catch"+label);
				}

	}
}
	   



