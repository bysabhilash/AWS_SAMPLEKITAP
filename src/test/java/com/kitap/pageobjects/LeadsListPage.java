package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
 * @KT1444
 * @date: 15/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of Leads creation
 */


public class LeadsListPage extends kitap.SFPageBase {
	
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
		
		@FindBy(xpath = "//*[@id=\"Lead\"]/div/lightning-formatted-rich-text/span/p/b")
		private WebElement leads;
			
	 public LeadsListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	 }
	 
	 
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

	    public void clickleads() throws InterruptedException {
	    	
	    	try {
				SFClick(leads);
				 waitForSFPagetoLoad();
	     }
 	 catch (Exception e)
     {
         System.out.println("In catch" );
     }
 }
	    
	 


	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method performs selecting salutation on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting salutation
	 */


	public void setSalutation(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters firstname on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates firstname
	 */


	public void setFirstname(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters lastname on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates lastname
	 */

	public void setLastname(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters companyname on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates companyname
	 */


	public void setCompanyname(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters phone on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates phonenumber
	 */

	public void setPhone(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters mobile on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates mobilenumber
	 */

	public void setMobile(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters fax on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates faxnumber
	 */

	public void setFax(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters title on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates title
	 */

	public void setTitle(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters Email on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates Email
	 */

	public void setEmail(String label,String data) throws Exception {

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
	 * @date: 13/07/2022
	 * @Description: This method performs selecting leadsource on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting leadsource
	 */

	public void setLeadSource(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters website on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates website
	 */

	public void setWebsite(String label,String data) throws Exception {

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
	 * @date: 13/07/2022
	 * @Description: This method performs selecting industry on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting industry
	 */

	public void setIndustry(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting leadstatus on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting leadstatus
	 */

	public void setLeadStatus(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters annualrevenue on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates annualrevenue
	 */
	
	

	public void setAnnualRevenue(String label,String data) throws Exception {

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
	 * @date: 13/07/2022
	 * @Description: This method performs selecting rating on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting rating
	 */

	public void setRating(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters NoofEmployees on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates noofemployees
	 */

	public void setNoofEmployees(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters street on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates street
	 */

	public void setStreet(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters cityname on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates city
	 */

	public void setCity(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters state/province on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates statename
	 */

	public void setStateOrProvince(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters zip/postalcode on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates zip/postalcode
	 */

	public void setZiporPostalCode(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters countrtyname on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates country
	 */

	public void setCountry(String label,String data) throws Exception {

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
	 * @date: 13/07/2022
	 * @Description: This method performs selecting productinterest on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting productinterest
	 */

	public void setProductInterest(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters currentgenerator on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates currentgenerator
	 */

	public void setCurrentGenerator(String label,String data) throws Exception {

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
	 * @date: 13/07/2022
	 * @Description: This method performs selecting sicCode on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting SicCode
	 */

	public void setSicCode(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 13/07/2022
	 * @Description: This method performs selecting primary on the leads page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates selecting primary
	 */

	public void setPrimary(String label,String data) throws Exception {

		try{
			selectOption(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1444
	 * @date: 15/07/2022
	 * @Description: This method  enters nooflocations on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates locations
	 */

	public void setNoofLocations(String label,String data) throws Exception {

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
	 * @date: 15/07/2022
	 * @Description: This method  enters description on the leads page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates description
	 */

	public void setDescription(String label,String data) throws Exception {

		try {
			setText(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}
	
	/*
	 * @KT1456
	 * @date: 15/07/2022
	 * @Description: This method performs clicking save button on  leads page
	 * @Param: accepts one argument i.e label
	 * @return values: saving record
	 */
	
	public void clicksave(String label) throws Exception {
		try{
			clickSFbutton("Save");
			waitForSFPagetoLoad(); 
			
		}
		catch (Exception c)
		{
			System.out.println("In catch"+label);
		}

	}
}
	
	
 
	
	