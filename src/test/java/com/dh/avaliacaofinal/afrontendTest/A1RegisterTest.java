package com.dh.avaliacaofinal.afrontendTest;

import com.dh.avaliacaofinal.pages.PageRegister;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A1RegisterTest {

    private static PageRegister register;

    @BeforeEach
    public void setUp() {
        register = new PageRegister();
        register.openApp();
    }

    @Test
    @Tag("Smoke")
    public void testRegister() throws InterruptedException {
        register.clickRegister();
        Thread.sleep(2000);
        register.insertData(
                "Tester",
                "Boladão",
                "Rua do Tester Boladão",
                "Tester City",
                "Teste State",
                "12345",
                "1234567",
                "123456789",
                "testerBoladao1",
                "tester123",
                "tester123"
        );
        Thread.sleep(2000);

        String txt = register.getTextContains();
        assertEquals(txt, "Your account was created successfully. You are now logged in.");
    }

    @AfterEach
    public void tearDown(){
        register.quitDriver();
    }
}
