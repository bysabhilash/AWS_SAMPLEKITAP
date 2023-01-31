
  package com.kitap.pageobjects;
  
  import org.openqa.selenium.Keys;      
  import org.openqa.selenium.WebDriver;  
  import org.openqa.selenium.WebElement; 
  import org.openqa.selenium.support.FindBy; 
  import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;
import kitap.SFPageClassic;


/*
* @KT1444
* @date: 22/07/2022
* @purpose: This page object covers methods for all the fields in salesforce of account creation
*/


  
  public class Opportunitypagelist extends SFPageBase {
	  
	  
	  @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	  @FindBy(xpath = "//*[@id=\"Opportunity\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement opportunities;
  
	  public Opportunitypagelist(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
		    // Creates instance for all web elements

      
	  public void clickninesymbol() {
	        try {

	            SFClick(ninesymbol);
	        } catch (Exception e) {
	            System.out.println("in catch");
	        }
	    }
	 
	 
	 public void enteropportunities(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	        }
	    }

	 
	 public void clickopportunities() throws InterruptedException {

	        SFClick(opportunities);
	       waitForSFPagetoLoad();

	        }
	 

	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers clicking on new symbol of opportunity in salesforce
	   * @Param: accepts one argument label as input
	   * @return values: opens new opportunity's page
	   */
	    public void clicknewbutton(String label) throws Exception {

	    	clickSFbutton(label);
	    	waitForSFPagetoLoad();

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers clicking on private checkbox of opportunity in salesforce
	   * @Param: accepts one argument label as input
	   * @return values: clicking on checkbox
	   */
	    public void clickprivate(String label) throws Exception {

	    	click(label);
	    	   

	    }


	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering name of opportunity in salesforce
	   * @Param: accepts arguments label and data as input
	   * @return values: entering name of opportunity
	   */
	    public void setopportunityname(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting account in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting account
	   */
	    public void selectaccountname(String label,String data) throws Exception {
	    	
	    	selectcombobox(label, data);
	       
	      }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting customer type in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting customer type
	   */
	    public void selectcustomertype(String label,String data) throws Exception {

	    	   selectdropdown1(label,data);
	    	  

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting lead in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting lead
	   */
	    public void selectlead(String label,String data) throws Exception {

	    	   selectOption(label,data);
	    	  


	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting stage in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting stage
	   */
	    public void selectstage(String label,String data) throws Exception {

	    	   selectOption(label,data);
	    	   


	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering amount in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering amount
	   */
	    public void setamount(String label,String data) throws Exception {

	    	   setText(label,data);
	    	  


	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting date on opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting date
	   */
	    public void setdate(String label,String data) throws Exception {

	    	   setText(label,data);
	    	   


	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting next step in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting next step
	   */
	    public void setnextstep(String label,String data) throws Exception {

	    	   setText(label,data);
	    	   


	    }

	    public void setprobability(String label,String data) throws Exception {

	    	   setText(label,data);
	    	  


	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting campaign source in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting campaign source
	   */
	    public void selectcampaignsource(String label,String data) throws Exception {
	        selectcombobox(label, data);
	      }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering order number in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering order number
	   */
	    public void setordernumber(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering generator name in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering generator name
	   */
	    public void setgeneratorname(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering track number in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering track number
	   */
	    public void settracknumber(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering competitor name in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering competitor name
	   */
	    public void setcompetitorname(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers selecting delivery status in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: selecting delivery status
	   */
	    public void selectdeliverystatus(String label,String data) throws Exception {

	    	   selectOption(label,data);

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @purpose: This page method covers entering description in opportunity's page
	   * @Param: accepts arguments label and data as input
	   * @return values: entering description
	   */
	    public void setdescription(String label,String data) throws Exception {

	    	   setText(label,data);
	    	   waitForSFPagetoLoad();
	    	  

	    }
	  /*
	   * @KT1444
	   * @date: 22/07/2022
	   * @Description: This method performs saving Opportunity's page
	   * @Param: accepts argument label as input
	   * @return values: saving record
	   */
	    public void clicksavebutton(String label) throws Exception {
            
	    	clickSFbutton(label);
	    	  

	    }
  }
	 
 