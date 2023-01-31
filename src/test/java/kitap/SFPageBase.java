package kitap;


import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.prefs.Preferences;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.jayway.jsonpath.JsonPath;
import com.kitap.utilities.ExtentManager;


import net.minidev.json.JSONArray;

/**
 * @author KT1456
 * @date: 04/07/2022
 * @Description: This class gets the UI layout from UI API and tries to make the xpath for all the elements 👼
 * @see: A lot of these methods are implemented using JSONPATH to parse the
 *       response we get from UI API
 */

public class SFPageBase  {
	
	protected static WebDriver driver;
	String originalValue = null;
	Actions actions = null;
	protected String default_locale;
	protected Preferences prefs = Preferences.userRoot().node(this.getClass().getName());;
        public static String value;
        public static String text;
        public static String details;
        public static String casenumber;
        public static String cases;
        public static String actualvalue;
        
		public SFPageBase(WebDriver driver) {
			this.driver = driver;
			actions = new Actions(driver);
		}
		
		protected static String uiapi_record_json;
		private static ArrayList<String> listoflabels;
		protected static HashMap<String, String> labelandtype;
	
		public void waitForSFPagetoLoad() throws InterruptedException {
			
	       Thread.sleep(3000);
			
			try {
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	
				ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
					@Override
					public Boolean apply(WebDriver driver) {
						return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
								.equals("complete");
					}
				};
	
				ExpectedCondition<Boolean> aurascriptLoad = new ExpectedCondition<Boolean>() {
					@Override
					public Boolean apply(WebDriver driver) {
						String WAIT_FOR_AURA_SCRIPT = "return (typeof $A !== 'undefined' && $A && $A.metricsService.getCurrentPageTransaction().config.context.ept > 0)";
						String EPT_COUNTER_SCRIPT = "return ($A.metricsService.getCurrentPageTransaction().config.context.ept)";
						Boolean result = (Boolean) ((JavascriptExecutor) driver).executeScript((WAIT_FOR_AURA_SCRIPT));
	
						if (result.equals(true)) {
							System.out.println("Experienced Page Load time in milliseconds on the current page is : "
									+ ((JavascriptExecutor) driver).executeScript(EPT_COUNTER_SCRIPT));
							return true;
						} else {
							return false;
						}
	
					}
				};
				if (wait1.until(jsLoad) && wait1.until(aurascriptLoad)) {
					System.out.println("Page load complete");
				} else {
					waitForSFPagetoLoad();
				}
			}
	
