package com.kitap.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
 * @KT1461 
 * @date: 27/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of alternativepayment creation
 */


public class AlternativePaymentListPage extends SFPageBase
{

    public AlternativePaymentListPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()='Alternative Payment Methods']")
    private WebElement alternativepayments;
    
    /*
     * @KT1444
     * @date:27/07/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException{
    
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
     * @date: 27/07/2022
     * @Description: This method performs entering input as alternativepayment in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: related screen name appear in applauncher
     */
    public void enteralternativepayment(String label,String data) throws Exception {

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
     * @Description: This method performs clicking  on the alternativepayment screen page
     * @return values: opens dashboards page 
     */

    public void clickAlternativepayments() throws InterruptedException
    {

    	try {
	    	SFClick(alternativepayments);
	    	waitForSFPagetoLoad();

	    }
	    catch (Exception e)
        {
            System.out.println("In catch");
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs clicking on new button on the alternativepayment page
     * @Param: accepts one argument label as input
     * @return values: opens new alternativepayment page
     */

    public void Newbutton(String label) throws Exception
    {

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
     * @date: 27/07/2022
     * @Description: This method performs enters nickname on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates nickname
     */

    public void setNickname(String label,String data) throws Exception
    {

        try{
        setinput(label,data);
    }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
   }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters registered email on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates registered email
     */

   public void setRegisterdEmail(String label, String data)
   {
       try {
           settext1(label,data);
       }
       catch (Exception e)
       {
           System.out.println("in catch" +label);
       }
   }
   
   /*
    * @KT1444
    * @date: 27/07/2022
    * @Description: This method performs searching for account on alternativepayment page
    * @Param: accepts two Param label and targetvalue as input
    * @return values: populates accounts
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
     * @date: 27/07/2022
     * @Description: This method performs selecting status on the alternativepayment page
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
     * @date: 27/07/2022
     * @Description: This method performs selecting processsingmode on the alternativepayment page
     * @Param: accepts two Param label and data as input
     * @return values: populates processingmode
     */

    public void setProcessingmode(String label,String data)
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
     * @date: 27/07/2022
     * @Description: This method performs click action on auto pay on alternativepayment page
     * @Param: accepts arguments label  as input
     * @return values: clicking the checkbox in alternativepayment page of autopay
     */

    public void setAutopay(String label)
    {
        try{
            click(label);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters gatewaytoken on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates gatewaytoken
     */

    public void setGatewayToken(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters gatewaytokendetails on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates GatewayTokenDetails
     */

    public void setGatewayTokenDetails(String label,String data)
    {
        try {
            settext(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters company name on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates companyname
     */

    public void setCompanyname(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters street on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates street
     */

    public void setStreet(String label,String data)
    {
        try {
            settext(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters city on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates city
     */

    public void setCity(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters state on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates state
     */

    public void setState(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters postalcode on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates code
     */

    public void setPostalCode(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters country on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates country
     */

    public void setcountry(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters comments on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates comments
     */

    public void setComments(String label,String data)
    {
        try {
        	settext(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters MACaddress on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates MACaddress
     */

    public void setMACAddress(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters ipaddress on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates ipaddress
     */

    public void setIPAddress(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters phone on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates phone
     */

    public void setPhone(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs enters auditemail on alternativepayment page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates auditemail
     */

    public void setAuditEmail(String label,String data)
    {
        try {
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 27/07/2022
     * @Description: This method performs click action on save on alternatibepayment page
     * @Param: accepts arguments label  as input
     * @return values: saves data
     */

    public void clicksave(String label)
    {
        try{
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

}
