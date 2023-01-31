package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class ChangeRequestListPage extends SFPageBase
{

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Change Requests\"]")
    private WebElement changeReq;

    public ChangeRequestListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

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


    public void enterChangeRequest(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void clickchangerequest() throws InterruptedException
    {

        SFClick(changeReq);
        waitForSFPagetoLoad();
    }

    public void clicknew() throws Exception {
        try{
            clickSFbutton("New");
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch");
        }

    }

    public void setSubject(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setDescription(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setStatus(String label,String data) throws Exception {

        try {
            selectdropdown(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setPriority(String label,String data) throws Exception {

        try {
            selectdropdown(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setImpact(String label,String data) throws Exception {

        try {
            selectdropdown(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setRisklevel(String label,String data) throws Exception {

        try {
            selectdropdown(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setTypeofChange(String label,String data) throws Exception {

        try {
            selectdropdown( label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void enterReviewer(String label,String data) throws Exception
    {

    	selectcombobox(label,data);
        waitForSFPagetoLoad();

    }

    public void setReviewedon_Date(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setFinalReviewnotes(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setBusinessJustification(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setImpactAnalysis(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setRemediationPlan(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setStartDate(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setEndDate(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }


    public void clicksave(String label) throws Exception {

        try {
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }







}
