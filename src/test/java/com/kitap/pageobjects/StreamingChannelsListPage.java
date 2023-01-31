package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

      /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
     */
public class StreamingChannelsListPage extends SFPageBase {

          public StreamingChannelsListPage(WebDriver webDriver) {
              super(webDriver);
              PageFactory.initElements(driver, this);
          }
          @FindBy(xpath = "//div[@class='slds-icon-waffle']")
          private WebElement ninesymbol;

          @FindBy(xpath="//b[normalize-space()=\"Streaming Channels\"]")
          private WebElement clickStreamingChannels;

          /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in the Streaming channels
     @return values: opens app launcher
    */
          public void clickninesymbol() throws InterruptedException {
              SFClick(ninesymbol);
              waitForSFPagetoLoad();
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
      @Param: accepts two Param  label and targetvalue as input
      @return values: opens StreamingChannekspage
     */

          public void enterStreamingChannels(String label, String targetvalue) throws Exception {

              try {

                  setText(label,targetvalue);
                  waitForSFPagetoLoad();
              }
              catch (Exception e)
              {
                  System.out.println("In catch" +label);
              }
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
      @Description: This method performs clicking on the streamingchannels page 
      @return values: opens new streaming channels page 
     */

          public void clickStreamingChannels() throws InterruptedException {

              SFClick(clickStreamingChannels);
              waitForSFPagetoLoad();
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
      @Param: accepts one argument label as input
      @return values: opens new email templates page
     */

          public void Newbutton(String label) throws Exception {

              clickSFbutton(label);
              waitForSFPagetoLoad();
          }
      /*
       @KTV1296
       @date: 22/08/2022
       @Description: This page object covers methods for all the fields in the Streaming channels
       @Param: accepts two Param label and value as input
       @return values: populates channelname
      */
      public void ChannelName(String label, String targetvalue) throws Exception {

          try {
              setinput(label, targetvalue);
              waitForSFPagetoLoad();
          } catch (Exception e) {
              System.out.println("In catch" + label);
          }
      }
     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
      @Param: accepts two Param label and value as input
      @return values: populates description
     */

          public void Description(String label, String targetvalue) throws Exception {

              try {
                  setinput(label, targetvalue);
                  waitForSFPagetoLoad();
              } catch (Exception e) {
                  System.out.println("In catch" + label);
              }
          }
     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
      @Param: accepts arguments label  as input
      @return values: populates save
     */

          public void clicksavebutton(String label) throws Exception {

              click(label);
              waitForSFPagetoLoad();

          }
      }
