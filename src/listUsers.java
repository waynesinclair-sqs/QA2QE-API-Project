import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.google.gson.JsonObject;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class listUsers {

    public static void main(String[] args) {

        RequestSpecification request;
        JsonObject jsonObject;
        String url;

        //jsonObject = new JsonObject();
        //request = given().contentType("application/json");
        request = given().queryParam("page","2").contentType("application/json");

        url = "https://reqres.in";
        Response response = request.get(url + "/api/users/");
//        url = "https://jsonplaceholder.typicode.com";
//        Response response = request.get(url + "/users");
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);
        System.out.println("status code is:" + response.statusCode());
        Assert.assertEquals(response.getStatusCode(),200);

        //<String> output = response.jsonPath().getList("$");
        HashMap<String,Integer> output = response.jsonPath().get();

//        HashMap<String,String> data = response.jsonPath().get("data");
//        System.out.println("data is: " + data);

//        System.out.println("User name is : " + output.get("first_name") +
//                " * " + output.get("last_name"));

        //HashMap<String,String> xxx = response.jsonPath().getMap("data");

        String yyy;

//Map.Entry interface in Java provides certain methods to access the entry in the Map.
// By gaining access to the entry of the Map we can easily manipulate them.
// https://www.geeksforgeeks.org/map-entry-interface-java-example/
// entrySet() method in Java is used to create a set out of the same elements contained
// in the hash map. It basically returns a set view of the hash map or
// we can create a new set and store the map elements into them.
// https://www.geeksforgeeks.org/hashmap-entryset-method-in-java/
// Set is a collection that contains no elements


        for (Map.Entry<String, Integer> e : output.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            yyy = e.getValue().toString();
        }
        //String firstnames = response.jsonPath().get("first_name");
        //HashMap<String,String> xxx = response.jsonPath().get("data");
        //List<String> firstnames = response.jsonPath().get("data");
        // System.out.println("Firstname output:" + firstnames);

//        List<String> jsonResponse = response.jsonPath().getList("$");
//        System.out.println("Size is:" + jsonResponse.size());

//        List<String> firstname = response.jsonPath().getList("first_name");
//        System.out.println("First name is:" + firstname);
//
//        List<String> emails = response.jsonPath().getList("email");
//        System.out.println("emails is:" + emails);
//        List<String> email = response.jsonPath().getList("email");
//        System.out.println("emails is:" + email.get(0));

        // for extracting data from json response refer
        // https://www.baeldung.com/rest-assured-response
        // https://devqa.io/parse-json-response-rest-assured/

        // Using a hashmap
        //https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/



    }
}