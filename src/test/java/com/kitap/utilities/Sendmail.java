package com.kitap.utilities;

import java.io.File; 
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;
import com.kitap.base.BaseTest;
import com.kitap.base.Log;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class Sendmail extends BaseTest{
	
	public static String Reportpath; 
	public static String Filename;
	public static String Description;
	public static String HostName;
	public static String username;
	public static String password;
	public static String From;
	public static String ToPerson1;
	public static String ToPerson2;
	public static String CC;
	public static String BCC;
	public static String Message;
	
    @Test
	@SuppressWarnings("deprecation")
	public static void mail() throws EmailException, InterruptedException, ParseException {
    	
    	
    	readConfigJsonFile();
    	System.out.println("attaching the link");
		String path=Reportpath + File.separator + ExtentManager.extentReportPrefix + ".html" ;
		System.out.println(path);
        //String path=Reportpath;
		System.out.println(path);
    	EmailAttachment attachment = new EmailAttachment();
 	    attachment.setPath(path);
 	    attachment.setDisposition(EmailAttachment.ATTACHMENT);
 	    attachment.setDescription(Description);
 	    attachment.setName(Filename);
 	    
		System.out.print("sending the mail");
		MultiPartEmail email = new MultiPartEmail();
	    email.setHostName(HostName);
	    email.setSmtpPort(465);
	    email.setAuthentication(username,password);
	    email.setSSLOnConnect(true);
	    try {
	        email.setSubject("Salesforce Test Execution");
	        email.setFrom(From, "Automated Message Sender");
	        email.setMsg("Hello good day This is a test execution report ");
	        email.addTo(ToPerson1);
	        email.addTo(ToPerson2);
	        email.addCc(CC);
	        email.addBcc(BCC);
	        email.attach(attachment);
	        Thread.sleep(10);
	        email.send();
	      
	    } catch (EmailException ex) {
	        ex.printStackTrace();
	    }
	   	}
    
    
    private static void readConfigJsonFile() throws ParseException {
		{ 

			@SuppressWarnings("deprecation")
			JSONParser parser = new JSONParser();
		      try {
		         Object obj = parser.parse(new FileReader(".\\src\\main\\resources\\email.json"));
		         JSONObject jsonObject = (JSONObject)obj;
		         Reportpath= (String)jsonObject.get("reportpath");
		          Filename = (String)jsonObject.get("filename");
		          Description = (String)jsonObject.get("desc");
		          HostName = (String)jsonObject.get("host");
		          username = (String)jsonObject.get("authenticationusername");
		      	  password = (String)jsonObject.get("authenticationpsswd");;
		          From = (String)jsonObject.get("fromperson");;
		      	  ToPerson1 = (String)jsonObject.get("Toperson1");;
		      	  ToPerson2 = (String)jsonObject.get("Toperson2");;
		          CC = (String)jsonObject.get("cc");;
		      	  BCC = (String)jsonObject.get("Bcc");;
		      	  Message = (String)jsonObject.get("msg");;
		       
		         }
			 catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
