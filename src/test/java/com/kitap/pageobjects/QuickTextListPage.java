package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

/*
 * @KTH1398
 * @date: 16/08/2022
 * @Description: This page object covers methods for all the fields in salesforce of Quick text Creation
 */
public class QuickTextListPage extends SFPageBase {

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

//    @FindBy(xpath = "//b[contains(text(),'QuickText')]")
//    private WebElement QuickText;

    @FindBy(xpath = "//*[@id=\"QuickText\"]/div/lightning-formatted-rich-text/span/p/b")
    private WebElement QuickText1;


    public QuickTextListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);// Creates instance for all web elements
    }

    /*
     * @KTH1398
     * @date: 16/08/2022
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
     * @date: 16/08/2022
     * @Description: This method performs entering the input Quick text in the quick search
     */

    public void enterQuicktext(String label, String data) throws Exception {

        try {
            setText(label, data);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description: This method performs clicking on the Quick text in the Quick search
     */
    public void clickQuickText() throws InterruptedException {

        SFClick(QuickText1);
        waitForSFPagetoLoad();
    }

    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the New Quick text button .
     *  @return values: opens the  New Quick text popup page
     */
    public void clickNewQuickText(String lable) throws Exception {

        clickSFbutton(lable);
        waitForSFPagetoLoad();
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the New Quick text button .
     *  @return values: opens the  New Quick text popup page
     */
    public void setQuickTextName(String label, String data) throws Exception {

        try {
            setinput(label, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the New Quick text button .
     *  @return values: opens the  New Quick text popup page
     */
    public void RelatedTo(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the New Quick text button .
     *  @return values: opens the  New Quick text popup page
     */
    public void Field(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the Insert button .
     *  @return values: populates the text area with the values selected
     */
    public void clickInsert(String label) throws Exception {
        try {
            clickSFbutton(label);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("Sent values as ");
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the Category and select the value from the dropdowns .
     *  @return values: selects the value from the dropdown .
     */
    public void selectCategory(String label, String targetvalue) throws Exception {
        try {
            selectdropdown(label, targetvalue);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the checkbox.
     */
    public void clickInclude(String label) throws Exception {
        try {
            clickSFbutton("Include in selected channels");
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("Sent values as ");
        }
    }
    /*
     * @KTH1398
     * @date: 16/08/2022
     * @Description:This method performs clicking on the Save button .
     *  @return values: save  the dat in the Quick text list page.
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