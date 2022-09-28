package com.dh.avaliacaofinal.backendTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class B3AccountViewTest extends Cookies{

    @Test
    @Tag("Integration")
    public void givenThatIPerformAGetRequest_whenIGetTheResponseCode_thenTheResponseStatusCodeIs200(){

        given()
                .when()
                .header("Cookie", JSESSIONID)
                .get("https://parabank.parasoft.com/parabank/overview.htm").
        then()
                .statusCode(200);
    }
}
