package com.kitap.testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mob_chromeTest {
	
	
	public WebDriver driver;
	 
    
    @Test
 	public void ChromeTestMethod()
 	{ 
        	beforeTest();
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
       }
        
        
 
       @AfterTest
       public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
       }
       
       @BeforeTest
   	public void beforeTest() {
   		System.out.println("Initilizing the Google Chrome Driver");
   		//driver = new ChromeDriver();
   		String chromeExe = "src" + File.separator + "test" + File.separator + "resources" + File.separator
   				+ "chromedriver.exe";
   		System.setProperty("webdriver.edge.driver", chromeExe);
   		driver = WebDriverManager.chromedriver().create();
   	}

}