			catch (Exception e) {
				System.out.println("Exception happened in waiting for page to load , so sleeping for 5 seconds");
				System.out.println("Exception is " + e.getMessage());
				waitForSFPagetoLoad();
	
			}
		}
		
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description: This method call is the heart of the UI API based automation and gets the UI
			             API
			             Json for further operations ♥
			             Here 0015g00000S9lfUAAR is the record ID of an ACCOUNT, but the same API and
			             general methods below can be used for the other sbjects.
		 */
	
		public static void uiApiHitter(String recordID) {
			uiapi_record_json = (HTTPClientWrapper
					.runGetRequest("/ui-api/record-ui/" + recordID + "?formFactor=Large&modes=View,Edit")).toString();
			System.out.println(uiapi_record_json);
	
		}
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description:  This method brings in the count of sections displayed on the UI
		 */
	
		public static void sectionGetter() throws Exception {
			
			String sectionspath = "$.layouts.Account..sections";
			JSONArray sectionsparent = JsonPath.read(uiapi_record_json, sectionspath);
			JSONArray sectionsarray = (JSONArray) sectionsparent.get(0);
			System.out.println("Count of Sections is : " + sectionsarray.size());
	
		}
		
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description: These labels are gathered from layoutComponents as we get labels which are actually displayed on the UI rather than all the fields for the sObject
		 */
	
	
		public static void labelGetter() throws Exception {
			
			String labelpath = "$..[?(@.editableForUpdate == true)].layoutComponents..label";
			JSONArray listofduplicatelabels = JsonPath.read(uiapi_record_json, labelpath);
			
			LinkedHashSet<String> labels = new LinkedHashSet<String>();
			for (int i = 0; i < listofduplicatelabels.size(); i++) {
				labels.add((String) listofduplicatelabels.get(i));
			}
	
			listoflabels = new ArrayList<String>();
			listoflabels.addAll(labels);
			System.out.println("Labels are " + labels);
	
		}
		
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description: This method fetches the data type for all labels from the UI API JSON
		 */
	
	
		public static void dataTypeGetter() throws Exception {
			
			labelandtype = new HashMap<>();
			for (int i = 0; i < listoflabels.size(); i++) {
				String label = listoflabels.get(i);
				String typepath = "$..[?(@.label =='" + label + "')].dataType";
				String datatype = JsonPath.read(uiapi_record_json, typepath).toString();
				labelandtype.put(label, datatype);
			}
			labelandtype.entrySet().forEach(entry -> {
				System.out.println("Label and types are : " + entry.getKey() + " " + entry.getValue());
			});
		}
	
		public void uiApiParser(String recordid) throws Exception {
			uiApiHitter(recordid);
			sectionGetter();
			labelGetter();
			dataTypeGetter();
		}
		
	
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description: This method automagically uses the label and datatypes to fill the form on the fly  And reduces the pain for creation and maintenance of separate pageobjects and  web elements
		*/
	  
		public void formValueFiller(String label, String targetvalue) throws Exception {
			
			WebElement we;
			String type = labelandtype.get(label);
			switch (type) {
			case "[\"String\"]":
			case "[\"Url\"]":
			case "[\"Int\"]":
			case "[\"Phone\"]":
			case "[\"Currency\"]":
			case "[\"Double\"]":
			case "[\"Date\"]":
			case "[\"Boolean\"]":
				Thread.sleep(5000);
				
				we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
				we.sendKeys(targetvalue);
				System.out.println("Sent values as " + targetvalue);
				break;
			case "[\"TextArea\"]":
				we = driver.findElement(By.xpath("//textarea[@id=string(//label[text()='" + label + "']/@for)]"));
				we.sendKeys(targetvalue);
				break;
			case "[\"Picklist\"]":
				we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
				we.sendKeys(targetvalue);
				waitForSFPagetoLoad();
				we.sendKeys(Keys.ENTER);
				break;
			case "[\"Reference\"]":
				we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
				we.sendKeys(Keys.ARROW_DOWN);
				waitForSFPagetoLoad();
				we.sendKeys(Keys.ENTER);
				break;
			}
	
		}
		
		/**
		 * @author KT1456
		 * @date: 04/07/2022
		 * @Description: This method checks whether the specified value is mandatory in the UI or not
		*/
	
		public static void verifyRequiredFields(String testdatajson, String objname) {
			
			String valuename = objname + "Name";
			String isrequiredexpected = readJsonFile(testdatajson, "$." + valuename + ".isRequired");
	
			String objjson = HTTPClientWrapper.runGetRequest("/sobjects/" + objname + "/describe/layouts/").toString();
			String jsonpath = "$..[?(@.label==\"Account Name\")]..required";
	
			String isrequiredactual = JsonPath.read(objjson, jsonpath).toString();
			System.out.print("Validating that the object contains the right mandatory fields");
			if (isrequiredactual.contains(isrequiredexpected)) {
				System.out.println(
						"THIS IS A TEST-------------------------------------SHOULD BE REPLACED BY TESTNG/JUNIT ASSERTS");
				System.out.println("Required fields verified correctly");
				System.out.println("--------------------------------------------------------------------------");
	
			} else {
				System.out.println(
						"THIS IS A TEST-------------------------------------SHOULD BE REPLACED BY TESTNG/JUNIT ASSERTS");
				System.out.println("Required fields couldnt be verified correctly");
				System.out.println("--------------------------------------------------------------------------");
			}
	
		}
	
		public void globalSearch(String searchterm) {
			
	
		}
	
		public String getURL(String appname) { // Method to get SF Apps URL and simulate 9 dot navigation
			GetSFApps getSfApps = new GetSFApps();
			return getSfApps.getAppNavURL(appname);
	
		}
	
		public void appLauncher(String appname) throws InterruptedException {
			String accountappurl = getURL(appname);
			System.out.println("account URL is" + accountappurl);
			String cleanurl = accountappurl.replace("[\"", "").replace("\"]", "");
			System.out.println("Navigating to App URL as : " + cleanurl);
			openHomepage(cleanurl + "?eptVisible=1");
	
			waitForSFPagetoLoad();
	
		}
		
		 /*
		    * @KT1456
		    * @date: 25/06/2022
		    * @Description: This method performs entering data into input fields in salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
		public void setText(String label, String targetvalue) throws Exception {
			WebElement we;
			WebElement we2;
	
			try {
				if (!label.isEmpty()) {
					try {
						we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
						 highlightelement(we);
						we.sendKeys(targetvalue);
						//we.sendKeys(Keys.ENTER);
						System.out.println("Sent values as " + targetvalue);
			//			ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the "  +  label  +   " field" );
					} catch (Exception e) {
						we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));
						 highlightelement(we);
						we.sendKeys(targetvalue);
					//	we.sendKeys(Keys.ENTER);
		//				ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the "  +  label  +   " field" );
					}
	
				}
	
			} catch (Exception e) {
				System.out.println("Given"  + targetvalue +  " not entered in to particular field by using setText method");
	//			ExtentManager.fail("text "  +  targetvalue  +   " was not entered in to the "  +  label  +  " field" );
			}
		}
		 /*
		    * @KT1456
		    * @date: 25/06/2022
		    * @Description: This method performs action on the dropdowns in  salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
		public void selectOption(String label, String targetvalue) throws Exception {
			   WebElement we;

			   try {
			      if (!label.isEmpty()) {
			         try {
			        	
			            we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
			            highlightelement(we);
			            we.sendKeys(targetvalue);
			            System.out.println("Sent values as " + targetvalue);
		//	            ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the "  +  label  +   " field" );
			         } 
			         catch (Exception e) {
			            we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));
			            highlightelement(we);
			            we.sendKeys(targetvalue);
			            we.sendKeys(Keys.ENTER);
		//	            ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the "  +  label  +   " field" );
			            
			         }

			      }

			   } catch (Exception e) {
			      System.out.println("Given " + targetvalue + " Dropdown elements are not able select by usinng selectOption method ");
	//		      ExtentManager.fail("selected value "  +  targetvalue  +   " was notselected in to the "  +  label  +  " field" );
			   }
			}
		 /*
		    * @KT1456
		    * @date: 25/06/2022
		    * @Description: This method performs click actions in salesforce application 
		    * @Param: accepts arguments label  as input
		    * @return values: None
		 */
		public void clickSFbutton(String label) throws Exception {
			WebElement we;
	
			try {
				if (!label.isEmpty()) {
					try {
						
						we = driver.findElement(By.xpath("//div[@class='actionsContainer']//following::a//div[text()='" + label + "']"));
						we.click();
						 
						System.out.println("Sent values as ");
		//				ExtentManager.pass("Have successfully clicked the "  +  label   );
	
					} catch (Exception e) {
						we = driver.findElement(By.xpath("//div[text()='" + label + "']"));
						we.click();
						
						System.out.println("Sent values as ");
			//			ExtentManager.pass("Have successfully clicked the "   +  label   );
					}
	
				}
	
			} catch (Exception e) {
				System.out.println("Not able to click particular " + label + " by usimg clickSFbutton");
		//		ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		 /*
		    * @KT1456
		    * @date: 11/07/2022
		    * @Description: This method performs click actions in salesforce application 
		    * @Param: accepts arguments label  as input
		    * @return values: None
		 */
		
		public void click(String label) throws Exception {
			WebElement we;
	
			try {
				if (!label.isEmpty()) {
					
					try {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "']//ancestor::button)[1]"));
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
				//		ExtentManager.pass("Have successfully clicked the "  +  label   );
						return;					
					}
					
					    catch (Exception e) {
					    we = driver.findElement(By.xpath("(//span[text()='" + label + "']//ancestor::button)[2]"));
					    highlightelement(we);
					//	we = driver.findElement(By.xpath("//label//span[text()='" + label + "']//following::input[1]"));
						we.click();
						
						//we.sendKeys(Keys.ENTER);
				//		ExtentManager.pass("Have successfully clicked the"   +  label   );
						return;
						
					}	
					}
				
	
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
		//		ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		/*
		    * @KT1456
		    * @date: 11/07/2022
		    * @Description: This method performs entering data into input fields in salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
		public void setinput(String label, String targetvalue) throws Exception {
		
			WebElement we;
	
			
	
				try {
					
						try {                               
							we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[2]//following::input[1]"));
							 highlightelement(we);
							we.sendKeys(targetvalue);
							we.getAttribute("");
							System.out.println("Sent values as " + targetvalue);
				//			ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the "  +  label  +   " field" );
							
	
						} catch (Exception e) {
							we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::textarea[2]"));
							 highlightelement(we);
							we.sendKeys(targetvalue);
							System.out.println("Sent values as " + targetvalue);
				//			ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the "  +  label  +   " field" );
							
						}
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using setinput method");
		//			ExtentManager.fail("text "  +  targetvalue  +   " was not entered in to the "  +  label  +  " field" );
				}
	
			}
	
		

		/*
		    * @KT1456
		    * @date: 11/07/2022
		    * @Description: This method performs action on the dropdowns in  salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
	
		public void selectdropdown(String label, String targetvalue) throws Exception{ 
			WebElement we;
			WebElement we2;
		  
		  try { 
		  if(!label.isEmpty()) { 
		  try { 
		    we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[2]//following::a[1]"));  
		    highlightelement(we);
		    we.click(); 		  
		   
		    we2=driver.findElement(By.xpath("(//a[text()='" + targetvalue + "'])[1]"));		   
		    we2.click();
		   
	        System.out.println("Sent values as " + targetvalue);
	 //       ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the "  +  label  +   " field" );
	        
	        
		  } 
		  catch(Exception e) {
		  we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::a[1]")); 
		  highlightelement(we);
		  we.click();
		  waitForSFPagetoLoad();
		  we2= driver.findElement(By.xpath("//span[text()='" + label + "']//following::a[text()='" + targetvalue + "'][1]"));
		 
		  we2.click();
		
	      System.out.println("Sent values as " + targetvalue);
	//      ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the"  +  label  +   " field" );
		  }
		 
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  + targetvalue +  " Dropdown elements are not bale select by usinng selectdropdown method ");
		//	  ExtentManager.fail("selected value "  +  targetvalue  +   " was notselected in to the "  +  label  +  "field" );
			  }
		  
		  }
		
		/*
		    * @KT1456
		    * @date: 11/07/2022
		    * @Description: This method performs entering data into input fields in salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
		public void settext1(String label, String targetvalue) throws Exception {
			WebElement we;
			
				try {
					
						try {
							we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::input[1]"));
							 highlightelement(we);
							we.sendKeys(targetvalue);
							System.out.println("Sent values as " + targetvalue);
					//		ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the"  +  label  +   " field" );
						} catch (Exception e) {
							we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::textarea"));
							 highlightelement(we);
							we.sendKeys(targetvalue);
						    
							we.sendKeys(Keys.ENTER);
					//		ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent to the"  +  label  +   " field" );
						}
	
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using settext1 method");
				//	ExtentManager.fail("text "  +  targetvalue  +   " was not entered in to the"  +  label  +  " field" );
				}
			}
		
		
		
		/*
		    * @KT1456
		    * @date: 11/07/2022
		    * @Description: This method performs action on the dropdowns in  salesforce application 
		    * @Param: accepts two arguments label and targetvalue as input
		    * @return values: None
		 */
		
		public void selectdropdown1(String label, String targetvalue) throws Exception{ 
			WebElement we;
			WebElement we2;
		  
		  try { 
		  if(!label.isEmpty()) { 
		  try { 
		    we = driver.findElement(By.xpath("//label[text()='" + label +"']//following::button[1]"));  
			we.click(); 		  
		    
		    we2=driver.findElement(By.xpath("(//span[text()='" + targetvalue +"'])[1]"));
		    we2.click();
	        System.out.println("Sent values as " + targetvalue);
	    //    ExtentManager.pass("Have successfully"  +   targetvalue   +   " was selected to the"  +  label  +   "field" );
	        
	        
		  } 
		  catch (Exception e) {
              we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::button[1]"));
               we.click();           
               we2=driver.findElement(By.xpath("//span[text()='" + label + "']//following::span[text()='" + targetvalue +"'][1]"));
              
               we2.click();
               System.out.println("Sent values as " + targetvalue);
            //   ExtentManager.pass("Have successfully"  +   targetvalue   +   " was selected to the"  +  label  +   "field" );
              
          }
		  
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  + targetvalue +  " Dropdown elements are not able select by usinng selectdropdown1 method "); 
			//  ExtentManager.fail("selected value"  +  targetvalue  +   " was notselected in to the"  +  label  +  "field" );
			  }
		  
		  }
		
		/*
		    * @KT1461
		    * @date: 05/08/2022
		    * @Description: This method performs selecting the targetvalue in to combobox whichever data we are passing in to field on  salesforce application 
		    * @Param: accepts three arguments label , label1 & targetvalue as input
		    * @return values: None
		 */
		
		public void selectcombobox(String label,String targetvalue) throws Exception{ 
			WebElement we;
			WebElement we2;
		  try { 
		  if(!label.isEmpty()) { 
		  try { 
		    we = driver.findElement(By.xpath("//label//span[text()='" + label + "']//following::input[1]"));
		    we.click();
		    highlightelement(we);
			we.sendKeys(targetvalue);	
			waitForSFPagetoLoad();   
			we.sendKeys(Keys.DOWN);
			we.sendKeys(Keys.ENTER);
	        System.out.println("Sent values as " + targetvalue); 
	      //  ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the "  +  label  +   " field" );
		  } 
		  catch(Exception e) {
			  we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]")); 
			  highlightelement(we);
				we.sendKeys(targetvalue);
				waitForSFPagetoLoad(); 
				we.sendKeys(Keys.DOWN);
				we.sendKeys(Keys.ENTER);				  
		        System.out.println("Sent values as " + targetvalue);
		      //  ExtentManager.pass("Have successfully "  +   targetvalue   +   " was selected to the "  +  label  +   " field" );
			   
		  }
		  
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  +  targetvalue  +  " Dropdown elements are not able select by usinng selectcombobox method "); 
			//  ExtentManager.fail("selected value"  +  targetvalue  +   "was notselected in to the"  +  label  +  "field" );
			  }
		  
		  }
		
		
		
		/*
		    * @KT1461
		    * @date: 04/08/2022
		    * @Description: This method performs action on the dropdowns with tag of (img) in DOM on  salesforce application 
		    * @Param: accepts three arguments label , label1 & targetvalue as input
		    * @return values: None
		 */
		
		public void clicklink(String label) throws Exception {
			WebElement we;
	
			try {
				if (!label.isEmpty()) {
					
					try {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[2]"));
						we.click();
						System.out.println("Sent values as ");
						//ExtentManager.pass("Have successfully clicked the "  +  label   );
						return;					
					}
					
					    catch (Exception e) {
					    	
					    	we = driver.findElement(By.xpath("(//a[text()='" + label + "'])[3]"));							
							we.click();
							System.out.println("Sent values as ");
							//ExtentManager.pass("Have successfully clicked the "  +  label   );
					    						    	
					}	
					}
			
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
				//ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		
		
		//******************************** Under Working************************************
		
		/*
		    * @KT1461
		    * @date: 16/08/2022
		    * @Description: This method performs deleting the saved recors  on  salesforce application 
		    * @Param: accepts one arguments label as input
		    * @return values: None
		 */
	
		public void delete(String label) throws Exception{
	        WebElement we;
	        WebElement we2;
	        WebElement we3;
	      
	      try {
	       if(!label.isEmpty()) {
	      try {
	    	  we = driver.findElement(By.xpath("//span[text()='Show more actions']//ancestor::button"));  
	          we.click();           
	          waitForSFPagetoLoad();
	          we2=driver.findElement(By.xpath("//a//span[text()='Delete']"));
	          we2.click();
	          waitForSFPagetoLoad();
	          we3=driver.findElement(By.xpath("//button//span[text()='" + label + "']"));
	          we3.click();
	          waitForSFPagetoLoad();
	          System.out.println("account was " + label);
	        
	        
	      }
	      catch(Exception e) {
	          we = driver.findElement(By.xpath("(//button[@type='button']//following::span[text()='Show more actions'])[5]"));  
	            we.click();           
	            waitForSFPagetoLoad();
	            we2=driver.findElement(By.xpath("//a//span[text()='Delete']"));
	            we2.click();
	            we3=driver.findElement(By.xpath("//button//span[text()='" + label +"']"));
	            System.out.println("account was " + label);
	      }
	      
	    }
	}
	      catch(Exception e)
	      {
	          System.out.println("in catch");
	          }
	      
	      }
		
		//*******************************************Under Working*********************************************************
	
		
		public void settext(String label, String targetvalue) throws Exception {
			WebElement we;
		//	java.util.List<WebElement> ele = driver.findElements(By.xpath("//span"));
		//	for (int i = 0; i < ele.size(); i++) {
	
				try {
					//if (ele.get(i).getText().equalsIgnoreCase(label))
						try {
							we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::textarea[1]"));
							waitForSFPagetoLoad();
							highlightelement(we);
							we.sendKeys(targetvalue);
						   
							we.sendKeys(Keys.ENTER);
						//	ExtentManager.pass("Have successfully "  +   targetvalue   +   " was sent  to the "  +  label  +   " field" );
						} catch (Exception e) {
							
						}
	
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using settext method");
				//	ExtentManager.pass("Have not sent the "  +   targetvalue   +   "   to the"  +  label  +   "field" );
				}
			}
		//}
		
		public void clickaction(String label) throws Exception {
			WebElement we;
	
			try {
				if (!label.isEmpty()) {
					
					try {			
						we = driver.findElement(By.xpath("//span[text()='" + label + "']"));
						highlightelement(we);					
						we.click();
						waitForSFPagetoLoad();
						System.out.println("Sent values as ");
					//	ExtentManager.pass("Have successfully clicked the "  +  label   );
						return;					
					}
					
					    catch (Exception e) {
					    	    
					    	   we = driver.findElement(By.xpath("//div//a[text()='" + label + "']"));
					    	   // we = driver.findElement(By.xpath("//span//div//a[text()='" + label + "']"));  
					    	    highlightelement(we);
					            we.click();           
					          
					            System.out.println("account was " + label);
					          //  ExtentManager.pass("Have successfully clicked the "  +  label   );
					    	
					}	
					}
				
	
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
				//ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		public void performclick(String label) throws Exception {
			WebElement we;
			WebElement we2;
	
			try {
				if (!label.isEmpty()) {
					
					try {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "']//following::span[contains(text(),01)])[1]"));
						we2=driver.findElement(By.xpath("//li//a[text()='Asset Warranty Info']"));
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we2);
						Thread.sleep(500); 
						highlightelement(we);					
						we.click();
						System.out.println("Sent values as ");
					//	ExtentManager.pass("Have successfully clicked the "  +  label   );
						return;					
					}
					
					    catch (Exception e) {
					    	String s=label;
							String value=s.replaceAll(" ", "");
					    	we = driver.findElement(By.xpath("(//span[text()='" + value + "'])"));
							highlightelement(we);
							Thread.sleep(2000);
							we.click();
							System.out.println("Sent values as ");
					    
					}	
					}
				
	
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
				//ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		public void clickrelated(String label) throws Exception {
			WebElement we;
	
			try {
				if (!label.isEmpty()) {
					
					try {
					//	we = driver.findElement(By.xpath("//li//a[text()='" + label + "']"));
						String s=label;
						String value=s.replaceAll(" ", "");
						we = driver.findElement(By.xpath("//a[text()='" + value + "']"));
						we.click();
						System.out.println("Sent values as ");
						//ExtentManager.pass("Have successfully clicked the "  +  label   );
						return;					
					}
					
					    catch (Exception e) {
					    	
					    	we = driver.findElement(By.xpath("(//span[contains(text(),'" + label + "')])[1]"));
							
							we.click();
							System.out.println("Sent values as ");
							//ExtentManager.pass("Have successfully clicked the "  +  label   );
					    						    	
					}	
					}
			
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
				//ExtentManager.fail("Not able to click particular "  + label +  " by usimg click method");
			}
		}
		
		
		
		public  void validation(String label,String value) throws Exception {
			WebElement we;
	
			try {				
	     				try {
						we = driver.findElement(By.xpath("//h2[normalize-space()='" + label + "']"));
						 actualvalue=we.getText();
						System.out.println(actualvalue);
						String expectedvalue=value;
						Assert.assertEquals(actualvalue, expectedvalue);
						//System.out.println("user is on "  + label +  " page");
						//ExtentManager.pass("user is on "  + label +  " page");
									
					}					
					    catch (Exception e) {
					    	we = driver.findElement(By.xpath("//div//p[text()='Status']//following::lightning-formatted-text[1]"));
							String actualvalue=we.getText();
							System.out.println(actualvalue);
							String expectedvalue=label;
							Assert.assertEquals(actualvalue, expectedvalue);
							System.out.println("user successfully saved all details "  + label +  " generated ");
							//ExtentManager.pass("user successfully saved all details "  + label +  " generated ");
					    	
					  
					}	
					
			} catch (Exception e) {
				System.out.println("Not able to click particular "  );
				//ExtentManager.fail("Have not able to  send the required text "  +  value    );
			}
		}
		
		
		public  void validation2(String label) throws Exception {
		WebElement we;
			try {				
	     				try {
						String actualtitle= driver.getTitle();
						String expectedtitle=label;
						Assert.assertEquals(actualtitle, expectedtitle);
						System.out.println("user is on "  + label +  " page");
						//ExtentManager.pass("user is on "  + label +  " page");									
					}					
					    catch (Exception e) {
				    	we = driver.findElement(By.xpath("//span[text()='" + label + "']"));
						 actualvalue=we.getText();
						System.out.println(actualvalue);
						String expectedvalue=label;
						Assert.assertEquals(actualvalue, expectedvalue);
						System.out.println("user is on "  + label +  " page");	
					}	
					
			} catch (Exception e) {
				System.out.println("Not able to click particular "  );
				//ExtentManager.fail("Have not able to  send the required text "  +  value    );
			}
		}
		
		public void scrollToElementview(WebElement ele) throws InterruptedException {
				
			try {
				Thread.sleep(14000); 
			    Robot robo = new Robot();
			    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
			    Thread.sleep(9000); 

			} catch (Exception e1) {
			   // TODO Auto-generated catch block
			   e1.printStackTrace();
			}
		}
			
			public  void status(WebElement ele) throws Throwable {
				
				WebElement we;				
				try {				
		     				try {
		     					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
								wait.until(ExpectedConditions.visibilityOf(ele));
								 details=ele.getText();
								System.out.println(details);
								 casenumber=details.replaceAll("[^0-9]", " ");
								System.out.println(casenumber);
							//	writeExcelData("C:\\Users\\AbhilashBysani-Kairo\\eclipse-workspace\\KITAP\\src\\test\\resources\\sales_data.xlsx","CaseserviceapprovalCreation",1,3,casenumber);
								ExtentManager.pass("case creation genearted status : "  +  details );
						}					
						    catch (Exception e) {
						    	we=driver.findElement(By.xpath("//div[@class='modal-body scrollable slds-modal__content slds-p-around--medium']"));
						    	details=we.getText();
						    	System.out.println(details);
						    	//ExtentManager.pass("user not able to send a approval request  : "  +  details  +  " priority criteria not matches to case" );	
						}						
				} 
				catch (Exception e) {
					System.out.println("Not able to get the success status");
				//	ExtentManager.fail("User  not able to send the approval request");
				}
			}
			
			public void swtich_actionperformance(String targetvalue) throws Exception {
				WebElement we;
				WebElement we2;
				
				while(true){
			    try {
				List<WebElement> frame = driver.findElements(By.xpath("//div//iframe"));
				System.out.println("count of frame "  +  frame.size());
				for(int i=0;i<=frame.size();i++) {
					driver.switchTo().frame(i);
					we=driver.findElement(By.xpath("//table//tbody//tr//th[text()='Unit']//following::select"));
					Select s = new Select(we);
					s.selectByVisibleText(targetvalue);
					System.out.println(targetvalue);
					break;
				}
				}
					 catch (Exception e) {
						 System.out.println(e); 
						// TODO: handle exception
					}
				}
		
				
			}
			public void scroll(WebElement ele) throws Throwable {
				//WebElement element = driver.findElement(By.xpath("//input[@name='Site']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(2000); 
				
			}
			
public  void status1(WebElement ele) throws Throwable {
				
				WebElement we;
				
				
				try {				
	     				try {
	     					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
							wait.until(ExpectedConditions.visibilityOf(ele));
							 details=ele.getText();
							System.out.println(details);
							cases=details.replaceAll("[^0-9]", " ");
							System.out.println(cases);
							ExtentManager.pass("case creation genearted status : "  +  details );
					}					
					    catch (Exception e) {
					    	we=driver.findElement(By.xpath("//div[@class='modal-body scrollable slds-modal__content slds-p-around--medium']"));
					    	details=we.getText();
					    	System.out.println(details);
					    	ExtentManager.pass("user not able to send a approval request  : "  +  details  +  " priority criteria not matches to case" );	
					}						
				} 
				catch (Exception e) {
					System.out.println("Not able to get the success status");
					ExtentManager.fail("User  not able to send the approval request");
				}
			}
			
			public void writeExcelData(String path, String sheet, int row, int cell, String data) throws Throwable {
			    FileInputStream fis = new FileInputStream(path);
			    Workbook wb = WorkbookFactory.create(fis);
			    wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
			    FileOutputStream fos = new FileOutputStream(path);
			    wb.write(fos);
			}
			
			public void selectoption(String label,String targetvalue ) throws Exception {
				WebElement we;
				WebElement we2;
				int x=1;
		        while(true) {
		         	
				try {
					switch(x) {
					case  1 : {
						  we = driver.findElement(By.xpath("//label[text()='" + label +"']//following::button[1]"));  
							we.click(); 		  					    
						    we2=driver.findElement(By.xpath("(//span[text()='" + targetvalue +"'])[1]"));
						    we2.click();
						    highlightelement(we);
					        System.out.println("Sent values as " + targetvalue);
						break;
					}
					case  2 : {
						 we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::button[1]"));
			               we.click();           
			               we2=driver.findElement(By.xpath("//span[text()='" + label + "']//following::span[text()='" + targetvalue +"'][1]"));		              
			               we2.click();
			               highlightelement(we);
			               System.out.println("Sent values as " + targetvalue);
						break;
					}
					case  3 : {
						 we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[2]//following::a[1]"));  
						    highlightelement(we);
						    we.click(); 		  						   
						    we2=driver.findElement(By.xpath("(//a[text()='" + targetvalue + "'])[1]"));		   
						    we2.click();
						   
					break;
					}
					case  4 : {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "']//ancestor::button)[2]"));
						 we = driver.findElement(By.xpath("//span[text()='" + label + "']//following::a[1]")); 
						  we.click();
						  waitForSFPagetoLoad();
						  we2= driver.findElement(By.xpath("//span[text()='" + label + "']//following::a[text()='" + targetvalue + "'][1]"));						 
						  we2.click();
						  highlightelement(we);
					      System.out.println("Sent values as " + targetvalue);
						break;
						}
					case  5 : {
						 we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));				           
				            we.sendKeys(targetvalue);
				            highlightelement(we);
				            System.out.println("Sent values as " + targetvalue);
						break;
						}
					case  6 : {
						    we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));				           
				            we.sendKeys(targetvalue);
				            highlightelement(we);
				            we.sendKeys(Keys.ENTER);
						break;
						}												
						}
					break;
				} 
				
				catch (Exception e) {
					x++;
				}
			}
			}
		
		public void clickbutton(String label) throws Exception {
				WebElement we;
				int x=1;
		        while(true) {
		         	
				try {
					switch(x) {
					case  1 : {
						we = driver.findElement(By.xpath("//div[@class='actionsContainer']//following::a//div[text()='" + label + "']"));
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
						break;
					}
					case  2 : {
						we = driver.findElement(By.xpath("//div[text()='" + label + "']"));
						highlightelement(we);
						we.click();	
						System.out.println("Sent values as ");
						break;
					}
					case  3 : {
					we = driver.findElement(By.xpath("(//span[text()='" + label + "']//ancestor::button)[1]"));
					highlightelement(we);
					we.click();
					System.out.println("Sent values as ");
					break;
					}
					case  4 : {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "']//ancestor::button)[2]"));
					    highlightelement(we);
					//	we = driver.findElement(By.xpath("//label//span[text()='" + label + "']//following::input[1]"));
						we.click();
						System.out.println("Sent values as ");
						break;
						}
					case  5 : {
						we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[1]"));
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
						break;
						}
					case  6 : {
						we = driver.findElement(By.xpath("(//a[text()='" + label + "'])[3]"));
						highlightelement(we);						
						we.click();
						System.out.println("Sent values as ");
						break;
						}
					case  7 : {
						we = driver.findElement(By.xpath("//span[text()='" + label + "']"));
						highlightelement(we);					
						we.click();						
						System.out.println("Sent values as ");
						break;
						}
					case  8 : {
						we = driver.findElement(By.xpath("//div//a[text()='" + label + "']"));
				    	   // we = driver.findElement(By.xpath("//span//div//a[text()='" + label + "']"));  
				    	    highlightelement(we);
				            we.click();           				          
				            System.out.println("account was " + label);
				            break;
						}
					case  9 : {
					/*	we = driver.findElement(By.xpath("(//span[text()='" + label + "']//following::span[contains(text(),01)])[1]"));
						//we2=driver.findElement(By.xpath("//li//a[text()='Asset Warranty Info']"));
						//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we2);
						Thread.sleep(500); 
						highlightelement(we);					
						we.click();
						System.out.println("Sent values as ");
				            break;        */
				        we = driver.findElement(By.xpath("//button[text()='" + label + "']"));	
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
				            break;
						}        
					case  10 : {
						String s=label;
						String value=s.replaceAll(" ", "");
				    	we = driver.findElement(By.xpath("(//span[text()='" + value + "'])"));
						highlightelement(we);
						Thread.sleep(2000);
						we.click();
						System.out.println("Sent values as ");
				            break;
						}
					case  11 : {
						String s=label;
						String value=s.replaceAll(" ", "");
						we = driver.findElement(By.xpath("//a[text()='" + value + "']"));
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
				            break;
						}
					case  12 : {
						we = driver.findElement(By.xpath("(//span[contains(text(),'" + label + "')])[1]"));	
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
				            break;
						}
					case  13 : {
						we = driver.findElement(By.xpath("(//button[text()='" + label + "'])[2]"));	
						highlightelement(we);
						we.click();
						System.out.println("Sent values as ");
				            break;
						}	
						}
					break;
				} 
				
				catch (Exception e) {
					x++;
				}
			}
			}
			
			
			
			
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
                   //********************************************************                    ****************************************//
			
			public WebDriver getWebDriver() {
				return driver;
			}

			public static String OSDetector() {
				String os = System.getProperty("os.name").toLowerCase();
				if (os.contains("win")) {
					return "Windows";
				} else if (os.contains("nux") || os.contains("nix")) {
					return "Linux";
				} else if (os.contains("mac")) {
					return "Mac";
				} else if (os.contains("sunos")) {
					return "Solaris";
				} else {
					return "Other";
				}
			}

			public void loginSaleforceApp(String homepageURL) {
				driver.get(homepageURL);

				System.out.println("Opened URL : " + homepageURL);

				
			}
			public void openHomepage(String homepageURL) {
				try {
					
				getWebDriver().get(homepageURL);

				System.out.println("Navigated to the  URL : " + getWebDriver());
				ExtentManager.pass("Navigated to the  URL : " + homepageURL);
			}
				catch(Exception e)
				{
					System.out.println("Not able to navigate to url");
					ExtentManager.fail("Not able to navigate to url");
				}
				}


			public void openHomepageWithElement(String homepageURL, WebElement homePageElement) throws Exception {
				openHomepage(homepageURL);
				if (homePageElement != null) {
					if (!homePageElement.isDisplayed()) {
						throw new Exception();
					}
				}
			}
			
			
			
			public String getCurrentWindowHandle() {
				return driver.getWindowHandle();
			}

			public String getCurrentURL() {
				return driver.getCurrentUrl();
			}

			public void forceClickElement(WebElement element) {
				try {

					actions.moveToElement(element);
					actions.click();
					actions.build().perform();
				} catch (Exception e) {
					System.out.print("Failed to force click element" + e.toString());
				} finally {
					System.out.print("clicked on  " + element.toString());
				}
			}

			public boolean verifyWebElement(WebElement element) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(element));

				
				if (element.isDisplayed()) {
					System.out.println("Element Displayed " + element.getText());
				} else {
					System.out.println("Element Not Displayed " + element.getText());
				}
				return element.isDisplayed();
			}

			public void waitAndClick(WebElement element) {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(element));

						if (element.isDisplayed()) {
					System.out.println("Element found and clicked");
					element.click();
				} else {
					System.out.println("Element Not Displayed " + element.getText());
				}

			}

			public boolean verifyElementEnabled(WebElement element) {
				if (element.isEnabled()) {
					System.out.println("Element Enabled " + element.getText());
				} else {
					System.out.println("Element Not Enabled " + element.getText());
				}
				return element.isEnabled();
			}

			public void refreshPage() {
				driver.navigate().refresh();
				System.out.println("Page Refreshed");
			}

			public void quitBrowser() {
				
				driver.quit();
			}
			public void closeCurrentBrowser() {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String script = "window.onbeforeunload = null;" + "window.close();";
				js.executeScript(script);
			}

			public void handleIEError() {
				try {
					Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			public void sleep(long millis) {

				try {
					TimeUnit.MILLISECONDS.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			public void explicitWait(WebElement elmt) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOf(elmt));
			}

			public void explicitWaitInMinutes(WebElement elmt, Duration timeOutInMinutes) {
				WebDriverWait wait = new WebDriverWait(driver, timeOutInMinutes);
				wait.until(ExpectedConditions.visibilityOf(elmt));
			}

			public void explicitWaitClickable(WebElement elmt, Duration timeOutInSeconds) {
				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
				wait.until(ExpectedConditions.elementToBeClickable(elmt));
			}

			public void explicitWait(List<WebElement> elmt, Duration timeOutInSeconds) {
				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
				wait.until(ExpectedConditions.visibilityOf(elmt.get(1)));
			}

			public boolean isAlertOpen() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				try {
					return wait.until(ExpectedConditions.alertIsPresent()) != null;
				} catch (Exception e) {
					return false;
				}
			}

			public String replaceValue(String key, String... values) {
				originalValue = key;
				String eleValue = originalValue;
				for (int i = 0; i < values.length; i++) {
					String value = values[i];
					eleValue = eleValue.replace("{" + (i + 1) + "}", value);
				}
				return eleValue;
			}

			public String getTextOfElement(WebElement element) {
				return element.getText().trim();
			}

			public void mouseOverElement(WebElement element) {

				actions.moveToElement(element).build().perform();
			}

			public String getAttrValueForElement(WebElement element, String attrName) {
				if (null == element) {
					return null;
				}
				if (attrName.isEmpty()) {
					return null;
				}
				return element.getAttribute(attrName.trim().toLowerCase());
			}

			public void scrollToElement(WebElement element) {
				int elementPosition = element.getLocation().getY();
				String js = String.format("window.scroll(0, %s)", elementPosition);
				((JavascriptExecutor) driver).executeScript(js);
			}
			
			public void scrollToElementview() throws InterruptedException {
				WebElement element = driver.findElement(By.xpath("//input[@name='Site']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(2000); 
				
			}
			
			
			public static void highlightelement(WebElement element) {
			for (int i = 0; i < 9; i++) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: springgreen; border: 2px solid red;');", element);
			}
			}

			
			public void scrollToElementviewweb() throws InterruptedException {
				
				WebElement element = driver.findElement(By.xpath("//input[@name='Website']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(2000);
			
			}

			public void javascriptExecutor(String jscode) {
				((JavascriptExecutor) driver).executeScript(jscode);
			}

			public void scrollByCoordinate(int horizontal, int vertical) {
				String str1 = Integer.toString(horizontal);
				String str2 = Integer.toString(vertical);
				String arguments = "window.scrollBy(" + str1 + "," + str2 + ")";
				((JavascriptExecutor) driver).executeScript(arguments);
			}

			public void scrollToElementAsync(WebElement element) {
				int elementPosition = element.getLocation().getY();
				String js = String.format("window.scroll(0, %s)", elementPosition);
				((JavascriptExecutor) driver).executeAsyncScript(js);
			}

			public void scrollToElementInView(WebElement element) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element);
				actions.perform();
			}

			public void scrollToElementHorizontally(WebElement element) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", element);
			}

			public void scrollVerticallyInsideDiv(WebElement element) {

			}

			public boolean scroll_Page(WebElement webelement, int scrollPoints) {
				try {

					int numberOfPixelsToDragTheScrollbarDown = 10;
					for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown) {
						actions.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown)
								.release(webelement).build().perform();
					}
					Thread.sleep(500);
					
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}

			/*
			 * @KT1456
			 * @date: 01/07/2022
			 * @Description: This method helps with exceptions on element not being into viewport and resulting in element x intercepts click on element y
			 */
			

			public void javascriptScrollToElement(WebElement webelement) {

				
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].scrollIntoView()", webelement);
			}

			public void scrollToHeader() {
				String js = String.format("window.scroll(0, 0)");
				((JavascriptExecutor) driver).executeScript(js);
			}

			public void scrollToBottom() {
				String js = String.format("window.scrollTo(0, document.body.scrollHeight)");
				((JavascriptExecutor) driver).executeScript(js);
			}

			public void switchToNewWindow() {

				String firstWindow = driver.getWindowHandle();
				String newWindow = "";
				Set<String> allWindows = driver.getWindowHandles();

				for (String window : allWindows) {
					if (!window.equals(firstWindow)) {
						newWindow = window;
					}
				}

				driver.switchTo().window(firstWindow);
				driver.switchTo().window(newWindow);
				
			}

			public String getCurrentDate() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public String getCurrentDateInMMDDYYYY() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			
			public String getCurrentDateInMDDYYYY() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public String getCurrentDateInYYYYMMDD() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;

			}

			public String getTomorrowateInYYYYMMDD() {
				Date dt = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

				Calendar c = Calendar.getInstance();
				c.setTime(dt);
				c.add(Calendar.DATE, 1);
				dt = c.getTime();

				return simpleDateFormat.format(dt);
			}

			public String getTomorrowDateInMDYYYY() {
				Date dt = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");

				Calendar c = Calendar.getInstance();
				c.setTime(dt);
				c.add(Calendar.DATE, 1);
				dt = c.getTime();

				return simpleDateFormat.format(dt);
			}

			public String getTomorrowDateInMDYYYYEST() {
				// This method returns the current date's next date in EST format
				Instant nowUtc = Instant.now();
				ZoneId usnewyork = ZoneId.of("America/New_York");
				TimeZone usnewyorktimezone = TimeZone.getTimeZone(usnewyork);

				Date dt = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("M/d/yyyy");

				Calendar c = Calendar.getInstance(usnewyorktimezone);
				c.setTime(dt);
				c.add(Calendar.DATE, 1);
				dt = c.getTime();

				return simpleDateFormat.format(dt);
			}

			public String getCurrentDateInMMDDYY() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public String getCurrentDateTimeStamp() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd:h:mm:ss");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public String getCurrentTimeStamp() {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm");
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public String getCurrentDateWithCustomFormat(String format) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
				String currentdatetime = simpleDateFormat.format(new Date());
				return currentdatetime;
			}

			public boolean isElementDisplayed(WebElement elmt) {
				boolean display = false;
				

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				try {
					wait.until(ExpectedConditions.visibilityOf(elmt));
					display = true;
				} catch (Exception e) {
					display = false;
					System.out.println("Element not found");
				}

				return display;
			}

			public boolean isElementNotDisplayed(WebElement elmt) {

				

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				try {
					wait.until(ExpectedConditions.visibilityOf(elmt));
					return true;
				} catch (NoSuchElementException | TimeoutException e) {
					return false;
				}

			}

			public boolean isElementDisplayedWithTimeOut(WebElement elmt, Duration timeout) {
				boolean display = false;

				WebDriverWait wait = new WebDriverWait(driver, timeout);
				try {
					wait.until(ExpectedConditions.visibilityOf(elmt));
					display = true;
				} catch (Exception e) {
					display = false;
				}

				return display;
			}

			public String getInnerText(WebElement elmt) {
				return elmt.getAttribute("textContent");
			}

			public int getWindowsCount() {
				Set<String> listOfWindows = driver.getWindowHandles();
				return listOfWindows.size();
			}

			public void acceptAlert() throws InterruptedException {
				try {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {
					System.out.println("Alert not found on the page");
				}

			}

			public void clickControlHome() {
				
				actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).perform();
			}

			public void clickEscapeKey() {
				
				actions.sendKeys(Keys.ESCAPE).build().perform();
			}

			public void selectValueByVisibleText(WebElement wb, String visibletext) {
				Select select = new Select(wb);
				select.selectByVisibleText(visibletext);
				System.out.println("Selected value " + visibletext);
			}

			public void getAllOptions(WebElement wb) {
				Select select = new Select(wb);
				
				List<WebElement> options = select.getOptions();
				for (WebElement we : options) {
					System.out.println(we.getText());
				}
				System.out.println("Option values " + select.getOptions());
			}

			public void selectValueByIndex(WebElement ele, int index) {
				Select select = new Select(ele);
				select.selectByIndex(index);
				System.out.println("Selected value " + select.getAllSelectedOptions().get(index));
			}

			public void selectValue(WebElement ele, String value) {
				Select select = new Select(ele);
				select.selectByValue(value);
				System.out.println("Selected value : " + value);
			}

			public void enterValue(WebElement element, String value) {
				element.click();
				if (element.getTagName().equals("input")) {
					element.clear();
				}
				element.sendKeys(value);
				System.out.println("Entered value " + value);
			}

			public void enterValueTextArea(WebElement element, String value) {
				highlightelement(element);
				element.click();
				if (element.getTagName().equals("textarea")) {
					element.clear();
				}
				element.sendKeys(value + Keys.ENTER);
				System.out.println("Entered value " + value);
			}
			
			public void clearElement(WebElement element) {
				
				element.clear();
			}
			public void enterValueText(WebElement element, String value) {
				highlightelement(element);
				element.sendKeys(value + Keys.ENTER);
				System.out.println("Entered value " + value);
			}


			
			public void enterValueUsingScript(WebElement element, String value) {

				element.click();
				if (element.getTagName().equals("input")) {
					element.clear();
				}

				actions.moveToElement(element);
				actions.click();
				actions.sendKeys(value);
				actions.build().perform();
				System.out.println("Using Actions,Entered value:" + value);
			}

			public void selectRadio(WebElement element) {
				element.click();
			}

			public String captureText(WebElement element) {
				return element.getText();
			}

			public void safeClick(WebElement element) throws InterruptedException {
				Thread.sleep(3000);
				if ((element != null) && (element.isDisplayed())) {
					element.click();
				} else {
					

					System.out.println("Element: " + element.toString() + ", is not available on a page - ");
				}
			}

			public File takeScreenshot() {
				WebDriver augment = new Augmenter().augment(driver);
				return ((TakesScreenshot) augment).getScreenshotAs(OutputType.FILE);
			}

			public void maximize() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension screenResolution = new Dimension((int) toolkit.getScreenSize().getWidth(),
						(int) toolkit.getScreenSize().getHeight());
				driver.manage().window().setSize(screenResolution);
			}

			public boolean imageCompare(String actImagePath, String expImagePath) {
				boolean ret = true;
				try {
					URL url = new URL(actImagePath);
					BufferedImage actImage = ImageIO.read(url);
					BufferedImage expImage = ImageIO.read(new File(expImagePath));
					Raster rasActImage = actImage.getData();
					Raster rasExpImage = expImage.getData();
					// Comparing the the two images for number of bands,width & height.
					if (rasActImage.getNumBands() != rasExpImage.getNumBands()
							|| rasActImage.getWidth() != rasExpImage.getWidth()
							|| rasActImage.getHeight() != rasExpImage.getHeight()) {
						ret = false;
					} else {
						// Once the band ,width & height matches, comparing the images.
						search: for (int i = 0; i < rasActImage.getNumBands(); ++i) {
							for (int x = 0; x < rasActImage.getWidth(); ++x) {
								for (int y = 0; y < rasActImage.getHeight(); ++y) {
									if (rasActImage.getSample(x, y, i) != rasExpImage.getSample(x, y, i)) {
										// If one of the result is false setting the result as false and breaking the
										// loop.
										ret = false;
										break search;
									}
								}
							}
						}
					}
				} catch (IOException e) {
					System.out.println("Cannot read the image file " + e.getMessage());
					ret = false;
				}
				return ret;
			}

		   
			/*
			    * @KT1456
			    * @date: 11/07/2022
			    * @Description: Sets the amount of time to wait for a page load to complete, before throwing an error. If the timeout is negative, page loads can be indefinite.
			    
			 */
			
			public void pageLoadWait(int time) {


				driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);

			}

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public void waitAndforceClickElement(WebElement element) {
				try {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
					wait.until(ExpectedConditions.elementToBeClickable(element));
					actions.moveToElement(element);
					actions.click();
					actions.build().perform();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.print("Failed to force click element" + e.getMessage());
				}
			}

			public LogEntries getConsoleLogEntriesChromeBrowser() {
				
				LogEntries logs = driver.manage().logs().get("browser");

				return logs;
			}

			public boolean waitForJSandJQueryToLoad() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
					@Override
					public Boolean apply(WebDriver driver) {
						try {
							Long r = (Long) ((JavascriptExecutor) driver).executeScript("return $.active");
							return r == 0;
						} catch (Exception e) {
							System.out.println("no jquery present");
							return true;
						}
					}
				};
				ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
					@Override
					public Boolean apply(WebDriver driver) {
						return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
								.equals("complete");
					}
				};
				return wait.until(jQueryLoad) && wait.until(jsLoad);
			}

			public void implicitWait(int time) {
				driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

			}

			public String getCurrentDateESTmdyyyy() {
				DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
				
				LocalDate localDate = LocalDate.now(ZoneId.of("America/New_York"));
				return (etFormat.format(localDate));
			}
			

			/*
			    * @KT1456
			    * @date: 11/07/2022
			    * @Description: This method returns the "By" value for a webelement as an input.
			    
			 */
			

			public static By webElementToByValue(WebElement we) {
				
				String[] data = we.toString().split(" -> ")[1].replace("]", "").split(": ");
				String locator = data[0];
				String term = data[1];

				switch (locator) {
				case "xpath":
					return By.xpath(term);
				case "css selector":
					return By.cssSelector(term);
				case "id":
					return By.id(term);
				case "tag name":
					return By.tagName(term);
				case "name":
					return By.name(term);
				case "link text":
					return By.linkText(term);
				case "class name":
					return By.className(term);
				}
				return (By) we;
			}

			public WebElement chainedElementLocator(By parentelement, By childelement) {
				WebElement element = driver.findElement(new ByChained(parentelement, childelement));

				return element;

			}

			public void browserback() throws InterruptedException {
				driver.navigate().back();
				implicitWait(5);
			}

			public void SFClick(WebElement we) {

				highlightelement(we);

				try { 
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

					wait.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500))
							.ignoreAll(new ArrayList<Class<? extends Throwable>>() {

								private static final long serialVersionUID = 1L;

								{
									add(StaleElementReferenceException.class);
									add(NoSuchElementException.class);
									add(TimeoutException.class);
									add(InvalidElementStateException.class);
									add(NoSuchFrameException.class);
									add(WebDriverException.class);
								}
							}).withMessage("Fluent wait in process");
					String elementText = we.getText();

					System.out.println("Clicking on webelement: " + elementText);
					Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {

						@Override
						public Boolean apply(WebDriver arg0) {

							if (we.isDisplayed() && we.isEnabled()) {
								System.out.println("Element displayed is " + elementText);
								return true;
							} else {
								return false;
							}

						}
					};
					wait.until(function);

					JavascriptExecutor executor = (JavascriptExecutor) driver;

					executor.executeScript("arguments[0].focus(); arguments[0].click();", we);
				//	ExtentManager.pass("Have successfully clicked the "  +  we   );
					

				} catch (StaleElementReferenceException s) {
					System.out.println("StaleElement exception for web element" + we.getText());
					refreshPage();
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].focus(); arguments[0].click();", we);
				//	ExtentManager.pass("Have successfully clicked the "  +  we   );

				} catch (Exception e) {
					System.out.println("SFClick exception for web element" + we.getText());
			//		ExtentManager.fail("not bale to click the  "  +  we   );

				}
				
			}

			public void uploadFileToWebElement(String filepath, WebElement element) {
				sleep(4000);

				element.sendKeys(filepath);
				sleep(4000);
				

			}

			public char getNumericValueFromString(String text) {

				char ch;
				char intValue = 0;
				for (int i = 0; i < text.length(); i++) {
					ch = text.charAt(i);
					if (ch >= '0' && ch <= '9') {
						intValue = ch;
					}
				}
				return intValue;
			}

			public void clickOnElementUsingJavaScript(WebDriver driver, WebElement element) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			}

			public void disablegpu() {
				System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
			}

			public void uploadFile(String filepath, WebElement element) {
				sleep(4000);

				int size = driver.findElements(By.tagName("iframe")).size();
				System.out.println("Number of iFrames detected " + size);
				driver.switchTo().frame(0);

				element.sendKeys(filepath);
				sleep(4000);
				driver.switchTo().defaultContent();

			}

			public String getCurrentTimeEST() {
				DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("h:mm");
				
				LocalTime localTime = LocalTime.now(ZoneId.of("America/New_York"));
				
				return (etFormat.format(localTime));

			}

			public String getCurrentDateESTmddyyyy() {
				DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("M/dd/yyyy");
				
				LocalDate localDate = LocalDate.now(ZoneId.of("America/New_York"));
				return (etFormat.format(localDate));
			}

			public LocalTime gethmmTimeFromString(String str) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
				LocalTime time = LocalTime.parse(str, formatter);
				return time;

			}
			
			/*
			 * @KT1456
			 * @date: 13/07/2022
			 * @Description: This method takes two datetime values and returns the difference in minutes
			 */

			public String getTimeDiffMinutes(String startdatetime, String enddatetime) throws ParseException {
				

				DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm a");

				Date startdate = dateFormat.parse(startdatetime);
				Date enddate = dateFormat.parse(enddatetime);
				DecimalFormat decFormatter = new DecimalFormat("#####");

				long diff = enddate.getTime() - startdate.getTime();

				int diffmin = (int) (diff / (60 * 1000));
				return decFormatter.format(diffmin);
			}

			public boolean scrollPage(WebElement webelement, int scrollPoints) {
				try {
					Actions dragger = new Actions(driver);
					
					int numberOfPixelsToDragTheScrollbarDown = 10;
					for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown) {
						dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown)
								.release(webelement).build().perform();
					}
					Thread.sleep(500);
					
					System.out.println("Success");
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Exception caught");
					return false;

				}
			}

			public void compareDateValue(String bdate, String adate) throws ParseException {
				Date beforedate = new SimpleDateFormat("dd/MM/yyyy").parse(bdate);
				Date afterdate = new SimpleDateFormat("dd/MM/yyyy").parse(adate);

				Calendar calen1 = Calendar.getInstance();
				Calendar calen2 = Calendar.getInstance();
				calen1.setTime(beforedate);
				calen2.setTime(afterdate);

				
				if (calen1.after(calen2)) {

					
					System.out.println(bdate + " is after " + adate);
				}

				else if (calen1.before(calen2)) {

					
					System.out.println(bdate + " is before " + adate);
				}
			}

			public void hardwait(int timeinsec) throws InterruptedException {
				Thread.sleep(timeinsec * 1000);
			}

			public static String readJsonFile(String jsonfilename, String path_key) {
				{ 
				

					try {

						String sPath = new java.io.File(".").getCanonicalPath();
						File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
								+ "resources" + File.separator + jsonfilename + ".json");
						return JsonPath.read(jsonFile, path_key).toString().replace("[\"", "").replace("\"]", "");
					} catch (IOException e) {
						e.printStackTrace();
					}
					return null;
				}

			}

}

		
		
		
		
		
		
		
	

