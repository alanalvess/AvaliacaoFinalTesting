package com.dh.avaliacaofinal.backendTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class B2NewAccountTest extends Cookies{

    @Test
    @Tag("Integration")
    public void givenThatIPerformAPostRequest_whenIGetTheResponseCode_thenTheResponseStatusCodeIs200() throws Exception{


        given()
                .when()
                .header("Cookie", JSESSIONID)
                .post("https://parabank.parasoft.com/parabank/services/bank/createAccount/?customerId=12545&newAccountType=1&fromAccountId=13899")
                .then()
                .statusCode(200);
    }
}
