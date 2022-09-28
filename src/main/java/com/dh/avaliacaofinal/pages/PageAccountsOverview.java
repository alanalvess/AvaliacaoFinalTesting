package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageAccountsOverview extends BasePage {

    protected static final String linkAccountOverview = "//*[@id=\"leftPanel\"]/ul/li[2]/a"; //xpath

    protected static final String textContains = "//*[@id=\"accountTable\"]/tfoot/tr/td"; //xpath

    public void clickAccountOverview() {
        WebElement clickInAccountOverview = getWebElement(By.xpath(linkAccountOverview));
        clickInAccountOverview.click();
    }

    public String getTextContains() {
        WebElement txt = getWebElement(By.xpath(textContains));
        return txt.getText();
    }

}
