package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageLogin extends BasePage {

    protected static final String formUsername = "//*[@id=\"loginPanel\"]/form/div[1]/input"; //xpath
    protected static final String formPassword = "//*[@id=\"loginPanel\"]/form/div[2]/input"; //xpath
    protected static final String buttonLogin = "//*[@id=\"loginPanel\"]/form/div[3]/input"; //xpath

    public void clickLogin(String username, String password) {

        WebElement inputUsername = getWebElement(By.xpath(formUsername));
        inputUsername.sendKeys(username);
        WebElement inputPassword = getWebElement(By.xpath(formPassword));
        inputPassword.sendKeys(password);

        WebElement clickButtonLogin = getWebElement(By.xpath(buttonLogin));
        clickButtonLogin.click();
    }
}
