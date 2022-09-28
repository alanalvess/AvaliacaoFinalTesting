package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageAccountDetails extends BasePage {

    protected static final String accountNumber = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"; //xpath

    protected static final String textAccountDetails = "//*[@id=\"rightPanel\"]/div/div[1]/h1"; //xpath

    protected static final String selectActivityPeriod = "month"; //id
    protected static final String optionAllActivityPeriod = "//*[@id=\"month\"]/option[1]"; //xpath

    protected static final String selectType = "transactionType"; //id
    protected static final String optionAllType = "//*[@id=\"transactionType\"]/option[1]"; //xpath

    protected static final String buttonGo = "//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input"; //xpath

    public void clickAccountNumber() {
        WebElement clickInAccountNumber = getWebElement(By.xpath(accountNumber));
        clickInAccountNumber.click();
        WebElement clickInSelectActivityPeriod = getWebElement(By.id(selectActivityPeriod));
        clickInSelectActivityPeriod.click();
        WebElement clickOptionActivityPeriod = getWebElement(By.xpath(optionAllActivityPeriod));
        clickOptionActivityPeriod.click();
        WebElement clickInSelectType = getWebElement(By.id(selectType));
        clickInSelectType.click();
        WebElement clickOptionType = getWebElement(By.xpath(optionAllType));
        clickOptionType.click();
        WebElement clickBtnGo = getWebElement(By.xpath(buttonGo));
        clickBtnGo.click();
    }

    public String getTextAccountDetails() {
        WebElement txt = getWebElement(By.xpath(textAccountDetails));
        return txt.getText();
    }
}
