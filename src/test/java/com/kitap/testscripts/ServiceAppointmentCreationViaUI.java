package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

/*
 * @KT1444
 * @date: 18/08/2022
 * @Description: This test script covers the creation of an serviceappointment via UI
 */

public class ServiceAppointmentCreationViaUI extends BaseTest
{
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void ServiceAppointmentCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("ServiceAppointmentCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "ServiceAppointmentCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        lightningloginpage.applauncher("ServiceAppointment");
        serviceappointmentlistpage.clicknew("New");
        serviceappointmentlistpage.setContact("Contact",data.get("contact"));
        serviceappointmentlistpage.setparentaccount("Parent Record",data.get("account"));
        serviceappointmentlistpage.setDescription("Description",data.get("description"));
        serviceappointmentlistpage.setEarliestStartPermitted("Earliest Start Permitted",data.get("earliest"));
        serviceappointmentlistpage.setDuedate("Due Date",data.get("duedate"));
        //serviceappointmentlistpage.setDuration("Duration",data.get("duration"));
        serviceappointmentlistpage.setAddress("Address",data.get("street"));
        serviceappointmentlistpage.setCity("City",data.get("city"));
        serviceappointmentlistpage.setZiporPostalcode("Zip/Postal Code",data.get("postalcode"));
        serviceappointmentlistpage.setStateorProvince("State/Province",data.get("state"));
        serviceappointmentlistpage.setCountry("Country",data.get("country"));
        serviceappointmentlistpage.setComment("Comment",data.get("comment"));
        serviceappointmentlistpage.setDurationType("Duration Type",data.get("durationtype"));
        serviceappointmentlistpage.setSubject("Subject",data.get("subject"));
      //  serviceappointmentlistpage.setWorkType("Work Type",data.get("worktype"));
        serviceappointmentlistpage.setAdditionalInformation("Additional Information",data.get("additionalinfo"));
        serviceappointmentlistpage.setStatus("Status",data.get("status"));
        serviceappointmentlistpage.setCancellationReason("Cancellation Reason",data.get("cancellationreason"));
        serviceappointmentlistpage.setArrivalwindowStart("Arrival Window Start",data.get("arrivalwindowstart"));
        serviceappointmentlistpage.setScheduleStart("Scheduled Start",data.get("schedulestart"));
        serviceappointmentlistpage.setArrivalwindowEnd("Arrival Window End",data.get("arrivalwindowend"));
        serviceappointmentlistpage.setScheduleEnd("Scheduled End",data.get("scheduleend"));
        serviceappointmentlistpage.setActualStart("Actual Start",data.get("actualstart"));
        serviceappointmentlistpage.setActualEnd("Actual End",data.get("actualend"));
        serviceappointmentlistpage.setActualDuration("Actual Duration (Minutes)",data.get("actualduration"));
        serviceappointmentlistpage.setPhone("Phone",data.get("phone"));
        serviceappointmentlistpage.setEmail("Email",data.get("email"));
        serviceappointmentlistpage.clicksave("Save");
    }

}
