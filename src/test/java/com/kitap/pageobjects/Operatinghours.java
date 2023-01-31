package com.kitap.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;


public class Operatinghours extends SFPageBase {

    public Operatinghours(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath = "(//p[@class=\"slds-truncate\"])[3]")
    private WebElement Operatinghours;

    @FindBy(xpath = "//*[@id=\"OperatingHours\"]/div/lightning-formatted-rich-text/span/p")
    private WebElement Operatinghours1;


    public void clickninesymbol() throws InterruptedException {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    public void enterOperatinghours(String label, String data) throws Exception {

        try {
            setText(label, data);
            
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void OperatingHours1() throws InterruptedException {
        SFClick(Operatinghours1);
        waitForSFPagetoLoad();
    }

    public void clicknew(String label) throws Exception {
        try {
            clickSFbutton(label);
            waitForSFPagetoLoad();

        } catch (Exception c) {
            System.out.println("In catch" + label);
        }

    }

    public void name(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
            

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void description(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
            

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void Timezone (String lable, String data) throws Exception{
        try{
            selectdropdown(lable,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +lable);
        }
    }
    public void clickadd(String label) throws Exception {
        try {
            clickSFbutton(label);
            

        } catch (Exception c) {
            System.out.println("In catch" + label);
        }

    }

    public void Day(String lable, String targetvalue) throws Exception {
        try {
            selectdropdown1(lable, targetvalue);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void Starttime (String label, String targetvalue) throws Exception{
        try{
            setText(label,targetvalue);
            
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void Endtime (String lable, String data) throws Exception{
        try{
        	setText(lable,data);
        	
           
        }
        catch (Exception e)
        {
            System.out.println("In catch" +lable);
        }
    }
    
    public void clicksave(String label) throws Exception {
        try {
            clickSFbutton(label);
            waitForSFPagetoLoad();

        } catch (Exception c) {
            System.out.println("In catch" + label);
        }

    }
}

