package com.dh.avaliacaofinal.afrontendTest;

import com.dh.avaliacaofinal.pages.PageLogin;
import com.dh.avaliacaofinal.pages.PageTransferFunds;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A5TransferFundsTest {

    private static PageLogin login;
    private static PageTransferFunds transferFunds;

    @BeforeEach
    public void setUp() {
        transferFunds = new PageTransferFunds();
        transferFunds.openApp();

        login = new PageLogin();
        login.clickLogin(
                "testerBoladao1",
                "tester123"
        );
    }

    @Test
    @Tag("Regression")
    public void transferFunds() throws InterruptedException {
        transferFunds.clickTransferFunds();
        Thread.sleep(2000);

        String txtTransferFunds = transferFunds.getTextTransferFunds();
        assertEquals(txtTransferFunds, "Transfer Funds");

        transferFunds.transferFunds("5");
        Thread.sleep(2000);

        String txtTransferComplete = transferFunds.getTextTransferComplete();
        assertEquals(txtTransferComplete, "Transfer Complete!");
    }

    @AfterEach
    public void tearDown(){
        transferFunds.quitDriver();
    }
}
