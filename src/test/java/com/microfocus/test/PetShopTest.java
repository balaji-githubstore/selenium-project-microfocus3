package com.microfocus.test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PetShopTest {
    public static String endPoint="https://petstore.swagger.io/v2";

    @Test
    public void findValidPetStatusCodeById(){
        int petId=9005;
        String resource="/pet/"+petId;

        RestAssured.
                given()
                .when().get(endPoint+resource)
                .then().statusCode(200);

    }

    @Test
    public void findValidPetDetalCodeById(){
        int petId=9005;
        String resource="/pet/"+petId;

       String response= RestAssured.
                given()
                .when().get(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(response);
        Assert.assertTrue(response.contains("120"));
        Assert.assertTrue(response.contains("Tiny"));
    }

    @Test
    public void findPetByStatus()
    {
        String status="pending";
        String resource="/pet/findByStatus?status="+status;

      String responseBody=  RestAssured
                .given()
                .when().get(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(responseBody);
    }

    //defect - expected and actual not matching
    @Test
    public void findPetByInvalidStatus()
    {
        String status="hello";
        String resource="/pet/findByStatus?status="+status;

        String responseBody=  RestAssured
                .given()
                .when().get(endPoint+resource)
                .then().statusCode(400).extract().asString();

        System.out.println(responseBody);
    }

    @Test
    public void deleteValidPetById()
    {
        int petId=256;
        String resource="/pet/"+petId;

        String response=RestAssured
                .given().header("api_key","pet432")
                .when().delete(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(response);
    }

    @Test
    public void addValidPet()
    {
        String resource="/pet";
        String response=RestAssured
                .given()
//                .header("Authorization","Bearer "+TokenGeneration.getToken())
                .header("Content-Type","application/json").body("{\n" +
                        "    \"id\": 9005,\n" +
                        "    \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"string\"\n" +
                        "    },\n" +
                        "    \"name\": \"doggie\",\n" +
                        "    \"photoUrls\": [\n" +
                        "        \"string\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "        {\n" +
                        "            \"id\": 0,\n" +
                        "            \"name\": \"string\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"status\": \"available\"\n" +
                        "}")
                .when().post(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(response);
    }

    @Test
    public void addValidPetTest() throws FileNotFoundException {

        FileInputStream file=new FileInputStream("test_data/new_pet.json");

        JsonPath obj=new JsonPath(file);
        String json=obj.prettify();
        System.out.println(json);

        String resource="/pet";
        String response=RestAssured
                .given()
//                .header("Authorization","Bearer "+TokenGeneration.getToken())
                .header("Content-Type","application/json").body(json)
                .when().post(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(response);
    }

    @Test
    public void updateValidPetTest() throws FileNotFoundException {

        FileInputStream file=new FileInputStream("test_data/new_pet1.json");

        JsonPath obj=new JsonPath(file);
        String json=obj.prettify();
        System.out.println(json);

        String resource="/pet";
        String response=RestAssured
                .given()
//                .header("Authorization","Bearer "+TokenGeneration.getToken())
                .header("Content-Type","application/json").body(json)
                .when().put(endPoint+resource)
                .then().statusCode(200).extract().asString();

        System.out.println(response);
    }

    @Test
    public void readJson() throws FileNotFoundException {

        FileInputStream file = new FileInputStream("test_data/new_pet.json");

        JsonPath json = new JsonPath(file);


        String jsonString = json.prettify();
        System.out.println(jsonString);

        System.out.println("----------------------");
        int id=json.get("id");
        System.out.println(id);

        String name= json.get("name");
        System.out.println(name);

       String token= TokenGeneration.getToken();
        System.out.println("Bearer "+token);
    }


}
