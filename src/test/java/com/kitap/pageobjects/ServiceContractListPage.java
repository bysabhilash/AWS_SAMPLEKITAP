package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class ServiceContractListPage extends SFPageBase
{

    public ServiceContractListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()='Service Contracts']")
    private WebElement servicecontract;

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

    public void enterServiceContract(String label,String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("Unable to enter " +label);
        }
    }

    public void clickServiceContract() throws InterruptedException {

        try {
            SFClick(servicecontract);
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

    public void setContractname(String label, String data)
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

    public void setStartdate(String label, String data)
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

    public void setEnddate(String label, String data)
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

    public void setTerm(String label, String data)
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

    public void setSpecialTerms(String label, String data)
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

    public void setAccount(String label, String data) throws InterruptedException
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

    public void setShippingandHandling(String label, String data)
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

    public void setTax(String label, String data)
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

    public void setBillingStreet(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingCity(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingState(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingZip(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setBillingCountry(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingStreet(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingCity(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingState(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingZip(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setShippingCountry(String label,String data) throws Exception {

        try {
            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void clicksave(String label)
    {
        try{
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

}
