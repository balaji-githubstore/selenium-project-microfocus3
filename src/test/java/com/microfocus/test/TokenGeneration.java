package com.microfocus.test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class TokenGeneration {
    public static String endPoint="https://petstore.swagger.io/v2";

    public static String getToken()
    {
        int petId=256;
        String resource="/pet/"+petId;
        String response= RestAssured
                .given().header("api_key","pet432")
                .when().post(endPoint+resource)
                .then().extract().asString();

        JsonPath json=new JsonPath(response);
        String token=json.get("message");

        return token;
    }
}
