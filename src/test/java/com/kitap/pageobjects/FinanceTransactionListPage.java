package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class FinanceTransactionListPage extends SFPageBase
{

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Finance Transactions\"]")
    private WebElement FinanceTransaction;

    public FinanceTransactionListPage(WebDriver webDriver)
    {
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


    public void enterFinanceTransactions(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }
    public void clickFinanceTransactions() throws InterruptedException {

        try {
            SFClick(FinanceTransaction);
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

    public void enterAccount(String label, String data) throws InterruptedException
    {

        try {
            WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
            ele.sendKeys(data);
            waitForSFPagetoLoad();
            ele.sendKeys(Keys.DOWN);
            ele.sendKeys(Keys.ENTER);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch"+label);
        }


    }

    public void enterLegalEntities(String label, String data) throws InterruptedException
    {

        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Legal Entities...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setreferenceEntity(String label, String label1,String data)
    {
        try{
           // selectimgclick(label,label1,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }


    public void setreferenceEntityType(String label, String data)
    {
        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    public void setparentreferenceEntity(String label,String label1,String data)
    {
        try{
        	// selectimgclick(label,label1,data);
           
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setEventAction(String label, String data)
    {
        try
        {
            selectdropdown(label,data);
           
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setEventType(String label,String data)
    {
        try{
            selectdropdown(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setTotalAmountwithTax(String label, String data)
    {
        try{
            settext1(label,data);
           
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setChargeAmount(String label, String data)
    {
        try{
            settext1(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setSubtotal(String label,String data)
    {
        try{
            settext1(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setImpactAmount(String label,String data)
    {
        try{
            setinput(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setResultingbalance(String label, String data)
    {
        try{
            settext1(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setAdjustmentAmount(String label,String data)
    {
        try{
            settext1(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setTaxAmount(String label,String data)
    {
        try{
            settext1(label,data);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch"+label);
        }

    }

    public void setTransactionDate(String label,String data)
    {
        try{
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In Catch"+label);
        }
    }

    public void setEffectivedate(String label,String data)
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

    public void setFinanceSystemName(String label,String data)
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
    
    public void setsourceEntity(String label, String label1,String data)
    {
        try{
         //   selectimgclick(label,label1,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    public void setdestinationEntity(String label, String label1,String data)
    {
        try{
         //   selectimgclick(label,label1,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }


    public void setFinanceSystemIntegrationMode(String label,String data)
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

    public void setFinanceSystemTransactionNumber(String label,String data)
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

    public void setFinanceSystemIntegrationStatus(String label,String data)
    {
        try{
            selectdropdown(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

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
