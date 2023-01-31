package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class PaymentLineInvoiceListPage extends SFPageBase
    {
        public PaymentLineInvoiceListPage(WebDriver webDriver) {
            super(webDriver);
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//div[@class='slds-icon-waffle']")
        private WebElement ninesymbol;

        @FindBy(xpath="//b[normalize-space()='Payment Line Invoices']")
        private WebElement clickpayment;

        public void clickninesymbol() throws InterruptedException
        {
            SFClick(ninesymbol);
            waitForSFPagetoLoad();
        }

        public void enterPaymentlineInvoice(String label,String data) throws Exception {

            try {
                setText(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }
        }

        public void clickPaymentLineInvoice() throws InterruptedException {

            SFClick(clickpayment);
            waitForSFPagetoLoad();
        }

        public void clicknew(String label) throws Exception {
            try{
                clickSFbutton("New");
                waitForSFPagetoLoad();
            }
            catch (Exception c)
            {
                System.out.println("In catch"+label);
            }

        }

        public void setPayment(String label,String data) throws Exception {
            try{
            	selectcombobox(label,data);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setHasbeenUnapplied(String label,String data) throws Exception {
            try{
                selectdropdown(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }
        }

        public void setType(String label,String data) throws Exception {
            try{
                selectdropdown(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }
        }

        public void setInvoice(String label,String data) throws Exception {
            try{
            	selectcombobox(label,data);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setcomments(String label,String data) throws Exception {

            try {
                setinput(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }

        }

        public void setAmount(String label,String data) throws Exception {

            try {
                setinput(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }

        }

        public void setAssociateAccount(String label,String data) throws Exception {
            try{
                WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
                ele.sendKeys(data);
                waitForSFPagetoLoad();
                ele.sendKeys(Keys.DOWN);
                ele.sendKeys(Keys.ENTER);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setAssociatePaymentLineInvoice(String label,String data) throws Exception {
            try{
                WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Payment Line Invoices...']"));
                ele.sendKeys(data);
                waitForSFPagetoLoad();
                ele.sendKeys(Keys.DOWN);
                ele.sendKeys(Keys.ENTER);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setDate(String label,String data) throws Exception {

            try {
                settext1(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }

        }

        public void setAppliedDate(String label,String data) throws Exception {

            try {
                settext1(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }

        }

        public void setUnappliedDate(String label,String data) throws Exception {

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
