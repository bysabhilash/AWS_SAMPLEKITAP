package com.kitap.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class LocationPage extends SFPageBase
{
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath ="//b[contains(text(),'Products')]")
    private WebElement Orders;

    public LocationPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);// Creates instance for all web elements
    }

    public void clickninesymbol()
    {
        try {

            SFClick(ninesymbol);
        }
        catch (Exception e)
        {
            System.out.println("in catch");
        }

    }

    public void enterProducts(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void clickProducts() throws InterruptedException {

        SFClick(Orders);
        waitForSFPagetoLoad();
    }

    public void setProductname(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setProductCode(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void setActive(String label)
    {
        try{
            click(label);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setProductFamily(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setProductDescription(String label,String data)
    {
        try{
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void clicksave(String label)
    {
        try{
            click(label);
        }
        catch (Exception e)
        {
            System.out.println("in catch"+label);
        }
    }



}

