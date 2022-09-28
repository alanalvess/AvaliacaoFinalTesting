package com.dh.avaliacaofinal.pages;

import com.dh.avaliacaofinal.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageRegister extends BasePage {

    protected static final String linkRegister = "//*[@id=\"loginPanel\"]/p[2]/a"; //xpath

    protected static final String formFirstName = "customer.firstName"; //id
    protected static final String formLastName = "customer.lastName"; //id
    protected static final String formAddress = "customer.address.street"; //id
    protected static final String formCity = "customer.address.city"; //id
    protected static final String formState = "customer.address.state"; //id
    protected static final String formZipCode = "customer.address.zipCode"; //id
    protected static final String formPhone = "customer.phoneNumber"; //id
    protected static final String formSSN = "customer.ssn"; //id

    protected static final String formUsername = "customer.username"; //id
    protected static final String formPassword = "customer.password"; //id
    protected static final String formConfirm = "repeatedPassword"; //id

    protected static final String buttonRegister = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"; //xpath

    protected static final String textContains = "//*[@id=\"rightPanel\"]/p"; //xpath

    public void clickRegister() {
        WebElement clickInRegister = getWebElement(By.xpath(linkRegister));
        clickInRegister.click();
    }

    public void insertData(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String password, String confirm) {
        WebElement inputFirstName = getWebElement(By.id(formFirstName));
        inputFirstName.sendKeys(firstName);
        WebElement inputLastName = getWebElement(By.id(formLastName));
        inputLastName.sendKeys(lastName);
        WebElement inputAddress = getWebElement(By.id(formAddress));
        inputAddress.sendKeys(address);
        WebElement inputCity = getWebElement(By.id(formCity));
        inputCity.sendKeys(city);
        WebElement inputState = getWebElement(By.id(formState));
        inputState.sendKeys(state);
        WebElement inputZipCode = getWebElement(By.id(formZipCode));
        inputZipCode.sendKeys(zipCode);
        WebElement inputPhone = getWebElement(By.id(formPhone));
        inputPhone.sendKeys(phone);
        WebElement inputSSN = getWebElement(By.id(formSSN));
        inputSSN.sendKeys(ssn);
        WebElement inputUsername = getWebElement(By.id(formUsername));
        inputUsername.sendKeys(username);
        WebElement inputPassword = getWebElement(By.id(formPassword));
        inputPassword.sendKeys(password);
        WebElement inputConfirm = getWebElement(By.id(formConfirm));
        inputConfirm.sendKeys(confirm);

        WebElement btnRegister = getWebElement(By.xpath(buttonRegister));
        btnRegister.click();
    }

    public String getTextContains() {
        WebElement txt = getWebElement(By.xpath(textContains));
        return txt.getText();
    }
}
