package kitap;

import java.awt.Desktop.Action;       
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

/**
 * @author KT1456
 * @date: 04/07/2022
 * @Description: This class gets the UI layout from UI API and tries to make the xpath for all the elements 👼
 * @see: A lot of these methods are implemented using JSONPATH to parse the
 *       response we get from UI API
 */

public class SFPageClassic extends SFPageBase {

		public SFPageClassic(WebDriver driver) {
			super(driver);
		}
		
		protected static String uiapi_record_json;
		private static ArrayList<String> listoflabels;
		protected static HashMap<String, String> labelandtype;
		
		//***************************************************                     ********************************************//
	
	/*	public void waitForSFPagetoLoad() {

		    WebDriverWait wait = new WebDriverWait(driver, 30);

		    // wait for jQuery to load
		    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
		      @Override
		      public Boolean apply(WebDriver driver) {
		        try {
		          return ((Long)executeJavaScript("return jQuery.active") == 0);
		        }
		        catch (Exception e) {
		          return true;
		        }
		      }

			private Long executeJavaScript(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		    };

		    // wait for Javascript to load
		    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
		      @Override
		      public Boolean apply(WebDriver driver) {
		        return executeJavaScript("return document.readyState")
		            .toString().equals("complete");
		      }

			private Object executeJavaScript(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		    };

		  return wait.until(jQueryLoad) && wait.until(jsLoad);
		}                  */
			
	       		
			
		
		
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
	
