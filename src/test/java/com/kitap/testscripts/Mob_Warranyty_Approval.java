package com.kitap.testscripts;

import com.sf.utilities.ExtentManager;  
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.kitap.mobilebase.*;
import com.kitap.pageobjects.*;
import java.time.Duration;
import java.util.Hashtable;
//@Listeners(com.sf.listeners.listeners.class)
public class Mob_Warranyty_Approval extends BaseTest {
    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "db")
    public void Approval_Confirmation(Hashtable<String, String> data) throws Exception {
        ExtentManager.log("Starting Procedure for Approval...");
        Mob_Warranty_Approval_Demo Submission = new Mob_Warranty_Approval_Demo(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Submission.LoginCredentials("saikalyan.b@kairostech.com.dev", "Sridan123+@");
        Submission.Notification();
        Submission.Select_Case(data.get("Parent Case Number"));
        Submission.Button_Box("Approve");
        Submission.EditViews("Comments", data.get("Reply To Comment"));
        Submission.Button_Box("Approve");
        Submission.ProfileMenu();
        Submission.Logout();
        ExtentManager.log("Approved The Request...");
        Submission.quit();
    }
}
