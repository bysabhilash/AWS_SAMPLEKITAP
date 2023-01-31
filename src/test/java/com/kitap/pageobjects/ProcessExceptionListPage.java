package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class ProcessExceptionListPage extends SFPageBase
{
    public ProcessExceptionListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()='Process Exceptions']")
    private WebElement processexception;

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

    public void enterProcessException(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void clickProcessexception() throws InterruptedException {

        try {
            SFClick(processexception);
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

    public void setStatus(String label,String data)
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

    public void setSeverity(String label,String data)
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

    public void setCategory(String label,String data)
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

    public void setPriority(String label,String data)
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

    public void setMessage(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

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

    public void setCase(String label, String data) throws InterruptedException
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

    public void setExternalReference(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch" +label);
        }
    }

    public void clicksave(String label) throws Exception
    {
        try
        {
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch"+label);
        }


    }


}