			try {
				if (!label.isEmpty()) {
					try {
						we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
						we.sendKeys(targetvalue);
						we.sendKeys(Keys.TAB);
						System.out.println("Sent values as " + targetvalue);
						
					} catch (Exception e) {
						we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));
						we.sendKeys(targetvalue);
						System.out.println("Sent values as " + targetvalue);
					}
	
				}
	
			} catch (Exception e) {
				System.out.println("Given " + targetvalue + " not entered in to particular field by using setText method");
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
			            we.sendKeys(targetvalue);
			            System.out.println("Sent values as " + targetvalue);
			         } 
			         catch (Exception e) {
			            we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));
			            we.sendKeys(targetvalue);
			            we.sendKeys(Keys.ENTER);
			            
			         }

			      }

			   } catch (Exception e) {
			      System.out.println("Given " + targetvalue + " Dropdown elements are not able select by usinng selectOption method ");
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
						
						we = driver.findElement(By.xpath("(//input[@title='" + label + "'])[2]"));
						we.click();
						 
						System.out.println("Sent values as ");
	
					} catch (Exception e) {
						we = driver.findElement(By.xpath("//button[text()='" + label + "']"));
						we.click();
						
						System.out.println("Sent values as ");
					}
	
				}
	
			} catch (Exception e) {
				System.out.println("Not able to click particular " + label + " by usimg clickSFbutton");
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
							we = driver.findElement(By.xpath("//label[text()='" + label + "']//following::input[1]"));
							we.sendKeys(targetvalue);
							we.sendKeys(Keys.TAB);
							System.out.println("Sent values as " + targetvalue);
							
	
						} catch (Exception e) {
							we = driver.findElement(By.xpath("(//span[text()='" + label + "'])[2]//following::textarea"));
							we.sendKeys(targetvalue);
							System.out.println("Sent values as " + targetvalue);
							
						}
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using setinput method");
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

			   try {
			      if (!label.isEmpty()) {
			         try {
			            we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
			            we.click();
			            we.sendKeys(targetvalue);
			            System.out.println("Sent values as " + targetvalue);
			         } 
			         catch (Exception e) {
			            we = driver.findElement(By.xpath("//*[@id=string(//label[text()='" + label + "']/@for)]"));
			            we.sendKeys(targetvalue);
			            we.sendKeys(Keys.ENTER);
			            
			         }

			      }

			   } catch (Exception e) {
			      System.out.println("Given " + targetvalue + " Dropdown elements are not able select by usinng selectOption method ");
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
							we = driver.findElement(By.xpath("//label[text()='" + label + "']//following::input[1]"));
							we.sendKeys(targetvalue);
							Thread.sleep(1000);
							System.out.println("Sent values as " + targetvalue);
						} catch (Exception e) {
							we = driver.findElement(By.xpath("//label[text()='" + label + "']//following::textarea"));
							we.sendKeys(targetvalue);
						    waitForSFPagetoLoad();
							we.sendKeys(Keys.ENTER);
						}
	
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using settext1 method");
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
						we = driver.findElement(By.xpath("(//input[@title='" + label + "'])[2]"));
						we.click();						 
						System.out.println("Sent values as ");
	
										
					}
					    catch (Exception e) {
						we = driver.findElement(By.xpath("//label[text()='" + label + "']//following::input[1]"));
						we.click();
						System.out.println("Sent values as ");
						
						
					}
	
				}
	
			} catch (Exception e) {
				System.out.println("Not able to click particular "  + label +  " by usimg click method");
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
		    waitForSFPagetoLoad();
		    we2=driver.findElement(By.xpath("(//span[text()='" + targetvalue +"'])[1]"));
		    we2.click();
	        System.out.println("Sent values as " + targetvalue);
	        
	        
		  } 
		  catch (Exception e) {
              we = driver.findElement(By.xpath("//label[text()='" + label +"']//following::select[1]"));
              we.click();
              Select s = new Select(we);
              s.selectByVisibleText(targetvalue);
				/*
				 * we.click(); we2=driver.findElement(By.xpath("//span[text()='" + label +
				 * "']//following::span[text()='" + targetvalue +"'][1]"));
				 * waitForSFPagetoLoad(); we2.click();
				 */
               System.out.println("Sent values as " + targetvalue);
              
          }
		  
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  + targetvalue +  " Dropdown elements are not able select by usinng selectdropdown1 method "); 
			  }
		  
		  }
		
		/*
		    * @KT1461
		    * @date: 04/08/2022
		    * @Description: This method performs action on the dropdowns with tag of (img) in DOM on  salesforce application 
		    * @Param: accepts three arguments label , label1 & targetvalue as input
		    * @return values: None
		 */
		
		public void selectimgclick(String label,String label1,String targetvalue) throws Exception{ 
			WebElement we;
			WebElement we2;
			WebElement we3;
		  try { 
		  if(!label.isEmpty()) { 
		  try { 
		    we = driver.findElement(By.xpath("(//span[text()='" + label +"'])//following::span[@class='uiImage'][1]"));  
			we.click(); 	
			waitForSFPagetoLoad();
			we2=driver.findElement(By.linkText(label1));
		    we2.click();
		    waitForSFPagetoLoad();
		    we3=driver.findElement(By.xpath("(//span[text()='" + label +"']//following::div/div/div[2]/input)[1]"));
		    we3.sendKeys(targetvalue);   
			we3.sendKeys(Keys.DOWN);
			waitForSFPagetoLoad();
			we3.sendKeys(Keys.ENTER);
	        System.out.println("Sent values as " + targetvalue);
		  } 
		  catch(Exception e) {
			    we = driver.findElement(By.xpath("(//span[text()='" + label +"'])[2]//following::span[@class='uiImage'][1]"));  
				we.click();
				waitForSFPagetoLoad();
				we2=driver.findElement(By.linkText(label1));
			    we2.click();
			    waitForSFPagetoLoad();
			    we3=driver.findElement(By.xpath("(//span[text()='" + label +"']//following::div/div/div[2]/input)[1]"));
			    we3.sendKeys(targetvalue);
				waitForSFPagetoLoad();
				we3.sendKeys(Keys.DOWN);
				waitForSFPagetoLoad();
				we3.sendKeys(Keys.ENTER);
		        System.out.println("Sent values as " + targetvalue);
		  }
		  
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  + targetvalue +  " Dropdown elements are not able select by usinng selectimgclick method "); 
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
			WebElement we3;
		  try { 
		  if(!label.isEmpty()) { 
		  try {
	            we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));
	            we.sendKeys(targetvalue);
	            String parent=driver.getWindowHandle();
	            we2= driver.findElement(By.xpath("//a//img[@class='lookupIcon']"));
	            we2.click();
	            //String parent=driver.getWindowHandle();
	            Set<String>s=driver.getWindowHandles();
	            Iterator<String> I1= s.iterator();
	            while(I1.hasNext()){
	            String child_window=I1.next();
	            if(!parent.equals(child_window)){
	            driver.switchTo().window(child_window);
	            System.out.println(driver.switchTo().window(child_window).getTitle());
	            we3=  driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a"));
	            we3.click();
	            System.out.println(driver.switchTo().window(child_window).getTitle());
	            driver.close();
	            }
	            }
	            driver.switchTo().window(parent);
	            System.out.println("Sent values as " + targetvalue);
	         } 
		  catch(Exception e) {
			  we = driver.findElement(By.xpath("//input[@id=string(//label[text()='" + label + "']/@for)]"));  
				we.sendKeys(targetvalue) ;	
				waitForSFPagetoLoad();   
				we.sendKeys(Keys.DOWN);
				waitForSFPagetoLoad(); 
				we.sendKeys(Keys.ENTER);
		        System.out.println("Sent values as " + targetvalue);
			   
		  }
		  
	    } 
	}
		  catch(Exception e) 
		  { 
			  System.out.println("Given "  +  targetvalue  +  " Dropdown elements are not able select by usinng selectcombobox method "); 
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
		
		public void assertext (String act_txt) {
			
			try {
				if (!act_txt.isEmpty()) {
					try {
			WebElement we = driver.findElement(By.xpath("//h2[text()='" + act_txt +"']"));
			String  exep_txt= we.getText();
			System.out.println(exep_txt);
			//String Actual = exep_txt;
			//System.out.println(exep_txt);
			Assert.assertEquals(act_txt, exep_txt);
			
			//System.out.println("actual and expected data are corrcet");		
		}			
		 catch(Exception e) {
				/*
				 * we = driver.findElement(By.
				 * xpath("(//button[@type='button']//following::span[text()='Show more actions'])[5]"
				 * )); we.click(); waitForSFPagetoLoad();
				 * we2=driver.findElement(By.xpath("//a//span[text()='Delete']")); we2.click();
				 * we3=driver.findElement(By.xpath("//button//span[text()='" + label +"']"));
				 * System.out.println("account was " + label);
				 */
	      }
	      
	    }
	}
	      catch(Exception e)
	      {
	          System.out.println("in catch");
	          }
			
	      
	      }
		
		public void settext(String label, String targetvalue) throws Exception {
			WebElement we;
			
				try {
					
						try {
							we = driver.findElement(By.xpath("//label[text()='" + label + "']//following::textarea"));
							we.sendKeys(targetvalue);
						    waitForSFPagetoLoad();
							we.sendKeys(Keys.ENTER);
						} catch (Exception e) {
							
						}
	
				}
	
				catch (Exception e) {
					System.out.println("Given "  + targetvalue +  " not entered in to particular field by using settext method");
				}
			}
		}
		
	



