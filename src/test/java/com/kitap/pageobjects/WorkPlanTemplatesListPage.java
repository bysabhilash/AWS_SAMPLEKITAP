package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTV1362
 * @date: 17/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of work plan templates creation
 */
public class WorkPlanTemplatesListPage extends SFPageBase {
    public WorkPlanTemplatesListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Work Plan Templates\"]")
    private WebElement clickWorkPlanTemplates;

    /*
     * @KTV1362
     * @date: 17/08/2022
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
     * @date: 17/08/2022
     * @Description: This method performs entering input as work plan templates in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: opens work plan templates page
     */
    public void enterWorkPlanTemplates(String label,String data) throws Exception {

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
     * @date: 17/08/2022
     * @Description: This method performs clicking on the work plan templates page
     * @return values: opens work plan templates page
     */
    public void clickWorkPlanTemplates() throws InterruptedException {

        SFClick(clickWorkPlanTemplates);
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 17/08/2022
     * @Description: This method performs clicking on new button on the work plan templates page
     * @Param: accepts one argument label as input
     * @return values: opens new work plan templates
     */

    public void clickNew(String label) throws Exception {
        try{
            clickSFbutton("New");
            waitForSFPagetoLoad();
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }
    }

    /*
     * @KTV1362
     * @date: 17/08/2022
     * @Description: This method performs enters name on the work plan templates page
     * @Param: accepts two Param label and value as input
     * @return values: populates name
     */

    public void setName(String label,String data) throws Exception {

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
     * @date: 17/08/2022
     * @Description: This method performs enters relative execution order on the work plan templates page
     * @Param: accepts two Param label and value as input
     * @return values: populates relative execution order
     */
    public void setRelativeExecutionOrder(String label,String data) throws Exception {

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
     * @date: 17/08/2022
     * @Description: This method performs click action on active on the work plan templates page
     * @Param: accepts arguments label  as input
     * @return values: populates active
     */

    public void clickActive(String label) throws Exception {

        click("Active");
        waitForSFPagetoLoad();
    }

    /*
     * @KTV1362
     * @date: 17/08/2022
     * @Description: This method performs enters description on the work plan templates page
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
     * @date: 17/08/2022
     * @Description: This method performs click action on save on the  work plan templates page
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
