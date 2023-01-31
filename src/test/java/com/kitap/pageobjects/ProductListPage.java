package com.kitap.pageobjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

/*
 * @KT1444
 * @date: 22/07/2022
 * @Description: This page object covers methods for all the fields in salesforce of product creation
 */

public class ProductListPage extends SFPageBase{
	 public ProductListPage(WebDriver webDriver)
	    {
	        super(webDriver);
	        PageFactory.initElements(driver, this);// Creates instance for all web elements
	    }
	 
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath ="//b[contains(text(),'Products')]")
    private WebElement Orders;
    
    /*
     * @KT1444
     * @date:22/07/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

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
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs entering input as product in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: related screen name appear in applauncher
     */

    public void enterProducts(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs clicking  on the product page
     * @return values: opens dashboards page 
     */

    public void clickProducts() throws InterruptedException {

        SFClick(Orders);
        waitForSFPagetoLoad();
    }
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs clicking on new button on the product page
     * @Param: accepts one argument label as input
     * @return values: opens new product page
     */
    
    public void clicknew(String label) throws Exception {

    	try {
    	clickSFbutton(label);
    	waitForSFPagetoLoad();
    }
    	 catch (Exception e)
        {
            System.out.println("In catch");
        }
    }
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs enters product name on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates product name
     */

    public void setProductname(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs enters product code on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates product code
     */

    public void setProductCode(String label,String data) throws Exception {

        try {
            setinput(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs click action on active on product page
     * @Param: accepts arguments label  as input
     * @return values: clicking the checkbox on active in product page
     */

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
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs selecting product family on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates productfamily
     */

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
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs enters product description on the product page
     * @Param: accepts two Param label and data as input
     * @return values: populates product description
     */

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
    
    /*
     * @KT1444
     * @date: 22/07/2022
     * @Description: This method performs click action on save on product page
     * @Param: accepts arguments label  as input
     * @return values: saves data
     */

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
