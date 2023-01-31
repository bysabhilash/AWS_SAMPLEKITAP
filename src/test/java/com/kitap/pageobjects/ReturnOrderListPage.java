package com.kitap.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kitap.base.BaseTest;

import kitap.SFPageBase;

/*
 * @KT1461 
 * @date: 25/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of returnorder creation
 */


public class ReturnOrderListPage extends SFPageBase
{
    public  ReturnOrderListPage (WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="(//p[@class='slds-truncate'])[1]")
    private WebElement retunrOrder;
    
    /*
     * @KT1444
     * @date:25/07/2022
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
            System.out.println("In catch");
        }
    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs entering input as returnorder in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: related screen name appear in applauncher
     */
    public void enterreturnorder(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs clicking  on the product screen page
     * @return values: opens dashboards page 
     */
    public void clickReturnOrder() throws InterruptedException {

    	try {
	    	SFClick(retunrOrder);
	    	waitForSFPagetoLoad();

	    }
	    catch (Exception e)
        {
            System.out.println("In catch");
        }
    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs clicking on new button on the product page
     * @Param: accepts one argument label as input
     * @return values: opens new product page
     */

    public void Newbutton(String label) throws Exception {

    	try {
	    	clickSFbutton(label);
	    	waitForSFPagetoLoad();
	    }
	    	 catch (Exception e)
	        {
	            System.out.println("In catch");
	        }
	    }
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs searching for case on product page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates case
     */
    
    public void setCase(String label,String data) throws InterruptedException {
    	 try {
		        selectcombobox(label, data);
		    } 
		    catch (Exception e) 
		 {
		     System.out.println("Sent values as " + data);
		    }
		}
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs searching for account on product page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates account
     */

    public void setAccount(String label,String data) throws InterruptedException {
    	 try {
		        selectcombobox(label, data);
		    } 
		    catch (Exception e) 
		 {
		     System.out.println("Sent values as " + data);
		    }
		}
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs searching for people on product page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates returned person name 
     */

    public void setPeople(String label,String data) throws InterruptedException {
    	 try {
		        selectcombobox(label, data);
		    } 
		    catch (Exception e) 
		 {
		     System.out.println("Sent values as " + data);
		    }
		}
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs selecting status on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates status
     */

    public void setStatus(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs searching for contact on product page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates contact
     */

    public void setContact(String label,String data) throws InterruptedException {
    	 try {
		        selectcombobox(label, data);
		    } 
		    catch (Exception e) 
		 {
		     System.out.println("Sent values as " + data);
		    }
		}

    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs selecting shipmenttype on the products page
     * @Param: accepts two Param label and data as input
     * @return values: populates status
     */

    public void setShipmenttype(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters address name on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates address
     */

    public void setAddress(String label, String data)
    {
        try{
            settext(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters city name on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates city
     */

    public void setCity(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters state name on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates state
     */

    public void setStateorProvince(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters Zipcode on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates Zip code
     */

    public void setZiporPostal(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters country name on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates country
     */

    public void setCountry(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters date on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates date
     */

    public void setDate(String label, String data)
    {
        try{
            setText(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs enters description on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates description
     */

    public void setDescription(String label, String data)
    {
        try{
            setinput(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 25/07/2022
     * @Description: This method performs click action on save on product page
     * @Param: accepts arguments label  as input
     * @return values: saves data
     */

    public void clicksave(String label)
    {
        try{
            click("Save");
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }




}
