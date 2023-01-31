package com.kitap.pageobjects;

import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;
import kitap.SFPageClassic;


/*
* @KT1456
* @date: 13/07/2022
* @Description: This page object covers methods for all the fields in salesforce of contactcreation
*/

public class ContactListPage extends SFPageBase{
	
	
	@FindBy(xpath = "//div[@class='slds-icon-waffle']")
	private WebElement ninesymbol;


	@FindBy(xpath = "//*[@id=\"Contact\"]/div/lightning-formatted-rich-text/span/p/b")
	private WebElement contacts;

	
	
	 public ContactListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	 
	 public void clickninesymbol() {
	        try {

	            SFClick(ninesymbol);
	        } catch (Exception e) {
	            System.out.println("in catch");
	        }
	    }
	 
	 
	 public void entercontacts(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	        }
	    }

	 
	 public void clickcontacts() throws InterruptedException {

	        SFClick(contacts);

	        }

	    	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs clicking new button on the contact's page
         * @Param: accepts Param label  as input
         * @return values: populates Newcontact creation will open
	     */
	    
	    public void clicknewbutton(String label) throws Exception {
            
	    	try {
	    	clickSFbutton(label);
	    	 
	    	}
	    	catch (Exception e)
			{
				System.out.println("In catch" + label );
			}

	    }
	    
	    /*
	     * @KT1456
	     *@date: 13/07/2022
	     * @Description: This method performs entering contact's firstname on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Firstname
	     */

	   
	    
	    public void setFirstname(String label,String data) throws Exception {
                
	    	   try {
	    	   setText(label,data);
	    	  
	    	   }
	    	   catch (Exception e)
				{
					System.out.println("In catch" + label );
				}
	    	   

	    }
	    
	    /*
	     * @KT1456
	     *@date: 13/07/2022
	     * @Description: This method performs entering contact's lastnamename on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Lasttname
	     */
	    
	    public void setLastname(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}
		    	   

		    }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering title on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Title
	     */
	    
	    public void setTitle(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}
		    	   

	    }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's parentaccount on the contact's page
         * @Param: accepts two Param label& data as input
         * @return values: populates Parentaccount
	     */
	    
	    public void enterParentAccount(String label,String data) throws InterruptedException {
	    	
	       try {
	       selectcombobox(label, data);
	        
	       }
	        catch (Exception e) {
			
				System.out.println("In catch" );
			}
	        
	      }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's department on the contact's page
         * @Param: accepts  Param label and data as input
         * @return values: populates Department
	     */
	    
	    public void setDepartment(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}
		    	   

	    }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's birthdate on the contact's page
         * @Param: accepts  Param label and data as input
         * @return values: populates Birthdate
	     */
	    
	    public void setBirthdate(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact  on the contact's page
         * @Param: accepts two Param label& data as input
         * @return values: populates Reports to contactperson
	     */
	    
	    public void entersearchcontact(String label,String data) throws InterruptedException {
	    	
	    	try {
	       selectcombobox(label, data);
	       
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

 }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs selecting contact's leadsource on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Lead source
	     */
	    
	    public void selectLeadsource(String label,String data) throws Exception {

	    	 try {
		    	   selectOption(label,data);
		    	   
		          }
		    	  catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	   }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's assistantno on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Asst.phone
	     */
	    
	    public void setassistantNo(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's assistantname on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Assistant
	     */
	    
	    public void setAssistantname(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    /*
	     * @KT1456
	    * @date: 13/07/2022
	     * @Description: This method performs entering contact's emailid on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Email 
	     */
	    
	    public void setEmailid(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's phonenumber on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Phone
	     */
	    
	    public void setPhonenumber(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT@KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's homenumber on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Home Phone
	     */
	    
	    public void setHomenumber(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     *@KT1456
	    * @date: 13/07/2022
	     * @Description: This method performs entering contact's mobilenumber on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mobile
	     */
	    
	    public void setMobilenumber(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's othernumber on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Other Phone
	     */
	    
	    	    
	    public void setOthernumber(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's faxnumber on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Fax
	     */
	    
	    public void setFaxnumber(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   waitForSFPagetoLoad();
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's mailingstreet on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mailing Street
	     */
	    
	    public void setMailingstreet(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   waitForSFPagetoLoad();
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's mailingcity on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mailing City
	     */
	    
	    public void setMailingcity(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's mailingstate on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mailing State
	     */
	    
	    public void setMailingstate(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     *@KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's mailingcode on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mailing Code
	     */
	    
	    public void setMailingcode(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's mailingcountry on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Mailing Country
	     */
	    
	    public void setMailingcountry(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's otherstreet on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Other Street
	     */
	    
	    public void setOtherstreet(String label,String data) throws Exception {
	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This test covers the creation of an contactpage via UI
	       @return values: returns webelement
	     */
	    
	    public void setOthercity(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's otherstate on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Other State
	     */
	    
	    public void setOtherstate(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	    * @date: 13/07/2022
	     * @Description: This method performs entering contact's othercode on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Other Code
	     */
	    
	    public void setOthercode(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's othercountry on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Other Country
	     */
	    
	    public void setOthercountry(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	  
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's languages on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Languages
	     */
	    
	    public void setlanguages(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs selecting contact's level on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Level
	     */
	    
	    public void selectlevel(String label,String data) throws Exception {
               
	    	  try {
	    	   selectOption(label,data);
	    	  
	          }
	    	  catch (Exception e)
				{
					System.out.println("In catch" + label );
				}

   }
	    	  
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs entering contact's description on the contact's page
         * @Param: accepts two Param label and data as input
         * @return values: populates Description
	     */
	    
	    public void setdescription(String label,String data) throws Exception {

	    	 try {
		    	   setText(label,data);
		    	   
		    	   }
		    	   catch (Exception e)
					{
						System.out.println("In catch" + label );
					}

	     }
	    
	    /*
	     * @KT1456
	     * @date: 13/07/2022
	     * @Description: This method performs clicking  savebutton on the contact's page
         * @Param: accepts  Param label  as input
         * @return values: populates new contact creation will be saved
	     */
	    
	    
	    
	    public void clicksavebutton(String label) throws Exception {
	    	
	    	
            try {
	    	clickSFbutton(label);
	    	  
	    	  }
            catch (Exception e)
			{
				System.out.println("In catch" + label );
			}

 }
	    
		
		/*
		 * @KT1461
		 * @date: 16/08/2022
		 * @Description: This method performs clicking delete button on  contact's page
		 * @Param: accepts one argument i.e label
		 * @return values: deleting saved records
		 */
		
	    
	    public void clickdelete(String label) throws Exception {
			try{
				delete(label);
				waitForSFPagetoLoad();
				
			}
			catch (Exception c)
			{
				System.out.println("In catch"+label);
			}

		}
            


}
