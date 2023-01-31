package com.kitap.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
 * @KT1444
 * @date: 22/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of card payment method creation
 */
public class CardPaymentMethodListPage extends SFPageBase
{

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath = "//b[normalize-space()=\"Card Payment Methods\"]")
    private WebElement clickcardpayments;


    public CardPaymentMethodListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs clicking on new button on the card payment method page
     */

    public void clickninesymbol()
    {
        try{
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
     * @date: 22/08/2022
     * @Description: This method performs entering 'card payment method' on app launcher
     * @Param: accepts two arguments label and data as input
     * @return values: enters card payment method on app launcher
     */

    public void entercardpaymentmethods(String label,String data) throws Exception {

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
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs clicking 'card payment method' on app launcher
     * @return values: clicks card payment method on app launcher
     */

    public void clickCardpaymentmethods() throws InterruptedException
    {

        SFClick(clickcardpayments);
        waitForSFPagetoLoad();
    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs clicking on new button on the card payment method's page
     * @Param: accepts one argument label as input
     * @return values: opens card payment method's page
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
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering nickname on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters nickname on card payment method's page
     */
    public void setNickname(String label, String data) throws Exception {
        try{
            setinput(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering input card number on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters input card number on card payment method's page
     */

    public void setInputcardnumber(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs selecting card type on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters card type on card payment method's page
     */

    public void setcardType(String label, String data) throws Exception {
        try{
            selectdropdown(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering cardholder name on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters cardholder name on card payment method's page
     */

    public void setcardHoldername(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs selecting card category on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters card category on card payment method's page
     */

    public void setcardCategory(String label, String data) throws Exception {
        try{
            selectdropdown(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Auto-card type on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Auto-card type on card payment method's page
     */

    public void setAutocardType(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs selecting status on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters status on card payment method's page
     */

    public void setStatus(String label, String data) throws Exception {
        try{
            selectdropdown(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Expiry Date on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Expiry Date on card payment method's page
     */

    public void setExpiryYear(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Expiry month on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Expiry month on card payment method's page
     */

    public void setExpiryMonth(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering 'card last four' on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters 'card last four' on card payment method's page
     */

    public void setcardLastfour(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering 'card Bin' on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters 'card Bin' on card payment method's page
     */

    public void setCardBin(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering 'start year' on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters 'start year' on card payment method's page
     */

    public void setStartYear(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering start month on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters start month on card payment method's page
     */

    public void setStartmonth(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering cardholder last name month on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters cardholder last name on card payment method's page
     */

    public void setCardHolderLastname(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering cardholder first name month on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters cardholder first name on card payment method's page
     */

    public void setCardHolderfirstname(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs selecting processing mode the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters cardholder last name on card payment method's page
     */

    public void setprocessingmode(String label, String data) throws Exception {
        try{
            selectdropdown(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Gateway token on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Gateway token on card payment method's page
     */

    public void setGatewaytoken(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Company name on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Company Name on card payment method's page
     */

    public void setCompanyname(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs selecting account name on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters account Name on card payment method's page
     */

    public void setAccount(String label, String data) throws Exception {
        try{
            selectcombobox(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Street name on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Street Name on card payment method's page
     */

    public void setStreet(String label, String data) throws Exception {
        try{
            setinput(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Comments on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Comments on card payment method's page
     */

    public void setComments(String label, String data) throws Exception {
        try{
            setinput(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering City name on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters City Name on card payment method's page
     */

    public void setcity(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Postal code on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Postal code on card payment method's page
     */

    public void setPostalcode(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering State on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters State on card payment method's page
     */

    public void setState(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering Country on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Country on card payment method's page
     */

    public void setCountry(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date: 22/08/2022
     * @Description: This method performs entering registered card email code on the card payment method's page
     * @Param: accepts two arguments label and data as input
     * @return values: enters Postal code on card payment method's page
     */

    public void setRegisteredCardEmail(String label, String data) throws Exception {
        try{
            settext1(label,data);
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1444
     * @date:22/08/2022
     * @Description: This method performs clicking save button on  card payment method's page
     * @Param: accepts one argument i.e label
     * @return values: saving record
     */

    public void clicksave(String label) throws Exception {
        try{
            click(label);
            waitForSFPagetoLoad();

        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }
}
