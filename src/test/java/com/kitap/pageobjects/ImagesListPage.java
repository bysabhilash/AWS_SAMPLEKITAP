package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KT1427
 * @date: 23/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of Image creation
 */
public class ImagesListPage extends SFPageBase {

    public ImagesListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Images\"]")
    private WebElement clickimages;

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */

    public void clickninesymbol() throws InterruptedException
    {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method performs entering input as Images in app launcher of salesforce home page
     * @Param: accepts two Param  label and value as input
     * @return values: opens accounts page
     */

    public void enterimages(String label,String data) throws Exception {

        try {
            setText(label, data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

    public void clickimages() throws InterruptedException {

        SFClick(clickimages);
        waitForSFPagetoLoad();
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method performs clicking on new button on the Images page
     * @Param: accepts one argument label as input
     * @return values: opens new accounts page
     */

    public void clicknew(String label) throws Exception {
        try{
            clickSFbutton("New");
        }
        catch (Exception c)
        {
            System.out.println("In catch"+label);
        }

    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method performs enters Image name on the account's page
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void setname(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method performs Orienting image from image data
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void setimage(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to set title for the image
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void settitle(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to set Accessibilty text for the image
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */
    public void setaccessibilitytext(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    
    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to set Accessibilty text for the image
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */
    public void seturl(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }


    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to mark the cheque box either it is active or not.
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */
    public void clickactive(String label) throws Exception {

        click(label);
        waitForSFPagetoLoad();

    }
    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to set a category of the image
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void setcategory(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to set a image type
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */
    public void setimagetype(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to choose the file from the combo box
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void setfile(String label, String targetvalue) throws Exception {
        try {
            selectcombobox(label, targetvalue);

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to choose the camera angle
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void setcam(String label, String targetvalue) throws Exception {

        try {
            settext1(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KT1427
     * @date: 22/08/2022
     * @Description: This method is to click on save in salesforce
     * @Param: accepts two Param label and value as input
     * @return values: populates account name
     */

    public void clicksave(String label) throws Exception {

        click(label);
        waitForSFPagetoLoad();

    }
}
