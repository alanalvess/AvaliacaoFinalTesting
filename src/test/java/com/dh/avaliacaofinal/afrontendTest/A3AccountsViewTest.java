package com.dh.avaliacaofinal.afrontendTest;

import com.dh.avaliacaofinal.pages.PageAccountsOverview;
import com.dh.avaliacaofinal.pages.PageLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A3AccountsViewTest {

    private static PageLogin login;
    private static PageAccountsOverview accountsOverview;

    @BeforeEach
    public void setUp() {
        accountsOverview = new PageAccountsOverview();
        accountsOverview.openApp();

        login = new PageLogin();

        login.clickLogin(
                "testerBoladao1",
                "tester123"
        );
    }

    @Test
    @Tag("Regression")
    public void accountsView() throws InterruptedException {
        accountsOverview.clickAccountOverview();
        Thread.sleep(2000);

        String txt = accountsOverview.getTextContains();
        assertEquals(txt, "*Balance includes deposits that may be subject to holds");
    }

    @AfterEach
    public void tearDown(){
        accountsOverview.quitDriver();
    }

}
