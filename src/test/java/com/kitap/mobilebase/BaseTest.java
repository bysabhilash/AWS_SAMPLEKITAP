package com.kitap.mobilebase;

import io.appium.java_client.android.AndroidDriver;         
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
//import com.aventstack.extentreports.ExtentTest;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;
import com.google.common.collect.ImmutableMap;
import com.kitap.utilities.ExtentManager;

import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
	
	// public String appurl = "https://login.salesforce.com/";
	 public static  AndroidDriver driver;
	 public static String screenShotDestinationPath;
		
	@BeforeClass
	
	
	public void setup() throws Throwable {
		
	//	System.getProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver_win32 (1)\\chromedriver.exe");

		 DesiredCapabilities capabilities=new DesiredCapabilities(); 
		  //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		  capabilities.setCapability(MobileCapabilityType.UDID, "35924bee");
		  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "realme X2"); 
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  capabilities.setCapability("appPackage","com.salesforce.chatter");
		  capabilities.setCapability("appActivity","com.salesforce.chatter.Chatter");
		  //capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		 // capabilities.setCapability("skipDeviceInitialization", true);
		 // capabilities.setCapability("skipServerInstallation", true);
		  ChromeOptions options = new ChromeOptions();
		//  options.setExperimentalOption("androidKeepAppDataDir", true);
		//    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//    capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
		  driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	
	}  
	
	
	@AfterClass
	
	public void teardown() {
//		driver.quit();
		
	}
	
	public static String takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String destFile = System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png";
		screenShotDestinationPath = destFile;
		
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return name;
		
	}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static String getScreenshotDestinationPath() {
		return screenShotDestinationPath;
	}	
	
}



