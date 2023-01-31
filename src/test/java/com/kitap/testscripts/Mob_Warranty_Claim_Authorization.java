package com.kitap.testscripts;

import com.sf.utilities.ExtentManager; 

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.kitap.mobilebase.*;
import com.kitap.pageobjects.*;
import java.time.Duration;
import java.util.Hashtable;

import static com.kitap.pageobjects.Mob_Warranty_Approval_Demo.Parent_Case;

@Listeners(com.sf.listeners.listeners.class)
public class Mob_Warranty_Claim_Authorization extends BaseTest {
    Mob_Warranty_Approval_Demo Submission;

    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "db")

    public void Submit_For_Approval(Hashtable<String, String> data) throws Exception {
        ExtentManager.log("Starting Procedure to Request for Approval...");
        Submission = new Mob_Warranty_Approval_Demo(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Submission.LoginCredentials("bysani@gmail.com", "Abhilash@143");
        Submission.Menu("Cases");
        Submission.New();
        Submission.Search_Bar("Contact Name", data.get("Contact Name"));
        Submission.Search_Bar("Account Name", data.get("Account Name"));
        Submission.Information("Product", data.get("Product"));
        Submission.Information("Type", data.get("Type"));
        Submission.CaseInformarion("Status", data.get("Status"));
        Submission.Information("Priority", data.get("Priority"));
        Submission.Information("Case Origin", data.get("Case Origin"));
//        Submission.Information("Case Reason", data.get("Case Reason"));
        Submission.WebInformation("Web Email", data.get("Web Email"));
        Submission.WebInformation("Web Name", data.get("Web Name"));
        Submission.WebInformation("Web Company", data.get("Web Company"));
        Submission.WebInformation("Web Phone", data.get("Web Phone"));
        Submission.WebInformation("Engineering Req Number", data.get("Engineering Req Number"));
        Submission.AdditionalInformation("Potential Liability", data.get("Potential Liability"));
        Submission.AdditionalInformation("SLA Violation", data.get("SLA Violation"));
        Submission.DescriptionalInformation("Subject", data.get("Subject"));
        Submission.DescriptionalInformation("Description", data.get("Description"));
        Submission.DescriptionalInformation("Internal Comments", data.get("Internal Comments"));
        Submission.Save();
        Submission.Menu("Cases");
        Submission.Select_Case(Parent_Case);
        Submission.Button_Box("More");
        Submission.Button_Box("Submit for Approval");
        Submission.EditViews("Comments", data.get("Comment"));
        ExtentManager.log("Commented about the Approval");
        Submission.Button_Box("Submit");
        Submission.ProfileMenu();
        Submission.Logout();
        ExtentManager.log("Request for Approval was successfully submitted...");
        Submission.quit();


    }


}
