package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class OrderListPage extends SFPageBase
{

    public OrderListPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);// Creates instance for all web elements
    }

 
    public void enterOrders(String label,String data) throws Exception
    {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }



    public void setAccountname(String data) throws InterruptedException
    {

        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
        ele.sendKeys(data);
        Thread.sleep(7000);
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        Thread.sleep(7000);

    }

    public void setOrderStartdate(String label,String data) throws Exception {
        try{
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }


    }

    public void setContractnumber(String data) throws InterruptedException
    {

        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Contracts...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setStatus(String label,String data) throws Exception {
        try {
            selectdropdown(label,data);
        } catch (Exception e) {
            System.out.println("in catch" + label);
        }
    }
    public void setShippingStreet(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingCity(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingStateOrProvince(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingZiporPostalCode(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingCountry(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setCustomerAuthorizedby(String data) throws InterruptedException
    {

        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Contacts...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setCompanyAuthorizedby(String data) throws InterruptedException
    {

        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search People...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setBillingStreet(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingCity(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingStateOrProvince(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingZiporPostalCode(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingCountry(String label,String data) throws Exception {

        try {
            settext1(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }



    public void setDescription(String label,String data) throws Exception {

        try {
            setinput(label, data);

        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void save(String label)
    {
        try{
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("in Catch"+label);
        }
    }
}






