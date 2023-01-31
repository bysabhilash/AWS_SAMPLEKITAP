package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

    /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in salesforce of sellers
     */

public class SellersListPage extends SFPageBase {

    public SellersListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Sellers\"]")
    private WebElement sellers;
     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in salesforce of sellers
      @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
     @Param: accepts two Param  label and value as input
     @return values: opens sellers page
    */
    public void enterSellers(String label, String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
     @return values: opens new email templates sellers age
    */
    public void ClickSellers() throws InterruptedException {

        SFClick(sellers);
        waitForSFPagetoLoad();
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
     @Param: accepts one argument label as input
     @return values: opens new email templates page
    */
    public void Newbutton(String label) throws Exception {

        clickSFbutton(label);
        waitForSFPagetoLoad();
    }

    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
         @Param: accepts two Param label and targetvalue as input
         @return values: populates party selection
        */
    public void selectParty(String label, String targetvalue) throws Exception {
        try {
            selectcombobox(label, targetvalue);
        } 
        catch (Exception e) {
         System.out.println("Sent values as " + targetvalue);
        }
    }
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
         @Param: accepts two Param  label and targetvalue as input
         @return values: populates the name 
        */
    public void setName(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
        } 
        catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
         @Param: accepts two Param label and data as input
         @return values: populates type
        */
    
    public void sellerType(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } 
        catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

	 /*
		  @KTV1296
		  @date: 22/08/2022
		  @Description: This page object covers methods for all the fields in salesforce of sellers
		  @Param: accepts two Param label and data as input
		  @return values: populates Tier
		 */
    
		public void sellerTier(String lable, String data) throws Exception {
		    try {
		        selectdropdown(lable, data);
		    } catch (Exception e) {
		        System.out.println("In catch" + lable);
		    }
		}
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
         @Param: accepts  Param label and targetvalue as input
         @return values: populates amount
        */
		
    public void SalesAmount(String label, String targetvalue) throws Exception {
        try {
            setinput(label, targetvalue);
            waitForSFPagetoLoad();
        } 
        catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    
    /*
     * @KT1456
     * @date: 13/07/2022
     * @Description: This method performs entering sellers active to date on the sellers page
     * @Param: accepts  Param label and data as input
     * @return values: populates active to date
     */
    
    
    public void setactivedate(String label,String data) throws Exception {

    	 try {
    		 setinput(label,data);	    	   
	    	   }
	    	   catch (Exception e)
				{
					System.out.println("In catch" + label );
				}

     }
    
    /*
     * @KT1456
     * @date: 13/07/2022
     * @Description: This method performs entering sellers active from date on the sellers page
     * @Param: accepts  Param label and data as input
     * @return values: populates activet from date
     */
    
    
    public void setactivefromdate(String label,String data) throws Exception {

    	 try {
    		 setinput(label,data);	    	   
	    	   }
	    	   catch (Exception e)
				{
					System.out.println("In catch" + label );
				}

     }

    /*
    @KTV1296
    @date: 22/08/2022
    @Description: This page object covers methods for all the fields in salesforce of sellers
    @Param: accepts arguments label  as input
    @return values: populates save
   */
    public void clicksavebutton(String label) throws Exception {

        click(label);
        waitForSFPagetoLoad();

    }

}

