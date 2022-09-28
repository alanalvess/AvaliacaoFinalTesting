package com.dh.avaliacaofinal.backendTest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class B5TransferFundsTest extends Cookies{

    @Test
    @Tag("Integration")
    public void givenThatIPerformAPostRequest_whenIGetTheResponseCode_thenTheResponseStatusCodeIs200(){

        given()
                .when()
                .header("Cookie", JSESSIONID)
                .post("https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId=13790&toAccountId=13788&amount=444").
        then()
                .assertThat()
                .statusCode(200);
    }
}
