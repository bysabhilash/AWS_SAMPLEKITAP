package com.kitap.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class ServiceAppointmentListPage extends SFPageBase
{
    public ServiceAppointmentListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    } 
	 
	    /*
	     * @KT1444
	     * @date: 18/08/2022
	     * @Description: This method performs clicking on new button on the serviceappointment page
	     * @Param: accepts one argument label as input
	     * @return values: opens new serviceappointment page
	     */
	 

    public void clicknew(String label) throws Exception {
        try{
            clickSFbutton(label);
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enterscontact name on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates contact name
     */

    public void setContact(String label, String data) throws InterruptedException
    {

        try {
        	selectcombobox(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch"+label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enterscontact name on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates contact name
     */

    public void setparentaccount(String label, String data) throws InterruptedException
    {

        try {
        	selectcombobox(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch"+label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters description on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates description
     */

    public void setDescription(String label, String data)
    {
        try{
            settext(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates date
     */

    public void setEarliestStartPermitted(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters due date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates due date
     */

    public void setDuedate(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs entersduration on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates duration
     */

    public void setDuration(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters address on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates address
     */

    public void setAddress(String label, String data)
    {
        try{
            settext(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters city on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates city
     */


    public void setCity(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters postal code on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates postal code
     */

    public void setZiporPostalcode(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters state on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates state
     */

    public void setStateorProvince(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters country on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates country
     */

    public void setCountry(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/2022
     * @Description: This method performs selecting duartion on the service appointment page
     * @Param: accepts two Param label and data as input
     * @return values: populates duration
     */
    
    

    public void setDurationType(String label,String data) throws Exception {
        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters subject on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates subject
     */
    public void setSubject(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    

    /*
	 * @KT1444
	 * @date: 18/08/2022
	 * @Description: This method performs searching forwork type on the service appointment page
	 * @Param: accepts two Param label and data as input
	 * @return values: populates worktype
	 */

    public void setWorkType(String label, String data) throws InterruptedException
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
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters additioanl information on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates information
     */


    public void setAdditionalInformation(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters comments on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates comments
     */


    public void setComment(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 18/08/2022
     * @Description: This method performs selecting status on the service appointment page
     * @Param: accepts two Param label and data as input
     * @return values: populates status
     */

    public void setStatus(String label,String data) throws Exception {
        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters cancellation reason on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates cancellation rweason
     */


    public void setCancellationReason(String label,String data) throws Exception {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters startdate on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates start date
     */


    public void setArrivalwindowStart(String label, String data)
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
     * @date: 18/08/200
     * @Description: This method performs enters schedule start on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates start
     */


    public void setScheduleStart(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters arrival end date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates end date
     */


    public void setArrivalwindowEnd(String label, String data)
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
     * @date: 18/08/200
     * @Description: This method performs enters schedule end date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates scheduleend date
     */


    public void setScheduleEnd(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
  
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters actual start date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates actual start date
     */

    public void setActualStart(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters actual end date on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates end date
     */


    public void setActualEnd(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters actual duration on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates duration
     */


    public void setActualDuration(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters phone on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates phonenumber
     */


    public void setPhone(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    

    /*
     * @KT1444
     * @date: 18/08/200
     * @Description: This method performs enters email on the service appointment page
     * @Param: accepts two Param label and value as input
     * @return values: populates email
     */


    public void setEmail(String label, String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }
    
    /*
	 * @KT1444
	 * @date: 18/08/2022
	 * @Description: This method performs saving serviceappointment page
	 * @Param: accepts argument label as input
	 * @return values: saving record
	 */

    public void clicksave(String label) throws Exception {
        try{
            click("Save");
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }
}
