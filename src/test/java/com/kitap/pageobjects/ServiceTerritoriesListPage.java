package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class ServiceTerritoriesListPage extends SFPageBase
    {
        public ServiceTerritoriesListPage(WebDriver webDriver) {
            super(webDriver);
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//div[@class='slds-icon-waffle']")
        private WebElement ninesymbol;

        @FindBy(xpath="//b[normalize-space()='Service Territories']")
        private WebElement clickserviceterritories;

        @FindBy(xpath = "(//span[text()='Address']//following::textarea)[1]")
        private WebElement address;

        public void clickninesymbol() throws InterruptedException
        {
            SFClick(ninesymbol);
            waitForSFPagetoLoad();
        }

        public void enterServiceTerritories(String label,String data) throws Exception {

            try {
                setText(label, data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }
        }

        public void clickServiceTerritories() throws InterruptedException {

            SFClick(clickserviceterritories);
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

        public void setName(String label,String data) throws Exception {
            try{
                setinput(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }
        }

        public void setParentTerritory(String label,String data) throws Exception {
            try{
            	selectcombobox(label,data);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setOperatingHour(String label,String data) throws Exception {
            try{
            	selectcombobox(label,data);
                waitForSFPagetoLoad();

            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setActive(String label) throws Exception {

            try {
                click(label);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In catch" +label);
            }

        }


        public void setAddress(String label,String data){
            try
            {
                setinput(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In Catch" + label);
            }
        }

        public void setCity(String label,String data) throws Exception {
            try{
                settext1(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setZiporPostalcode(String label,String data) throws Exception {
            try{
                settext1(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setStateorProvince(String label,String data) throws Exception {
            try{
                settext1(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
            }
        }

        public void setCountry(String label,String data) throws Exception {
            try{
                settext1(label,data);
                waitForSFPagetoLoad();
            }
            catch (Exception e)
            {
                System.out.println("In Catch" +label);
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


