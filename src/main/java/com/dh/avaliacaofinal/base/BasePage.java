package com.dh.avaliacaofinal.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {

    public static WebDriver driver;

    protected static final String URL = "https://parabank.parasoft.com/parabank/index.htm";

    public BasePage() {
        if (driver == null) {
            this.driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openApp() {
        getDriver().get(URL);
    }

    public WebElement getWebElement(By locator) {
        WebElement element = null;

        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Elemento não encontrado: " + locator);
            System.out.println("Mensagem de erro:" + e.getMessage());
        }

        return element;
    }

    public void quitDriver(){
        getDriver().quit();
    }
}
