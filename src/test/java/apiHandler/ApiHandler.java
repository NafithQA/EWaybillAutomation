package apiHandler;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

public class ApiHandler {

    public static void main(String[] args) throws InterruptedException {
        String eWaybillId = createEwaybill();
        Thread.sleep(3000);
        acceptEwaybill(eWaybillId);
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

    public static String createEwaybill() {
        String endpoint = "http://192.168.6.196/gateway/EWaybill";
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9zaWQiOiJlN2MwYjkwZi0wNjk4LTQ0N2UtOWUxZC1hYmJkMTBhZmZhZGEiLCJ1bmlxdWVfbmFtZSI6IlBvc3RtYW5SdW50aW1lLzcuMzYuMyIsIm5iZiI6MTcxMTQ0MjIyMywiZXhwIjoyMDI2OTc1MDIzLCJpYXQiOjE3MTE0NDIyMjN9.lw5jC7hGGdh8OHPVWlYg6AbCkfu-H1xA4bj7oRUcZ3w";

        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .cookie(".AspNetCore.Identity.Application=CfDJ8Frf6AIKRV9BhVjrQc8-EaEHX-lCJl0BKbE7aOrPSzOZ2yXmkf7CyTUp_bvvgyslnT6wSyHvnajCVl218f30TZPNSDS7q8CUbpWZskJQnUVfZ1ulLpIskQbD2pqVxLGLZp3eupY12_x8nWUvz4vtuwBgSyxpExihD7zHWyOqgCvRxbUrpxwECMNiY85uCymd5waDr1O69vbXkG542KijU3uWDi3-3K4HAbuxEZbV5__fbDiJthQb29i1odfRhpLmuWyVJNARd1VQjQ7PZ6ak8EslSaZVbpD5p4wbva_OC2yttMqQPCZaIJPfSbTiw2y5IX9fXHdXPMtEidkocWgEA1Pz1B4wwdxf6p9lht-L5m3ERletnivdfWYYBwvcmGrrGVDXkYoEDpVBIinGFtfsAR7w5B5DUPAaIX21FCnDsNe66OTzj5yu8PNbJcuV2whivxs7kUSoQN3aLifOMVTW4svzZBIVPYUNkHQFEz6wb5ORuVfYhqqcXmyRrKyxL0O5GMX577w1PJsIiJLiYUhSl0Kt4KkK5f0MW30A-5RzqUQKxBZud6TucN0tZf_sfM1EOKlHBBapnj550M7SlHwZPpqdCH7nLAxqiNoq8Gn0K8G9umtqOGGDA5kedbiEnrrcRVxqj83dRj4XpZxLMAsQYb4HGNA-Z8VpK2Wvw0FOWuDbXkNehhslmug5XsyJE3wI86N1aOl8QqqhKxJ-A1d_ggt6YJzTvEeZ6UmFkhmfPTfGo9zv1W3c9jmvtj3CTWyXZloJrV5-7rzWGWRFYn9jDr36ubzvZ_qOZiNetHkbvrrhaXeIsPePcxZapCaChYocUCbxmYaLDl4rpsGXotxGD2ybzN5Fc2dKG_KjeLMUPZNsfRsvT0Rn6PTW3zWlTyRh5HHYR8oUZ2MXX2cKumeI4VRGM5tp3sTRtPOd0d5EdTQ1FRkLktkmOHXMNPY07iznAKVt6kM3bYg04K9WOhtD-_7mJtEH4Wyrx4_BqNxlEWsAZGpsolZ8NR_w0zj6eg2IJg")
                .formParam("truckingCompanyStakeholderId", "32051")
                .formParam("ConsigneeName", "الإسم التجاري بالعربي ٠")
                .formParam("Country", "OMN")
                .formParam("ConsigneeMobileNo", "25741620")
                .formParam("DischargeAddress", "OTHER")
                .formParam("DischargeAddressText", "Muscat")
                .formParam("LoadingAddress", "SOHARPORT")
                .formParam("loadingAddressText", "")
                .formParam("DischargeDate", "1998/02/03")
                .formParam("TypeOfGoods", "Nothing")
                .formParam("NumberOfPackages", "1")
                .formParam("WeightVolumeDimensions", "20m")
                .formParam("ContainerNo", "50")
                .formParam("DescriptionOfGoods", "Nothing")
                .formParam("ValueOfGoods", "50")
                .formParam("LoadingDate", "2000/Apr/02")
                .formParam("DischargeSpecialInstructions", "Nothing")
                .formParam("ConsigneeAdditionalInfo", "Nothing")
                .formParam("BillOfLadingNo", "65365552")
                .formParam("InvoiceNo", "23536")
                .formParam("ContainerNo", "56896")
                .formParam("HandlingInstructions", "Nothing")
                .formParam("Destination", "Jordan")
                .formParam("ReturnsQuantities", "1")
                .formParam("ShipmentAdditionalInfo", "Nothing")
                .formParam("InsuranceAmount", "566")
                .formParam("InsuranceType", "Test")
                .formParam("InsuranceContactNo", "44565644")
                .multiPart("EWaybillCreatorAttachmentNo1", new File(System.getProperty("user.dir")
                        + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg"))
                .multiPart("EWaybillCreatorAttachmentNo2", new File(System.getProperty("user.dir")
                        + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg"))
                .multiPart("EWaybillCreatorAttachmentNo3", new File(System.getProperty("user.dir")
                        + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "img1.jpg"))
                .formParam("consigneeStakeholderName", "Consignee Test Automation")
                .post(endpoint);

        int statusCode = response.getStatusCode();
        System.out.println("Create eWaybill API Status Code: " + statusCode);

        String eWaybillId = response.jsonPath().getString("result.id");
        System.out.println("Created eWaybill ID is : " + eWaybillId);

        String responseBody = response.getBody().asString();
        System.out.println("Create eWaybill API Response Body: " + responseBody);
        return eWaybillId;
    }

    public static void acceptEwaybill(String id) {
        String endpoint = "http://192.168.6.196/gateway/EWaybill/Accept";
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9zaWQiOiJlN2MwYjkwZi0wNjk4LTQ0N2UtOWUxZC1hYmJkMTBhZmZhZGEiLCJ1bmlxdWVfbmFtZSI6IlBvc3RtYW5SdW50aW1lLzcuMzYuMyIsIm5iZiI6MTcxMTQ0MjIyMywiZXhwIjoyMDI2OTc1MDIzLCJpYXQiOjE3MTE0NDIyMjN9.lw5jC7hGGdh8OHPVWlYg6AbCkfu-H1xA4bj7oRUcZ3w";

        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .formParam("Id", id)
                .formParam("VehicleNationality", "oman")
                .formParam("VehicleClass", "Heavy Truck")
                .formParam("TruckPlateNumber", "1234")
                .formParam("TruckPlateCode", "AA")
                .formParam("TrailerType", "Heavy")
                .formParam("TrailerPlateNumber", "5698")
                .formParam("TrailerPlateCode", "Nothing")
                .formParam("DriverNationality", "oman")
                .formParam("DriverName", "Nothing")
                .formParam("DriverMobileNumber", "700800900")
                .formParam("TransportationFeesMethod", "Visa")
                .formParam("LoadingDelayDemurrage", "10JD")
                .formParam("LoadingLocationDemurrage", "10JD")
                .formParam("DischargeDelayDemurrage", "10JD")
                .formParam("DischargeLocationDemurrage", "10JD")
                .formParam("Price", "156")
                .formParam("Currency", "152")
                .formParam("PaymentMethod", "369")
                .formParam("DownPayment", "123")
                .formParam("Notes", "Nothing")
                .formParam("DriverAreaCode", "962")
                .put(endpoint);

        int statusCode = response.getStatusCode();
        System.out.println("Accept eWaybill API Status Code: " + statusCode);

        String responseBody = response.getBody().asString();
        System.out.println("Accept eWaybill API Response Body: " + responseBody);
    }
}
