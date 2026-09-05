package com.github;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RESTAssuredAPIProject {

    RequestSpecification requestSpec;

    // Replace with your actual public SSH key
    String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAg....";

    int keyId;

    @BeforeClass
    public void setup() {

        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token YOUR_GITHUB_ACCESS_TOKEN")
                .build();
    }

    @Test(priority = 1)
    public void createSSHKey() {

        String requestBody =
                "{\n" +
                "  \"title\":\"TestAPIKey\",\n" +
                "  \"key\":\"" + sshKey + "\"\n" +
                "}";

        Response response =
                given()
                        .spec(requestSpec)
                        .body(requestBody)
                .when()
                        .post("/user/keys");

        response.then().statusCode(201);

        keyId = response.jsonPath().getInt("id");

        Reporter.log("Created Key ID: " + keyId);

        assertEquals(response.getStatusCode(), 201);
        assertTrue(response.asString().contains("TestAPIKey"));
    }

    @Test(priority = 2)
    public void getSSHKey() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .get("/user/keys/{keyId}");

        Reporter.log(response.asPrettyString());

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().getInt("id"), keyId);
    }

    @Test(priority = 3)
    public void deleteSSHKey() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .delete("/user/keys/{keyId}");

        Reporter.log("Delete Response Code: " + response.statusCode());

        assertEquals(response.getStatusCode(), 204);
    }
}