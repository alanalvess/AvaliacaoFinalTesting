package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageTransferFunds  extends BasePage {

    protected static final String linkTransferFunds = "//*[@id=\"leftPanel\"]/ul/li[3]/a"; //xpath

    protected static final String textTransferFunds = "//*[@id=\"leftPanel\"]/ul/li[3]/a"; //xpath

    protected static final String formAmount = "amount"; //id

    protected static final String selectFromAccount = "//*[@id=\"fromAccountId\"]"; //xpath

    protected static final String optionFromAccount = "//*[@id=\"fromAccountId\"]/option[1]"; //xpath

    protected static final String selectToAccount = "//*[@id=\"toAccountId\"]"; //xpath

    protected static final String optionToAccount = "//*[@id=\"toAccountId\"]/option[2]"; //xpath

    protected static final String buttonTransfer = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"; //xpath

    protected static final String textTransferComplete = "//*[@id=\"rightPanel\"]/div/div/h1"; //xpath

    public void clickTransferFunds() {
        WebElement clickInTransferFunds = getWebElement(By.xpath(linkTransferFunds));
        clickInTransferFunds.click();
    }

    public void transferFunds(String amount) {
        WebElement inputAmount = getWebElement(By.id(formAmount));
        inputAmount.sendKeys(amount);
        WebElement clickInSelectFromAccount = getWebElement(By.xpath(selectFromAccount));
        clickInSelectFromAccount.click();
        WebElement clickOptionFromAccount = getWebElement(By.xpath(optionFromAccount));
        clickOptionFromAccount.click();
        WebElement clickInSelectToAccount = getWebElement(By.xpath(selectToAccount));
        clickInSelectToAccount.click();
        WebElement clickOptionToAccount = getWebElement(By.xpath(optionToAccount));
        clickOptionToAccount.click();
        WebElement clickButtonTransfer = getWebElement(By.xpath(buttonTransfer));
        clickButtonTransfer.click();
    }

    public String getTextTransferFunds() {
        WebElement txt = getWebElement(By.xpath(textTransferFunds));
        return txt.getText();
    }

    public String getTextTransferComplete() {
        WebElement txt = getWebElement(By.xpath(textTransferComplete));
        return txt.getText();
    }

}
