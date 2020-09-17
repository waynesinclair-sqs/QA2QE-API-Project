
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.google.gson.JsonObject;

import static io.restassured.RestAssured.given;

public class Magento_API {
    public static void main(String[] args) {

        String url,path;
        url = "https://magento.abox.co.za";
        path = "/index.php/rest/V1/integration/admin/token";

        Response response = given()
                .baseUri(url)
                .basePath(path)
                .queryParam("username", "training_api_user")
                .queryParam("password", "PtkekYqgRZW8pCVN")
                .post();
        System.out.println(response.getBody().asString());

//        RequestSpecification request;
//        JsonObject requestParams;
//        String url,path;
//
//        requestParams = new JsonObject();
//
//        url = "https://magento.abox.co.za";
//        path = "/index.php/rest/V1/integration/admin/token";
//
//        RestAssured.baseURI =url;
//        request = RestAssured.given();
//
//        requestParams.addProperty("username", "training");
//        requestParams.addProperty("password", "PtkekYqgRZW8pCVN");
//        request..body(requestParams);
//        Response response = request.post(path);
//
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is:" + responseBody);

//        request = given().contentType("application/json");
//        url = "https://magento.abox.co.za";
//        path = "/index.php/rest/V1/integration/admin/token";
//        System.out.println("url + path:" + url + path);
//        Response response = request.get(url + path);
//        String responseBody = response.getBody().asString();
//
//        System.out.println("Response Body is:" + responseBody);
    }
}
// https://www.toolsqa.com/rest-assured/post-request-using-rest-assured/
// https://www.toolsqa.com/rest-assured/query-parameters-in-rest-assured/