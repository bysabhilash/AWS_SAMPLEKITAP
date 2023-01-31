package com.kitap.pageobjects;

import org.openqa.selenium.Alert;   
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sf.utilities.ExtentManager;

import com.kitap.mobilebase.*;


@Listeners(com.sf.listeners.listeners.class)

/*
 * @KT1456
 * @date: 03/08/2021
 * @Description: This test covers the creation of an contactpage via UI
 */

public class Mob_BankingManagement extends BaseTest {
	
	@Test

	public void BankingManagementViaMobile() throws Exception {
		ExtentManager.log("Starting OrderCompleteTest...");
		
		//  driver.get(appurl);
		  ExtentManager.pass("Have successfully url launched");
		  
		  driver.findElement(By.id("username")).sendKeys("bysani@gmail.com");
		  ExtentManager.pass("Have successfully username entered");
		  
		  driver.findElement(By.id("password")).sendKeys("Abhilash@143");
		  ExtentManager.pass("Have successfully password entered");
		  
		  driver.findElement(By.id("Login")).click();
		  ExtentManager.pass("Have successfully opened classic version");
		  
		  Thread.sleep(2000);
       
		  driver.findElement(By.xpath("//a[text()='Banking Management']")).click();
		  Thread.sleep(2000);
		  ExtentManager.pass("Have successfully clicked on Banking Management page");
		  
		  driver.findElement(By.xpath("//input[@title='N']")).click();
		  Thread.sleep(2000);
		  ExtentManager.pass("Have successfully clicked on New link on Page");
		  
		  driver.findElement(By.id("Name")).sendKeys("abhi");
		  
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  
		  WebElement ele=driver.findElement(By.xpath("//select[@tabindex='3']"));
		  Select s = new Select(ele);
		  s.selectByVisibleText("Personal Loans");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[3]")).click();
		  
		  WebElement ele1=driver.findElement(By.xpath("//select[@id='calMonthPicker']"));
		  Select s1 = new Select(ele1);
		  s1.selectByVisibleText("August");
		  
		  WebElement ele2=driver.findElement(By.xpath("//select[@id='calYearPicker']"));
		  Select s2 = new Select(ele2);
		  s2.selectByVisibleText("2027");
		  
		  driver.findElement(By.xpath("//table//tbody//tr[@id='calRow3']//td[text()='18']")).click();
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[4]")).sendKeys("9876543210");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[5]")).sendKeys("abhilash");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[6]")).sendKeys("bysani");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[7]")).sendKeys("andhrapradesh");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[8]")).sendKeys("abhi bysani");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[9]")).sendKeys("524201");
		 
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[11]")).sendKeys("nellore");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[12]")).sendKeys("india");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//textarea[@type='text'])")).sendKeys("paletivaristreet");
		  
		  driver.findElement(By.xpath("(//tbody//tr//td//input[@type='text'])[10]")).sendKeys("6,00,000");	
		  
		
		  driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
		  
		  Thread.sleep(3000);		  
		  System.out.println("account created");
		 
			

	}
}



