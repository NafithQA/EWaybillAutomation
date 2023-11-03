package apiHandler;

import eWaybill.helpers.DataLoader;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Methods {

	public String getValueFromResponseBody(String response, String key) {

		JsonPath js = new JsonPath(response);
		return js.getString(key);
	}

	public static void setURL() {

//		RestAssured.baseURI = DataLoader.dataReader("url");
	}
}
