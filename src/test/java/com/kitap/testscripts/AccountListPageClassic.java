package com.kitap.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class AccountListPageClassic {
    
    //public static void main(String[]  args) throws InterruptedException {
	
	@Test
	
	public void AccountCreationClassic() throws InterruptedException {
        
         System.setProperty("webdriver.edge.driver","C:\\Users\\AbhilashBysani-Kairo\\eclipse-workspace\\KITAP\\src\\test\\resources\\msedgedriver.exe");  
          
           // Instantiate a ChromeDriver class.       
        WebDriver driver=new EdgeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(5000);



       driver.findElement(By.id("username")).sendKeys("bysani@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jasper@143");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(11000);
        driver.findElement(By.xpath("(//span[@class='uiImage'])[1]")).click();
        Thread.sleep(3000);



       driver.findElement(By.xpath("//a[normalize-space()='Switch to Salesforce Classic']")).click();
        Thread.sleep(6000);

       driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
        Thread.sleep(6000);

       driver.findElement(By.xpath("//input[@title='New']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=string(//label[text()='Account Name']/@for)]")).sendKeys("Mliwardbwown");
        driver.findElement(By.xpath("//input[@name='acc5']")).sendKeys("98345612");
        driver.findElement(By.xpath("//input[@id='acc23']")).sendKeys("http://wwww.mb.com");
        
        Select type =new Select(driver.findElement(By.id("acc6")));
        type.selectByValue("Customer - Direct");
        
        Select industry =new Select(driver.findElement(By.id("acc7")));
        industry.selectByValue("Agriculture");
        
        Select rating =new Select(driver.findElement(By.id("acc9")));
        rating.selectByValue("Hot");
        
        driver.findElement(By.xpath("//input[@id='acc10']")).sendKeys("987654321");
        driver.findElement(By.xpath("//input[@id='acc11']")).sendKeys("32145");
        driver.findElement(By.xpath("//input[@id='acc12']")).sendKeys("http://wwww.mb.com");
        driver.findElement(By.xpath("//input[@id='acc13']")).sendKeys("Symbol1");
        
        Select ownership =new Select(driver.findElement(By.id("acc14")));
        ownership.selectByValue("Public");
        
        driver.findElement(By.xpath("//input[@id='acc8']")).sendKeys("1000000");
        driver.findElement(By.xpath("//input[@id='acc15']")).sendKeys("250");
        driver.findElement(By.xpath("//textarea[@id='acc17street']")).sendKeys("Street");
        driver.findElement(By.xpath("//input[@id='acc17city']")).sendKeys("city");
        driver.findElement(By.xpath("//input[@id='acc17state']")).sendKeys("state");
        driver.findElement(By.xpath("//input[@id='acc17zip']")).sendKeys("521478");      
        driver.findElement(By.xpath("//input[@id='acc17country']")).sendKeys("USA");
        driver.findElement(By.xpath("//textarea[@id='acc18street']")).sendKeys("Street");
        driver.findElement(By.xpath("//input[@id='acc18city']")).sendKeys("city");
        driver.findElement(By.xpath("//input[@id='acc18state']")).sendKeys("state");
        driver.findElement(By.xpath("//input[@id='acc18zip']")).sendKeys("521478");      
        driver.findElement(By.xpath("//input[@id='acc18country']")).sendKeys("USA");
        
        Select customerpriority =new Select(driver.findElement(By.id("00N5i00000BbMX2")));
        customerpriority.selectByValue("High");
        
        
        driver.findElement(By.xpath("//input[@id='00N5i00000BbMX5']")).sendKeys("9/7/2022");
        driver.findElement(By.xpath("//input[@id='00N5i00000BbMX3']")).sendKeys("20");
        
        Select active =new Select(driver.findElement(By.id("00N5i00000BbMX4")));
        active.selectByValue("Gold");
        
        Select sla =new Select(driver.findElement(By.id("00N5i00000BbMX1")));
        sla.selectByValue("No");
        
        driver.findElement(By.xpath("//input[@id='00N5i00000BbMX6']")).sendKeys("0074X");
        
        Select upsellopportunity =new Select(driver.findElement(By.id("00N5i00000BbMX7")));
        upsellopportunity.selectByValue("Maybe");
        
        driver.findElement(By.xpath("//textarea[@id='acc20']")).sendKeys("creating account");
        driver.findElement(By.xpath("(//input[@class='btn'])[4]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
        Thread.sleep(3000);
        
        Alert a = driver.switchTo().alert();
        a.accept();
        Thread.sleep(3000);
        
        driver.quit();

        


    }



}

	
	