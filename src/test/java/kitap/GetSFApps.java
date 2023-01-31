package kitap;

import com.jayway.jsonpath.JsonPath;

public class GetSFApps {

	public String getAppsData() {
		String endpoint = "/services/data/v55.0/ui-api/apps?formFactor=Large";
		
		return HTTPClientWrapper.runGetRequest(endpoint).toString();
		
	}

	public String getAppNavURL(String objectname) {
		
		String objurljson = HTTPClientWrapper.runGetRequest("/ui-api/apps?formFactor=Large").toString();
        System.out.println("Response from UI API for 9 dot icons" + objurljson);
        String jsonpath = "$.apps..[?(@.objectApiName=='" + objectname + "')].content";

        String objurl_malformed = JsonPath.read(objurljson, jsonpath).toString();

        String objurl = objurl_malformed.replace("\\/", "/");
        return objurl;

	}

}
