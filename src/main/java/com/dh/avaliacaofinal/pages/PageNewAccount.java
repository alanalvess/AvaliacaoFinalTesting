package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageNewAccount extends BasePage {

    protected static final String linkNewAccount = "//*[@id=\"leftPanel\"]/ul/li[1]/a"; //xpath

    protected static final String selectType = "type"; //id
    protected static final String selectSaving = "//*[@id=\"type\"]/option[2]"; //xpath
    protected static final String buttonOpenNewAccount = "//*[@id=\"rightPanel\"]/div/div/form/div/input"; //xpath
    protected static final String textContains = "//*[@id=\"rightPanel\"]/div/div/p[1]"; //xpath

    public void clickNewAccount() {
        WebElement clickInOpenNewAccount = getWebElement(By.xpath(linkNewAccount));
        clickInOpenNewAccount.click();
    }

    public void createAccount() {
        WebElement options = getWebElement(By.id(selectType));
        options.click();
        WebElement typeOptions = getWebElement(By.xpath(selectSaving));
        typeOptions.click();
        WebElement btnOpenNewAccount = getWebElement(By.xpath(buttonOpenNewAccount));
        btnOpenNewAccount.click();
    }

    public String getTextContains() {
        WebElement txt = getWebElement(By.xpath(textContains));
        return txt.getText();
    }
}
