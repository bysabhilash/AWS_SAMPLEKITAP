package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTH1398
 * @date: 23/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of Work Step Templates Creation
 */
public class WorkStepTemplatesListPage extends SFPageBase {


    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath = "//*[@id=\"WorkStepTemplate\"]/div/lightning-formatted-rich-text")
    private WebElement WorkStepTemplates;


    public WorkStepTemplatesListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);// Creates instance for all web elements
    }

    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs clicking on app launcher in the salesforce home page
     * @return values: opens app launcher
     */
    public void clickninesymbol() {
        try {

            SFClick(ninesymbol);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs entering the input Work Step Templates in the quick search
     */
    public void WorkStepTemplates(String label, String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs clicking  Work Step Templates in the quick search list
     */
    public void clickWorkStepTemplates() throws InterruptedException {

        SFClick(WorkStepTemplates);
        waitForSFPagetoLoad();
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs clicking  new button in the Work Step Templates page
     * @Param: accepts one argument label as input
	 * @return values: opens new WorkStepTemplate page
     */
    public void clickNew(String lable) throws Exception {

        clickSFbutton(lable);
        waitForSFPagetoLoad();
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs entering the data into the Name field
     * @Param: accepts one argument label and value as input
	 * @return values: populates name
     */
    public void setName(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);


        } catch (Exception e) {
            System.out.println("Sent values as " + targetvalue);
        }
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs selecting  the data in the Action Definition
     * @Param: accepts two Param label and data as input
	 * @return values: populates parent actiondefinition
     */
    public void selectActionDefinition(String label, String targetvalue) throws Exception{
        try {
            selectcombobox(label, targetvalue);
            waitForSFPagetoLoad();

        } catch (Exception e) {
            System.out.println("Sent values as " + targetvalue);
        }
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs click action for the Active button
     * @return values: populates clicking active 
     */
    public void clickActive(String lable) throws Exception {
        click(lable);
        waitForSFPagetoLoad();
    }

    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs entering the data in the Description
     * @Param: accepts two Param label and data as input
	 * @return values: populates parent description
     */

    public void setDescription(String label, String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();

        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
     * @KTH1398
     * @date: 23/08/2022
     * @Description: This method performs click action for the Save button
     * @return values : populates saves the information
     */
    public void clickSave(String label) throws Exception {
        try {
            click(label);


        } catch (Exception e) {
            System.out.println("in catch" + label);
        }
    }
}


