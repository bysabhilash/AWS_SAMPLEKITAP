package com.kitap.pageobjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;
		
		
		/*
		* @KT1461
		* @date: 03/08/2022
		* @Description: This page object covers methods for all the fields in salesforce of Work order creation
		*/
		public class WorkOrdersListPage extends SFPageBase {
		
		public WorkOrdersListPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
		}
		
		/*
		* @KT1461
		* @date: 03/08/2022
		* @Description: This method performs clicking on new button on the workorder's page
		* @Param: accepts one argument label as input
		* @return values: opens new workorder's page
		*/
		public void clicknewbutton(String label) throws Exception {
		 try{
	            clickSFbutton(label);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception c)
	        {
	            System.out.println("In catch"+label);
	        }
	
	    }
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting status on the workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting status
		 */
		public void selectstatus(String label, String data) throws Exception {
		 try{
	            selectdropdown(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In Catch" +label);
	        }
	    }
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting parent work order on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting parent work order
		 */
		public void selectparentworkorder(String label, String data) throws Exception {
			{

		        try {
		        	selectcombobox(label,data);
		            waitForSFPagetoLoad();
		        }
		        catch (Exception e)
		        {
		            System.out.println("In catch"+label);
		        }
		    }
		}
		
	    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting account on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting account
		 */
		public void selectaccount(String label, String data) throws Exception {
		{

	        try {
	        	selectcombobox(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch"+label);
	        }
	    }
	}
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting cases on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting cases
		 */
		public void selectcases(String label, String data) throws Exception {
		{

	        try {
	        	selectcombobox(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch"+label);
	        }
	    }
	}
		
	   /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting Priority on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting Priority
		 */
		public void selectpriority(String label,String data) throws Exception {
		
		 try{
	            selectdropdown(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In Catch" +label);
	        }
	    }
		/*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting contact on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting contact
		 */
		public void selectcontact(String label, String data) throws Exception {
		{

	        try {
	        	selectcombobox(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch"+label);
	        }
	    }
	}
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting asset on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting asset
		 */
		public void selectasset(String label, String data) throws Exception {
		{

	        try {
	        	selectcombobox(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch"+label);
	        }
	    }
	}
		
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs selecting entitlement on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: selecting entitlement
		 */
		public void selectentitlement(String label, String data) throws Exception {
		{

	        try {
	        	selectcombobox(label,data);
	            waitForSFPagetoLoad();
	        }
	        catch (Exception e)
	        {
	            System.out.println("In catch"+label);
	        }
	    }
	}
		
		    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs entering subject on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: entering subject
		 */
		public void setsubject(String label,String data) throws Exception {
		
		try {
			setinput(label,data);
			waitForSFPagetoLoad();
	       }
		 catch (Exception e)
        {
            System.out.println("In catch"+label);
        }
		
		}
	    /*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs entering Description on workorder's page
		 * @Param: accepts arguments label and data as input
		 * @return values: entering Description asset
		 */
		public void setdescription(String label,String data) throws Exception {
		
		try {
			setinput(label,data);
			waitForSFPagetoLoad();
	       }
		 catch (Exception e)
        {
            System.out.println("In catch"+label);
        }
		
		}
		
		/*
		 * @KT1461
		 * @date: 03/08/2022
		 * @Description: This method performs saving workorder's page
		 * @Param: accepts argument label as input
		 * @return values: saving record
		 */
		public void clicksavebutton(String label) throws Exception {
		
       try {
		click(label);
		waitForSFPagetoLoad();	
		}
       catch (Exception e)
       {
           System.out.println("In catch"+label);
       }
		
		}
}
