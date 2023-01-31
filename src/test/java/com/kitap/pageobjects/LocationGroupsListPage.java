package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTV1362
 * @date: 16/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of location groups creation
 */
public class LocationGroupsListPage extends SFPageBase {

    public LocationGroupsListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Location Groups\"]")
    private WebElement clickLocationGroups;


    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException
    {
        SFClick(ninesymbol);
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs entering input as location groups in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: opens location groups page
     */

    public void enterLocationGroups(String label,String data) throws Exception {

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
     * @date: 16/08/2022
     * @Description: This method performs clicking on the location groups page
     * @return values: opens new location groups page
     */
    public void clickLocationGroups() throws InterruptedException {

        SFClick(clickLocationGroups);
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs clicking on new button on the location groups page
     * @Param: accepts one argument label as input
     * @return values: opens new location groups page
     */

    public void clickNew(String label) throws Exception {
        try{
            clickSFbutton("New");
            }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs enters location group number on the location group page
     * @Param: accepts two Param label and value as input
     * @return values: populates location group number
     */
    public void setLocationGroupsNumber(String label,String data) throws Exception {

        try {
            setinput(label, data);
            }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs enters external reference on the location group page
     * @Param: accepts two Param label and value as input
     * @return values: populates external reference
     */
    public void setExternalReference(String label,String data) throws Exception {

        try {

            setinput(label, data);
            }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs enters description on the location group page
     * @Param: accepts two Param label and value as input
     * @return values: populates description
     */

    public void setDescription(String label,String data) throws Exception {

        try {

            settext1(label, data);
            }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs click action on sync with OCI on the location group page
     * @Param: accepts arguments label  as input
     * @return values: populates sync
     */
    public void clickSync(String label) throws Exception {

        click("Sync with OCI");
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs click action on enabled on the location group page
     * @Param: accepts arguments label  as input
     * @return values: populates enabled
     */
    public void clickEnabled(String label) throws Exception {

        click("Enabled");
    }

    /*
     * @KTV1362
     * @date: 16/08/2022
     * @Description: This method performs click action on save on the location group page
     * @Param: accepts arguments label  as input
     * @return values: populates save
     */
    public void savebutton (String label) throws Exception{
        try {
            click(label);
            }
        catch (Exception e)
        {
            System.out.println("In catch" + label);
        }
    }
}
