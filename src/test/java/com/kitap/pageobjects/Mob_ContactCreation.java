package com.kitap.pageobjects;  

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.testng.annotations.Test;

import com.kitap.mobilebase.*;

/*
 * @KT1456
 * @date: 03/08/2021
 * @Description: This test covers the creation of an contactpage via UI
 */

public class Mob_ContactCreation extends BaseTest {
	
	@Test

	public void ContactsCreationViaMobile() throws Exception {
		
		//  driver.get(appurl);
		  
		  driver.findElement(By.id("username")).sendKeys("bysani@gmail.com");
		  
		  driver.findElement(By.id("password")).sendKeys("Abhilash@143");
		  
		  driver.findElement(By.id("Login")).click();
		  
		  Thread.sleep(2000);
       
		  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@title='New']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("name_firstcon2")).sendKeys("abhi");
		  
		  driver.findElement(By.id("name_lastcon2")).sendKeys("bysani");
		  
		  driver.findElement(By.id("con5")).sendKeys("title");
		  
		  driver.findElement(By.id("con6")).sendKeys("testing");
		  
		  driver.findElement(By.id("con10")).sendKeys("080-4455889");
		  
		  driver.findElement(By.id("con13")).sendKeys("08626-241979");
		  
          driver.findElement(By.id("con12")).sendKeys("9988774455");
		  
		  driver.findElement(By.id("con14")).sendKeys("789654123");
		  
          driver.findElement(By.id("con19street")).sendKeys("Paletivaristreet");
		  
		  driver.findElement(By.id("con19city")).sendKeys("nellore");
		  
		  driver.findElement(By.id("con19state")).sendKeys("A.p");
		  
		  driver.findElement(By.id("con19zip")).sendKeys("08626");
		  
		  driver.findElement(By.id("con19country")).sendKeys("india");
		  
		  driver.findElement(By.id("con18street")).sendKeys("ayyapasociety");
		  
		  driver.findElement(By.id("con18city")).sendKeys("Hyderabad");
		  
          driver.findElement(By.id("con18state")).sendKeys("Telangana");
		  
		  driver.findElement(By.id("con18country")).sendKeys("india");
		  
		  driver.findElement(By.id("00N5i00000BbMXC")).sendKeys("English");
		  
		  driver.findElement(By.id("con20")).sendKeys("Creating account");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//input[@title='Save'])[1]")).click();
		  
		  Thread.sleep(3000);		  
		  System.out.println("account created");
			  
		  driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
		  Thread.sleep(5000);
		  Alert alert=  driver.switchTo().alert();
		  Thread.sleep(5000);
          alert.accept();
          Thread.sleep(5000);
          System.out.println("created account deleted");
			
			  
		  }
			
			
}
