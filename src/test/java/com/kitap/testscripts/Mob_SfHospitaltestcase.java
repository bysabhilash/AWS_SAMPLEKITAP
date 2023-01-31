package com.kitap.testscripts;


import org.testng.annotations.Listeners;  
import org.testng.annotations.Test;

import com.sf.utilities.ExtentManager;

import com.kitap.mobilebase.*;
import com.kitap.pageobjects.*;

@Listeners(com.sf.listeners.listeners.class)

public class Mob_SfHospitaltestcase extends BaseTest {
	
	@Test
	public void HospitalmanagementviaMobile() throws InterruptedException {
		
		Mob_SfHospitalmanagement Hospitalmanagemnt = new Mob_SfHospitalmanagement(driver);
		
		ExtentManager.log("Starting HospitalmanagementviaMobile...");
		
		Hospitalmanagemnt.clickagree();
		Thread.sleep(50000);
		Hospitalmanagemnt.clickmenu();
		Thread.sleep(10000);
		//scrollUp(3);
		Hospitalmanagemnt.clickhospitalmanagement();
		Hospitalmanagemnt.clicknew();
		Thread.sleep(10000);
		Hospitalmanagemnt.enterhospitalname("Medicover");
		Hospitalmanagemnt.selectdropdown();
		Hospitalmanagemnt.selectservices();		
		Hospitalmanagemnt.setfees("50000");
		Hospitalmanagemnt.setdname("nadal");
		Hospitalmanagemnt.settelephone("08626-551177");
		Hospitalmanagemnt.setpatientname("roshan");
		Hospitalmanagemnt.setpatientaddress("hyderabad");
		//scrollUp(2);
		Thread.sleep(10000);
		Hospitalmanagemnt.setmail("abhilashcool43@gmail.com");
		Hospitalmanagemnt.setcity("madhapur");
		Hospitalmanagemnt.setstate("Telangana");
		//Hospitalmanagemnt.setdate("11/13/2022");
		Hospitalmanagemnt.setcode("500018");
		Hospitalmanagemnt.setphone("987456321");
		Hospitalmanagemnt.clickingpayemnetmode();
		Hospitalmanagemnt.selectingpaymentmode();
		Hospitalmanagemnt.clicksave();
		
		
	}
		
}

