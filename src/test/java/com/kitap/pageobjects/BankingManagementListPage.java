package com.kitap.pageobjects;

import org.openqa.selenium.By;      
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import kitap.SFPageBase;
import kitap.SFPageClassic;

 /*
 * @KT1461
 * @date: 24/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of account creation
 */

public class BankingManagementListPage extends SFPageBase {

	 public BankingManagementListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	 }
	 
		
		  @FindBy(xpath = "//div[@class='slds-icon-waffle']") 
		  private WebElement ninesymbol;
		  
		  @FindBy(xpath ="//*[@id=\"Banking_Management__c\"]/div/lightning-formatted-rich-text/span/p")
		  private WebElement Bankingmanagement;
		  
		  
		    /*
		     * @KT1461
		     * @date: 23/08/2022
		     * @Description: This method performs clicking on app launcher in the salesforce home page
		     * @return values: opens app launcher
		     */
		  
		  public void clickninesymbol() throws InterruptedException {
		  SFClick(ninesymbol); 
		  waitForSFPagetoLoad(); 
		  }

		    /*
		     * @KT1461
		     * @date: 24/08/2022
		     * @Description: This method performs entering input as BankingManagemnt in app launcher of salesforce home page
		     * @Param: accepts two Param  label and value as input
		     * @return values: opens bankingManagement page
		     */
		  
		  public void enterWorktype(String label, String data) throws Exception { 
			  try {
		          setText(label, data); waitForSFPagetoLoad(); 
		          } 
			  catch (Exception e) {
		      System.out.println("In catch" + label);  
		  } 
		}
		    /*
		     * @KT1461
		     * @date: 24/08/2022
		     * @Description: This method performs clicking on the BankingManagement page
		     * @return values: opens new bankingManagement page
		     */
		  
		  public void clickbankingmanagement() throws InterruptedException {
		     SFClick(Bankingmanagement);
		      waitForSFPagetoLoad(); 
		      }
		  
		  public void Bankingmanagement(String label) throws Exception {

		        clickbutton(label);
		        waitForSFPagetoLoad();

		   }
		  
		 
	/*
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs clicking on new button on the account's page
	 * @Param: accepts one argument label as input
	 * @return values: opens new accounts page
	 */
	public void clicknew(String label) throws Exception {
		try{
			clickSFbutton("New");
		}
		catch (Exception c)
		{
			System.out.println("In catch"+label);
		}

	}
	

	/*
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs enters banking name on the Bankingmanagement page
	 * @Param: accepts two Param label and value as input
	 * @return values: populates banking name
	 */
	public void setbankingname(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs clicking radiobox in banking management page
	 * @Param: accepts one argument i.e label
	 * @return values: clicked on thet field
	 */
	
	public void clickindian(String label) throws Exception {
		try{
			click(label);
			waitForSFPagetoLoad();
			
		}
		catch (Exception c)
		{
			System.out.println("In catch"+label);
		}

	}
	
	/*
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs selecting services  on the bankingmanagement page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates services
	 */
	public void selectservices(String label,String data) throws Exception {

		try{
			selectdropdown1(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	/*
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs entering date on the bankingmanagement page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates date 
	 */
	public void setdate(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering banking customer phone on the bankingmanagement page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates customer  phone
	 */
	public void setTelePhone(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering customer firstname on the bankingmanagement page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates customerfirstname 
	 */
	public void setcustomerfirstname(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering customer lastname on the bankingmanagement page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates customerlastname 
	 */
	public void setcustomerlastname(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs searching for nominee on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates nominee name
	 */
	public void setnominee(String label, String data) throws InterruptedException  
	{
		try {

			selectcombobox(label, data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	public void setAnnualincome(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering account's zip code on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates zip code
	 */
	public void setzipcode(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering   City on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates  city
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
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs entering  State on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates state
	 */
	public void setState(String label,String data) throws Exception {

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
	 * @date: 24/08/2022
	 * @Description: This method performs entering   Country on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates  Country
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
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs entering   address on the banking page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates  address
	 */
	public void setaddress(String label,String data) throws Exception {

		try {
			setText(label, data);
			waitForSFPagetoLoad();
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	

	/*
	 * @KT1461
	 * @date: 24/08/2022
	 * @Description: This method performs selecting save button on  account's page
	 * @Param: accepts one argument i.e label
	 * @return values: saving record
	 */
	public void clicksave(String label) throws Exception {
		try{
			clickbutton(label);
			
		}
		catch (Exception c)
		{
			System.out.println("In catch"+label);
		}

	}
}


