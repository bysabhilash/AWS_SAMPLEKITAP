package com.kitap.pageobjects;
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTV1362
 * @date: 22/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of service resorces creation
 */

public class ContactRequestListPage extends SFPageBase {
    public ContactRequestListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Contact Request\"]")
    private WebElement clickContactRequest;

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException
    {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs entering input as contact request in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: opens contact request
     */

    public void enterContactRequest(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs clicking on the contact request page
     * @return values: opens new contact request page
     */

    public void clickContactRequest() throws InterruptedException {

        SFClick(clickContactRequest);
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs clicking on new button on the contact request page
     * @Param: accepts one argument label as input
     * @return values: opens new contact request page
     */

    public void clickNew(String label) throws Exception {
        try{
            clickSFbutton("New");
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs entering requested by on the contact request page
     * @Param: accepts two Param label and data as input
     * @return values: populates requested by
      */

    public void enterRequestedBy(String label, String data) throws InterruptedException
    {
		try {

			selectcombobox(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs entering  related to on the contact request page
     * @Param: accepts two Param label and data as input
     * @return values: populates  related to
     */

    public void entRelatedTo(String label, String data) throws InterruptedException
    {
		try {

			selectcombobox(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
    
    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs action on the dropdowns in selecting preferred request page on the contact request page
     * @Param: accepts two arguments label and targetvalue as input
     * @return values: populates preferred channel
     */

    public void setprefferedchannel(String label,String data) throws Exception {

        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs enters preferred phone number  on the contact request page
     *  @Param: accepts two Param label and value as input
     * @return values: populates preferred phone number
     */

    public void setPreferredPhoneNumber(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs action on the dropdowns in request status on the contact request page
     * @Param: accepts two arguments label and targetvalue as input
     * @return values: populates request status
     */

    public void setRequestStatus(String label,String data) throws Exception {

        try{
            selectdropdown(label,data);
          
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs action on the dropdowns in request reson on the contact request page
     * @Param: accepts two arguments label and targetvalue as input
     * @return values: populates request reson
     */

    public void setRequestReason(String label,String data) throws Exception {

        try{
            selectdropdown(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs enters description on the contact request page
     * @Param: accepts two Param label and value as input
     * @return values: populates description
     */

    public void setDescription(String label,String data) throws Exception{
        try{
            settext1(label, data);
            waitForSFPagetoLoad();
          
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 22/08/2022
     * @Description: This method performs click action on save on the service resources page
     * @Param: accepts arguments label  as input
     * @return values: populates save
     */

    public void savebutton (String label) throws Exception{
        try {
            click(label);
        }
        catch (Exception e)
        {
            System.out.println("In catch" + label);
        }
    }
}
