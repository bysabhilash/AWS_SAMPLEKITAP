package com.kitap.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;


public class CampaignsPage extends SFPageBase
{
	public CampaignsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterCampaigns(String label,String data) throws Exception {

		try {
			setText(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	public void clicknewbutton() throws Exception {

		clickSFbutton("New");
		waitForSFPagetoLoad();
	}

	public void setCampaignName(String label,String data) throws Exception {

		try {
			setinput(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setActive(String label) throws Exception {

		try {
			click(label);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setType(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setStatus(String label,String data) throws Exception {

		try {
			selectdropdown(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setStartdate(String label,String data) throws Exception {

		try {
			setinput(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setEnddate(String label,String data) throws Exception {

		try {
			setinput(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setExpectedRevenueinCampaign(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setBudgetcostinCampaign(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setActualcostinCampaign(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setExpectedResponse(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setNumsetinCampaign(String label,String data) throws Exception {

		try {
			
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void setParentCampaign(String label,String data) throws Exception {
		selectcombobox(label, data);
	}
	
	public void setDescription(String label,String data) throws Exception {

		try {
			setinput(label, data);
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}

	public void clicksave(String label) throws Exception {

		try {
			click(label);
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}

	}



	}
	
	


