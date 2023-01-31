package com.kitap.pageobjects;
import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;
import kitap.SFPageClassic;

@Listeners(com.kitap.utilities.listener.class)

/*
 * @KTV1362
 * @date: 25/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of hospital management creation
 */
public class HospitalManagementListPage extends SFPageBase {

  
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Hospital Management\"]")
    private WebElement clickHospitalManagement;
    
    public HospitalManagementListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    /*
     * @KTV1362
     * @date: 25/08/2022
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
     * @date: 25/08/2022
     * @Description: This method performs entering input as hospital management in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: related screen name appear in applauncher
     */
    public void enterHospitalManagement(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs clicking  on the hospital management page
     * @return values: opens dashboards page 
     */
    public void clickHospitalManagement() throws InterruptedException {

        SFClick(clickHospitalManagement);
        waitForSFPagetoLoad();
    }
    
    public void Hospitalmanagement(String label) throws Exception {

        clickbutton(label);
        waitForSFPagetoLoad();

   }

    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs clicking on new button on the hospital management page
     * @Param: accepts one argument label as input
     * @return values: opens new hospital management page
     */

    public void clickNew(String label) throws Exception {
        try{
            clickSFbutton(label);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }
    }

    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs enters hospital name on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates hospital name
     */
    public void setHospitalName(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs selecting services on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates services
     */
    public void setServices(String label,String data) throws Exception {

        try{
            selectOption(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs enters doctor name on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates doctor name
     */
    public void setDoctorName(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters consultation fees on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates consultation fees
     */
    public void setConsultationFees(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters telephone on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates telephone
     */
    public void setTelephone(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters patient name on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates patient name
     */
    public void setPatientName(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters patient address on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates patient address
     */
    public void setPatientAddress(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters email on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates email
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
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs enters zip code on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates zip code
     */
    public void setZipCode(String label,String data) throws Exception {

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
     * @date: 25/08/2022
     * @Description: This method performs enters phone on the hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates phone
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
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs enters city on the hospital management page
     * @Param: accepts two Param label and data as input
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
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs entering  date on the hospitalmanagement page
     * @Param: accepts  Param label and data as input
     * @return values: populates  date
     */
    
    
    public void setdate(String label,String data) throws Exception {

    	 try {
    		 setText(label,data);	    	   
	    	   }
	    	   catch (Exception e)
				{
					System.out.println("In catch" + label );
				}

     }


    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs enters state on the hospital management page
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
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs searching for existing patient on hospital management page
     * @Param: accepts two Param label and targetvalue as input
     * @return values: populates existing patient
     */
    public void enterExistingPatient(String label, String targetvalue) throws InterruptedException {
    try {
        selectcombobox(label, targetvalue);
      } 
    catch (Exception e)  
    {
     System.out.println("Sent values as " + targetvalue);
    }
}

    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs selecting payment mode on hospital management page
     * @Param: accepts two Param label and data as input
     * @return values: populates payment mode
     */
    public void setPaymentMode(String label,String data) throws Exception {

        try{
        	selectOption(label,data);
           
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 25/08/2022
     * @Description: This method performs click action on save on the hospital management page
     * @Param: accepts arguments label  as input
     * @return values: populates save
     */

    public void savebutton (String label) throws Exception{
        try {
        	clickbutton(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" + label);
        }
    }
}
