package com.dh.avaliacaofinal.afrontendTest;

import com.dh.avaliacaofinal.pages.PageLogin;
import com.dh.avaliacaofinal.pages.PageNewAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A2NewAccountTest {

    private static PageLogin login;
    private static PageNewAccount newAccount;

    @BeforeEach
    public void setUp() {
        newAccount = new PageNewAccount();
        newAccount.openApp();

        login = new PageLogin();

        login.clickLogin(
                "testerBoladao1",
                "tester123"
        );
    }

    @Test
    @Tag("Smoke")
    public void createNewAccount() throws InterruptedException {
        newAccount.clickNewAccount();
        Thread.sleep(2000);
        newAccount.createAccount();
        Thread.sleep(2000);

        String txt = newAccount.getTextContains();
        assertEquals(txt, "Congratulations, your account is now open.");
    }

    @AfterEach
    public void tearDown(){
        newAccount.quitDriver();
    }

}
