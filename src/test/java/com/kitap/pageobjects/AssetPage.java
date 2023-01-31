package com.kitap.pageobjects;

import org.openqa.selenium.Keys; 
import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.WebElement; 
 import org.openqa.selenium.support.FindBy; 
 import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;
import kitap.SFPageClassic;
 
 public class AssetPage extends SFPageBase {
 
	  public AssetPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	  
	  /*
	   * @KT1461
	   * @date: 18/07/2022
	   * @Description: This page object covers methods for all the fields in salesforce of asset creation
	   */
	  
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
		
		@FindBy(xpath = "//*[@id=\"Asset\"]/div/lightning-formatted-rich-text/span/p/b")
		private WebElement clickassets;
			
		/*
	     * @KT1461
	     * @date: 18/07/2022
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
	     * @date: 18/07/2022
	     * @Description: This method performs entering input as asset in app launcher of salesforce home page
	     * @Param: accepts two Param  label and value as input
	     * @return values: related screen name appear in applauncher
	     */
	    
	    public void enterasset(String label,String data) throws Exception {

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
	     * @date: 18/07/2022
	     * @Description: This method performs clicking on new button on the asset page
	     * @return values: opens dashboard page 
	     */

	    public void clickasset() throws InterruptedException {
	    	
	    	try {
				SFClick(clickassets);
				 waitForSFPagetoLoad();
	     }
    	 catch (Exception e)
        {
            System.out.println("In catch" );
        }
    }
	    
	    /*
		 * @KT1461
		 * @date: 18/07/2022
		 * @Description: This method performs clicking on new button on the asset's page
		 * @Param: accepts one argument label as input
		 * @return values: opens new assets page
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
		 * @date: 18/07/2022
		 * @Description: This method performs enters assets name on the assets page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates asset name
		 */
	    
	    public void setassetname(String label,String data) throws Exception {

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
		 * @date: 18/07/2022
		 * @Description: This method performs searching for product on the asset's page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates product
		 */

	    public void selectproduct(String label,String data) throws Exception {

	    	try {

				selectcombobox(label, data);
				
			}
			catch (Exception e)
			{
				System.out.println("In catch" +label);
			}

	    }
	    
	    /*
		 * @KT1461
		 * @date: 18/07/2022
		 * @Description: This method performs enters serial number on the assets page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates serial number
		 */
	    
	    public void setserialnumber(String label,String data) throws Exception {

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
		 * @date: 18/07/2022
		 * @Description: This method performs enters installation date on the assets page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates install date 
		 */
	    
	    
	    public void setinstalldate(String label,String data) throws Exception {

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
		 * @date: 18/07/2022
		 * @Description: This method performs select status on the assets page
		 * @Param: accepts two Param label and value as input
		 * @return values: populates status
		 */
 
	    public void selectstatus(String label,String data) throws Exception {

	    	try {
				selectOption(label, data);
				
			}
			catch (Exception e)
			{
				System.out.println("In catch" +label);
			}
		}
	    
	    /*
  		 * @KT1461
  		 * @date: 18/07/2022
  		 * @Description: This method performs enters quantity on the assets page
  		 * @Param: accepts two Param label and value as input
  		 * @return values: populates quantity 
  		 */
    
	    public void setquantity(String label,String data) throws Exception {

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
  		 * @date: 18/07/2022
  		 * @Description: This method performs enters price on the assets page
  		 * @Param: accepts two Param label and value as input
  		 * @return values: populates price 
  		 */
	    
	    public void setprice(String label,String data) throws Exception {

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
  		 * @date: 18/07/2022
  		 * @Description: This method performs enters description on the assets page
  		 * @Param: accepts two Param label and value as input
  		 * @return values: populates description 
  		 */
 
	    public void setdescription(String label,String data) throws Exception {

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
		 * @date: 18/07/2022
		 * @Description: This method performs searching for account name on the asset's page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates account name 
		 */
	    
	    public void selectaccountname(String label,String data) throws Exception {
	    	try {

				selectcombobox(label, data);
				
			}
			catch (Exception e)
			{
				System.out.println("In catch" +label);
			}

	    }
	    
	    /*
		 * @KT1461
		 * @date: 18/07/2022
		 * @Description: This method performs searching for contact person on the asset's page
		 * @Param: accepts two Param label and data as input
		 * @return values: populates contact person
		 */
	    
	     public void selectcontactperson(String label,String data) throws Exception {
	    	 try {

					selectcombobox(label, data);
					
				}
				catch (Exception e)
				{
					System.out.println("In catch" +label);
				}

		    }
	     
	     /*
	 	 * @KT1444
	 	 * @date: 13/07/2022
	 	 * @Description: This method performs clicking Competitor Asset on  account's page
	 	 * @Param: accepts one argument i.e label
	 	 * @return values: clicking the checkbox of competitor Asset
	 	 */
	     
		  public void setasset(String label) throws Exception {
			  try {
		           click(label);	
		   }
			  catch (Exception e)
			  {
				System.out.println("In catch" +label);
				}

		    }
			  
		/*
  		 * @KT1461
  		 * @date: 18/07/2022
  		 * @Description: This method performs enters purchase date on the assets page
  		 * @Param: accepts two Param label and value as input
  		 * @return values: populates purchase date 
  		 */

	    public void setpurchasedate(String label,String data) throws Exception {

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
  		 * @date: 18/07/2022
  		 * @Description: This method performs enters usage end date on the assets page
  		 * @Param: accepts two Param label and value as input
  		 * @return values: populates usage end date 
  		 */
	    
	    public void setusageenddate(String label,String data) throws Exception {

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
		 * @date: 18/07/2022
		 * @Description: This method performs clicking save button on  account's page
		 * @Param: accepts one argument i.e label
		 * @return values: saving record
		 */

	    public void clicksavebutton(String label) throws Exception {

	    	try{
				clickSFbutton(label);
				waitForSFPagetoLoad();
				
			}
			catch (Exception c)
			{
				System.out.println("In catch"+label);
			}

		}
 }


