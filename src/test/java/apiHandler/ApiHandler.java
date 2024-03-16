package apiHandler;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHandler {

    public static void main(String[] args) {
        truckingCompanyLogin();
    }

    public static void truckingCompanyLogin() {

        RestAssured.baseURI = "http://192.168.6.214/gateway";

        // JSON payload
        String requestBody = "{\"userName\": \"+96820202020\", \"password\": \"Aa@123456\"}";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/UsersAuth/login");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
    }
}
