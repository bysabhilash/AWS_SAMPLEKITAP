package com.kitap.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class jsonparser {
	
	



   public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();  
        File fileObj = new File("C:\\Users\\AbhilashBysani-Kairo\\eclipse-workspace\\KITAP\\src\\main\\resources\\config.json");  
        try {
            List<Map<String, Object>> userData = mapper.readValue(  
                    fileObj, new TypeReference<List<Map<String, Object>>>() {  
            });
            //getUserDetailsByKeyValue(userData, "BillingCity", "Madhapur");
            printAllObjectsInAnArray(userData);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        
          
    }
    
    public static void printAllObjectsInAnArray(List<Map<String, Object>>userData) {
        for (int i=0; i < userData.size(); i++) {
            System.out.println(userData.get(i));
        }
    }
    
    public static void getUserDetailsByKeyValue(List<Map<String, Object>>userData, String key, String value) {
        
        List<Map<String, Object>> filteredUsers = new ArrayList<Map<String, Object>>();
        for (int i=0; i < userData.size(); i++) {
            if(((String) userData.get(i).get(key)).equals(value)) {
                //System.out.println(userData.get(i));
                filteredUsers.add(userData.get(i));
            }
        }    
        System.out.println(filteredUsers);
    }
    
    
}