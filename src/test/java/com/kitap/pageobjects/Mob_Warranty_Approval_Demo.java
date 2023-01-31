package com.kitap.pageobjects;


import com.sf.utilities.ExtentManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class Mob_Warranty_Approval_Demo {
    static int hgt;
    static int wdt;
    int y;
    int x;
    int startx;
    int endx;
    int starty;
    int endy;
    AndroidDriver driver;

    public Mob_Warranty_Approval_Demo(AndroidDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.salesforce.chatter:id/mi_accept")
    public WebElement agree;
    @AndroidFindBy(xpath = "//*[@text='Menu']")
    public WebElement menu;
    @AndroidFindBy(id = "com.salesforce.chatter:id/toast_message")
    public WebElement toast_message;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Cases Link']")
    public WebElement Cases;
    @AndroidFindBy(id = "com.salesforce.chatter:id/object_list_new_button")
    public WebElement New;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    public WebElement Close;
    @AndroidFindBy(id = "com.salesforce.chatter:id/user_avatar_icon")
    public WebElement ProfileMenu;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[8]")
    public WebElement Logout;
    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.TextView[2]")
    public WebElement Logout_Confirmation;
    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    public WebElement Save;
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public List<WebElement> LoginFields;
    @AndroidFindBy(xpath = "//*[contains(@text,'Log In')]")
    public WebElement Login_Button;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Case Info\")]")
    public WebElement Case_Info;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement Set;

    public void CheckingcredentialsPath(String UserName, String PassWord) {
        List<WebElement> i = LoginFields;
        WebElement k = null;
        for (WebElement j : i) {
            if (k != null) j.sendKeys(PassWord);
            else j.sendKeys(UserName);
            k = j;
        }
    }

    public void LoginCredentials(String UserName, String PassWord) throws InterruptedException {
        while (true) {
            try {
                if (agree.isDisplayed())
                    agree.click();
                CheckingcredentialsPath(UserName, PassWord);
                Login_Button.click();
                Button_Box(" Allow ");
                Close();
                ExtentManager.log("Successfully Login...");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void Menu(String List) throws InterruptedException {
        menu.click();
        while (true) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement element = driver.findElement(By.xpath("//*[contains(@text,'" + List + "')]"));
                wait.until(ExpectedConditions.visibilityOf(element));
                element.click();
                ExtentManager.log("Entered to Menu to check on Cases");
                break;
            } catch (Exception e) {
                scrolltoEnd();
                System.out.println(e.getMessage());
            }
        }
    }

    public void New() throws InterruptedException {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOf(New));
            New.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ContactInformarion(String FieldName, String InputText) throws Exception {
        TextView(FieldName, InputText);
    }

    public void CaseInformarion(String FieldName, String InputText) throws InterruptedException {
        TextViews(FieldName, InputText);
        ExtentManager.log("Status was  Updated");
    }

    public void Information(String FieldName, String InputText) throws Exception {
        TextView(FieldName, InputText);
        ExtentManager.log( FieldName+"Updated");
    }

    public void WebInformation(String FieldName, String InputText) throws InterruptedException {
        EditViews(FieldName, InputText);
        ExtentManager.log(FieldName+" Updated");
    }

    public void AdditionalInformation(String FieldName, String InputText) throws InterruptedException {
        TextView(FieldName, InputText);
        ExtentManager.log(FieldName+" Updated");
    }

    public void DescriptionalInformation(String FieldName, String InputText) throws InterruptedException {
        EditViews(FieldName, InputText);
        ExtentManager.log(FieldName +" commented");
    }

    public void quit() {
        driver.quit();
    }

    public void EditViews(String s, String l) {
        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + s + "']/following-sibling::android.widget.EditText"));
                i.sendKeys(l);

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();
            }
        }
    }

    public void EditView(String FieldName, String FieldBox) throws InterruptedException {
        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + FieldName + "']/ancestor::android.view.View[1]/following-sibling::android.widget.EditText"));
                System.out.println(i.getText());
                i.sendKeys(FieldBox);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();

            }
        }
    }

    public void TextView(String s, String l) {
        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + s + "']"));
                i.click();
                WebElement ele = driver.findElement(By.xpath("//*[@text='" + l + "']"));
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(ele));
                ele.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();
            }
        }
    }

    public void Search_Bar(String s, String l) {
        while (true) {
            try {
                Thread.sleep(5000);
                WebElement element = driver.findElement((By.xpath("//*[@text='" + s + "']/following-sibling::android.view.View/descendant::android.widget.Button")));
                element.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement ele = driver.findElement(By.xpath("//*[@text='" + l + "']"));
                wait.until(ExpectedConditions.visibilityOf(ele));
                ele.click();
                ExtentManager.log(s+" Name Updated");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();
            }
        }

    }

    public void Notification() {
        while (true) {
            try {
                WebElement i = driver.findElement(By.id("com.salesforce.chatter:id/bell_icon"));
                i.click();
                ExtentManager.log("Looking into Request...");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void Select_Case(String Case_Number) {
        while (true) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement ele = driver.findElement(By.xpath("//*[contains(@text,'" + Case_Number + "')]"));
                wait.until(ExpectedConditions.visibilityOf(ele));
                ele.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void Case_Approval() {

    }

    public void TextViews(String s, String l) {

        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + s + "']/ancestor::android.view.View[1]/following-sibling::android.view.View"));
                i.click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement ele = driver.findElement(By.xpath("//*[@text='" + l + "']"));
                wait.until(ExpectedConditions.visibilityOf(ele));
                ele.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();

            }
        }
    }

    public void Spinner(String s) throws InterruptedException {
        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + s + "']/ancestor::android.view.View[1]/following-sibling::android.widget.Spinner"));
                i.click();
                Set.click();
                break;
            } catch (Exception e) {
                scrolltoEnd();
            }
        }
    }

    public void Button_Box(String s) throws InterruptedException {
        Thread.sleep(5000);
        while (true) {
            try {
                WebElement i = driver.findElement(By.xpath("//*[@text='" + s + "']"));
                i.click();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scrolltoEnd();
            }
        }
    }


    public void ScrolltoElement(WebElement element) throws InterruptedException {
        if (hgt == 0 && wdt == 0) getDmiensions();

        while (true) {
            try {
                element.click();
                break;
            } catch (Exception e) {
                scrolltoEnd();
                System.out.println("scrolling.....!");
            }

        }
    }

    public void Close() {
        try {
            Thread.sleep(10000);
            Close.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Logout() {
        Logout.click();
        Logout_Confirmation.click();
    }

    public void ProfileMenu() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(ProfileMenu));
            ProfileMenu.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Display_Message() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(toast_message));
        Close.click();
    }

    public static String Parent_Case;

    String Path = "C:\\Users\\AkhilK-Kairos\\IdeaProjects\\SALESFORCE_MOBILE_DEMO1\\src\\test\\resource\\extentconfig\\Demo_Sample.xlsx";

    public void Save() throws InterruptedException {

        try {

            Save.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOf(toast_message));
            Parent_Case = toast_message.getText().substring(6, 14);
            writeExcelData(Path, "Sheet1", 1, 21, Parent_Case);
            System.out.println(Parent_Case);
            ExtentManager.log("Saved The Request");
            Thread.sleep(5000);
        } catch (Throwable e) {
            System.out.println(e.getMessage());

        }
    }


    public void getDmiensions() {
        Dimension dme = driver.manage().window().getSize();
        hgt = dme.getHeight();
        wdt = dme.getWidth();
        y = (int) (hgt * 0.2);
        x = (int) (wdt * 0.2);
        startx = (int) (wdt * 0.9);
        endx = (int) (wdt * 0.1);
        starty = (int) (hgt * 0.75);
        endy = (int) (hgt * 0.35);
    }

    public void ScrollToTarget(int LOCY1, int LOCY2) {
        if (hgt == 0 && wdt == 0) getDmiensions();
        Sequence swipe2;
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        swipe2 = new Sequence(finger2, 1);
        swipe2.addAction(finger2.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), x, LOCY1));
        swipe2.addAction(finger2.createPointerDown(0));
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(2500), PointerInput.Origin.viewport(), x, LOCY2));
        swipe2.addAction(finger2.createPointerUp(0));
        driver.perform(Arrays.asList(swipe2));

    }

    public void scrolltoEnd() {
        if (hgt == 0 && wdt == 0) getDmiensions();
        Sequence swipe2;
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        swipe2 = new Sequence(finger2, 1);
        swipe2.addAction(finger2.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), x, starty));
        swipe2.addAction(finger2.createPointerDown(0));
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), x, y));
        swipe2.addAction(finger2.createPointerUp(0));
        driver.perform(Arrays.asList(swipe2));


    }

    public String readExcelData(String path, String sheet, int row, int cell) throws Throwable {
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        return wb.getSheet(sheet).getRow(row).getCell(cell).toString();
    }

    public void writeExcelData(String path, String sheet, int row, int cell, String data) throws Throwable {
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
    }


}

