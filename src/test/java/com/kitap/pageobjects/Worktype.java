package com.kitap.pageobjects;

import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
 * @KT1427
 * @date: 17/08/2022
 * @Description: This test script covers the creation of an Work Type Via UI
 */


public class Worktype extends SFPageBase {

    public Worktype(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath = "//a[@id='WorkType']//p[@class='slds-truncate']")
    private WebElement Worktypes;

    public void clickninesymbol() throws InterruptedException {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    public void enterWorktype(String label, String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void WorkType() throws InterruptedException {
        SFClick(Worktypes);
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

    public void typename(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
            waitForSFPagetoLoad();

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    
    public void setdescription(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void selectOH(String label, String targetvalue) throws Exception {
        try {
            selectcombobox(label, targetvalue);

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void setestimatedduration(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void Durationtype(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void blocktime(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void blocktimebefore(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void blocktimeafter(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void blocktimeafter2(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);

        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void Timeframe(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    public void Timestart(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void Timeframe2(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }


    public void Timeend(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    public void clicksavebutton(String label) throws Exception {

        click(label);
        waitForSFPagetoLoad();

    }

}

















