package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class PartyConsentListPage extends SFPageBase
{
    public PartyConsentListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()='Party Consent']")
    private WebElement partyconsent;

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

    public void enterPartyConsent(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void clickPartyConsent() throws InterruptedException {

        try {
            SFClick(partyconsent);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to click on FinanceTransactions");
        }

    }

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

    public void setName(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setParty(String label, String data) throws InterruptedException
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

    public void setBusinessbrand(String label, String data) throws InterruptedException
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

    public void setPrivacyConsentStatus(String label,String data)
    {
        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setAction(String label,String data)
    {
        try{
            selectdropdown1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setEffectiveTo(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setEffectiveFrom(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setConsentCaptureContactPointType(String label,String data) throws Exception {

        try {
            selectdropdown(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setConsentCaptureSource(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setDoubleConsentCaptureDateTime(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void setConsentCaptureDateTime(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void clicksave(String label) throws Exception {
        try{
            clickSFbutton("Save");
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }
}
