package com.dh.avaliacaofinal.backendTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class B1RegisterTest {

    @Test
    @Tag("Integration")
    public void givenThatIPerformAGetRequest_whenIGetTheResponseCode_thenTheResponseStatusCodeIs200() {

        given().
                when().
                get("https://parabank.parasoft.com/parabank/register.htm")
                .then()
                .statusCode(200);
    }
}
