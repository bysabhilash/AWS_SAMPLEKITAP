package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTV1362
 * @date: 23/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of email templates creation
 */

public class EmailTemplatesListPage extends SFPageBase {
    public EmailTemplatesListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Email Templates\"]")
    private WebElement clickEmailTemplates;

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException
    {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs entering input as email templates in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: opens email templates page
     */

    public void enterEmailTemplates(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs clicking on the email templates page
     * @return values: opens new email templates page
     */
    public void clickEmailTemplates() throws InterruptedException {

        SFClick(clickEmailTemplates);
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs clicking on new button on the email templates page
     * @Param: accepts one argument label as input
     * @return values: opens new email templates page
     */

    public void clickNewEmailTemplate(String label) throws Exception {
        try{
            clickSFbutton(label);
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs enters email template name on the email templates page
     * @Param: accepts two Param label and value as input
     * @return values: populates email template name
     */
    public void setEmailTemplateName(String label,String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs enters description on the email templates page
     * @Param: accepts two Param label and value as input
     * @return values: populates description
     */

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

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs selecting related entity type on the email templates page
     * @Param: accepts two Param label and data as input
     * @return values: populates related entity type
     */
    public void setRelatedEntityType(String label,String data) throws Exception {

        try{
            selectdropdown1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs selecting folder on the email templates page
     * @Param: accepts two Param label and data as input
     * @return values: populates folder
     */
    public void setFolder(String label,String data) throws Exception {

        try{
            selectdropdown1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs enters subject on the email templates page
     * @Param: accepts two Param label and value as input
     * @return values: populates subject
     */

    public void setSubject(String label,String data) throws Exception {

        try {

            settext1(label, data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 23/08/2022
     * @Description: This method performs click action on save on the email templates page
     * @Param: accepts arguments label  as input
     * @return values: populates save
     */
    public void savebutton (String label) throws Exception{
        try {
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" + label);
        }
    }
}
